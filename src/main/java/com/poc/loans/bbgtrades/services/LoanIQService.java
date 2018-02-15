package com.poc.loans.bbgtrades.services;

import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.poc.loans.bbgtrades.loaniq.ApiCall;
import com.poc.loans.bbgtrades.loaniq.Constants;
import com.poc.loans.bbgtrades.loaniq.LoanIQResponseHandler;
import com.poc.loans.bbgtrades.repo.bbg.BBGStagedTrade;
import com.poc.loans.bbgtrades.repo.loaniq.VlsCustAlias;
import com.poc.loans.bbgtrades.repo.loaniq.VlsCustLocation;
import com.poc.loans.bbgtrades.repo.loaniq.VlsCustomer;
import com.poc.loans.bbgtrades.repo.loaniq.VlsCustomerRepo;
import com.poc.loans.bbgtrades.repo.loaniq.VlsDeal;
import com.poc.loans.bbgtrades.repo.loaniq.VlsDealRepo;
import com.poc.loans.bbgtrades.repo.loaniq.VlsFacPortPos;
import com.poc.loans.bbgtrades.repo.loaniq.VlsFacPortPosRepo;
import com.poc.loans.bbgtrades.repo.loaniq.VlsFacility;
import com.poc.loans.bbgtrades.repo.loaniq.VlsFacilityRepo;
import com.poc.loans.bbgtrades.repo.loaniq.VlsInvFacilityRepo;
import com.poc.loans.bbgtrades.repo.loaniq.VlsMisCode;
import com.poc.loans.bbgtrades.repo.loaniq.VlsMisCodeRepo;
import com.poc.loans.bbgtrades.xml.request.CancelTrade;
import com.poc.loans.bbgtrades.xml.request.Counterparty;
import com.poc.loans.bbgtrades.xml.request.CreateDeal;
import com.poc.loans.bbgtrades.xml.request.CreateFacility;
import com.poc.loans.bbgtrades.xml.request.CreateTrade;
import com.poc.loans.bbgtrades.xml.request.DealBorrower;
import com.poc.loans.bbgtrades.xml.request.FacilityPosition;
import com.poc.loans.bbgtrades.xml.request.LoanPurpose;
import com.poc.loans.bbgtrades.xml.request.MISCode;
import com.poc.loans.bbgtrades.xml.request.PortfolioAllocation;
import com.poc.loans.bbgtrades.xml.request.Risk;
import com.poc.loans.bbgtrades.xml.response.XmlResponse;

@Component
public class LoanIQService implements CachedService {

	private static final Log LOG = LogFactory.getLog(LoanIQService.class);

	//@Autowired
	//private VlsCustAliasRepo aliasRepo;

	//@Autowired
	//private VlsCustLocationRepo locationRepo;

	@Autowired
	private VlsCustomerRepo customerRepo;

	@Autowired
	private VlsDealRepo dealRepo;

	@Autowired
	private VlsFacilityRepo facilityRepo;

	@Autowired
	private VlsFacPortPosRepo facPortPosRepo;

	@Autowired
	private VlsInvFacilityRepo invFacRepo;

	@Autowired
	private VlsMisCodeRepo misRepo;

	@Autowired
	private ApiCall apiCall;

	@Autowired
	private LoanIQResponseHandler responseHandler;

	private Map<String, List<VlsMisCode>> misMap;
	private Map<String, List<VlsMisCode>> misCircleMap;
	private Map<String, VlsFacility> facMap;
	private Map<String, VlsCustomer> customerMap;

