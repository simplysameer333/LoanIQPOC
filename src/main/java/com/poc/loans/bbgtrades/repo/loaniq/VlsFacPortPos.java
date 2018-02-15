package com.poc.loans.bbgtrades.repo.loaniq;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VLS_FAC_PORT_POS")
public class VlsFacPortPos {

	@Column(name = "FPP_AMT_CLOSED_POS")
	private String fppAmtClosedPos;
	
	@Id
	@Column(name = "FPP_PID_FACILITY")
	private String fppPidFacility;
	
	@Column(name = "FPP_AMT_AVAILABLE")
	private String fppAmtAvailable;
	
	@Column(name = "FPP_AMT_SHORT")
	private String fppAmtShort;
	
	@Column(name = "FPP_CDE_BRANCH")
	private String fppCdeBranch;
	
	@Column(name = "FPP_CDE_PORTFOLIO")
	private String fppCdePortfolio;
	
	@Column(name = "FPP_CDE_EXPENSE")
	private String fppCdeExpense;
	
	@Column(name = "FPP_IND_DORMANT")
	private String fppIndDormant;

	/**
	 * @return the fppAmtClosedPos
	 */
	public String getFppAmtClosedPos() {
		return fppAmtClosedPos;
	}

	/**
	 * @return the fppIndDormant
	 */
	public String getFppIndDormant() {
		return fppIndDormant;
	}

	/**
	 * @param fppIndDormant the fppIndDormant to set
	 */
	public void setFppIndDormant(String fppIndDormant) {
		this.fppIndDormant = fppIndDormant;
	}

	/**
	 * @param fppAmtClosedPos the fppAmtClosedPos to set
	 */
	public void setFppAmtClosedPos(String fppAmtClosedPos) {
		this.fppAmtClosedPos = fppAmtClosedPos;
	}

	/**
	 * @return the fppPidFacility
	 */
	public String getFppPidFacility() {
		return fppPidFacility;
	}

	/**
	 * @param fppPidFacility the fppPidFacility to set
	 */
	public void setFppPidFacility(String fppPidFacility) {
		this.fppPidFacility = fppPidFacility;
	}

	/**
	 * @return the fppAmtAvailable
	 */
	public String getFppAmtAvailable() {
		return fppAmtAvailable;
	}

	/**
	 * @param fppAmtAvailable the fppAmtAvailable to set
	 */
	public void setFppAmtAvailable(String fppAmtAvailable) {
		this.fppAmtAvailable = fppAmtAvailable;
	}

	/**
	 * @return the fppAmtShort
	 */
	public String getFppAmtShort() {
		return fppAmtShort;
	}

	/**
	 * @param fppAmtShort the fppAmtShort to set
	 */
	public void setFppAmtShort(String fppAmtShort) {
		this.fppAmtShort = fppAmtShort;
	}

	/**
	 * @return the fppCdeBranch
	 */
	public String getFppCdeBranch() {
		return fppCdeBranch;
	}

	/**
	 * @param fppCdeBranch the fppCdeBranch to set
	 */
	public void setFppCdeBranch(String fppCdeBranch) {
		this.fppCdeBranch = fppCdeBranch;
	}

	/**
	 * @return the fppCdePortfolio
	 */
	public String getFppCdePortfolio() {
		return fppCdePortfolio;
	}

	/**
	 * @param fppCdePortfolio the fppCdePortfolio to set
	 */
	public void setFppCdePortfolio(String fppCdePortfolio) {
		this.fppCdePortfolio = fppCdePortfolio;
	}

	/**
	 * @return the fppCdeExpense
	 */
	public String getFppCdeExpense() {
		return fppCdeExpense;
	}

	/**
	 * @param fppCdeExpense the fppCdeExpense to set
	 */
	public void setFppCdeExpense(String fppCdeExpense) {
		this.fppCdeExpense = fppCdeExpense;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fppAmtAvailable == null) ? 0 : fppAmtAvailable.hashCode());
		result = prime * result + ((fppAmtClosedPos == null) ? 0 : fppAmtClosedPos.hashCode());
		result = prime * result + ((fppAmtShort == null) ? 0 : fppAmtShort.hashCode());
		result = prime * result + ((fppCdeBranch == null) ? 0 : fppCdeBranch.hashCode());
		result = prime * result + ((fppCdeExpense == null) ? 0 : fppCdeExpense.hashCode());
		result = prime * result + ((fppCdePortfolio == null) ? 0 : fppCdePortfolio.hashCode());
		result = prime * result + ((fppIndDormant == null) ? 0 : fppIndDormant.hashCode());
		result = prime * result + ((fppPidFacility == null) ? 0 : fppPidFacility.hashCode());
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
		VlsFacPortPos other = (VlsFacPortPos) obj;
		if (fppAmtAvailable == null) {
			if (other.fppAmtAvailable != null)
				return false;
		} else if (!fppAmtAvailable.equals(other.fppAmtAvailable))
			return false;
		if (fppAmtClosedPos == null) {
			if (other.fppAmtClosedPos != null)
				return false;
		} else if (!fppAmtClosedPos.equals(other.fppAmtClosedPos))
			return false;
		if (fppAmtShort == null) {
			if (other.fppAmtShort != null)
				return false;
		} else if (!fppAmtShort.equals(other.fppAmtShort))
			return false;
		if (fppCdeBranch == null) {
			if (other.fppCdeBranch != null)
				return false;
		} else if (!fppCdeBranch.equals(other.fppCdeBranch))
			return false;
		if (fppCdeExpense == null) {
			if (other.fppCdeExpense != null)
				return false;
		} else if (!fppCdeExpense.equals(other.fppCdeExpense))
			return false;
		if (fppCdePortfolio == null) {
			if (other.fppCdePortfolio != null)
				return false;
		} else if (!fppCdePortfolio.equals(other.fppCdePortfolio))
			return false;
		if (fppIndDormant == null) {
			if (other.fppIndDormant != null)
				return false;
		} else if (!fppIndDormant.equals(other.fppIndDormant))
			return false;
		if (fppPidFacility == null) {
			if (other.fppPidFacility != null)
				return false;
		} else if (!fppPidFacility.equals(other.fppPidFacility))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "VlsFacPortPos [fppAmtClosedPos=" + fppAmtClosedPos + ", fppPidFacility=" + fppPidFacility
				+ ", fppAmtAvailable=" + fppAmtAvailable + ", fppAmtShort=" + fppAmtShort + ", fppCdeBranch="
				+ fppCdeBranch + ", fppCdePortfolio=" + fppCdePortfolio + ", fppCdeExpense=" + fppCdeExpense
				+ ", fppIndDormant=" + fppIndDormant + "]";
	}

}
