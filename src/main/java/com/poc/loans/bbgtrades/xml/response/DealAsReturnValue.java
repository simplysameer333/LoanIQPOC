package com.poc.loans.bbgtrades.xml.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "DealAsReturnValue")
public class DealAsReturnValue {

    @XmlAttribute(name = "dealId", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String dealId;
    @XmlAttribute(name = "dealName", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String dealName;
    @XmlAttribute(name = "status", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String status;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
	 * @return the dealName
	 */
	public String getDealName() {
		return dealName;
	}

	/**
	 * @param dealName the dealName to set
	 */
	public void setDealName(String dealName) {
		this.dealName = dealName;
	}

	/**
     * Gets the value of the internalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealId() {
        return dealId;
    }

    /**
     * Sets the value of the internalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealId(String value) {
        this.dealId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String value) {
        this.version = value;
    }

}

