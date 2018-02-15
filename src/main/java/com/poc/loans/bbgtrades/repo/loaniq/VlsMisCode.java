package com.poc.loans.bbgtrades.repo.loaniq;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VLS_MIS_CODE")
public class VlsMisCode {

	@Column(name = "MIC_PID_PRODUCT_ID")
	private String micPidProductId;
	
	@Column(name = "MIC_CDE_PROD_TYPE")
	private String micCdeProdType;
	
	@Column(name = "MIC_TXT_MIS_VALUE")
	private String micTxtMisValue;
	
	@Id
	@Column(name = "MIC_RID_MIS_CODE")
	private String micRidMisCode;
	
	@Column(name = "MIC_CDE_MIS_TYPE")
	private String micCdeMisType;

	/**
	 * @return the micCdeMisType
	 */
	public String getMicCdeMisType() {
		return micCdeMisType;
	}

	/**
	 * @param micCdeMisType the micCdeMisType to set
	 */
	public void setMicCdeMisType(String micCdeMisType) {
		this.micCdeMisType = micCdeMisType;
	}

	/**
	 * @return the micPidProductId
	 */
	public String getMicPidProductId() {
		return micPidProductId;
	}

	/**
	 * @param micPidProductId the micPidProductId to set
	 */
	public void setMicPidProductId(String micPidProductId) {
		this.micPidProductId = micPidProductId;
	}

	/**
	 * @return the micCdeProdType
	 */
	public String getMicCdeProdType() {
		return micCdeProdType;
	}

	/**
	 * @param micCdeProdType the micCdeProdType to set
	 */
	public void setMicCdeProdType(String micCdeProdType) {
		this.micCdeProdType = micCdeProdType;
	}

	/**
	 * @return the micTxtMisValue
	 */
	public String getMicTxtMisValue() {
		return micTxtMisValue;
	}

	/**
	 * @param micTxtMisValue the micTxtMisValue to set
	 */
	public void setMicTxtMisValue(String micTxtMisValue) {
		this.micTxtMisValue = micTxtMisValue;
	}

	/**
	 * @return the micRidMisCode
	 */
	public String getMicRidMisCode() {
		return micRidMisCode;
	}

	/**
	 * @param micRidMisCode the micRidMisCode to set
	 */
	public void setMicRidMisCode(String micRidMisCode) {
		this.micRidMisCode = micRidMisCode;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((micCdeMisType == null) ? 0 : micCdeMisType.hashCode());
		result = prime * result + ((micCdeProdType == null) ? 0 : micCdeProdType.hashCode());
		result = prime * result + ((micPidProductId == null) ? 0 : micPidProductId.hashCode());
		result = prime * result + ((micRidMisCode == null) ? 0 : micRidMisCode.hashCode());
		result = prime * result + ((micTxtMisValue == null) ? 0 : micTxtMisValue.hashCode());
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
		VlsMisCode other = (VlsMisCode) obj;
		if (micCdeMisType == null) {
			if (other.micCdeMisType != null)
				return false;
		} else if (!micCdeMisType.equals(other.micCdeMisType))
			return false;
		if (micCdeProdType == null) {
			if (other.micCdeProdType != null)
				return false;
		} else if (!micCdeProdType.equals(other.micCdeProdType))
			return false;
		if (micPidProductId == null) {
			if (other.micPidProductId != null)
				return false;
		} else if (!micPidProductId.equals(other.micPidProductId))
			return false;
		if (micRidMisCode == null) {
			if (other.micRidMisCode != null)
				return false;
		} else if (!micRidMisCode.equals(other.micRidMisCode))
			return false;
		if (micTxtMisValue == null) {
			if (other.micTxtMisValue != null)
				return false;
		} else if (!micTxtMisValue.equals(other.micTxtMisValue))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "VlsMisCode [micPidProductId=" + micPidProductId + ", micCdeProdType=" + micCdeProdType
				+ ", micTxtMisValue=" + micTxtMisValue + ", micRidMisCode=" + micRidMisCode + ", micCdeMisType="
				+ micCdeMisType + "]";
	}


	}