package com.poc.loans.bbgtrades.api;

import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.poc.loans.bbgtrades.repo.bbg.BBGStagedTrade;

@Component
public class TradesController {
	
	private static final Log LOG = LogFactory.getLog(TradesController.class);
	
	@Autowired
	private StagingManager stagingManager;
	
	@Autowired
	private ReferenceDataManager referenceDataManager;
	
	@Autowired
	private TradeManager tradeManager;
	
	public void run() {
		
		Date processDate = (Date) TradeProcessContext.get("PROCESS_DATE");
		
		// step 1, process new trades into staging table and return all unprocessed for the day
		List<BBGStagedTrade> trades = stagingManager.getAllStagedTradesToBeProcessed(processDate);
		LOG.info("@@@@@@@@@@ Staging Completes");
		// add relevant reference data
		// also creates facility and deals that are missing in LIQ
		// also updates cache
		referenceDataManager.addReferenceData(trades);
		stagingManager.update(trades);
		LOG.info("@@@@@@@@@@ Adding reference data Completes");
		
		// sends trades to LIQ
		tradeManager.processTrades(trades);
		LOG.info("@@@@@@@@@@ Trade processing Completes");
		

	}


}
