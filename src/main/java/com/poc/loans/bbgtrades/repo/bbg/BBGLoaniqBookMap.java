package com.poc.loans.bbgtrades.repo.bbg;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BBG_LOANIQ_BOOK_MAP")
public class BBGLoaniqBookMap {
	
	@Column(name ="BBG_TRADER_NAME")
	private String bbgTraderName;
	
	@Column(name = "BBG_TRADER_ID")
	private String bbgTraderId;
	
	@Column(name = "BBG_TRADERBOOKS_ID")
	private String bbgTraderbooksId;
	
	@Column(name = "BBG_BOOK_DESCRIPTION")
	private String bbgBookDescription;
	
	@Column(name = "BBG_DEPARTMENT")
	private String bbgDepartment;
	
	@Column(name = "LIQ_PORTFOLIO_CODE")
	private String liqPortfolioCode;
	
	@Column(name = "LIQ_PORTFOLIO_DESC")
	private String liqPortfolioDesc;
	
	@Column(name = "LIQ_BRANCH")
	private String liqBranch;
	
	@Column(name = "LIQ_BRANCH_DESC")
	private String liqBranchDesc;
	
	@Column(name = "LIQ_EXP_CODE")
	private String liqExpCode;
	
	@Column(name = "LIQ_EXP_CODE_DESC")
	private String liqexpCodeDesc;
	
	@Column(name = "LIQ_RISK_BOOK_CODE")
	private String liqRiskBookCode;
	
	@Column(name = "LIQ_RISK_BOOK_DESC")
	private String liqRiskBookDesc;
	
	@Column(name = "COMMENT1")
	private String comment1;
	
	@Column(name = "COMMENT2")
	private String comment2;
	
	@Column(name = "COMMENT3")
	private String comment3;

	@Column(name = "AUDIT_INSERT_DATE")
	private Timestamp auditInsertDate;
	
	@Column(name = "AUDIT_INSERT_USER")
	private String auditInsertUser;
	
	@Column(name = "AUDIT_UPDATE_DATE")
	private Timestamp auditUpdateDate;
	
	@Column(name = "AUDIT_UPDATE_USER")
	private String auditUpdateUser;
	
	@Id
	@Column(name = "BBG_LOANIQ_BOOK_MAPID")
	private Integer bbgLoaniqBookMapid;
	
	@Column(name = "ACTIVE")
	private char active;

	/**
	 * @return the bbg_trader_name
	 */
	public String getBbg_trader_name() {
		return bbgTraderName;
	}

	/**
	 * @param bbg_trader_name the bbg_trader_name to set
	 */
	public void setBbg_trader_name(String bbg_trader_name) {
		this.bbgTraderName = bbg_trader_name;
	}

	/**
	 * @return the bbg_trader_id
	 */
	public String getBbg_trader_id() {
		return bbgTraderId;
	}

	/**
	 * @param bbg_trader_id the bbg_trader_id to set
	 */
	public void setBbg_trader_id(String bbg_trader_id) {
		this.bbgTraderId = bbg_trader_id;
	}

	/**
	 * @return the bbg_traderbooks_id
	 */
	public String getBbg_traderbooks_id() {
		return bbgTraderbooksId;
	}

	/**
	 * @param bbg_traderbooks_id the bbg_traderbooks_id to set
	 */
	public void setBbg_traderbooks_id(String bbg_traderbooks_id) {
		this.bbgTraderbooksId = bbg_traderbooks_id;
	}

	/**
	 * @return the bbg_book_description
	 */
	public String getBbg_book_description() {
		return bbgBookDescription;
	}

	/**
	 * @param bbg_book_description the bbg_book_description to set
	 */
	public void setBbg_book_description(String bbg_book_description) {
		this.bbgBookDescription = bbg_book_description;
	}

	/**
	 * @return the bbg_department
	 */
	public String getBbg_department() {
		return bbgDepartment;
	}

	/**
	 * @param bbg_department the bbg_department to set
	 */
	public void setBbg_department(String bbg_department) {
		this.bbgDepartment = bbg_department;
	}

	/**
	 * @return the liq_portfolio_code
	 */
	public String getLiq_portfolio_code() {
		return liqPortfolioCode;
	}

