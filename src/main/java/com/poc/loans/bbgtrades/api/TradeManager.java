package com.poc.loans.bbgtrades.api;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.poc.loans.bbgtrades.repo.bbg.BBGStagedTrade;
import com.poc.loans.bbgtrades.repo.bbg.BBGStagedTradeRepo;
import com.poc.loans.bbgtrades.repo.loaniq.VlsFacPortPos;
import com.poc.loans.bbgtrades.services.LoanIQService;

@Component
public class TradeManager {

	private static final Log LOG = LogFactory.getLog(TradeManager.class);

	@Autowired
	private LoanIQService loaniqService;

	@Autowired
	private BBGStagedTradeRepo stagedTradeRepo;

	public void processTrades(List<BBGStagedTrade> trades) {
		
		String zone = (String) TradeProcessContext.get("ZONE");
		LOG.info("Zone selected : " + zone);
		
		List<BBGStagedTrade> buyTrades = new ArrayList<BBGStagedTrade>();
		List<BBGStagedTrade> sellTrades = new ArrayList<BBGStagedTrade>();
		List<BBGStagedTrade> nonSameDayCancelTrades = new ArrayList<BBGStagedTrade>();

		// put trades into different buckets
		trades.forEach(trade -> {
			
			if (trade.getStatus().equals("REJECT")) {
				// skip these trades as they are missing data
				LOG.info("Trade is missing data, Skipping : " +trade.getBbgtradeid());
				if ("NO BOOK MAP".equals(trade.getValidationError()) && zone.equals("Zone2")) {
					//marking missing book map cases as NEW to pick again while Zone 1 run
					trade.setStatus("NEW");
					stagedTradeRepo.save(trade);
				}
			} else if (trade.getStatus().equals("ERROR")) {
				// skip these trades that are marked error
				LOG.info("Trade is under error, Skipping : " +trade.getBbgtradeid());
			} else if (trade.getStatus().equals("SKIPPED")) {
				// skip these trades that are marked skipped in reference data stage
				LOG.info("Trade is marked to be skipped : " +trade.getBbgtradeid());
			} else if (trade.isCancelTrade() && !trade.getStatus().equals("SKIPPED")) {
				//back dated cancellations
				nonSameDayCancelTrades.add(trade);
			} else if (trade.getBuySellCode().equals("B")) {
				if (zone.equals("Zone2") && trade.isLondonZone()) {
					buyTrades.add(trade);
				} else if (zone.equals("Zone1")) {
					buyTrades.add(trade);
				}
			} else {
				if (zone.equals("Zone2") && trade.isLondonZone()) {
					sellTrades.add(trade);
				} else if (zone.equals("Zone1")) {
					sellTrades.add(trade);
				}
			}
		});

		LOG.info("Processing BUY: " + buyTrades.size() + " SELL: " + sellTrades.size() );

		// processing buy trades first
		buyTrades.forEach(buy -> {
			
				if (!StringUtils.startsWith(buy.getTransactionType(), "X")) {
				
					//capture time for trade call
				buy.setProcessTimestamp(new Timestamp(System.currentTimeMillis()));
				
			try {
				
				loaniqService.createLIQTrade(buy);
				//buy.setStatus("DONE");
				buy.setProcessError("API CALL MADE FOR BUY TRADE");
				
			} catch (Throwable t) {

				buy.setStatus("ERROR");
				buy.setProcessError("FAILED TO CREATE BUY TRADE " + t.getMessage());

			}

			// each trade is saved here

			} else {
				buy.setStatus("SKIPPED");
				buy.setValidationError("CANCELLATION TRADE");
			}
				
				/*else {
				buy.setStatus("SKIPPED");
				buy.setValidationError("TRADE ALREADY CANCELLED");
			}*/

			// save status and comment to db
			stagedTradeRepo.save(buy);

		});

		// process sell trades second

		sellTrades.forEach(sell -> {
			
						if (!StringUtils.startsWith(sell.getTransactionType(), "X")) {

			boolean shortSell = false;

			// get current position value to see if we need to do short sell
			VlsFacPortPos vlsFacPortPos = loaniqService.getPosition(sell.getFacilityInternalId(), sell.getExpenseCode(), sell.getPortfolioCode(), sell.getBranchCode());
			Double shortAmount = 0d;
			Double positionAmount = 0d;

			if (vlsFacPortPos != null) {
				positionAmount = Double.parseDouble(vlsFacPortPos.getFppAmtAvailable());
				if (positionAmount.compareTo(sell.getTrade_feed_Amount().doubleValue()) < 0) {
					// position amount is less than trade feed amount, short sell, calculate short amount
					shortSell = true;
					shortAmount = sell.getTrade_feed_Amount().doubleValue() - positionAmount;
					LOG.info("Short amount: " + shortAmount);
				}
			}
			
				sell.setProcessTimestamp(new Timestamp(System.currentTimeMillis()));
				
			try {
				if (shortSell) {
					loaniqService.createShortSellTrade(sell, shortAmount, positionAmount);
					sell.setProcessError("API CALL MADE FOR SHORT SELL TRADE");
				} else {
					loaniqService.createLIQTrade(sell);
					sell.setProcessError("API CALL MADE FOR SELL TRADE");
				}
				//sell.setStatus("DONE");

			} catch (Throwable t) {
				sell.setStatus("ERROR");
				sell.setProcessError("FAILED TO CREATE SELL TRADE " + t.getMessage());
			}

			} else {
				sell.setStatus("SKIPPED");
				sell.setValidationError("CANCELLATION TRADE");
			}
						
						/*else {

				sell.setStatus("SKIPPED");
				sell.setValidationError("TRADE ALREADY CANCELLED");

			}*/

			stagedTradeRepo.save(sell);

		});

		nonSameDayCancelTrades.forEach(cancel -> {
			cancel.setProcessTimestamp(new Timestamp(System.currentTimeMillis()));
			try {
				/*loaniqService.createCancelTrade(cancel);;
				cancel.setStatus("DONE");
				cancel.setProcessError("API CALL MADE FOR NON SAME DAY CANCELLATION");*/
				cancel.setStatus("SKIPPED");
				cancel.setProcessError("API CALL NOT MADE FOR NON SAME DAY CANCELLATION");
			} catch (Throwable t) {
				cancel.setStatus("ERROR");
				cancel.setProcessError("FAILED TO CREATE CANCEL TRADE " + t.getMessage());
			}
			stagedTradeRepo.save(cancel);
		});

	}
}
