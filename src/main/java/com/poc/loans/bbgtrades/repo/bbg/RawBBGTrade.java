package com.poc.loans.bbgtrades.repo.bbg;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.lang3.time.DateUtils;

@Entity
@Table(name = "RAWBBGTRADES")
public class RawBBGTrade implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "FIRM_IDENTIFIER")
	private String firmIdentifier;

	@Column(name = "TRADER_NAME")
	private String traderName;

	@Id
	@Column(name = "BBGTRADEID")
	private int bBGTradeId;

	@Column(name = "TICKET_NUMBER")
	private String ticketNumber;

	@Column(name = "ORIGINAL_TICKET_NUMBER")
	private String originalTicketNumber;

	@Column(name = "SECURITY_IDENTIFIER_FLAG")
	private String securityIdentifierFlag;

	@Column(name = "TRANSACTION_TYPE")
	private String transactionType;

	@Column(name = "SETTLEMENT_LOCATION_ABBRVTION")
	private String settlementLocationAbbrvtion;

	@Column(name = "BUY_SELL")
	private String buySell;

	@Column(name = "TRADE_FEED_AMOUNT")
	private String tradeFeedAmount;

	@Column(name = "CURRENCY")
	private String currency;

	@Column(name = "VIEW_IN_CURRENCY")
	private String viewInCurrency;

	@Column(name = "PRINCIPAL")
	private String principal;

	@Column(name = "INVERT_EXCHANGE_RATE")
	private String invertExchangeRate;

	@Column(name = "EXCHANGE_RATE")
	private String exchangeRate;

	@Column(name = "AS_OF_DATE")
	private Timestamp asOfDate;

	@Column(name = "TRADE_FEED_AS_OF_TIME")
	private String tradeFeedAsOfTime;

	@Column(name = "SETTLEMENT_DATE")
	private Timestamp settlementDate;

	@Column(name = "TRANSACTION_ACCOUNT")
	private String transactionAccount;

	@Column(name = "TRADER_LOGIN")
	private String traderLogin;

	@Column(name = "ACCRUED_INTEREST")
	private String accruedInterest;

	@Column(name = "TRANSACTION_COST_1_AMOUNT")
	private String transactionCost1Amount;

	@Column(name = "TRANSACTION_COST_1_RATE")
	private String transactionCost1Rate;

	@Column(name = "TRANSACTION_COST_1_CURRENCY")
	private String transactionCost1Currency;

	@Column(name = "TRANSACTION_COST_2_CURRENCY")
	private String transactionCost2Currency;

	@Column(name = "TRANSACTION_COST_2_RATE")
	private String transactionCost2Rate;

	@Column(name = "TRANSACTION_COST_2_AMOUNT")
	private String transactionCost2Amount;

	@Column(name = "TRANSACTION_COST_3_AMOUNT")
	private String transactionCost3Amount;

	@Column(name = "TRANSACTION_COST_3_RATE")
	private String transactionCost3Rate;

	@Column(name = "TRANSACTION_COST_3_CURRENCY")
	private String transactionCost3Currency;

	@Column(name = "TRANSACTION_COST_4_AMOUNT")
	private String transactionCost4Amount;

	@Column(name = "TRANSACTION_COST_4_RATE")
	private String transactionCost4Rate;

	@Column(name = "TRANSACTION_COST_4_CURRENCY")
	private String transactionCost4Currency;

	@Column(name = "TRANSACTION_COST_5_AMOUNT")
	private String transactionCost5Amount;

	@Column(name = "TRANSACTION_COST_5_RATE")
	private String transactionCost5Rate;

	@Column(name = "TRANSACTION_COST_5_CURRENCY")
	private String transactionCost5Currency;

	@Column(name = "LONG_NOTE_1")
	private String longNote1;

	@Column(name = "TRADE_PRICE")
	private String tradePrice;

	@Column(name = "ISSUE_DATE")
	private Timestamp issueDate;

	@Column(name = "MASTER_TICKET_NUMBER")
	private String masterTicketNumber;

	@Column(name = "TRADE_DATE")
	private Timestamp tradeDate;

	@Column(name = "FIRM_ACCOUNT_SHORT_NAME")
	private String firmAccountShortName;

	@Column(name = "GUID")
	private String guid;

	@Column(name = "CREATE_DATE")
	private Timestamp createDate;

	@Column(name = "USER_CREATE")
	private String userCreate;

	@Column(name = "UPDATE_DATE")
	private Timestamp updateDate;

	@Column(name = "USER_UPDATE")
	private String userUpdate;

	@Column(name = "STATUS")
	private String status;

	@Column(name = "COMMENTS")
	private String comments;

	@Column(name = "BBG_TRADE_TYPE")
	private String bbgTradeType;

	/**
	 * @return the firmIdentifier
	 */
	public String getFirmIdentifier() {
		return firmIdentifier;
	}

	/**
	 * @param firmIdentifier the firmIdentifier to set
	 */
	public void setFirmIdentifier(String firmIdentifier) {
		this.firmIdentifier = firmIdentifier;
	}

	/**
	 * @return the traderName
	 */
	public String getTraderName() {
		return traderName;
	}

	/**
	 * @param traderName the traderName to set
	 */
	public void setTraderName(String traderName) {
		this.traderName = traderName;
	}

	/**
	 */
	public int getbBGTradeId() {
		return bBGTradeId;
	}

	/**
	 * @param bBGTradeId the bBGTradeId to set
	 */
	public void setbBGTradeId(int bBGTradeId) {
		this.bBGTradeId = bBGTradeId;
	}

	/**
	 * @return the ticketNumber
	 */
	public String getTicketNumber() {
		return ticketNumber;
	}

	/**
	 * @param ticketNumber the ticketNumber to set
	 */
	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	/**
	 * @return the originalTicketNumber
	 */
	public String getOriginalTicketNumber() {
		return originalTicketNumber;
	}

	/**
	 * @param originalTicketNumber the originalTicketNumber to set
	 */
	public void setOriginalTicketNumber(String originalTicketNumber) {
		this.originalTicketNumber = originalTicketNumber;
	}

	/**
	 * @return the securityIdentifierFlag
	 */
	public String getSecurityIdentifierFlag() {
		return securityIdentifierFlag;
	}

	/**
	 * @param securityIdentifierFlag the securityIdentifierFlag to set
	 */
	public void setSecurityIdentifierFlag(String securityIdentifierFlag) {
		this.securityIdentifierFlag = securityIdentifierFlag;
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
	 * @return the settlementLocationAbbrvtion
	 */
	public String getSettlementLocationAbbrvtion() {
		return settlementLocationAbbrvtion;
	}

	/**
	 * @param settlementLocationAbbrvtion the settlementLocationAbbrvtion to set
	 */
	public void setSettlementLocationAbbrvtion(String settlementLocationAbbrvtion) {
		this.settlementLocationAbbrvtion = settlementLocationAbbrvtion;
	}

	/**
	 * @return the buySell
	 */
	public String getBuySell() {
		return buySell;
	}

	/**
	 * @param buySell the buySell to set
	 */
	public void setBuySell(String buySell) {
		this.buySell = buySell;
	}

	/**
	 * @return the tradeFeedAmount
	 */
	public String getTradeFeedAmount() {
		return tradeFeedAmount;
	}

	/**
	 * @param tradeFeedAmount the tradeFeedAmount to set
	 */
	public void setTradeFeedAmount(String tradeFeedAmount) {
		this.tradeFeedAmount = tradeFeedAmount;
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
	 * @return the viewInCurrency
	 */
	public String getViewInCurrency() {
		return viewInCurrency;
	}

	/**
	 * @param viewInCurrency the viewInCurrency to set
	 */
	public void setViewInCurrency(String viewInCurrency) {
		this.viewInCurrency = viewInCurrency;
	}

	/**
	 * @return the principal
	 */
	public String getPrincipal() {
		return principal;
	}

	/**
	 * @param principal the principal to set
	 */
	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	/**
	 * @return the invertExchangeRate
	 */
	public String getInvertExchangeRate() {
		return invertExchangeRate;
	}

	/**
	 * @param invertExchangeRate the invertExchangeRate to set
	 */
	public void setInvertExchangeRate(String invertExchangeRate) {
		this.invertExchangeRate = invertExchangeRate;
	}

	/**
	 * @return the exchangeRate
	 */
	public String getExchangeRate() {
		return exchangeRate;
	}

	/**
	 * @param exchangeRate the exchangeRate to set
	 */
	public void setExchangeRate(String exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	/**
	 * @return the asOfDate
	 */
	public Timestamp getAsOfDate() {
		return asOfDate;
	}

	/**
	 * @param asOfDate the asOfDate to set
	 */
	public void setAsOfDate(Timestamp asOfDate) {
		this.asOfDate = asOfDate;
	}

	/**
	 * @return the tradeFeedAsOfTime
	 */
	public String getTradeFeedAsOfTime() {
		return tradeFeedAsOfTime;
	}

	/**
	 * @param tradeFeedAsOfTime the tradeFeedAsOfTime to set
	 */
	public void setTradeFeedAsOfTime(String tradeFeedAsOfTime) {
		this.tradeFeedAsOfTime = tradeFeedAsOfTime;
	}

	/**
	 * @return the settlementDate
	 */
	public Timestamp getSettlementDate() {
		return settlementDate;
	}

	/**
	 * @param settlementDate the settlementDate to set
	 */
	public void setSettlementDate(Timestamp settlementDate) {
		this.settlementDate = settlementDate;
	}

	/**
	 * @return the transactionAccount
	 */
	public String getTransactionAccount() {
		return transactionAccount;
	}

	/**
	 * @param transactionAccount the transactionAccount to set
	 */
	public void setTransactionAccount(String transactionAccount) {
		this.transactionAccount = transactionAccount;
	}

	/**
	 * @return the traderLogin
	 */
	public String getTraderLogin() {
		return traderLogin;
	}

	/**
	 * @param traderLogin the traderLogin to set
	 */
	public void setTraderLogin(String traderLogin) {
		this.traderLogin = traderLogin;
	}

	/**
	 * @return the accruedInterest
	 */
	public String getAccruedInterest() {
		return accruedInterest;
	}

	/**
	 * @param accruedInterest the accruedInterest to set
	 */
	public void setAccruedInterest(String accruedInterest) {
		this.accruedInterest = accruedInterest;
	}

	/**
	 * @return the transactionCost1Amount
	 */
	public String getTransactionCost1Amount() {
		return transactionCost1Amount;
	}

	/**
	 * @param transactionCost1Amount the transactionCost1Amount to set
	 */
	public void setTransactionCost1Amount(String transactionCost1Amount) {
		this.transactionCost1Amount = transactionCost1Amount;
	}

	/**
	 * @return the transactionCost1Rate
	 */
	public String getTransactionCost1Rate() {
		return transactionCost1Rate;
	}

	/**
	 * @param transactionCost1Rate the transactionCost1Rate to set
	 */
	public void setTransactionCost1Rate(String transactionCost1Rate) {
		this.transactionCost1Rate = transactionCost1Rate;
	}

	/**
	 * @return the transactionCost1Currency
	 */
	public String getTransactionCost1Currency() {
		return transactionCost1Currency;
	}

	/**
	 * @param transactionCost1Currency the transactionCost1Currency to set
	 */
	public void setTransactionCost1Currency(String transactionCost1Currency) {
		this.transactionCost1Currency = transactionCost1Currency;
	}

	/**
	 * @return the transactionCost2Currency
	 */
	public String getTransactionCost2Currency() {
		return transactionCost2Currency;
	}

	/**
	 * @param transactionCost2Currency the transactionCost2Currency to set
	 */
	public void setTransactionCost2Currency(String transactionCost2Currency) {
		this.transactionCost2Currency = transactionCost2Currency;
	}

	/**
	 * @return the transactionCost2Rate
	 */
	public String getTransactionCost2Rate() {
		return transactionCost2Rate;
	}

	/**
	 * @param transactionCost2Rate the transactionCost2Rate to set
	 */
	public void setTransactionCost2Rate(String transactionCost2Rate) {
		this.transactionCost2Rate = transactionCost2Rate;
	}

	/**
	 * @return the transactionCost2Amount
	 */
	public String getTransactionCost2Amount() {
		return transactionCost2Amount;
	}

	/**
	 * @param transactionCost2Amount the transactionCost2Amount to set
	 */
	public void setTransactionCost2Amount(String transactionCost2Amount) {
		this.transactionCost2Amount = transactionCost2Amount;
	}

	/**
	 * @return the transactionCost3Amount
	 */
	public String getTransactionCost3Amount() {
		return transactionCost3Amount;
	}

	/**
	 * @param transactionCost3Amount the transactionCost3Amount to set
	 */
	public void setTransactionCost3Amount(String transactionCost3Amount) {
		this.transactionCost3Amount = transactionCost3Amount;
	}

	/**
	 * @return the transactionCost3Rate
	 */
	public String getTransactionCost3Rate() {
		return transactionCost3Rate;
	}

	/**
	 * @param transactionCost3Rate the transactionCost3Rate to set
	 */
	public void setTransactionCost3Rate(String transactionCost3Rate) {
		this.transactionCost3Rate = transactionCost3Rate;
	}

	/**
	 * @return the transactionCost3Currency
	 */
	public String getTransactionCost3Currency() {
		return transactionCost3Currency;
	}

	/**
	 * @param transactionCost3Currency the transactionCost3Currency to set
	 */
	public void setTransactionCost3Currency(String transactionCost3Currency) {
		this.transactionCost3Currency = transactionCost3Currency;
	}

	/**
	 * @return the transactionCost4Amount
	 */
	public String getTransactionCost4Amount() {
		return transactionCost4Amount;
	}

	/**
	 * @param transactionCost4Amount the transactionCost4Amount to set
	 */
	public void setTransactionCost4Amount(String transactionCost4Amount) {
		this.transactionCost4Amount = transactionCost4Amount;
	}

	/**
	 * @return the transactionCost4Rate
	 */
	public String getTransactionCost4Rate() {
		return transactionCost4Rate;
	}

	/**
	 * @param transactionCost4Rate the transactionCost4Rate to set
	 */
	public void setTransactionCost4Rate(String transactionCost4Rate) {
		this.transactionCost4Rate = transactionCost4Rate;
	}

	/**
	 * @return the transactionCost4Currency
	 */
	public String getTransactionCost4Currency() {
		return transactionCost4Currency;
	}

	/**
	 * @param transactionCost4Currency the transactionCost4Currency to set
	 */
	public void setTransactionCost4Currency(String transactionCost4Currency) {
		this.transactionCost4Currency = transactionCost4Currency;
	}

	/**
	 * @return the transactionCost5Amount
	 */
	public String getTransactionCost5Amount() {
		return transactionCost5Amount;
	}

	/**
	 * @param transactionCost5Amount the transactionCost5Amount to set
	 */
	public void setTransactionCost5Amount(String transactionCost5Amount) {
		this.transactionCost5Amount = transactionCost5Amount;
	}

	/**
	 * @return the transactionCost5Rate
	 */
	public String getTransactionCost5Rate() {
		return transactionCost5Rate;
	}

	/**
	 * @param transactionCost5Rate the transactionCost5Rate to set
	 */
	public void setTransactionCost5Rate(String transactionCost5Rate) {
		this.transactionCost5Rate = transactionCost5Rate;
	}

	/**
	 * @return the transactionCost5Currency
	 */
	public String getTransactionCost5Currency() {
		return transactionCost5Currency;
	}

	/**
	 * @param transactionCost5Currency the transactionCost5Currency to set
	 */
	public void setTransactionCost5Currency(String transactionCost5Currency) {
		this.transactionCost5Currency = transactionCost5Currency;
	}

	/**
	 * @return the longNote1
	 */
	public String getLongNote1() {
		return longNote1;
	}

	/**
	 * @param longNote1 the longNote1 to set
	 */
	public void setLongNote1(String longNote1) {
		this.longNote1 = longNote1;
	}

	/**
	 * @return the tradePrice
	 */
	public String getTradePrice() {
		return tradePrice;
	}

	/**
	 * @param tradePrice the tradePrice to set
	 */
	public void setTradePrice(String tradePrice) {
		this.tradePrice = tradePrice;
	}

	/**
	 * @return the issueDate
	 */
	public Timestamp getIssueDate() {
		return issueDate;
	}

	/**
	 * @param issueDate the issueDate to set
	 */
	public void setIssueDate(Timestamp issueDate) {
		this.issueDate = issueDate;
	}

	/**
	 * @return the masterTicketNumber
	 */
	public String getMasterTicketNumber() {
		return masterTicketNumber;
	}

	/**
	 * @param masterTicketNumber the masterTicketNumber to set
	 */
	public void setMasterTicketNumber(String masterTicketNumber) {
		this.masterTicketNumber = masterTicketNumber;
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
	 * @return the firmAccountShortName
	 */
	public String getFirmAccountShortName() {
		return firmAccountShortName;
	}

	/**
	 * @param firmAccountShortName the firmAccountShortName to set
	 */
	public void setFirmAccountShortName(String firmAccountShortName) {
		this.firmAccountShortName = firmAccountShortName;
	}

	/**
	 * @return the guid
	 */
	public String getGuid() {
		return guid;
	}

	/**
	 * @param guid the guid to set
	 */
	public void setGuid(String guid) {
		this.guid = guid;
	}

	/**
	 * @return the createDate
	 */
	public Timestamp getCreateDate() {
		return createDate;
	}

	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	/**
	 * @return the userCreate
	 */
	public String getUserCreate() {
		return userCreate;
	}

	/**
	 * @param userCreate the userCreate to set
	 */
	public void setUserCreate(String userCreate) {
		this.userCreate = userCreate;
	}

	/**
	 * @return the updateDate
	 */
	public Timestamp getUpdateDate() {
		return updateDate;
	}

	/**
	 * @param updateDate the updateDate to set
	 */
	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * @return the userUpdate
	 */
	public String getUserUpdate() {
		return userUpdate;
	}

	/**
	 * @param userUpdate the userUpdate to set
	 */
	public void setUserUpdate(String userUpdate) {
		this.userUpdate = userUpdate;
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
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accruedInterest == null) ? 0 : accruedInterest.hashCode());
		result = prime * result + ((asOfDate == null) ? 0 : asOfDate.hashCode());
		result = prime * result + bBGTradeId;
		result = prime * result + ((bbgTradeType == null) ? 0 : bbgTradeType.hashCode());
		result = prime * result + ((buySell == null) ? 0 : buySell.hashCode());
		result = prime * result + ((comments == null) ? 0 : comments.hashCode());
		result = prime * result + ((createDate == null) ? 0 : createDate.hashCode());
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		result = prime * result + ((exchangeRate == null) ? 0 : exchangeRate.hashCode());
		result = prime * result + ((firmAccountShortName == null) ? 0 : firmAccountShortName.hashCode());
		result = prime * result + ((firmIdentifier == null) ? 0 : firmIdentifier.hashCode());
		result = prime * result + ((guid == null) ? 0 : guid.hashCode());
		result = prime * result + ((invertExchangeRate == null) ? 0 : invertExchangeRate.hashCode());
		result = prime * result + ((issueDate == null) ? 0 : issueDate.hashCode());
		result = prime * result + ((longNote1 == null) ? 0 : longNote1.hashCode());
		result = prime * result + ((masterTicketNumber == null) ? 0 : masterTicketNumber.hashCode());
		result = prime * result + ((originalTicketNumber == null) ? 0 : originalTicketNumber.hashCode());
		result = prime * result + ((principal == null) ? 0 : principal.hashCode());
		result = prime * result + ((securityIdentifierFlag == null) ? 0 : securityIdentifierFlag.hashCode());
		result = prime * result + ((settlementDate == null) ? 0 : settlementDate.hashCode());
		result = prime * result + ((settlementLocationAbbrvtion == null) ? 0 : settlementLocationAbbrvtion.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((ticketNumber == null) ? 0 : ticketNumber.hashCode());
		result = prime * result + ((tradeDate == null) ? 0 : tradeDate.hashCode());
		result = prime * result + ((tradeFeedAmount == null) ? 0 : tradeFeedAmount.hashCode());
		result = prime * result + ((tradeFeedAsOfTime == null) ? 0 : tradeFeedAsOfTime.hashCode());
		result = prime * result + ((tradePrice == null) ? 0 : tradePrice.hashCode());
		result = prime * result + ((traderLogin == null) ? 0 : traderLogin.hashCode());
		result = prime * result + ((traderName == null) ? 0 : traderName.hashCode());
		result = prime * result + ((transactionAccount == null) ? 0 : transactionAccount.hashCode());
		result = prime * result + ((transactionCost1Amount == null) ? 0 : transactionCost1Amount.hashCode());
		result = prime * result + ((transactionCost1Currency == null) ? 0 : transactionCost1Currency.hashCode());
		result = prime * result + ((transactionCost1Rate == null) ? 0 : transactionCost1Rate.hashCode());
		result = prime * result + ((transactionCost2Amount == null) ? 0 : transactionCost2Amount.hashCode());
		result = prime * result + ((transactionCost2Currency == null) ? 0 : transactionCost2Currency.hashCode());
		result = prime * result + ((transactionCost2Rate == null) ? 0 : transactionCost2Rate.hashCode());
		result = prime * result + ((transactionCost3Amount == null) ? 0 : transactionCost3Amount.hashCode());
		result = prime * result + ((transactionCost3Currency == null) ? 0 : transactionCost3Currency.hashCode());
		result = prime * result + ((transactionCost3Rate == null) ? 0 : transactionCost3Rate.hashCode());
		result = prime * result + ((transactionCost4Amount == null) ? 0 : transactionCost4Amount.hashCode());
		result = prime * result + ((transactionCost4Currency == null) ? 0 : transactionCost4Currency.hashCode());
		result = prime * result + ((transactionCost4Rate == null) ? 0 : transactionCost4Rate.hashCode());
		result = prime * result + ((transactionCost5Amount == null) ? 0 : transactionCost5Amount.hashCode());
		result = prime * result + ((transactionCost5Currency == null) ? 0 : transactionCost5Currency.hashCode());
		result = prime * result + ((transactionCost5Rate == null) ? 0 : transactionCost5Rate.hashCode());
		result = prime * result + ((transactionType == null) ? 0 : transactionType.hashCode());
		result = prime * result + ((updateDate == null) ? 0 : updateDate.hashCode());
		result = prime * result + ((userCreate == null) ? 0 : userCreate.hashCode());
		result = prime * result + ((userUpdate == null) ? 0 : userUpdate.hashCode());
		result = prime * result + ((viewInCurrency == null) ? 0 : viewInCurrency.hashCode());
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
		RawBBGTrade other = (RawBBGTrade) obj;
		if (accruedInterest == null) {
			if (other.accruedInterest != null)
				return false;
		} else if (!accruedInterest.equals(other.accruedInterest))
			return false;
		if (asOfDate == null) {
			if (other.asOfDate != null)
				return false;
		} else if (!asOfDate.equals(other.asOfDate))
			return false;
		if (bBGTradeId != other.bBGTradeId)
			return false;
		if (bbgTradeType == null) {
			if (other.bbgTradeType != null)
				return false;
		} else if (!bbgTradeType.equals(other.bbgTradeType))
			return false;
		if (buySell == null) {
			if (other.buySell != null)
				return false;
		} else if (!buySell.equals(other.buySell))
			return false;
		if (comments == null) {
			if (other.comments != null)
				return false;
		} else if (!comments.equals(other.comments))
			return false;
		if (createDate == null) {
			if (other.createDate != null)
				return false;
		} else if (!createDate.equals(other.createDate))
			return false;
		if (currency == null) {
			if (other.currency != null)
				return false;
		} else if (!currency.equals(other.currency))
			return false;
		if (exchangeRate == null) {
			if (other.exchangeRate != null)
				return false;
		} else if (!exchangeRate.equals(other.exchangeRate))
			return false;
		if (firmAccountShortName == null) {
			if (other.firmAccountShortName != null)
				return false;
		} else if (!firmAccountShortName.equals(other.firmAccountShortName))
			return false;
		if (firmIdentifier == null) {
			if (other.firmIdentifier != null)
				return false;
		} else if (!firmIdentifier.equals(other.firmIdentifier))
			return false;
		if (guid == null) {
			if (other.guid != null)
				return false;
		} else if (!guid.equals(other.guid))
			return false;
		if (invertExchangeRate == null) {
			if (other.invertExchangeRate != null)
				return false;
		} else if (!invertExchangeRate.equals(other.invertExchangeRate))
			return false;
		if (issueDate == null) {
			if (other.issueDate != null)
				return false;
		} else if (!issueDate.equals(other.issueDate))
			return false;
		if (longNote1 == null) {
			if (other.longNote1 != null)
				return false;
		} else if (!longNote1.equals(other.longNote1))
			return false;
		if (masterTicketNumber == null) {
			if (other.masterTicketNumber != null)
				return false;
		} else if (!masterTicketNumber.equals(other.masterTicketNumber))
			return false;
		if (originalTicketNumber == null) {
			if (other.originalTicketNumber != null)
				return false;
		} else if (!originalTicketNumber.equals(other.originalTicketNumber))
			return false;
		if (principal == null) {
			if (other.principal != null)
				return false;
		} else if (!principal.equals(other.principal))
			return false;
		if (securityIdentifierFlag == null) {
			if (other.securityIdentifierFlag != null)
				return false;
		} else if (!securityIdentifierFlag.equals(other.securityIdentifierFlag))
			return false;
		if (settlementDate == null) {
			if (other.settlementDate != null)
				return false;
		} else if (!settlementDate.equals(other.settlementDate))
			return false;
		if (settlementLocationAbbrvtion == null) {
			if (other.settlementLocationAbbrvtion != null)
				return false;
		} else if (!settlementLocationAbbrvtion.equals(other.settlementLocationAbbrvtion))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (ticketNumber == null) {
			if (other.ticketNumber != null)
				return false;
		} else if (!ticketNumber.equals(other.ticketNumber))
			return false;
		if (tradeDate == null) {
			if (other.tradeDate != null)
				return false;
		} else if (!tradeDate.equals(other.tradeDate))
			return false;
		if (tradeFeedAmount == null) {
			if (other.tradeFeedAmount != null)
				return false;
		} else if (!tradeFeedAmount.equals(other.tradeFeedAmount))
			return false;
		if (tradeFeedAsOfTime == null) {
			if (other.tradeFeedAsOfTime != null)
				return false;
		} else if (!tradeFeedAsOfTime.equals(other.tradeFeedAsOfTime))
			return false;
		if (tradePrice == null) {
			if (other.tradePrice != null)
				return false;
		} else if (!tradePrice.equals(other.tradePrice))
			return false;
		if (traderLogin == null) {
			if (other.traderLogin != null)
				return false;
		} else if (!traderLogin.equals(other.traderLogin))
			return false;
		if (traderName == null) {
			if (other.traderName != null)
				return false;
		} else if (!traderName.equals(other.traderName))
			return false;
		if (transactionAccount == null) {
			if (other.transactionAccount != null)
				return false;
		} else if (!transactionAccount.equals(other.transactionAccount))
			return false;
		if (transactionCost1Amount == null) {
			if (other.transactionCost1Amount != null)
				return false;
		} else if (!transactionCost1Amount.equals(other.transactionCost1Amount))
			return false;
		if (transactionCost1Currency == null) {
			if (other.transactionCost1Currency != null)
				return false;
		} else if (!transactionCost1Currency.equals(other.transactionCost1Currency))
			return false;
		if (transactionCost1Rate == null) {
			if (other.transactionCost1Rate != null)
				return false;
		} else if (!transactionCost1Rate.equals(other.transactionCost1Rate))
			return false;
		if (transactionCost2Amount == null) {
			if (other.transactionCost2Amount != null)
				return false;
		} else if (!transactionCost2Amount.equals(other.transactionCost2Amount))
			return false;
		if (transactionCost2Currency == null) {
			if (other.transactionCost2Currency != null)
				return false;
		} else if (!transactionCost2Currency.equals(other.transactionCost2Currency))
			return false;
		if (transactionCost2Rate == null) {
			if (other.transactionCost2Rate != null)
				return false;
		} else if (!transactionCost2Rate.equals(other.transactionCost2Rate))
			return false;
		if (transactionCost3Amount == null) {
			if (other.transactionCost3Amount != null)
				return false;
		} else if (!transactionCost3Amount.equals(other.transactionCost3Amount))
			return false;
		if (transactionCost3Currency == null) {
			if (other.transactionCost3Currency != null)
				return false;
		} else if (!transactionCost3Currency.equals(other.transactionCost3Currency))
			return false;
		if (transactionCost3Rate == null) {
			if (other.transactionCost3Rate != null)
				return false;
		} else if (!transactionCost3Rate.equals(other.transactionCost3Rate))
			return false;
		if (transactionCost4Amount == null) {
			if (other.transactionCost4Amount != null)
				return false;
		} else if (!transactionCost4Amount.equals(other.transactionCost4Amount))
			return false;
		if (transactionCost4Currency == null) {
			if (other.transactionCost4Currency != null)
				return false;
		} else if (!transactionCost4Currency.equals(other.transactionCost4Currency))
			return false;
		if (transactionCost4Rate == null) {
			if (other.transactionCost4Rate != null)
				return false;
		} else if (!transactionCost4Rate.equals(other.transactionCost4Rate))
			return false;
		if (transactionCost5Amount == null) {
			if (other.transactionCost5Amount != null)
				return false;
		} else if (!transactionCost5Amount.equals(other.transactionCost5Amount))
			return false;
		if (transactionCost5Currency == null) {
			if (other.transactionCost5Currency != null)
				return false;
		} else if (!transactionCost5Currency.equals(other.transactionCost5Currency))
			return false;
		if (transactionCost5Rate == null) {
			if (other.transactionCost5Rate != null)
				return false;
		} else if (!transactionCost5Rate.equals(other.transactionCost5Rate))
			return false;
		if (transactionType == null) {
			if (other.transactionType != null)
				return false;
		} else if (!transactionType.equals(other.transactionType))
			return false;
		if (updateDate == null) {
			if (other.updateDate != null)
				return false;
		} else if (!updateDate.equals(other.updateDate))
			return false;
		if (userCreate == null) {
			if (other.userCreate != null)
				return false;
		} else if (!userCreate.equals(other.userCreate))
			return false;
		if (userUpdate == null) {
			if (other.userUpdate != null)
				return false;
		} else if (!userUpdate.equals(other.userUpdate))
			return false;
		if (viewInCurrency == null) {
			if (other.viewInCurrency != null)
				return false;
		} else if (!viewInCurrency.equals(other.viewInCurrency))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RawBBGTrades [firmIdentifier=" + firmIdentifier + ", traderName=" + traderName + ", bBGTradeId="
				+ bBGTradeId + ", ticketNumber=" + ticketNumber + ", originalTicketNumber=" + originalTicketNumber
				+ ", securityIdentifierFlag=" + securityIdentifierFlag + ", transactionType=" + transactionType
				+ ", settlementLocationAbbrvtion=" + settlementLocationAbbrvtion + ", buySell=" + buySell
				+ ", tradeFeedAmount=" + tradeFeedAmount + ", currency=" + currency + ", viewInCurrency="
				+ viewInCurrency + ", principal=" + principal + ", invertExchangeRate=" + invertExchangeRate
				+ ", exchangeRate=" + exchangeRate + ", asOfDate=" + asOfDate + ", tradeFeedAsOfTime="
				+ tradeFeedAsOfTime + ", settlementDate=" + settlementDate + ", transactionAccount="
				+ transactionAccount + ", traderLogin=" + traderLogin + ", accruedInterest=" + accruedInterest
				+ ", transactionCost1Amount=" + transactionCost1Amount + ", transactionCost1Rate="
				+ transactionCost1Rate + ", transactionCost1Currency=" + transactionCost1Currency
				+ ", transactionCost2Currency=" + transactionCost2Currency + ", transactionCost2Rate="
				+ transactionCost2Rate + ", transactionCost2Amount=" + transactionCost2Amount
				+ ", transactionCost3Amount=" + transactionCost3Amount + ", transactionCost3Rate="
				+ transactionCost3Rate + ", transactionCost3Currency=" + transactionCost3Currency
				+ ", transactionCost4Amount=" + transactionCost4Amount + ", transactionCost4Rate="
				+ transactionCost4Rate + ", transactionCost4Currency=" + transactionCost4Currency
				+ ", transactionCost5Amount=" + transactionCost5Amount + ", transactionCost5Rate="
				+ transactionCost5Rate + ", transactionCost5Currency=" + transactionCost5Currency + ", longNote1="
				+ longNote1 + ", tradePrice=" + tradePrice + ", issueDate=" + issueDate + ", masterTicketNumber="
				+ masterTicketNumber + ", tradeDate=" + tradeDate + ", firmAccountShortName=" + firmAccountShortName
				+ ", guid=" + guid + ", createDate=" + createDate + ", userCreate=" + userCreate + ", updateDate="
				+ updateDate + ", userUpdate=" + userUpdate + ", status=" + status + ", comments=" + comments
				+ ", bbgTradeType=" + bbgTradeType + "]";
	}

	@Transient
	public boolean isCancelTrade() {
		return "XMT".equals(this.transactionType);
	}
	
	@Transient
	public boolean isBuyTrade() {
		return "B".equals(this.buySell);
	}
	
	@Transient
	public boolean isAmendment() {
		Date today = DateUtils.truncate(new Date(), Calendar.DATE);
		return this.asOfDate.compareTo(today) < 0;
	}
	
}
