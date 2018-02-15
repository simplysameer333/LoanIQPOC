package com.poc.loans.bbgtrades.services;

import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.poc.loans.bbgtrades.loaniq.Constants;
import com.poc.loans.bbgtrades.repo.bbg.BBGStagedTrade;
import com.poc.loans.bbgtrades.repo.bbg.BBGStagedTradeRepo;
import com.poc.loans.bbgtrades.repo.bbg.RawBBGTrade;

@Component
public class StagingService {

	private static final Log LOG = LogFactory.getLog(StagingService.class);

	@Autowired
	private BBGStagedTradeRepo stagingRepo;
	
	public BBGStagedTrade stage(RawBBGTrade rawBBGTrade) {

		//if (!Constants.PROMOTION.equals(rawBBGTrade.getStatus())) {
			BBGStagedTrade stagedTrade = new BBGStagedTrade();

			stagedTrade.setAsofdate(rawBBGTrade.getAsOfDate());
			stagedTrade.setBbgtradeid(rawBBGTrade.getbBGTradeId());

			stagedTrade.setBuySellCode(rawBBGTrade.getBuySell());
			stagedTrade.setCircleFinalStatusCode("AWA");
			stagedTrade.setCurrency(rawBBGTrade.getCurrency());
			stagedTrade.setEventComment("Bloomberg Trade with Firm ID : "+ rawBBGTrade.getFirmIdentifier());
			stagedTrade.setTransactionType(rawBBGTrade.getTransactionType());
			stagedTrade.setBbgTradeType(rawBBGTrade.getBbgTradeType());
			stagedTrade.setExpectedCloseDate(null);

			stagedTrade.setFacilityCurrencyAmount(Float.valueOf(rawBBGTrade.getTradeFeedAmount()));
			stagedTrade.setFirm_Identifier(rawBBGTrade.getFirmIdentifier());
			stagedTrade.setInterestFeeSettlement(Constants.INTERESTFEESET);
			stagedTrade.setInterestSkim(0.0f);
			stagedTrade.setInvestmentType("ASG");
			stagedTrade.setIsDistressed(null);
			stagedTrade.setOriginalTicketNumber(Integer.valueOf(rawBBGTrade.getOriginalTicketNumber()));
			Float f = Float.valueOf(rawBBGTrade.getTradePrice()) / 100;
			stagedTrade.setPrice(f.toString());
			stagedTrade.setPricingComment("BBG Trade ID : " + rawBBGTrade.getbBGTradeId());

			stagedTrade.setSettleNet("Y");
			stagedTrade.setTicketNumber(Integer.valueOf(rawBBGTrade.getTicketNumber()));
			stagedTrade.setTrade_feed_Amount(Float.valueOf(rawBBGTrade.getTradeFeedAmount()));
			stagedTrade.setTradeDate(rawBBGTrade.getTradeDate());
			stagedTrade.setTrader(null);
			stagedTrade.setTrader_name(rawBBGTrade.getTraderName());
			stagedTrade.setTransaction_account(rawBBGTrade.getTransactionAccount());
			
			// set trade as NEW
			stagedTrade.setStatus("NEW");
			
			stagingRepo.save(stagedTrade);
			
			return stagedTrade;

		//} else {
			//LOG.info("Trade " + tradeId.toString() + " already staged");
		//}
		
		//return null;
	}
	
	public List<BBGStagedTrade> findByTradeDateAndStatus(Date tradeDate, String status) {
		return stagingRepo.findByTradeDateAndStatus(tradeDate, status);
	}
	
	public void save(List<BBGStagedTrade> trade) {
		stagingRepo.save(trade);
	}

}

