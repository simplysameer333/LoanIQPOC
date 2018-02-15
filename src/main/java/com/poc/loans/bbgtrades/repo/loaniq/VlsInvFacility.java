package com.poc.loans.bbgtrades.repo.loaniq;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="VLS_INV_FACILITY")
public class VlsInvFacility {
	
	@Id
	@Column(name = "IFA_FID_FAC_INV_ID")
	private String ifaFidFacInvId;
	
	@Column(name = "IFA_PID_FACILITY")
	private String ifaPidFacility;
	
	@Column(name = "IFA_IID_INV_ID")
	private String ifaIidInvId;

	/**
	 * @return the ifaFidFacInvId
	 */
	public String getIfaFidFacInvId() {
		return ifaFidFacInvId;
	}

	/**
	 * @param ifaFidFacInvId the ifaFidFacInvId to set
	 */
	public void setIfaFidFacInvId(String ifaFidFacInvId) {
		this.ifaFidFacInvId = ifaFidFacInvId;
	}

	/**
	 * @return the ifaPidFacility
	 */
	public String getIfaPidFacility() {
		return ifaPidFacility;
	}

	/**
	 * @param ifaPidFacility the ifaPidFacility to set
	 */
	public void setIfaPidFacility(String ifaPidFacility) {
		this.ifaPidFacility = ifaPidFacility;
	}

	/**
	 * @return the ifaIidInvId
	 */
	public String getIfaIidInvId() {
		return ifaIidInvId;
	}

	/**
	 * @param ifaIidInvId the ifaIidInvId to set
	 */
	public void setIfaIidInvId(String ifaIidInvId) {
		this.ifaIidInvId = ifaIidInvId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ifaFidFacInvId == null) ? 0 : ifaFidFacInvId.hashCode());
		result = prime * result + ((ifaIidInvId == null) ? 0 : ifaIidInvId.hashCode());
		result = prime * result + ((ifaPidFacility == null) ? 0 : ifaPidFacility.hashCode());
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
		VlsInvFacility other = (VlsInvFacility) obj;
		if (ifaFidFacInvId == null) {
			if (other.ifaFidFacInvId != null)
				return false;
		} else if (!ifaFidFacInvId.equals(other.ifaFidFacInvId))
			return false;
		if (ifaIidInvId == null) {
			if (other.ifaIidInvId != null)
				return false;
		} else if (!ifaIidInvId.equals(other.ifaIidInvId))
			return false;
		if (ifaPidFacility == null) {
			if (other.ifaPidFacility != null)
				return false;
		} else if (!ifaPidFacility.equals(other.ifaPidFacility))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "VlsInvFacility [ifaFidFacInvId=" + ifaFidFacInvId + ", ifaPidFacility=" + ifaPidFacility
				+ ", ifaIidInvId=" + ifaIidInvId + "]";
	}
	
}
