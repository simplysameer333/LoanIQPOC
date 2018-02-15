package com.poc.loans.bbgtrades.api;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.poc.loans.bbgtrades.loaniq.ApiCall;
import com.poc.loans.bbgtrades.repo.bbg.BBGLoaniqBookMap;
import com.poc.loans.bbgtrades.repo.bbg.BBGStagedTrade;
import com.poc.loans.bbgtrades.repo.bbg.RawBBGSecurityStatic;
import com.poc.loans.bbgtrades.repo.loaniq.VlsCustLocation;
import com.poc.loans.bbgtrades.repo.loaniq.VlsCustomer;
import com.poc.loans.bbgtrades.repo.loaniq.VlsDeal;
import com.poc.loans.bbgtrades.repo.loaniq.VlsFacility;
import com.poc.loans.bbgtrades.repo.loaniq.VlsMisCode;
import com.poc.loans.bbgtrades.services.BBGService;
import com.poc.loans.bbgtrades.services.LoanIQService;

@Component
public class ReferenceDataManager {

	@Autowired
	protected BBGService bbgService;

	@Autowired
	protected LoanIQService loaniqService;

	@Autowired
	protected ApiCall loaniqApiService;

	private static final Log LOG = LogFactory.getLog(ReferenceDataManager.class);

