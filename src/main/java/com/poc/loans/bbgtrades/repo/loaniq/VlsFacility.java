package com.poc.loans.bbgtrades.repo.loaniq;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VLS_FACILITY")
public class VlsFacility {

	@Id
	@Column(name = "FAC_PID_FACILITY")
	private String facPidFacility;
	
	@Column(name = "FAC_PID_DEAL")
	private String facPidDeal;
	
	@Column(name = "FAC_DTE_TERM_FAC")
	private String facDteTermFac;

	/**
	 * @return the facPidFacility
	 */
	public String getFacPidFacility() {
		return facPidFacility;
	}

	/**
	 * @param facPidFacility the facPidFacility to set
	 */
	public void setFacPidFacility(String facPidFacility) {
		this.facPidFacility = facPidFacility;
	}

	/**
	 * @return the facPidDeal
	 */
	public String getFacPidDeal() {
		return facPidDeal;
	}

	/**
	 * @param facPidDeal the facPidDeal to set
	 */
	public void setFacPidDeal(String facPidDeal) {
		this.facPidDeal = facPidDeal;
	}

	/**
	 * @return the facDteTermFac
	 */
	public String getFacDteTermFac() {
		return facDteTermFac;
	}

	/**
	 * @param facDteTermFac the facDteTermFac to set
	 */
	public void setFacDteTermFac(String facDteTermFac) {
		this.facDteTermFac = facDteTermFac;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((facDteTermFac == null) ? 0 : facDteTermFac.hashCode());
		result = prime * result + ((facPidDeal == null) ? 0 : facPidDeal.hashCode());
		result = prime * result + ((facPidFacility == null) ? 0 : facPidFacility.hashCode());
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
		VlsFacility other = (VlsFacility) obj;
		if (facDteTermFac == null) {
			if (other.facDteTermFac != null)
				return false;
		} else if (!facDteTermFac.equals(other.facDteTermFac))
			return false;
		if (facPidDeal == null) {
			if (other.facPidDeal != null)
				return false;
		} else if (!facPidDeal.equals(other.facPidDeal))
			return false;
		if (facPidFacility == null) {
			if (other.facPidFacility != null)
				return false;
		} else if (!facPidFacility.equals(other.facPidFacility))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "VlsFacility [facPidFacility=" + facPidFacility + ", facPidDeal=" + facPidDeal + ", facDteTermFac="
				+ facDteTermFac + "]";
	}


}