package com.poc.loans.bbgtrades.api;

import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.poc.loans.bbgtrades.loaniq.Constants;
import com.poc.loans.bbgtrades.repo.bbg.BBGStagedTrade;
import com.poc.loans.bbgtrades.repo.bbg.RawBBGTrade;
import com.poc.loans.bbgtrades.repo.bbg.RawBBGTradeRepo;
import com.poc.loans.bbgtrades.services.StagingService;

@Component
public class StagingManager {

	private static final Log LOG = LogFactory.getLog(StagingManager.class);
	
	@Autowired
	private RawBBGTradeRepo rawBBGTradeRepo;
	
	@Autowired
	private StagingService stagingService;
	
	public List<BBGStagedTrade> getAllStagedTradesToBeProcessed(Date tradeDate) {
		
		// get all from raw table that are in NEW status
		List<RawBBGTrade> trades = rawBBGTradeRepo.findByTradeDateAndStatus(tradeDate, "NEW");
		LOG.info("Number of new trades to be staged: " + trades.size());
		
		// move all new trades into staging
		trades.forEach(t -> {
			// mark as promoted first
			t.setStatus(Constants.PROMOTION);
			rawBBGTradeRepo.save(t);
			
			// then move to staging table. worst case is the trade is marked as promoted but missed being staged.
			// better than re-promoting trades causing dupes
			stagingService.stage(t);
		});
		
		// get all new trades that needs to be processed by tradeDate
		List<BBGStagedTrade> stagedTrades = stagingService.findByTradeDateAndStatus(tradeDate, "NEW");
		LOG.info("Processing unprocessed staged trades: " + stagedTrades.size());
		
		return stagedTrades;
	}
	
	void update(List<BBGStagedTrade> stagedTrades) {
		stagingService.save(stagedTrades);
	}
	
}
