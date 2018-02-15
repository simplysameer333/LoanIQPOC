package com.poc.loans.bbgtrades.repo.loaniq;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VLS_DEAL")
public class VlsDeal {

	@Id
	@Column(name = "DEA_PID_DEAL")
	private String deaPidDeal;
	
	@Column(name = "DEA_CDE_DEAL_STAT")
	private String deaCdeDealStat;

	/**
	 * @return the deaPidDeal
	 */
	public String getDeaPidDeal() {
		return deaPidDeal;
	}

	/**
	 * @param deaPidDeal the deaPidDeal to set
	 */
	public void setDeaPidDeal(String deaPidDeal) {
		this.deaPidDeal = deaPidDeal;
	}

	/**
	 * @return the deaCdeDealStat
	 */
	public String getDeaCdeDealStat() {
		return deaCdeDealStat;
	}

	/**
	 * @param deaCdeDealStat the deaCdeDealStat to set
	 */
	public void setDeaCdeDealStat(String deaCdeDealStat) {
		this.deaCdeDealStat = deaCdeDealStat;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deaCdeDealStat == null) ? 0 : deaCdeDealStat.hashCode());
		result = prime * result + ((deaPidDeal == null) ? 0 : deaPidDeal.hashCode());
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
		VlsDeal other = (VlsDeal) obj;
		if (deaCdeDealStat == null) {
			if (other.deaCdeDealStat != null)
				return false;
		} else if (!deaCdeDealStat.equals(other.deaCdeDealStat))
			return false;
		if (deaPidDeal == null) {
			if (other.deaPidDeal != null)
				return false;
		} else if (!deaPidDeal.equals(other.deaPidDeal))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "VlsDeal [deaPidDeal=" + deaPidDeal + ", deaCdeDealStat=" + deaCdeDealStat + "]";
	}


}