	@PostConstruct
	public void initializeCache() {
		
		misMap = new HashMap<String, List<VlsMisCode>>();
		List<VlsMisCode> misCodes = misRepo.findByMicCdeProdTypeStartingWithAndMicCdeMisType("FAC", "BBGID");
		System.out.println(misCodes.size());
		for (VlsMisCode mis : misCodes) {
			String misTxt = mis.getMicTxtMisValue().trim();
			if (misTxt.length() > 8) {
				misTxt = misTxt.substring(0, 8);
			}
			
			List<VlsMisCode> codes = misMap.get(misTxt); 
			if (codes == null) {
				codes = new ArrayList<VlsMisCode>();
			}
			codes.add(mis);
			misMap.put(misTxt, codes);

		}
		
		misCircleMap = new HashMap<String, List<VlsMisCode>>();
		List<VlsMisCode> misCircleCodes = misRepo.findByMicCdeProdTypeStartingWithAndMicCdeMisType("FAC", "BBGTK");
		System.out.println(misCircleCodes.size());
		for (VlsMisCode mis : misCircleCodes) {
			String misTxt = mis.getMicTxtMisValue().trim();
			if (misTxt.length() > 8) {
				misTxt = misTxt.substring(0, 8);
			}
			
			List<VlsMisCode> codes = misCircleMap.get(misTxt); 
			if (codes == null) {
				codes = new ArrayList<VlsMisCode>();
			}
			codes.add(mis);
			misCircleMap.put(misTxt, codes);
		}

		facMap = new HashMap<String, VlsFacility>();
		for (VlsFacility fac : facilityRepo.findAll()) {
			facMap.put(fac.getFacPidFacility(), fac);
		}

		customerMap = new HashMap<String, VlsCustomer>();
		//for (VlsCustomer customer : customerRepo.findByCusCdeCustDescEqualsAndCusCdeDeptNot("FMA","INACT")) {
		for (VlsCustomer customer : customerRepo.getAllQualitifedCustomers()) {
			Set<VlsCustAlias> aliases = customer.getAliases();
			aliases.forEach(a -> {
				if (a.getCalCdeAliasType().trim().equals("MNKR")) {
					customerMap.put(a.getCalNmeAliasName().trim(), customer);
				}
			});
		}

	}

	public VlsDeal createDeal(BBGStagedTrade trade) throws Exception {

		CreateDeal cd = new CreateDeal();
		DealBorrower db = new DealBorrower();
		MISCode mc = new MISCode();

		cd.setVersion("1.0");
		cd.setDealName(trade.getDeal_name());
		cd.setNonHostBankDealIndicator("N");
		cd.setCurrency(trade.getCurrency());
		cd.setDepartment("DEPAR");
		cd.setBranch(trade.getBranchCode());
		cd.setProcessingAreaCode("CLD");
		cd.setGlobalDealProposedCommitmentAmount(trade.getDealAmount());
		cd.setAgreementDate(trade.getIssue_dt().toString());
		cd.setExpenseCode("000300");

		cd.setDealBorrower(db);

		cd.setMISCode(mc);

		mc.setVersion("1.0");
		mc.setType("BBGDL");
		mc.setValue(trade.getLn_deal_id());

		db.setVersion("1.0");
		db.setCustomerExternalId("122"); 

		XmlResponse xmlResponse = callDealApi(trade, cd);

		List<String> messages = xmlResponse.getMessages().getMessage();
		for (String string : messages) {
			// duplicate name error, retry process deal with different name
			if (StringUtils.contains(string, "Duplicate name")) {
				trade.setDeal_name(trade.getDeal_name() + trade.getAsofdate());
				cd.setDealName(trade.getDeal_name());
				xmlResponse = callDealApi(trade, cd);
				break;
			}
		}

		if(xmlResponse.getResult().getDealAsReturnValue() == null) {
			LOG.info("Deal not created for Trade : " + trade.getBbgtradeid());
		}

		String dealTrackingNo = xmlResponse.getResult().getDealAsReturnValue().getDealId();
		VlsDeal deal = new VlsDeal();
		deal.setDeaPidDeal(dealTrackingNo);

		LOG.info("New deal created , Name : " + xmlResponse.getResult().getDealAsReturnValue().getDealName());

		return deal;
				

	}

	public XmlResponse callDealApi(BBGStagedTrade trade, CreateDeal cd) throws Exception {

		XmlResponse response = new XmlResponse();
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance("com.poc.loans.bbgtrades.xml.request");
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.setProperty("com.sun.xml.internal.bind.xmlHeaders",
					"\n<!DOCTYPE CreateDeal SYSTEM  \"CreateDeal.dtd\">");

			StringWriter sw = new StringWriter();
			jaxbMarshaller.marshal(cd, sw);
			String request = sw.toString();
			response = apiCall.call(trade, request);

			//persist response to api response table
			//responseHandler.handleResponse(trade, response, request);

		} catch (JAXBException e) {
			e.printStackTrace();
		}

