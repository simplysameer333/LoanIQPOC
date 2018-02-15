package com.poc.loans.bbgtrades.repo.loaniq;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "VLS_CUSTOMER")
public class VlsCustomer {
	
	@Id
	@Column(name = "CUS_CID_CUST_ID")
	private String  cusCidCustID;
	
	@Column(name = "CUS_CDE_DEPT")
	private String cusCdeDept;
	
	@Column(name = "CUS_CDE_CUST_DESC")
	private String cusCdeCustDesc;
	
	@Column(name = "CUS_XID_CUST_ID")
	private String cusXidCustId;

	
	@Transient
	private String exceptionMsg;

	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@Fetch(FetchMode.JOIN) 
	private Set<VlsCustLocation> locations;
	
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@Fetch(FetchMode.JOIN) 
	private Set<VlsCustAlias> aliases;
	
	/**
	 * @return the exceptionMsg
	 */
	public String getExceptionMsg() {
		return exceptionMsg;
	}

	/**
	 * @param exceptionMsg the exceptionMsg to set
	 */
	public void setExceptionMsg(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}

	/**
	 * @return the cusXidCustId
	 */
	public String getCusXidCustId() {
		return cusXidCustId;
	}

	/**
	 * @param cusXidCustId the cusXidCustId to set
	 */
	public void setCusXidCustId(String cusXidCustId) {
		cusXidCustId = cusXidCustId;
	}

	/**
	 * @return the cusCidCustID
	 */
	public String getCusCidCustID() {
		return cusCidCustID;
	}

	/**
	 * @param cusCidCustID the cusCidCustID to set
	 */
	public void setCusCidCustID(String cusCidCustID) {
		this.cusCidCustID = cusCidCustID;
	}

	/**
	 * @return the cusCdeDept
	 */
	public String getCusCdeDept() {
		return cusCdeDept;
	}

	/**
	 * @param cusCdeDept the cusCdeDept to set
	 */
	public void setCusCdeDept(String cusCdeDept) {
		this.cusCdeDept = cusCdeDept;
	}

	/**
	 * @return the cusCdeCustDesc
	 */
	public String getCusCdeCustDesc() {
		return cusCdeCustDesc;
	}

	/**
	 * @param cusCdeCustDesc the cusCdeCustDesc to set
	 */
	public void setCusCdeCustDesc(String cusCdeCustDesc) {
		this.cusCdeCustDesc = cusCdeCustDesc;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cusXidCustId == null) ? 0 : cusXidCustId.hashCode());
		result = prime * result + ((cusCdeCustDesc == null) ? 0 : cusCdeCustDesc.hashCode());
		result = prime * result + ((cusCdeDept == null) ? 0 : cusCdeDept.hashCode());
		result = prime * result + ((cusCidCustID == null) ? 0 : cusCidCustID.hashCode());
		result = prime * result + ((exceptionMsg == null) ? 0 : exceptionMsg.hashCode());
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
		VlsCustomer other = (VlsCustomer) obj;
		if (cusXidCustId == null) {
			if (other.cusXidCustId != null)
				return false;
		} else if (!cusXidCustId.equals(other.cusXidCustId))
			return false;
		if (cusCdeCustDesc == null) {
			if (other.cusCdeCustDesc != null)
				return false;
		} else if (!cusCdeCustDesc.equals(other.cusCdeCustDesc))
			return false;
		if (cusCdeDept == null) {
			if (other.cusCdeDept != null)
				return false;
		} else if (!cusCdeDept.equals(other.cusCdeDept))
			return false;
		if (cusCidCustID == null) {
			if (other.cusCidCustID != null)
				return false;
		} else if (!cusCidCustID.equals(other.cusCidCustID))
			return false;
		if (exceptionMsg == null) {
			if (other.exceptionMsg != null)
				return false;
		} else if (!exceptionMsg.equals(other.exceptionMsg))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "VlsCustomer [cusCidCustID=" + cusCidCustID + ", cusCdeDept=" + cusCdeDept + ", cusCdeCustDesc="
				+ cusCdeCustDesc + ", CusXidCustId=" + cusXidCustId + ", exceptionMsg=" + exceptionMsg + "]";
	}

	public Set<VlsCustLocation> getLocations() {
		return locations;
	}

	public void setLocations(Set<VlsCustLocation> locations) {
		this.locations = locations;
	}

	public Set<VlsCustAlias> getAliases() {
		return aliases;
	}

	public void setAliases(Set<VlsCustAlias> aliases) {
		this.aliases = aliases;
	}


}