	/**
	 * @param liq_portfolio_code the liq_portfolio_code to set
	 */
	public void setLiq_portfolio_code(String liq_portfolio_code) {
		this.liqPortfolioCode = liq_portfolio_code;
	}

	/**
	 * @return the liq_portfolio_desc
	 */
	public String getLiq_portfolio_desc() {
		return liqPortfolioDesc;
	}

	/**
	 * @param liq_portfolio_desc the liq_portfolio_desc to set
	 */
	public void setLiq_portfolio_desc(String liq_portfolio_desc) {
		this.liqPortfolioDesc = liq_portfolio_desc;
	}

	/**
	 * @return the liq_branch
	 */
	public String getLiq_branch() {
		return liqBranch;
	}

	/**
	 * @param liq_branch the liq_branch to set
	 */
	public void setLiq_branch(String liq_branch) {
		this.liqBranch = liq_branch;
	}

	/**
	 * @return the liq_branch_desc
	 */
	public String getLiq_branch_desc() {
		return liqBranchDesc;
	}

	/**
	 * @param liq_branch_desc the liq_branch_desc to set
	 */
	public void setLiq_branch_desc(String liq_branch_desc) {
		this.liqBranchDesc = liq_branch_desc;
	}

	/**
	 * @return the liq_exp_code
	 */
	public String getLiq_exp_code() {
		return liqExpCode;
	}

	/**
	 * @param liq_exp_code the liq_exp_code to set
	 */
	public void setLiq_exp_code(String liq_exp_code) {
		this.liqExpCode = liq_exp_code;
	}

	/**
	 * @return the liq_exp_code_desc
	 */
	public String getLiq_exp_code_desc() {
		return liqexpCodeDesc;
	}

	/**
	 * @param liq_exp_code_desc the liq_exp_code_desc to set
	 */
	public void setLiq_exp_code_desc(String liq_exp_code_desc) {
		this.liqexpCodeDesc = liq_exp_code_desc;
	}

	/**
	 * @return the liq_risk_book_code
	 */
	public String getLiq_risk_book_code() {
		return liqRiskBookCode;
	}

	/**
	 * @param liq_risk_book_code the liq_risk_book_code to set
	 */
	public void setLiq_risk_book_code(String liq_risk_book_code) {
		this.liqRiskBookCode = liq_risk_book_code;
	}

	/**
	 * @return the liq_risk_book_desc
	 */
	public String getLiq_risk_book_desc() {
		return liqRiskBookDesc;
	}

	/**
	 * @param liq_risk_book_desc the liq_risk_book_desc to set
	 */
	public void setLiq_risk_book_desc(String liq_risk_book_desc) {
		this.liqRiskBookDesc = liq_risk_book_desc;
	}

	/**
	 * @return the comment1
	 */
	public String getComment1() {
		return comment1;
	}

	/**
	 * @param comment1 the comment1 to set
	 */
	public void setComment1(String comment1) {
		this.comment1 = comment1;
	}

	/**
	 * @return the comment2
	 */
	public String getComment2() {
		return comment2;
	}

	/**
	 * @param comment2 the comment2 to set
	 */
	public void setComment2(String comment2) {
		this.comment2 = comment2;
	}

	/**
	 * @return the comment3
	 */
	public String getComment3() {
		return comment3;
	}

	/**
	 * @param comment3 the comment3 to set
	 */
	public void setComment3(String comment3) {
		this.comment3 = comment3;
	}

	/**
	 * @return the audit_insert_date
	 */
	public Timestamp getAudit_insert_date() {
		return auditInsertDate;
	}

	/**
	 * @param audit_insert_date the audit_insert_date to set
	 */
	public void setAudit_insert_date(Timestamp audit_insert_date) {
		this.auditInsertDate = audit_insert_date;
	}

	/**
	 * @return the audit_insert_user
	 */
	public String getAudit_insert_user() {
		return auditInsertUser;
	}

	/**
	 * @param audit_insert_user the audit_insert_user to set
	 */
	public void setAudit_insert_user(String audit_insert_user) {
		this.auditInsertUser = audit_insert_user;
	}

	/**
	 * @return the audit_update_date
	 */
	public Timestamp getAudit_update_date() {
		return auditUpdateDate;
	}

