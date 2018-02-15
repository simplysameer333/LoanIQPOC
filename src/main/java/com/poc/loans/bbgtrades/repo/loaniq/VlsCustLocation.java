package com.poc.loans.bbgtrades.repo.loaniq;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "VLS_CUST_LOCATION")
public class VlsCustLocation {
	@Column(name = "CLO_CDE_LOCATION")
	private String cloCdeLocation;

	@Column(name = "CLO_CDE_PRFL_TYPE")
	private String cloCdePrflType;

	@Column(name = "CLO_CID_CUST_ID", insertable = false, updatable = false)
	private String cloCidCustId;

	@Id
	@Column(name = "CLO_RID_LOCATION")
	private String cloRidLocation;

	@Column(name = "CLO_IND_COMPLETE")
	private String cloIndComplete;

	@ManyToOne
	@JoinColumn(name = "CLO_CID_CUST_ID")
	private VlsCustomer customer;


	/**
	 * @return the cloCdeLocation
	 */
	public String getCloCdeLocation() {
		return cloCdeLocation;
	}

	/**
	 * @param cloCdeLocation
	 *            the cloCdeLocation to set
	 */
	public void setCloCdeLocation(String cloCdeLocation) {
		this.cloCdeLocation = cloCdeLocation;
	}

	/**
	 * @return the cloCdePrflType
	 */
	public String getCloCdePrflType() {
		return cloCdePrflType;
	}

	/**
	 * @param cloCdePrflType
	 *            the cloCdePrflType to set
	 */
	public void setCloCdePrflType(String cloCdePrflType) {
		this.cloCdePrflType = cloCdePrflType;
	}

	/**
	 * @return the cloCidCustId
	 */
	public String getCloCidCustId() {
		return cloCidCustId;
	}

	/**
	 * @param cloCidCustId
	 *            the cloCidCustId to set
	 */
	public void setCloCidCustId(String cloCidCustId) {
		this.cloCidCustId = cloCidCustId;
	}

	/**
	 * @return the cloRidLocation
	 */
	public String getCloRidLocation() {
		return cloRidLocation;
	}

	/**
	 * @param cloRidLocation
	 *            the cloRidLocation to set
	 */
	public void setCloRidLocation(String cloRidLocation) {
		this.cloRidLocation = cloRidLocation;
	}

	/**
	 * @return the cloIndComplete
	 */
	public String getCloIndComplete() {
		return cloIndComplete;
	}

	/**
	 * @param cloIndComplete the cloIndComplete to set
	 */
	public void setCloIndComplete(String cloIndComplete) {
		this.cloIndComplete = cloIndComplete;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cloCdeLocation == null) ? 0 : cloCdeLocation.hashCode());
		result = prime * result + ((cloCdePrflType == null) ? 0 : cloCdePrflType.hashCode());
		result = prime * result + ((cloCidCustId == null) ? 0 : cloCidCustId.hashCode());
		result = prime * result + ((cloIndComplete == null) ? 0 : cloIndComplete.hashCode());
		result = prime * result + ((cloRidLocation == null) ? 0 : cloRidLocation.hashCode());
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
		VlsCustLocation other = (VlsCustLocation) obj;
		if (cloCdeLocation == null) {
			if (other.cloCdeLocation != null)
				return false;
		} else if (!cloCdeLocation.equals(other.cloCdeLocation))
			return false;
		if (cloCdePrflType == null) {
			if (other.cloCdePrflType != null)
				return false;
		} else if (!cloCdePrflType.equals(other.cloCdePrflType))
			return false;
		if (cloCidCustId == null) {
			if (other.cloCidCustId != null)
				return false;
		} else if (!cloCidCustId.equals(other.cloCidCustId))
			return false;
		if (cloIndComplete == null) {
			if (other.cloIndComplete != null)
				return false;
		} else if (!cloIndComplete.equals(other.cloIndComplete))
			return false;
		if (cloRidLocation == null) {
			if (other.cloRidLocation != null)
				return false;
		} else if (!cloRidLocation.equals(other.cloRidLocation))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "VlsCustLocation [cloCdeLocation=" + cloCdeLocation + ", cloCdePrflType=" + cloCdePrflType
				+ ", cloCidCustId=" + cloCidCustId + ", cloRidLocation=" + cloRidLocation + ", cloIndComplete="
				+ cloIndComplete + "]";
	}

	public VlsCustomer getCustomer() {
		return customer;
	}

	public void setCustomer(VlsCustomer customer) {
		this.customer = customer;
	}


}
