package com.poc.loans.bbgtrades.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.poc.loans.bbgtrades.api.TradeProcessContext;
import com.poc.loans.bbgtrades.repo.bbg.BBGLoaniqBookMap;
import com.poc.loans.bbgtrades.repo.bbg.BBGLoaniqBookMapRepo;
import com.poc.loans.bbgtrades.repo.bbg.RawBBGSecurityStatic;
//import com.poc.loans.bbgtrades.repo.bbg.RawBBGSecurityStaticRepo;

@Component
public class BBGService implements CachedService {

	private static final Log LOG = LogFactory.getLog(BBGService.class);

	@Autowired
	private BBGLoaniqBookMapRepo bookMapRepo;

	@Autowired
	//private RawBBGSecurityStaticRepo securityStaticRepo;


	private Map<String, RawBBGSecurityStatic> securityMap;
	private Map<String, List<BBGLoaniqBookMap>> bookMap;

	@PostConstruct
	public void initializeCache() {

		LOG.info("initializing BBG Service cache");
		Date processDate = (Date) TradeProcessContext.get("PROCESS_DATE");
		LOG.info("Process Date: " + processDate);
		
		// get all security static
		// keyed by firm id
		securityMap = new HashMap<String, RawBBGSecurityStatic>();

	/*	securityStaticRepo.findByCreateDate(processDate).forEach(s -> {
			securityMap.put(s.getBbg_security_id(), s);
		});
*/
		// load all bookmap
		// key by trader id, value is a list of book maps
		bookMap = new HashMap<String, List<BBGLoaniqBookMap>>();
		bookMapRepo.findAll().forEach(bm -> {

			//active = 'Y' AND liqBranch IN ('JLCP', 'JIL') 
			if ("Y".equals(Character.toString(bm.getActive()))) {
				if ("JLCP".equals(bm.getLiq_branch().trim()) || "JIL".equals(bm.getLiq_branch().trim())) {

					List<BBGLoaniqBookMap> maps = bookMap.get(bm.getBbg_trader_name());
					if (maps == null) maps = new ArrayList<BBGLoaniqBookMap>();
					maps.add(bm);
					bookMap.put(bm.getBbg_trader_name(), maps);

				}
			}

		});


		LOG.info("loaded security static: " + securityMap.size());
		LOG.info("loaded bookmaps: " + bookMap.size());
	}

	public RawBBGSecurityStatic getSecurity(String firmIdentifier) {
		LOG.info("getting security: " + firmIdentifier);
		return securityMap.get(firmIdentifier);
	}

	public List<BBGLoaniqBookMap> getBookMap(String traderId) {
		LOG.info("getting book map for trader id: " + traderId);
		return bookMap.get(traderId);
	}

}