	/**
	 * @param audit_update_date the audit_update_date to set
	 */
	public void setAudit_update_date(Timestamp audit_update_date) {
		this.auditUpdateDate = audit_update_date;
	}

	/**
	 * @return the audit_update_user
	 */
	public String getAudit_update_user() {
		return auditUpdateUser;
	}

	/**
	 * @param audit_update_user the audit_update_user to set
	 */
	public void setAudit_update_user(String audit_update_user) {
		this.auditUpdateUser = audit_update_user;
	}

	/**
	 * @return the bbg_loaniq_book_mapid
	 */
	public Integer getBbg_loaniq_book_mapid() {
		return bbgLoaniqBookMapid;
	}

	/**
	 * @param bbg_loaniq_book_mapid the bbg_loaniq_book_mapid to set
	 */
	public void setBbg_loaniq_book_mapid(Integer bbg_loaniq_book_mapid) {
		this.bbgLoaniqBookMapid = bbg_loaniq_book_mapid;
	}

	/**
	 * @return the active
	 */
	public char getActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(char active) {
		this.active = active;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + active;
		result = prime * result + ((auditInsertDate == null) ? 0 : auditInsertDate.hashCode());
		result = prime * result + ((auditInsertUser == null) ? 0 : auditInsertUser.hashCode());
		result = prime * result + ((auditUpdateDate == null) ? 0 : auditUpdateDate.hashCode());
		result = prime * result + ((auditUpdateUser == null) ? 0 : auditUpdateUser.hashCode());
		result = prime * result + ((bbgBookDescription == null) ? 0 : bbgBookDescription.hashCode());
		result = prime * result + ((bbgDepartment == null) ? 0 : bbgDepartment.hashCode());
		result = prime * result + ((bbgLoaniqBookMapid == null) ? 0 : bbgLoaniqBookMapid.hashCode());
		result = prime * result + ((bbgTraderId == null) ? 0 : bbgTraderId.hashCode());
		result = prime * result + ((bbgTraderName == null) ? 0 : bbgTraderName.hashCode());
		result = prime * result + ((bbgTraderbooksId == null) ? 0 : bbgTraderbooksId.hashCode());
		result = prime * result + ((comment1 == null) ? 0 : comment1.hashCode());
		result = prime * result + ((comment2 == null) ? 0 : comment2.hashCode());
		result = prime * result + ((comment3 == null) ? 0 : comment3.hashCode());
		result = prime * result + ((liqBranch == null) ? 0 : liqBranch.hashCode());
		result = prime * result + ((liqBranchDesc == null) ? 0 : liqBranchDesc.hashCode());
		result = prime * result + ((liqExpCode == null) ? 0 : liqExpCode.hashCode());
		result = prime * result + ((liqexpCodeDesc == null) ? 0 : liqexpCodeDesc.hashCode());
		result = prime * result + ((liqPortfolioCode == null) ? 0 : liqPortfolioCode.hashCode());
		result = prime * result + ((liqPortfolioDesc == null) ? 0 : liqPortfolioDesc.hashCode());
		result = prime * result + ((liqRiskBookCode == null) ? 0 : liqRiskBookCode.hashCode());
		result = prime * result + ((liqRiskBookDesc == null) ? 0 : liqRiskBookDesc.hashCode());
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
		BBGLoaniqBookMap other = (BBGLoaniqBookMap) obj;
		if (active != other.active)
			return false;
		if (auditInsertDate == null) {
			if (other.auditInsertDate != null)
				return false;
		} else if (!auditInsertDate.equals(other.auditInsertDate))
			return false;
		if (auditInsertUser == null) {
			if (other.auditInsertUser != null)
				return false;
		} else if (!auditInsertUser.equals(other.auditInsertUser))
			return false;
		if (auditUpdateDate == null) {
			if (other.auditUpdateDate != null)
				return false;
		} else if (!auditUpdateDate.equals(other.auditUpdateDate))
			return false;
		if (auditUpdateUser == null) {
			if (other.auditUpdateUser != null)
				return false;
		} else if (!auditUpdateUser.equals(other.auditUpdateUser))
			return false;
		if (bbgBookDescription == null) {
			if (other.bbgBookDescription != null)
				return false;
		} else if (!bbgBookDescription.equals(other.bbgBookDescription))
			return false;
		if (bbgDepartment == null) {
			if (other.bbgDepartment != null)
				return false;
		} else if (!bbgDepartment.equals(other.bbgDepartment))
			return false;
		if (bbgLoaniqBookMapid == null) {
			if (other.bbgLoaniqBookMapid != null)
				return false;
		} else if (!bbgLoaniqBookMapid.equals(other.bbgLoaniqBookMapid))
			return false;
		if (bbgTraderId == null) {
			if (other.bbgTraderId != null)
				return false;
		} else if (!bbgTraderId.equals(other.bbgTraderId))
			return false;
		if (bbgTraderName == null) {
			if (other.bbgTraderName != null)
				return false;
		} else if (!bbgTraderName.equals(other.bbgTraderName))
			return false;
		if (bbgTraderbooksId == null) {
			if (other.bbgTraderbooksId != null)
				return false;
		} else if (!bbgTraderbooksId.equals(other.bbgTraderbooksId))
			return false;
		if (comment1 == null) {
			if (other.comment1 != null)
				return false;
		} else if (!comment1.equals(other.comment1))
			return false;
		if (comment2 == null) {
			if (other.comment2 != null)
				return false;
		} else if (!comment2.equals(other.comment2))
			return false;
		if (comment3 == null) {
			if (other.comment3 != null)
				return false;
		} else if (!comment3.equals(other.comment3))
			return false;
		if (liqBranch == null) {
			if (other.liqBranch != null)
				return false;
		} else if (!liqBranch.equals(other.liqBranch))
			return false;
		if (liqBranchDesc == null) {
			if (other.liqBranchDesc != null)
				return false;
		} else if (!liqBranchDesc.equals(other.liqBranchDesc))
			return false;
		if (liqExpCode == null) {
			if (other.liqExpCode != null)
				return false;
		} else if (!liqExpCode.equals(other.liqExpCode))
			return false;
		if (liqexpCodeDesc == null) {
			if (other.liqexpCodeDesc != null)
				return false;
		} else if (!liqexpCodeDesc.equals(other.liqexpCodeDesc))
			return false;
		if (liqPortfolioCode == null) {
			if (other.liqPortfolioCode != null)
				return false;
		} else if (!liqPortfolioCode.equals(other.liqPortfolioCode))
			return false;
		if (liqPortfolioDesc == null) {
			if (other.liqPortfolioDesc != null)
				return false;
		} else if (!liqPortfolioDesc.equals(other.liqPortfolioDesc))
			return false;
		if (liqRiskBookCode == null) {
			if (other.liqRiskBookCode != null)
				return false;
		} else if (!liqRiskBookCode.equals(other.liqRiskBookCode))
			return false;
		if (liqRiskBookDesc == null) {
			if (other.liqRiskBookDesc != null)
				return false;
		} else if (!liqRiskBookDesc.equals(other.liqRiskBookDesc))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BBGLoaniqBookMap [bbg_trader_name=" + bbgTraderName + ", bbg_trader_id=" + bbgTraderId
				+ ", bbg_traderbooks_id=" + bbgTraderbooksId + ", bbg_book_description=" + bbgBookDescription
				+ ", bbg_department=" + bbgDepartment + ", liq_portfolio_code=" + liqPortfolioCode
				+ ", liq_portfolio_desc=" + liqPortfolioDesc + ", liq_branch=" + liqBranch + ", liq_branch_desc="
				+ liqBranchDesc + ", liq_exp_code=" + liqExpCode + ", liq_exp_code_desc=" + liqexpCodeDesc
				+ ", liq_risk_book_code=" + liqRiskBookCode + ", liq_risk_book_desc=" + liqRiskBookDesc
				+ ", comment1=" + comment1 + ", comment2=" + comment2 + ", comment3=" + comment3
				+ ", audit_insert_date=" + auditInsertDate + ", audit_insert_user=" + auditInsertUser
				+ ", audit_update_date=" + auditUpdateDate + ", audit_update_user=" + auditUpdateUser
				+ ", bbg_loaniq_book_mapid=" + bbgLoaniqBookMapid + ", active=" + active + "]";
	}
}
