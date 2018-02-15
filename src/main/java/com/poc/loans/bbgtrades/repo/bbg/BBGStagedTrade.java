
package com.poc.loans.bbgtrades.repo.bbg;

import java.math.BigInteger;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "BBG_LIQ_LEVEL_II")
public class BBGStagedTrade implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "buySellCode")
	private String buySellCode;

	@Column(name = "investmentType")
	private String investmentType;

	@Column(name = "isDistressed")
	private String isDistressed;

	@Column(name = "Deal_RID")
	private String dealInternalId;

	@Column(name = "tradeDate")
	private Timestamp tradeDate;

	@Column(name = "circleFinalStatusCode")
	private String circleFinalStatusCode;

	@Column(name = "branchCode")
	private String branchCode;

	@Column(name = "trader")
	private String trader;

	@Column(name = "riskBook")
	private String riskBook;

	@Column(name = "settleNet")
	private String settleNet;

	@Column(name = "interestFeeSettlement")
	private String interestFeeSettlement;

	@Column(name = "pricingComment")
	private String pricingComment;

	@Column(name = "eventComment")
	private String eventComment;

	@Column(name = "expectedCloseDate")
	private String expectedCloseDate;

	@Column(name = "Customer_RID")
	private String customerInternalId;

	@Column(name = "locationCode")
	private String locationCode;

	@Column(name = "Facility_RID")
	private String facilityInternalId;

	@Column(name = "price")
	private String price;

	@Column(name = "interestSkim")
	private Float interestSkim;

	@Column(name = "portfolioCode")
	private String portfolioCode;

	@Column(name = "expenseCode")
	private String expenseCode;

	@Column(name = "facilityCurrencyAmount")
	private Float facilityCurrencyAmount;

	@Column(name = "trader_name")
	private String trader_name;

	@Column(name = "ticketNumber")
	private int ticketNumber;

	@Column(name = "originalTicketNumber")
	private int originalTicketNumber;

	@Column(name = "firm_Identifier")
	private String firm_Identifier;

	@Column(name = "trade_feed_Amount")
	private Float trade_feed_Amount;

	@Column(name = "currency")
	private String currency;

	@Column(name = "asofdate")
	private Timestamp asofdate;

	@Column(name = "Transaction_account")
	private String Transaction_account;

	@Column(name = "bbgtradeid")
	private int bbgtradeid;

	@Column(name = "ln_deal_id")
	private String ln_deal_id;

	@Column(name = "deal_name")
	private String deal_name;

	@Column(name = "id_isin")
	private String id_isin;

	@Column(name = "id_cusip")
	private String id_cusip;

	@Column(name = "security_short_des")
	private String security_short_des;

	@Column(name = "security_type")
	private String security_type;

	@Column(name = "amt_issued")
	private Float amt_issued;

	@Column(name = "amt_outstanding")
	private Float amt_outstanding;

	@Column(name = "day_cnt_des")
	private String day_cnt_des;

	@Column(name = "Maturity")
	private String Maturity;

	@Column(name = "issue_dt")
	private Timestamp issue_dt;

	@Column(name ="STATUS")
	private String status;

	@Column(name = "VALIDATION_ERROR")
	private String validationError;

	@Column(name = "PROCESS_ERROR")
	private String processError;

	@Column(name = "ProcessResult")
	private String processResult;

	@Column(name = "MIS_TYPE")
	private String misType;

	@Column(name = "MIS_VALUE")
	private String misValue;

	@Column(name = "Inv_TradeRid")
	private String invTradeRid;

	@Column(name = "Fac_Inv_TradeRid")
	private String facInvTradeRid;

	@Column(name = "BBG_TRADE_TYPE")
	private String bbgTradeType;

	@Column(name = "TRANSACTION_TYPE")
	private String transactionType;

	@Transient
	private BigInteger dealAmount;

	@CreationTimestamp
	@Column(name = "INSERT_TIMESTAMP")
	private Timestamp insertTimestamp;

	@Column(name = "PROCESS_TIMESTAMP")
	private Timestamp processTimestamp;



	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the buySellCode
	 */
	public String getBuySellCode() {
		return buySellCode;
	}

	/**
	 * @param buySellCode the buySellCode to set
	 */
	public void setBuySellCode(String buySellCode) {
		this.buySellCode = buySellCode;
	}

	/**
	 * @return the investmentType
	 */
	public String getInvestmentType() {
		return investmentType;
	}

	/**
	 * @param investmentType the investmentType to set
	 */
	public void setInvestmentType(String investmentType) {
		this.investmentType = investmentType;
	}

	/**
	 * @return the isDistressed
	 */
	public String getIsDistressed() {
		return isDistressed;
	}

	/**
	 * @param isDistressed the isDistressed to set
	 */
	public void setIsDistressed(String isDistressed) {
		this.isDistressed = isDistressed;
	}

	/**
	 * @return the dealInternalId
	 */
	public String getDealInternalId() {
		return dealInternalId;
	}

	/**
	 * @param dealInternalId the dealInternalId to set
	 */
	public void setDealInternalId(String dealInternalId) {
		this.dealInternalId = dealInternalId;
	}

	/**
	 * @return the tradeDate
	 */
	public Timestamp getTradeDate() {
		return tradeDate;
	}

	/**
	 * @param tradeDate the tradeDate to set
	 */
	public void setTradeDate(Timestamp tradeDate) {
		this.tradeDate = tradeDate;
	}

	/**
	 * @return the circleFinalStatusCode
	 */
	public String getCircleFinalStatusCode() {
		return circleFinalStatusCode;
	}

	/**
	 * @param circleFinalStatusCode the circleFinalStatusCode to set
	 */
	public void setCircleFinalStatusCode(String circleFinalStatusCode) {
		this.circleFinalStatusCode = circleFinalStatusCode;
	}

	/**
	 * @return the branchCode
	 */
	public String getBranchCode() {
		return branchCode;
	}

	/**
	 * @param branchCode the branchCode to set
	 */
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	/**
	 * @return the trader
	 */
	public String getTrader() {
		return trader;
	}

	/**
	 * @param trader the trader to set
	 */
	public void setTrader(String trader) {
		this.trader = trader;
	}

	/**
	 * @return the riskBook
	 */
	public String getRiskBook() {
		return riskBook;
	}

	/**
	 * @param riskBook the riskBook to set
	 */
	public void setRiskBook(String riskBook) {
		this.riskBook = riskBook;
	}

	/**
	 * @return the settleNet
	 */
	public String getSettleNet() {
		return settleNet;
	}

	/**
	 * @param settleNet the settleNet to set
	 */
	public void setSettleNet(String settleNet) {
		this.settleNet = settleNet;
	}

	/**
	 * @return the interestFeeSettlement
	 */
	public String getInterestFeeSettlement() {
		return interestFeeSettlement;
	}

	/**
	 * @param interestFeeSettlement the interestFeeSettlement to set
	 */
	public void setInterestFeeSettlement(String interestFeeSettlement) {
		this.interestFeeSettlement = interestFeeSettlement;
	}

	/**
	 * @return the pricingComment
	 */
	public String getPricingComment() {
		return pricingComment;
	}

	/**
	 * @param pricingComment the pricingComment to set
	 */
	public void setPricingComment(String pricingComment) {
		this.pricingComment = pricingComment;
	}

	/**
	 * @return the eventComment
	 */
	public String getEventComment() {
		return eventComment;
	}

	/**
	 * @param eventComment the eventComment to set
	 */
	public void setEventComment(String eventComment) {
		this.eventComment = eventComment;
	}

	/**
	 * @return the expectedCloseDate
	 */
	public String getExpectedCloseDate() {
		return expectedCloseDate;
	}

	/**
	 * @param expectedCloseDate the expectedCloseDate to set
	 */
	public void setExpectedCloseDate(String expectedCloseDate) {
		this.expectedCloseDate = expectedCloseDate;
	}

	/**
	 * @return the customerInternalId
	 */
	public String getCustomerInternalId() {
		return customerInternalId;
	}

	/**
	 * @param customerInternalId the customerInternalId to set
	 */
	public void setCustomerInternalId(String customerInternalId) {
		this.customerInternalId = customerInternalId;
	}

	/**
	 * @return the locationCode
	 */
	public String getLocationCode() {
		return locationCode;
	}

	/**
	 * @param locationCode the locationCode to set
	 */
	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	/**
	 * @return the facilityInternalId
	 */
	public String getFacilityInternalId() {
		return facilityInternalId;
	}

	/**
	 * @param facilityInternalId the facilityInternalId to set
	 */
	public void setFacilityInternalId(String facilityInternalId) {
		this.facilityInternalId = facilityInternalId;
	}

	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}

	/**
	 * @return the interestSkim
	 */
	public Float getInterestSkim() {
		return interestSkim;
	}

	/**
	 * @param interestSkim the interestSkim to set
	 */
	public void setInterestSkim(Float interestSkim) {
		this.interestSkim = interestSkim;
	}

	/**
	 * @return the portfolioCode
	 */
	public String getPortfolioCode() {
		return portfolioCode;
	}

	/**
	 * @param portfolioCode the portfolioCode to set
	 */
	public void setPortfolioCode(String portfolioCode) {
		this.portfolioCode = portfolioCode;
	}

	/**
	 * @return the expenseCode
	 */
	public String getExpenseCode() {
		return expenseCode;
	}

	/**
	 * @param expenseCode the expenseCode to set
	 */
	public void setExpenseCode(String expenseCode) {
		this.expenseCode = expenseCode;
	}

	/**
	 * @return the facilityCurrencyAmount
	 */
	public Float getFacilityCurrencyAmount() {
		return facilityCurrencyAmount;
	}

	/**
	 * @param facilityCurrencyAmount the facilityCurrencyAmount to set
	 */
	public void setFacilityCurrencyAmount(Float facilityCurrencyAmount) {
		this.facilityCurrencyAmount = facilityCurrencyAmount;
	}

	/**
	 * @return the trader_name
	 */
	public String getTrader_name() {
		return trader_name;
	}

	/**
	 * @param trader_name the trader_name to set
	 */
	public void setTrader_name(String trader_name) {
		this.trader_name = trader_name;
	}

	/**
	 * @return the ticketNumber
	 */
	public int getTicketNumber() {
		return ticketNumber;
	}

	/**
	 * @param ticketNumber the ticketNumber to set
	 */
	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	/**
	 * @return the originalTicketNumber
	 */
	public int getOriginalTicketNumber() {
		return originalTicketNumber;
	}

	/**
	 * @param originalTicketNumber the originalTicketNumber to set
	 */
	public void setOriginalTicketNumber(int originalTicketNumber) {
		this.originalTicketNumber = originalTicketNumber;
	}

	/**
	 * @return the firm_Identifier
	 */
	public String getFirm_Identifier() {
		return firm_Identifier;
	}

	/**
	 * @param firm_Identifier the firm_Identifier to set
	 */
	public void setFirm_Identifier(String firm_Identifier) {
		this.firm_Identifier = firm_Identifier;
	}

	/**
	 * @return the trade_feed_Amount
	 */
	public Float getTrade_feed_Amount() {
		return trade_feed_Amount;
	}

	/**
	 * @param trade_feed_Amount the trade_feed_Amount to set
	 */
	public void setTrade_feed_Amount(Float trade_feed_Amount) {
		this.trade_feed_Amount = trade_feed_Amount;
	}

	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * @return the asofdate
	 */
	public Timestamp getAsofdate() {
		return asofdate;
	}

	/**
	 * @param asofdate the asofdate to set
	 */
	public void setAsofdate(Timestamp asofdate) {
		this.asofdate = asofdate;
	}

	/**
	 * @return the transaction_account
	 */
	public String getTransaction_account() {
		return Transaction_account;
	}

	/**
	 * @param transaction_account the transaction_account to set
	 */
	public void setTransaction_account(String transaction_account) {
		Transaction_account = transaction_account;
	}

	/**
	 * @return the bbgtradeid
	 */
	public int getBbgtradeid() {
		return bbgtradeid;
	}

	/**
	 * @param bbgtradeid the bbgtradeid to set
	 */
	public void setBbgtradeid(int bbgtradeid) {
		this.bbgtradeid = bbgtradeid;
	}

	/**
	 * @return the ln_deal_id
	 */
	public String getLn_deal_id() {
		return ln_deal_id;
	}

	/**
	 * @param ln_deal_id the ln_deal_id to set
	 */
	public void setLn_deal_id(String ln_deal_id) {
		this.ln_deal_id = ln_deal_id;
	}

	/**
	 * @return the deal_name
	 */
	public String getDeal_name() {
		return deal_name;
	}

	/**
	 * @param deal_name the deal_name to set
	 */
	public void setDeal_name(String deal_name) {
		this.deal_name = deal_name;
	}

	/**
	 * @return the id_isin
	 */
	public String getId_isin() {
		return id_isin;
	}

	/**
	 * @param id_isin the id_isin to set
	 */
	public void setId_isin(String id_isin) {
		this.id_isin = id_isin;
	}

	/**
	 * @return the id_cusip
	 */
	public String getId_cusip() {
		return id_cusip;
	}

	/**
	 * @param id_cusip the id_cusip to set
	 */
	public void setId_cusip(String id_cusip) {
		this.id_cusip = id_cusip;
	}

	/**
	 * @return the security_short_des
	 */
	public String getSecurity_short_des() {
		return security_short_des;
	}

	/**
	 * @param security_short_des the security_short_des to set
	 */
	public void setSecurity_short_des(String security_short_des) {
		this.security_short_des = security_short_des;
	}

	/**
	 * @return the security_type
	 */
	public String getSecurity_type() {
		return security_type;
	}

	/**
	 * @param security_type the security_type to set
	 */
	public void setSecurity_type(String security_type) {
		this.security_type = security_type;
	}

	/**
	 * @return the amt_issued
	 */
	public Float getAmt_issued() {
		return amt_issued;
	}

	/**
	 * @param amt_issued the amt_issued to set
	 */
	public void setAmt_issued(Float amt_issued) {
		this.amt_issued = amt_issued;
	}

	/**
	 * @return the amt_outstanding
	 */
	public Float getAmt_outstanding() {
		return amt_outstanding;
	}

	/**
	 * @param amt_outstanding the amt_outstanding to set
	 */
	public void setAmt_outstanding(Float amt_outstanding) {
		this.amt_outstanding = amt_outstanding;
	}

	/**
	 * @return the day_cnt_des
	 */
	public String getDay_cnt_des() {
		return day_cnt_des;
	}

	/**
	 * @param day_cnt_des the day_cnt_des to set
	 */
	public void setDay_cnt_des(String day_cnt_des) {
		this.day_cnt_des = day_cnt_des;
	}

	/**
	 * @return the maturity
	 */
	public String getMaturity() {
		return Maturity;
	}

	/**
	 * @param maturity the maturity to set
	 */
	public void setMaturity(String maturity) {
		Maturity = maturity;
	}

	/**
	 * @return the issue_dt
	 */
	public Timestamp getIssue_dt() {
		return issue_dt;
	}

	/**
	 * @param issue_dt the issue_dt to set
	 */
	public void setIssue_dt(Timestamp issue_dt) {
		this.issue_dt = issue_dt;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the validationError
	 */
	public String getValidationError() {
		return validationError;
	}

	/**
	 * @param validationError the validationError to set
	 */
	public void setValidationError(String validationError) {
		this.validationError = validationError;
	}

	/**
	 * @return the processError
	 */
	public String getProcessError() {
		return processError;
	}

	/**
	 * @param processError the processError to set
	 */
	public void setProcessError(String processError) {
		this.processError = processError;
	}

	/**
	 * @return the processResult
	 */
	public String getProcessResult() {
		return processResult;
	}

	/**
	 * @param processResult the processResult to set
	 */
	public void setProcessResult(String processResult) {
		this.processResult = processResult;
	}

	/**
	 * @return the misType
	 */
	public String getMisType() {
		return misType;
	}

	/**
	 * @param misType the misType to set
	 */
	public void setMisType(String misType) {
		this.misType = misType;
	}

	/**
	 * @return the misValue
	 */
	public String getMisValue() {
		return misValue;
	}

	/**
	 * @param misValue the misValue to set
	 */
	public void setMisValue(String misValue) {
		this.misValue = misValue;
	}

	/**
	 * @return the invTradeRid
	 */
	public String getInvTradeRid() {
		return invTradeRid;
	}

	/**
	 * @param invTradeRid the invTradeRid to set
	 */
	public void setInvTradeRid(String invTradeRid) {
		this.invTradeRid = invTradeRid;
	}

	/**
	 * @return the facInvTradeRid
	 */
	public String getFacInvTradeRid() {
		return facInvTradeRid;
	}

	/**
	 * @param facInvTradeRid the facInvTradeRid to set
	 */
	public void setFacInvTradeRid(String facInvTradeRid) {
		this.facInvTradeRid = facInvTradeRid;
	}

	/**
	 * @return the bbgTradeType
	 */
	public String getBbgTradeType() {
		return bbgTradeType;
	}

	/**
	 * @param bbgTradeType the bbgTradeType to set
	 */
	public void setBbgTradeType(String bbgTradeType) {
		this.bbgTradeType = bbgTradeType;
	}

	/**
	 * @return the transactionType
	 */
	public String getTransactionType() {
		return transactionType;
	}

	/**
	 * @param transactionType the transactionType to set
	 */
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	/**
	 * @return the insertTimestamp
	 */
	public Timestamp getInsertTimestamp() {
		return insertTimestamp;
	}

	/**
	 * @param insertTimestamp the insertTimestamp to set
	 */
	public void setInsertTimestamp(Timestamp insertTimestamp) {
		this.insertTimestamp = insertTimestamp;
	}

	/**
	 * @return the processTimestamp
	 */
	public Timestamp getProcessTimestamp() {
		return processTimestamp;
	}

	/**
	 * @param processTimestamp the processTimestamp to set
	 */
	public void setProcessTimestamp(Timestamp processTimestamp) {
		this.processTimestamp = processTimestamp;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Maturity == null) ? 0 : Maturity.hashCode());
		result = prime * result + ((Transaction_account == null) ? 0 : Transaction_account.hashCode());
		result = prime * result + ((amt_issued == null) ? 0 : amt_issued.hashCode());
		result = prime * result + ((amt_outstanding == null) ? 0 : amt_outstanding.hashCode());
		result = prime * result + ((asofdate == null) ? 0 : asofdate.hashCode());
		result = prime * result + ((bbgTradeType == null) ? 0 : bbgTradeType.hashCode());
		result = prime * result + bbgtradeid;
		result = prime * result + ((branchCode == null) ? 0 : branchCode.hashCode());
		result = prime * result + ((buySellCode == null) ? 0 : buySellCode.hashCode());
		result = prime * result + ((circleFinalStatusCode == null) ? 0 : circleFinalStatusCode.hashCode());
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		result = prime * result + ((customerInternalId == null) ? 0 : customerInternalId.hashCode());
		result = prime * result + ((day_cnt_des == null) ? 0 : day_cnt_des.hashCode());
		result = prime * result + ((dealAmount == null) ? 0 : dealAmount.hashCode());
		result = prime * result + ((dealInternalId == null) ? 0 : dealInternalId.hashCode());
		result = prime * result + ((deal_name == null) ? 0 : deal_name.hashCode());
		result = prime * result + ((eventComment == null) ? 0 : eventComment.hashCode());
		result = prime * result + ((expectedCloseDate == null) ? 0 : expectedCloseDate.hashCode());
		result = prime * result + ((expenseCode == null) ? 0 : expenseCode.hashCode());
		result = prime * result + ((facInvTradeRid == null) ? 0 : facInvTradeRid.hashCode());
		result = prime * result + ((facilityCurrencyAmount == null) ? 0 : facilityCurrencyAmount.hashCode());
		result = prime * result + ((facilityInternalId == null) ? 0 : facilityInternalId.hashCode());
		result = prime * result + ((firm_Identifier == null) ? 0 : firm_Identifier.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((id_cusip == null) ? 0 : id_cusip.hashCode());
		result = prime * result + ((id_isin == null) ? 0 : id_isin.hashCode());
		result = prime * result + ((insertTimestamp == null) ? 0 : insertTimestamp.hashCode());
		result = prime * result + ((interestFeeSettlement == null) ? 0 : interestFeeSettlement.hashCode());
		result = prime * result + ((interestSkim == null) ? 0 : interestSkim.hashCode());
		result = prime * result + ((invTradeRid == null) ? 0 : invTradeRid.hashCode());
		result = prime * result + ((investmentType == null) ? 0 : investmentType.hashCode());
		result = prime * result + ((isDistressed == null) ? 0 : isDistressed.hashCode());
		result = prime * result + ((issue_dt == null) ? 0 : issue_dt.hashCode());
		result = prime * result + ((ln_deal_id == null) ? 0 : ln_deal_id.hashCode());
		result = prime * result + ((locationCode == null) ? 0 : locationCode.hashCode());
		result = prime * result + ((misType == null) ? 0 : misType.hashCode());
		result = prime * result + ((misValue == null) ? 0 : misValue.hashCode());
		result = prime * result + originalTicketNumber;
		result = prime * result + ((portfolioCode == null) ? 0 : portfolioCode.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((pricingComment == null) ? 0 : pricingComment.hashCode());
		result = prime * result + ((processError == null) ? 0 : processError.hashCode());
		result = prime * result + ((processResult == null) ? 0 : processResult.hashCode());
		result = prime * result + ((processTimestamp == null) ? 0 : processTimestamp.hashCode());
		result = prime * result + ((riskBook == null) ? 0 : riskBook.hashCode());
		result = prime * result + ((security_short_des == null) ? 0 : security_short_des.hashCode());
		result = prime * result + ((security_type == null) ? 0 : security_type.hashCode());
		result = prime * result + ((settleNet == null) ? 0 : settleNet.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ticketNumber;
		result = prime * result + ((tradeDate == null) ? 0 : tradeDate.hashCode());
		result = prime * result + ((trade_feed_Amount == null) ? 0 : trade_feed_Amount.hashCode());
		result = prime * result + ((trader == null) ? 0 : trader.hashCode());
		result = prime * result + ((trader_name == null) ? 0 : trader_name.hashCode());
		result = prime * result + ((transactionType == null) ? 0 : transactionType.hashCode());
		result = prime * result + ((validationError == null) ? 0 : validationError.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BBGStagedTrade other = (BBGStagedTrade) obj;
		if (Maturity == null) {
			if (other.Maturity != null)
				return false;
		} else if (!Maturity.equals(other.Maturity))
			return false;
		if (Transaction_account == null) {
			if (other.Transaction_account != null)
				return false;
		} else if (!Transaction_account.equals(other.Transaction_account))
			return false;
		if (amt_issued == null) {
			if (other.amt_issued != null)
				return false;
		} else if (!amt_issued.equals(other.amt_issued))
			return false;
		if (amt_outstanding == null) {
			if (other.amt_outstanding != null)
				return false;
		} else if (!amt_outstanding.equals(other.amt_outstanding))
			return false;
		if (asofdate == null) {
			if (other.asofdate != null)
				return false;
		} else if (!asofdate.equals(other.asofdate))
			return false;
		if (bbgTradeType == null) {
			if (other.bbgTradeType != null)
				return false;
		} else if (!bbgTradeType.equals(other.bbgTradeType))
			return false;
		if (bbgtradeid != other.bbgtradeid)
			return false;
		if (branchCode == null) {
			if (other.branchCode != null)
				return false;
		} else if (!branchCode.equals(other.branchCode))
			return false;
		if (buySellCode == null) {
			if (other.buySellCode != null)
				return false;
		} else if (!buySellCode.equals(other.buySellCode))
			return false;
		if (circleFinalStatusCode == null) {
			if (other.circleFinalStatusCode != null)
				return false;
		} else if (!circleFinalStatusCode.equals(other.circleFinalStatusCode))
			return false;
		if (currency == null) {
			if (other.currency != null)
				return false;
		} else if (!currency.equals(other.currency))
			return false;
		if (customerInternalId == null) {
			if (other.customerInternalId != null)
				return false;
		} else if (!customerInternalId.equals(other.customerInternalId))
			return false;
		if (day_cnt_des == null) {
			if (other.day_cnt_des != null)
				return false;
		} else if (!day_cnt_des.equals(other.day_cnt_des))
			return false;
		if (dealAmount == null) {
			if (other.dealAmount != null)
				return false;
		} else if (!dealAmount.equals(other.dealAmount))
			return false;
		if (dealInternalId == null) {
			if (other.dealInternalId != null)
				return false;
		} else if (!dealInternalId.equals(other.dealInternalId))
			return false;
		if (deal_name == null) {
			if (other.deal_name != null)
				return false;
		} else if (!deal_name.equals(other.deal_name))
			return false;
		if (eventComment == null) {
			if (other.eventComment != null)
				return false;
		} else if (!eventComment.equals(other.eventComment))
			return false;
		if (expectedCloseDate == null) {
			if (other.expectedCloseDate != null)
				return false;
		} else if (!expectedCloseDate.equals(other.expectedCloseDate))
			return false;
		if (expenseCode == null) {
			if (other.expenseCode != null)
				return false;
		} else if (!expenseCode.equals(other.expenseCode))
			return false;
		if (facInvTradeRid == null) {
			if (other.facInvTradeRid != null)
				return false;
		} else if (!facInvTradeRid.equals(other.facInvTradeRid))
			return false;
		if (facilityCurrencyAmount == null) {
			if (other.facilityCurrencyAmount != null)
				return false;
		} else if (!facilityCurrencyAmount.equals(other.facilityCurrencyAmount))
			return false;
		if (facilityInternalId == null) {
			if (other.facilityInternalId != null)
				return false;
		} else if (!facilityInternalId.equals(other.facilityInternalId))
			return false;
		if (firm_Identifier == null) {
			if (other.firm_Identifier != null)
				return false;
		} else if (!firm_Identifier.equals(other.firm_Identifier))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (id_cusip == null) {
			if (other.id_cusip != null)
				return false;
		} else if (!id_cusip.equals(other.id_cusip))
			return false;
		if (id_isin == null) {
			if (other.id_isin != null)
				return false;
		} else if (!id_isin.equals(other.id_isin))
			return false;
		if (insertTimestamp == null) {
			if (other.insertTimestamp != null)
				return false;
		} else if (!insertTimestamp.equals(other.insertTimestamp))
			return false;
		if (interestFeeSettlement == null) {
			if (other.interestFeeSettlement != null)
				return false;
		} else if (!interestFeeSettlement.equals(other.interestFeeSettlement))
			return false;
		if (interestSkim == null) {
			if (other.interestSkim != null)
				return false;
		} else if (!interestSkim.equals(other.interestSkim))
			return false;
		if (invTradeRid == null) {
			if (other.invTradeRid != null)
				return false;
		} else if (!invTradeRid.equals(other.invTradeRid))
			return false;
		if (investmentType == null) {
			if (other.investmentType != null)
				return false;
		} else if (!investmentType.equals(other.investmentType))
			return false;
		if (isDistressed == null) {
			if (other.isDistressed != null)
				return false;
		} else if (!isDistressed.equals(other.isDistressed))
			return false;
		if (issue_dt == null) {
			if (other.issue_dt != null)
				return false;
		} else if (!issue_dt.equals(other.issue_dt))
			return false;
		if (ln_deal_id == null) {
			if (other.ln_deal_id != null)
				return false;
		} else if (!ln_deal_id.equals(other.ln_deal_id))
			return false;
		if (locationCode == null) {
			if (other.locationCode != null)
				return false;
		} else if (!locationCode.equals(other.locationCode))
			return false;
		if (misType == null) {
			if (other.misType != null)
				return false;
		} else if (!misType.equals(other.misType))
			return false;
		if (misValue == null) {
			if (other.misValue != null)
				return false;
		} else if (!misValue.equals(other.misValue))
			return false;
		if (originalTicketNumber != other.originalTicketNumber)
			return false;
		if (portfolioCode == null) {
			if (other.portfolioCode != null)
				return false;
		} else if (!portfolioCode.equals(other.portfolioCode))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (pricingComment == null) {
			if (other.pricingComment != null)
				return false;
		} else if (!pricingComment.equals(other.pricingComment))
			return false;
		if (processError == null) {
			if (other.processError != null)
				return false;
		} else if (!processError.equals(other.processError))
			return false;
		if (processResult == null) {
			if (other.processResult != null)
				return false;
		} else if (!processResult.equals(other.processResult))
			return false;
		if (processTimestamp == null) {
			if (other.processTimestamp != null)
				return false;
		} else if (!processTimestamp.equals(other.processTimestamp))
			return false;
		if (riskBook == null) {
			if (other.riskBook != null)
				return false;
		} else if (!riskBook.equals(other.riskBook))
			return false;
		if (security_short_des == null) {
			if (other.security_short_des != null)
				return false;
		} else if (!security_short_des.equals(other.security_short_des))
			return false;
		if (security_type == null) {
			if (other.security_type != null)
				return false;
		} else if (!security_type.equals(other.security_type))
			return false;
		if (settleNet == null) {
			if (other.settleNet != null)
				return false;
		} else if (!settleNet.equals(other.settleNet))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (ticketNumber != other.ticketNumber)
			return false;
		if (tradeDate == null) {
			if (other.tradeDate != null)
				return false;
		} else if (!tradeDate.equals(other.tradeDate))
			return false;
		if (trade_feed_Amount == null) {
			if (other.trade_feed_Amount != null)
				return false;
		} else if (!trade_feed_Amount.equals(other.trade_feed_Amount))
			return false;
		if (trader == null) {
			if (other.trader != null)
				return false;
		} else if (!trader.equals(other.trader))
			return false;
		if (trader_name == null) {
			if (other.trader_name != null)
				return false;
		} else if (!trader_name.equals(other.trader_name))
			return false;
		if (transactionType == null) {
			if (other.transactionType != null)
				return false;
		} else if (!transactionType.equals(other.transactionType))
			return false;
		if (validationError == null) {
			if (other.validationError != null)
				return false;
		} else if (!validationError.equals(other.validationError))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BBGStagedTrade [id=" + id + ", buySellCode=" + buySellCode + ", investmentType=" + investmentType
				+ ", isDistressed=" + isDistressed + ", dealInternalId=" + dealInternalId + ", tradeDate="
				+ tradeDate + ", circleFinalStatusCode=" + circleFinalStatusCode + ", branchCode=" + branchCode
				+ ", trader=" + trader + ", riskBook=" + riskBook + ", settleNet=" + settleNet
				+ ", interestFeeSettlement=" + interestFeeSettlement + ", pricingComment=" + pricingComment
				+ ", eventComment=" + eventComment + ", expectedCloseDate=" + expectedCloseDate
				+ ", customerInternalId=" + customerInternalId + ", locationCode=" + locationCode
				+ ", facilityInternalId=" + facilityInternalId + ", price=" + price + ", interestSkim="
				+ interestSkim + ", portfolioCode=" + portfolioCode + ", expenseCode=" + expenseCode
				+ ", facilityCurrencyAmount=" + facilityCurrencyAmount + ", trader_name=" + trader_name
				+ ", ticketNumber=" + ticketNumber + ", originalTicketNumber=" + originalTicketNumber
				+ ", firm_Identifier=" + firm_Identifier + ", trade_feed_Amount=" + trade_feed_Amount
				+ ", currency=" + currency + ", asofdate=" + asofdate + ", Transaction_account="
				+ Transaction_account + ", bbgtradeid=" + bbgtradeid + ", ln_deal_id=" + ln_deal_id + ", deal_name="
				+ deal_name + ", id_isin=" + id_isin + ", id_cusip=" + id_cusip + ", security_short_des="
				+ security_short_des + ", security_type=" + security_type + ", amt_issued=" + amt_issued
				+ ", amt_outstanding=" + amt_outstanding + ", day_cnt_des=" + day_cnt_des + ", Maturity=" + Maturity
				+ ", issue_dt=" + issue_dt + ", status=" + status + ", validationError=" + validationError
				+ ", processError=" + processError + ", processResult=" + processResult + ", misType=" + misType
				+ ", misValue=" + misValue + ", invTradeRid=" + invTradeRid + ", facInvTradeRid=" + facInvTradeRid
				+ ", bbgTradeType=" + bbgTradeType + ", transactionType=" + transactionType + ", dealAmount="
				+ dealAmount + ", insertTimestamp=" + insertTimestamp + ", processTimestamp=" + processTimestamp
				+ "]";
	}

	public BigInteger getDealAmount() {
		return dealAmount;
	}

	public void setDealAmount(BigInteger dealAmount) {
		this.dealAmount = dealAmount;
	}

	@Transient
	public boolean isCancelTrade() {
		return transactionType.equals("XMT");
	}

	@Transient
	public boolean isAmendment() {
		return this.asofdate.compareTo(tradeDate) < 0;
	}
	
	@Transient
	public boolean isLondonZone() {
		return this.branchCode != null && "JIL".equals(this.branchCode) ? true : false;
	}
}


