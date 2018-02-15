package com.poc.loans.bbgtrades.loaniq;

public class Constants {
	public static final String SQLDATE = "Select max(updateDate) from RawBBGTrades";
	public static final String SQLBOOKMAP = "FROM BBGLoaniqBookMap WHERE active = 'Y' AND liqBranch IN ('JLCP', 'JIL') ";
	public static final String INTERESTFEESET = "ACTUALAGENT";
	public static final String COMMENT = "BLOOMBERG Trade ID : ";
	public static final String DEFAULT_CUS_RID = "R78MZ86B";
	
	public static final String SQLBBGJOIN =  "FROM RawBBGTrades r " + 
			" LEFT JOIN RawBBGSecurityStatic s ON r.firmIdentifier = s.bbgSecurityId  \r\n" + 
			"AND s.updateDate = (select MAX(updateDate) FROM RawBBGSecurityStatic) \r\n" + 
			"AND r.transactionType IN ('XMT','CMT','TT','MT','PCM') \r\n" + 
			"WHERE r.updateDate LIKE '";
	
	public static final String SQLCUSTJOIN = "SELECT c.cusCidCustID, l.cloCdeLocation, ca.calNmeAliasName, " + 
            "CASE WHEN c.cusCdeDept = 'INACT' \r\n" + 
            "THEN 'MONIKER CUSTOMER INACTIVE: USING DUMMY CUSTOMER RID:R78MZ86B '\r\n" + 
            "WHEN c.cusCdeCustDesc !='FMA'\r\n" + 
            "THEN 'MONIKER CUSTOMER NOT FMA: USING DUMMY  CUSTOMER RID:R78MZ86B '\r\n" + 
            "WHEN c.cusCidCustID IS NULL\r\n" + 
            "THEN 'MONIKER NOT FOUND IN LIQ : USING DUMMY  CUSTOMER RID:R78MZ86B '\r\n" + 
            "ELSE 'NO EXCEPTION IN CUSTOMER SELECT' END AS exceptionMsg\r\n" + 
            "FROM VlsCustAlias ca\r\n" + 
            "INNER JOIN VlsCustomer c ON ca.calCidCustId = c.cusCidCustID AND ca.calCdeAliasType='MNKR'\r\n" + 
            "AND c.cusCdeDept != 'INACT'\r\n" + 
            "AND c.cusCdeCustDesc ='FMA'\r\n" + 
            "LEFT JOIN VlsCustLocation l ON ca.calCidCustId = l.cloCidCustId AND l.cloCdePrflType ='INVR' AND l.cloIndComplete = 'Y' \r\n" + 
            " \r\n" + 
            "";
	public static final String SQLFACJOIN = "FROM VlsMisCode mc \r\n" + 
			"LEFT JOIN VlsFacility f ON f.facPidFacility = mc.micPidProductId \r\n" + 
			"AND f.facDteTermFac IS NULL \r\n" + 
			"AND mc.micCdeProdType = 'FAC' \r\n" + 
			"AND mc.micCdeMisType = 'BBGID' \r\n" + 
			"JOIN VlsDeal d ON f.facPidDeal = d.deaPidDeal AND d.deaCdeDealStat NOT IN ('TERM','CAN')";
	
	public static final String SQLCIRCLEJOIN = "FROM VlsMisCode mc \r\n" + 
			"LEFT JOIN VlsFacility f ON  f.facPidFacility = mc.micPidProductId \r\n" + 
			"AND f.facDteTermFac IS NULL\r\n" + 
			"AND mc.micCdeProdType = 'FAC' \r\n" + 
			"AND mc.micCdeMisType = 'BBGTK'\r\n" + 
			"JOIN VlsInvFacility nf ON nf.ifaPidFacility= f.facPidFacility";
	
	public static final String SQLDORMANTFAC = "FROM VlsFacPortPos where fppIndDormant='N' AND fppCdeBranch='JLCP'";
	
	public static final String SQLSHORTAMT = "FROM VlsFacPortPos f \r\n" + 
			"INNER JOIN VlsMisCode mc \r\n" + 
			"ON f.fppPidFacility = mc.micPidProductId \r\n" + 
			"AND mc.micCdeMisType ='BBGID' \r\n" + 
			"AND mc.micTxtMisValue = '1' \r\n" + 
			"AND f.fppCdeBranch IN ('JLCP','JIL') \r\n" + 
			"WHERE " + 
			"f.fppCdeExpense = '2'  AND \r\n" + 
			"f.fppCdePortfolio = '3' AND \r\n" + 
			"f.fppCdeBranch = '4'";
	
	public static final String TRADE = "Trade";
	public static final String DEAL = "Deal";
	public static final String FACILITY = "Facility";
	public static final String PROMOTION = "Promoted to level 2";
	
}