		return response;

	}

	public VlsFacility createFacility(BBGStagedTrade trade) throws Exception {

		CreateFacility cf = new CreateFacility();
		Risk risk = new Risk();
		LoanPurpose lp = new LoanPurpose();
		MISCode mc = new MISCode();

		LOG.info("****************Creating XML for Facility with Trade ID : " + trade.getBbgtradeid());
		// deal id is populated in the create deal method above
		cf.setDealTrackingNumber(trade.getDealInternalId());
		cf.setVersion("1.0");
		cf.setFacilityName(trade.getSecurity_short_des());
		cf.setFacilityType("TERM");
		cf.setCurrency(trade.getCurrency());
		cf.setProposedCommitmentAmount( String.valueOf(trade.getDealAmount()));
		//cf.setAgreementDate(TimeStampUtil.changeTimestampValue(trade.getAsofdate().toString(), -1));
		cf.setAgreementDate(trade.getIssue_dt().toString());
		cf.setEffectiveDate(trade.getIssue_dt().toString());
		cf.setFinalMaturityDate(trade.getMaturity().toString());

		cf.setRisk(risk);

		risk.setVersion("1.0");
		risk.setRiskTypeCode("LLTE");

		cf.setLoanPurpose(lp);

		lp.setVersion("1.0");
		lp.setLoanPurposeCode("GCP");

		cf.setMISCode(mc);

		mc.setVersion("1.0");
		mc.setType("BBGID");
		mc.setValue(trade.getFirm_Identifier());
		
		VlsFacility facility = new VlsFacility();
		XmlResponse response = new XmlResponse();
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance("com.poc.loans.bbgtrades.xml.request");
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.setProperty("com.sun.xml.internal.bind.xmlHeaders",
					"\n<!DOCTYPE CreateFacility SYSTEM  \"CreateFacility.dtd\">");

			StringWriter sw = new StringWriter();
			jaxbMarshaller.marshal(cf, sw);
			String request = sw.toString();
			response = apiCall.call(trade, request);
			
			
			//responseHandler.handleResponse(trade, response, request);

			if(null != response.getResult()) {
				LOG.info("Facility not created for trade : " + trade.getBbgtradeid());
			} else {

				String facilityRidNew = response.getResult().toString();
				facilityRidNew = StringUtils.split(facilityRidNew, ":")[1];
				facilityRidNew = StringUtils.trim(facilityRidNew);
				LOG.info("New Facility Created, RID : " + facilityRidNew);
				//VlsFacility facility = new VlsFacility();
				facility.setFacPidFacility(facilityRidNew);
				facility.setFacPidDeal(trade.getDealInternalId());

				// refresh map so future trades can use this
				VlsMisCode misCode = new VlsMisCode();
				misCode.setMicCdeMisType("BBGID");
				misCode.setMicTxtMisValue(trade.getFirm_Identifier());
				misCode.setMicCdeProdType("FAC");
				misCode.setMicPidProductId(facility.getFacPidFacility());

				List<VlsMisCode> codes = misMap.get(misCode.getMicTxtMisValue());
				if (codes == null) {
					codes = new ArrayList<VlsMisCode>();
				}
				misMap.put(misCode.getMicTxtMisValue(), codes);
				facMap.put(facility.getFacPidFacility(), facility);

			}

		} catch (JAXBException e) {
			e.printStackTrace();
		}

		return facility;

	}
	

	public void createLIQTrade(BBGStagedTrade trade) throws Exception {

		CreateTrade t = new CreateTrade();
		FacilityPosition f = new FacilityPosition();
		Counterparty c = new Counterparty();
		PortfolioAllocation p = new PortfolioAllocation();
		MISCode mc = new MISCode();
		MISCode mc1 = new MISCode();
		MISCode mc2 = new MISCode();
		List<MISCode> mcList = new ArrayList<MISCode>();

		LOG.info("****************Creating XML for Trade with Trade ID : " + trade.getBbgtradeid());
		
		t.setVersion("1.0");
		
		if ("B".equals(trade.getBuySellCode())) {
			t.setBuySellCode("BUY");
		} else if ("S".equals(trade.getBuySellCode())) {
			t.setBuySellCode("SELL");
		}
		
		t.setInvestmentType("ASG");
		
		if ("DL".equals(trade.getBbgTradeType())) {
			t.setIsDistressed("Y");
		} else {
			t.setIsDistressed("N");
		}

		t.setDealInternalId(trade.getDealInternalId());
		t.setTradeDate(trade.getAsofdate().toString());
		t.setCircleFinalStatusCode("AWA");
		t.setBranchCode(trade.getBranchCode());
		t.setRiskBook(trade.getRiskBook());
		t.setSettleNet("Y");
		t.setInterestFeeSettlement(Constants.INTERESTFEESET);
		t.setPricingComment("BBG Trade ID : " + trade.getBbgtradeid());
		t.setEventComment("Bloomberg Trade with Firm ID : " + trade.getFirm_Identifier());

		t.setFacilityPosition(f);

		f.setVersion("1.0");
		f.setFacilityInternalId(trade.getFacilityInternalId());
		f.setInterestSkim(new BigDecimal(0));
		//f.setPrice(new BigDecimal(trade.getPrice()).divide(new BigDecimal(100)));
		f.setPrice(new BigDecimal(trade.getPrice()));
		f.setPortfolioAllocation(p);

		p.setExpenseCode(trade.getExpenseCode());
		//p.setFacilityCurrencyAmount(Double.toString(roundToThreeDec(trade.getTrade_feed_Amount())));
		p.setFacilityCurrencyAmount(roundToThreeDec(trade.getTrade_feed_Amount()));
		p.setPortfolioCode(trade.getPortfolioCode());
		p.setVersion("1.0");

		t.setCounterparty(c);

		c.setCustomerInternalId(trade.getCustomerInternalId());
		c.setLocationCode((trade.getLocationCode()).trim());
		c.setVersion("1.0");

		mc.setVersion("1.0");
		mc.setType("BBGTK");
		mc.setValue(Integer.toString(trade.getTicketNumber()));

		mc1.setVersion("1.0");
		mc1.setType("BBGTN");
		mc1.setValue(trade.getTrader_name());

		mc2.setVersion("1.0");
		mc2.setType("BBGOT");
		mc2.setValue(Integer.toString(trade.getOriginalTicketNumber()));

		mcList.add(mc);
		mcList.add(mc1);
		mcList.add(mc2);
		t.setmISCode(mcList);
		
		//XmlResponse response = null;
		
		try {

			JAXBContext jaxbContext = JAXBContext.newInstance("com.poc.loans.bbgtrades.xml.request");
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.setProperty("com.sun.xml.internal.bind.xmlHeaders",
					"\n<!DOCTYPE CreateTrade SYSTEM  \"CreateTrade.dtd\">");

			StringWriter sw = new StringWriter();
			jaxbMarshaller.marshal(t, sw);

			String request = sw.toString();

			//make api calls
			//response = 
					apiCall.call(trade, request);
			//responseHandler.handleResponse(trade, response, request);

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

	public void createShortSellTrade(BBGStagedTrade trade, Double shortAmt, Double positionAmount) throws Exception {
		
		CreateTrade t = new CreateTrade();
		FacilityPosition f = new FacilityPosition();
		Counterparty c = new Counterparty();
		PortfolioAllocation p = new PortfolioAllocation();
		MISCode mc = new MISCode();
		MISCode mc1 = new MISCode();
		MISCode mc2 = new MISCode();
		List<MISCode> mcList = new ArrayList<MISCode>();

		t.setVersion("1.0");
		if ("B".equals(trade.getBuySellCode())) {
			t.setBuySellCode("BUY");
		} else if ("S".equals(trade.getBuySellCode())) {
			t.setBuySellCode("SELL");
		}
		t.setInvestmentType("ASG");
		if ("DISTRESSED".equals(trade.getExpenseCode())) {
			t.setIsDistressed("Y");
		} else {
			t.setIsDistressed("N");
		}
		t.setDealInternalId(trade.getDealInternalId());
		t.setTradeDate(trade.getAsofdate().toString());
		t.setCircleFinalStatusCode("AWA");
		t.setBranchCode(trade.getBranchCode());
		t.setRiskBook(trade.getRiskBook());
		t.setSettleNet("Y");
		t.setInterestFeeSettlement(Constants.INTERESTFEESET);
		t.setPricingComment("BBG Trade ID : " + trade.getBbgtradeid());
		t.setEventComment("Bloomberg Trade with Firm ID : " + trade.getFirm_Identifier());

		t.setFacilityPosition(f);

		f.setVersion("1.0");
		f.setFacilityInternalId(trade.getFacilityInternalId());
		f.setInterestSkim(new BigDecimal(0));
		//f.setPrice(new BigDecimal(trade.getPrice()).divide(new BigDecimal(100)));
		f.setPrice(new BigDecimal(trade.getPrice()));
		
		f.setPortfolioAllocation(p);

		p.setExpenseCode(trade.getExpenseCode());
		p.setFacilityCurrencyAmount(roundToThreeDec(positionAmount));
		p.setShortAmount(roundToThreeDec(shortAmt));
		p.setPortfolioCode(trade.getPortfolioCode());
		p.setVersion("1.0");

		t.setCounterparty(c);

		c.setCustomerInternalId(trade.getCustomerInternalId());
		c.setLocationCode((trade.getLocationCode()).trim());
		c.setVersion("1.0");

		mc.setVersion("1.0");
		mc.setType("BBGTK");
		mc.setValue(Integer.toString(trade.getTicketNumber()));

		mc1.setVersion("1.0");
		mc1.setType("BBGTN");
		mc1.setValue(trade.getTrader_name());
		
		mc2.setVersion("1.0");
		mc2.setType("BBGOT");
		mc2.setValue(Integer.toString(trade.getOriginalTicketNumber()));
		
		mcList.add(mc);
		mcList.add(mc1);
		mcList.add(mc2);
		t.setmISCode(mcList);
		
		//XmlResponse response = new XmlResponse();
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance("com.poc.loans.bbgtrades.xml.request");
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.setProperty("com.sun.xml.internal.bind.xmlHeaders",
					"\n<!DOCTYPE CreateTrade SYSTEM  \"CreateTrade.dtd\">");


			StringWriter sw = new StringWriter();
			jaxbMarshaller.marshal(t, sw);
			String request = sw.toString();
		
			//response = 
					apiCall.call(trade, request);
			
			//responseHandler.handleResponse(trade, response, request);
			

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	public void createCancelTrade(BBGStagedTrade trade) {

		CancelTrade ct = new CancelTrade();
		
		LOG.info("****************Creating XML for Cancelling trade with Trade ID : " +trade.getBbgtradeid());
		
		ct.setVersion("1.0");
		ct.setCircleId(trade.getInvTradeRid());
		ct.setCancellationDate(trade.getAsofdate().toString());
		ct.setCancellationReasonCode("OTHR");
		ct.setCancellationComment("Cancelled by Automated Trade API");
		
		//XmlResponse response = null;
		
		try {

			JAXBContext jaxbContext = JAXBContext.newInstance("com.poc.loans.bbgtrades.xml.request");
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.setProperty("com.sun.xml.internal.bind.xmlHeaders",
					"\n<!DOCTYPE CancelTrade SYSTEM  \"CancelTrade.dtd\">");

			StringWriter sw = new StringWriter();
			jaxbMarshaller.marshal(ct, sw);

			String request = sw.toString();

			//make api calls
			//response = 
					apiCall.call(trade, request);
			//responseHandler.handleResponse(trade, response, request);

		} catch (JAXBException | IOException e) {
			e.printStackTrace();
		}
	}

	public void createAmendTrade(BBGStagedTrade trade) {
		// not implemented yet
	}
	
	public VlsDeal getDeal(String dealRid) {
		return dealRepo.findOne(dealRid);
	}

	public VlsFacility getFacility(String facilityRid) {
		return facMap.get(facilityRid);
	}

	public VlsCustLocation getLocation(String custRid) {
		return null;
	}

	public List<VlsMisCode> getMisCode(String misCode) {
		return misMap.get(misCode);
	}

	public VlsCustomer getCustomer(String moniker) {
		LOG.info("retriving customer by moniker: " + moniker.trim());
		return customerMap.get(moniker.trim());
	}
	
	public String roundToThreeDec(float value) {
		String roundValue = String.format("%.3f %n", value);
		return roundValue;
	}
	
	public String roundToThreeDec(Double value) {
		String roundValue = String.format("%.3f %n", value);
		return roundValue;
	}
	
	public VlsFacPortPos getPosition(String facility, String expense, String portfolio, String branch) {
		return facPortPosRepo.findByFppPidFacilityAndFppCdeExpenseStartingWithAndFppCdePortfolioStartingWithAndFppCdeBranchStartingWith(facility, expense, portfolio, branch);
	}
}
