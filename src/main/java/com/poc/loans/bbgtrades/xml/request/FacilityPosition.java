//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.23 at 06:15:50 PM IST 
//


package com.poc.loans.bbgtrades.xml.request;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}PortfolioAllocation"/>
 *       &lt;/sequence>
 *       &lt;attribute name="facilityInternalId" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="interestSkim" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="price" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "portfolioAllocation"
})
@XmlRootElement(name = "FacilityPosition")
public class FacilityPosition {
	

    @XmlElement(name = "PortfolioAllocation", required = true, type = PortfolioAllocation.class)
    protected PortfolioAllocation portfolioAllocation;
    
    @XmlAttribute(name = "facilityInternalId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String facilityInternalId;
    @XmlAttribute(name = "interestSkim", required = true)
    protected BigDecimal interestSkim;
    @XmlAttribute(name = "price", required = true)
    protected BigDecimal price;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the portfolioAllocation property.
     * 
     * @return
     *     possible object is
     *     {@link PortfolioAllocation }
     *     
     */
    public PortfolioAllocation getPortfolioAllocation() {
        return portfolioAllocation;
    }

    /**
     * Sets the value of the portfolioAllocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortfolioAllocation }
     *     
     */
    public void setPortfolioAllocation(PortfolioAllocation value) {
        this.portfolioAllocation = value;
    }

    /**
     * Gets the value of the facilityInternalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityInternalId() {
        return facilityInternalId;
    }

    /**
     * Sets the value of the facilityInternalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityInternalId(String value) {
        this.facilityInternalId = value;
    }

    /**
     * Gets the value of the interestSkim property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInterestSkim() {
        return interestSkim;
    }

    /**
     * Sets the value of the interestSkim property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInterestSkim(BigDecimal value) {
        this.interestSkim = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

}