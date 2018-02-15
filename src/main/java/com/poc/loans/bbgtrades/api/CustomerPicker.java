package com.poc.loans.bbgtrades.api;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.poc.loans.bbgtrades.repo.bbg.BBGStagedTrade;
import com.poc.loans.bbgtrades.repo.loaniq.VlsCustAlias;
import com.poc.loans.bbgtrades.repo.loaniq.VlsCustLocation;
import com.poc.loans.bbgtrades.repo.loaniq.VlsCustomer;

public class CustomerPicker {
	
	private static final Log LOG = LogFactory.getLog("CustomerPicker");
	
	public static VlsCustomer DUMMY_CUSTOMER ;
	static {
		DUMMY_CUSTOMER = new VlsCustomer();
		DUMMY_CUSTOMER.setCusCidCustID("R78MZ86B");
		DUMMY_CUSTOMER.setCusXidCustId("R78MZ86B");
		Set<VlsCustAlias> aliases = new HashSet<VlsCustAlias>();
		Set<VlsCustLocation> locations = new HashSet<VlsCustLocation>();
		
		VlsCustAlias alias = new VlsCustAlias();
		alias.setCalCdeAliasType("MNKR");
		alias.setCalNmeAliasName("NO MONIKER ASSIGNED");
		aliases.add(alias);
		
		VlsCustLocation location = new VlsCustLocation();
		location.setCloCdeLocation("STA");
		location.setCloCdePrflType("INVR");
		location.setCloIndComplete("Y"); 
		locations.add(location);
		
		DUMMY_CUSTOMER.setAliases(aliases);
		DUMMY_CUSTOMER.setLocations(locations);
	}
	
	public static VlsCustomer pickCustomer(VlsCustomer customer, BBGStagedTrade trade) {
		
		
		if (customer == null) {
			// return dummy customer
			LOG.info("USING DUMMY CUSTOMER");
			return DUMMY_CUSTOMER;
		} else {
			LOG.info(customer.toString());
			return customer;
		}
		
	}
	
}
