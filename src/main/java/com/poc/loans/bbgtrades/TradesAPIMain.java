package com.poc.loans.bbgtrades;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import com.poc.loans.bbgtrades.api.TradeProcessContext;
import com.poc.loans.bbgtrades.api.TradesController;


@SpringBootApplication
@EnableAutoConfiguration
@EnableCaching 
public class TradesAPIMain implements CommandLineRunner {

	private static final Log LOG = LogFactory.getLog(TradesAPIMain.class);

	public static void main(String[] args) throws Exception {
		
		Date processDate = DateUtils.truncate(new Date(), Calendar.DATE);
		String zone  = null;
		
		if (args.length == 2) {
			// running with passed in date
			String date = args[1];
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			processDate = sdf.parse(date);
			zone = args[0];
		} else if (args.length == 1) {
			zone = args[0];
		}
		
		TradeProcessContext.set("PROCESS_DATE", processDate);
		TradeProcessContext.set("ZONE", zone);
		
		SpringApplication.run(TradesAPIMain.class, args);
	}

	@Autowired
	private TradesController tradesController;
	
	
	@Override
	public void run(String... args) throws Exception {

		LOG.info("Loading BBG trades api process starts...");
		
		tradesController.run();
		
		LOG.info("Process completes successfully");
		System.exit(1);

	}

}
