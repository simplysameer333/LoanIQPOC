package com.poc.loans.bbgtrades.repo.loaniq;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "VLS_CUST_ALIAS")
public class VlsCustAlias {
	
	@Id
	@Column(name = "CAL_RID_CUST_ALIAS")
	private String calRidCustAlias;
	
	@Column(name = "CAL_CID_CUST_ID" , insertable = false, updatable = false)
	private String calCidCustId;
	
	@Column(name = "CAL_CDE_ALIAS_TYPE")
	private String calCdeAliasType;
	
	@Column(name = "CAL_NME_ALIAS_NAME")
	private String calNmeAliasName;

	@ManyToOne
	@JoinColumn(name = "CAL_CID_CUST_ID")
	private VlsCustomer customer;
	
	/**
	 * @return the calRidCustAlias
	 */
	public String getCalRidCustAlias() {
		return calRidCustAlias;
	}

	/**
	 * @param calRidCustAlias the calRidCustAlias to set
	 */
	public void setCalRidCustAlias(String calRidCustAlias) {
		this.calRidCustAlias = calRidCustAlias;
	}

	/**
	 * @return the calCidCustId
	 */
	public String getCalCidCustId() {
		return calCidCustId;
	}

	/**
	 * @param calCidCustId the calCidCustId to set
	 */
	public void setCalCidCustId(String calCidCustId) {
		this.calCidCustId = calCidCustId;
	}

	/**
	 * @return the calCdeAliasType
	 */
	public String getCalCdeAliasType() {
		return calCdeAliasType;
	}

	/**
	 * @param calCdeAliasType the calCdeAliasType to set
	 */
	public void setCalCdeAliasType(String calCdeAliasType) {
		this.calCdeAliasType = calCdeAliasType;
	}

	/**
	 * @return the calNmeAliasName
	 */
	public String getCalNmeAliasName() {
		return calNmeAliasName;
	}

	/**
	 * @param calNmeAliasName the calNmeAliasName to set
	 */
	public void setCalNmeAliasName(String calNmeAliasName) {
		this.calNmeAliasName = calNmeAliasName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((calCdeAliasType == null) ? 0 : calCdeAliasType.hashCode());
		result = prime * result + ((calCidCustId == null) ? 0 : calCidCustId.hashCode());
		result = prime * result + ((calNmeAliasName == null) ? 0 : calNmeAliasName.hashCode());
		result = prime * result + ((calRidCustAlias == null) ? 0 : calRidCustAlias.hashCode());
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
		VlsCustAlias other = (VlsCustAlias) obj;
		if (calCdeAliasType == null) {
			if (other.calCdeAliasType != null)
				return false;
		} else if (!calCdeAliasType.equals(other.calCdeAliasType))
			return false;
		if (calCidCustId == null) {
			if (other.calCidCustId != null)
				return false;
		} else if (!calCidCustId.equals(other.calCidCustId))
			return false;
		if (calNmeAliasName == null) {
			if (other.calNmeAliasName != null)
				return false;
		} else if (!calNmeAliasName.equals(other.calNmeAliasName))
			return false;
		if (calRidCustAlias == null) {
			if (other.calRidCustAlias != null)
				return false;
		} else if (!calRidCustAlias.equals(other.calRidCustAlias))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "VlsCustAlias [calRidCustAlias=" + calRidCustAlias + ", calCidCustId=" + calCidCustId
				+ ", calCdeAliasType=" + calCdeAliasType + ", calNmeAliasName=" + calNmeAliasName + "]";
	}
	
}