	public void addReferenceData(List<BBGStagedTrade> trades) {
		
		Map<String, String> dealcheck = new HashMap<String, String>();
		Map<String, String> facilitycheck = new HashMap<String, String>();
		
		List<BBGStagedTrade> amendTrades = new ArrayList<BBGStagedTrade>();
		Set<Integer> amendTickets = new HashSet<Integer>();
		Set<Integer> cancelledTickets = new HashSet<Integer>();
		// List<BBGStagedTrade> eligibleTrades = new ArrayList<BBGStagedTrade>();

		// Buckets for trades to be skipped and rejected
		trades.forEach(trade -> {
			if (trade.isCancelTrade()) {
				cancelledTickets.add(trade.getTicketNumber());
			} else if (trade.isAmendment()) {
				amendTickets.add(trade.getTicketNumber());
				amendTrades.add(trade);
			} /*
				 * else { eligibleTrades.add(trade); }
				 */

		});

		trades.forEach(trade -> {

			if (!amendTickets.contains(trade.getTicketNumber())) {

				if (!cancelledTickets.contains(trade.getTicketNumber())) {

					LOG.info("##################### processing trade: " + trade.getTicketNumber());

					// get security static
					RawBBGSecurityStatic security = bbgService.getSecurity(trade.getFirm_Identifier());
					if (security != null) {

						LOG.info("Security found:" + security.getDeal_name());
						trade.setAmt_issued(
								security.getAmt_issued() == null ? null : security.getAmt_issued().floatValue());
						trade.setAmt_outstanding(security.getAmt_outstanding() == null ? null
								: security.getAmt_outstanding().floatValue());
						trade.setDay_cnt_des(security.getDay_cnt_des());
						trade.setDeal_name(security.getDeal_name());
						trade.setIssue_dt(security.getIssue_dt());
						trade.setLn_deal_id(security.getLn_deal_id());
						trade.setId_cusip(security.getId_cusip());
						trade.setId_isin(security.getId_isin());
						trade.setMaturity(security.getMaturity() == null ? null : security.getMaturity().toString());
						trade.setSecurity_short_des(security.getSecurity_short_des());
						trade.setSecurity_type(security.getSecurity_typ());
						Long l = security.getLn_deal_amt() == null ? null : security.getLn_deal_amt().longValue();
						if (null != l) {
							trade.setDealAmount(BigInteger.valueOf(l));
						}

					} else {
						LOG.error("No security static found for : " + trade.getFirm_Identifier());
						trade.setValidationError("NO SECURITY STATIC");
						trade.setStatus("REJECT");
						return;
					}

					// pick the book map to use
					BBGLoaniqBookMap bbgLoaniqBookMap = BookMapPicker
							.pickBookMap(bbgService.getBookMap(trade.getTrader_name()), trade);
					if (bbgLoaniqBookMap != null) {
						LOG.info("found matching bookmap: " + bbgLoaniqBookMap.toString());
						trade.setBranchCode(bbgLoaniqBookMap.getLiq_branch());
						trade.setExpenseCode(bbgLoaniqBookMap.getLiq_exp_code());
						trade.setPortfolioCode(bbgLoaniqBookMap.getLiq_portfolio_code());
						trade.setRiskBook(bbgLoaniqBookMap.getLiq_risk_book_code());

					} else {
						// no book map
						LOG.error("no book map found for trader: " + trade.getTrader_name());
						trade.setValidationError("NO BOOK MAP");
						trade.setStatus("REJECT");
						return;
					}

					// get customer using moniker from alias
					VlsCustomer customer = null;
					String transactionAcc = trade.getTransaction_account();
					transactionAcc = StringUtils.replace(trade.getTransaction_account(), "_USL", StringUtils.EMPTY); // get
																														// the
																														// moniker
																														// from
																														// transaction
																														// account

					if (transactionAcc != null) {
						customer = loaniqService.getCustomer(transactionAcc);
						customer = CustomerPicker.pickCustomer(customer, trade);
					}

					trade.setCustomerInternalId(customer.getCusCidCustID());

					// get Location from customer
					VlsCustLocation loc = null;
					if (customer != null) {
						loc = LocationPicker.pickLocation(customer.getLocations(), trade);
						if (loc != null) {
							trade.setLocationCode(loc.getCloCdeLocation());
						} else {
							trade.setStatus("REJECT");
							trade.setValidationError("NO CUSTOMER LOCATION");
							return;
						}
					}

					VlsMisCode misCode = null;
					
					// get mis code firm identifier for the facility
					List<VlsMisCode> misCodes = loaniqService.getMisCode(trade.getFirm_Identifier());
					
					if (misCodes == null || misCodes.size() == 0) {
						
						// assume that when mis code is missing, deal and facility is missing
						// if (trade.getStatus().equals("ERROR")) {
						// LOG.info("Trade already in error status, skip create deal and facility");
						// } else {
							try {
								if (dealcheck.size() == 0 || null == dealcheck.get(trade.getFirm_Identifier()) || 
										"Fail".equals(dealcheck.get(trade.getFirm_Identifier()))){
									VlsDeal deal = loaniqService.createDeal(trade);
									trade.setDealInternalId(deal.getDeaPidDeal());
									dealcheck.put(trade.getFirm_Identifier(), trade.getDealInternalId());
								} else {
									trade.setDealInternalId(dealcheck.get(trade.getFirm_Identifier()));
								}
								//VlsDeal deal = loaniqService.createDeal(trade);
								//trade.setDealInternalId(deal.getDeaPidDeal());
								
							} catch (Throwable t) {
								LOG.info("Create Deal error: " + t.getMessage());
								trade.setStatus("ERROR");
								trade.setProcessError("FAILED TO CREATE DEAL: " + t.getMessage());
								dealcheck.put(trade.getFirm_Identifier(), "Fail");
								return;
							}

							try {
								if (facilitycheck.size() == 0 || null == facilitycheck.get(trade.getFirm_Identifier()) || 
										"Fail".equals(facilitycheck.get(trade.getFirm_Identifier()))){
									VlsFacility fac = loaniqService.createFacility(trade);
									trade.setFacilityInternalId(fac.getFacPidFacility());
									facilitycheck.put(trade.getFirm_Identifier(), trade.getFacilityInternalId());
								} else {
									trade.setDealInternalId(facilitycheck.get(trade.getFirm_Identifier()));
								}
								//VlsFacility fac = loaniqService.createFacility(trade);
								//trade.setFacilityInternalId(fac.getFacPidFacility());
							} catch (Throwable t) {
								LOG.info("Create Facility error: " + t.getMessage());
								trade.setStatus("ERROR");
								trade.setProcessError("FAILED TO CREATE FACILITY: " + t.getMessage());
								facilitycheck.put(trade.getFirm_Identifier(), "Fail");
								return;
							}
						// }

					} else if (misCodes.size() != 1) {

						LOG.error("Number of MIS Code found for BBGID: " + misCodes.size());
						trade.setValidationError("MULTIPLE FAC MIS CODE FOUND");
						trade.setStatus("REJECT");
						return;

					} else {

						misCode = misCodes.get(0);
						// get deal using the facility id from mis code
						// TODO refactor this code to get deal directly from facility
						VlsDeal deal = null;
						if (misCode != null) {

							VlsFacility fac = loaniqService.getFacility(misCode.getMicPidProductId());
							if (fac != null) {
								trade.setFacilityInternalId(fac.getFacPidFacility());

								deal = loaniqService.getDeal(fac.getFacPidDeal());
								if (deal != null) {
									trade.setDealInternalId(deal.getDeaPidDeal());
								}
							} else {
								trade.setStatus("REJECT");
								trade.setValidationError("UNABLE TO FIND FACILITY and DEAL USING MISCODE");
								return;
							}
						}
					}

				} else {
					trade.setStatus("SKIPPED");
					trade.setValidationError("TRADE ALREADY CANCELLED");
				}
			} else {
				trade.setStatus("SKIPPED");
				trade.setValidationError("AMENDMENT");
			}
		});

		/*
		 * amendTrades.forEach(amend -> { if
		 * (!cancelledTickets.contains(amend.getTicketNumber())) {
		 * //loaniqService.createAmendTrade(amend); amend.setStatus("SKIPPED");
		 * amend.setValidationError("AMENDMENT"); } });
		 */

	}
}
