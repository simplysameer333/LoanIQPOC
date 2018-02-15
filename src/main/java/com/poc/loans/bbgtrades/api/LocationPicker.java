package com.poc.loans.bbgtrades.api;

import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.poc.loans.bbgtrades.repo.bbg.BBGStagedTrade;
import com.poc.loans.bbgtrades.repo.loaniq.VlsCustLocation;

public class LocationPicker {

	private static final Log LOG = LogFactory.getLog(LocationPicker.class);
	
	public static VlsCustLocation pickLocation(Set<VlsCustLocation> locations, BBGStagedTrade trade) {
		
		for (VlsCustLocation loc: locations) {
			 //l.cloCdePrflType ='INVR' AND l.cloIndComplete = 'Y'
					 
			if (loc.getCloCdePrflType().trim().equals("INVR") && loc.getCloIndComplete().trim().equals("Y")) {
				LOG.info("found location: " + loc.toString());
				return loc;
			}
		}
		
		LOG.error("No suitable Location found");
		return null;
	}
	
}
