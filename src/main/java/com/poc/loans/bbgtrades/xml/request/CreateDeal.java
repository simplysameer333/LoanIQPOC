//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.01 at 04:36:16 PM IST 
//


package com.poc.loans.bbgtrades.xml.request;

import java.math.BigDecimal;
import java.math.BigInteger;
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
 *         &lt;element ref="{}DealAdminAgent"/>
 *         &lt;element ref="{}DealBorrower"/>
 *         &lt;element ref="{}InterestPricingOption"/>
 *         &lt;element ref="{}FeePricingRule"/>
 *         &lt;element ref="{}HolidayCalendar"/>
 *         &lt;element ref="{}MISCode"/>
 *       &lt;/sequence>
 *       &lt;attribute name="agreementDate" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="branch" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="classification" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="currency" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="dealName" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="department" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="expenseCode" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="globalDealProposedCommitmentAmount" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="gracePeriodNumberOfDays" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="nonHostBankDealIndicator" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="processingAreaCode" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="projectedCloseDate" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="soleLenderIndicator" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
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
    "dealAdminAgent",
    "dealBorrower",
    "interestPricingOption",
    "feePricingRule",
    "holidayCalendar",
    "misCode"
})
@XmlRootElement(name = "CreateDeal")
public class CreateDeal {

    @XmlElement(name = "DealAdminAgent", required = true)
    protected DealAdminAgent dealAdminAgent;
    @XmlElement(name = "DealBorrower", required = true)
    protected DealBorrower dealBorrower;
    @XmlElement(name = "InterestPricingOption", required = true)
    protected InterestPricingOption interestPricingOption;
    @XmlElement(name = "FeePricingRule", required = true)
    protected FeePricingRule feePricingRule;
    @XmlElement(name = "HolidayCalendar", required = true)
    protected HolidayCalendar holidayCalendar;
    @XmlElement(name = "MISCode", required = true)
    protected MISCode misCode;
    @XmlAttribute(name = "agreementDate", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String agreementDate;
    @XmlAttribute(name = "branch", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String branch;
    @XmlAttribute(name = "classification", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String classification;
    @XmlAttribute(name = "currency", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String currency;
    @XmlAttribute(name = "dealName", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String dealName;
    @XmlAttribute(name = "department", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String department;
    @XmlAttribute(name = "expenseCode", required = true)
    protected String expenseCode;
    @XmlAttribute(name = "globalDealProposedCommitmentAmount", required = true)
    protected BigInteger globalDealProposedCommitmentAmount;
    @XmlAttribute(name = "gracePeriodNumberOfDays", required = true)
    protected BigInteger gracePeriodNumberOfDays;
    @XmlAttribute(name = "nonHostBankDealIndicator", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String nonHostBankDealIndicator;
    @XmlAttribute(name = "processingAreaCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String processingAreaCode;
    @XmlAttribute(name = "projectedCloseDate", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String projectedCloseDate;
    @XmlAttribute(name = "soleLenderIndicator", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String soleLenderIndicator;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the dealAdminAgent property.
     * 
     * @return
     *     possible object is
     *     {@link DealAdminAgent }
     *     
     */
    public DealAdminAgent getDealAdminAgent() {
        return dealAdminAgent;
    }

    /**
     * Sets the value of the dealAdminAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealAdminAgent }
     *     
     */
    public void setDealAdminAgent(DealAdminAgent value) {
        this.dealAdminAgent = value;
    }

    /**
     * Gets the value of the dealBorrower property.
     * 
     * @return
     *     possible object is
     *     {@link DealBorrower }
     *     
     */
    public DealBorrower getDealBorrower() {
        return dealBorrower;
    }

    /**
     * Sets the value of the dealBorrower property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealBorrower }
     *     
     */
    public void setDealBorrower(DealBorrower value) {
        this.dealBorrower = value;
    }

    /**
     * Gets the value of the interestPricingOption property.
     * 
     * @return
     *     possible object is
     *     {@link InterestPricingOption }
     *     
     */
    public InterestPricingOption getInterestPricingOption() {
        return interestPricingOption;
    }

    /**
     * Sets the value of the interestPricingOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestPricingOption }
     *     
     */
    public void setInterestPricingOption(InterestPricingOption value) {
        this.interestPricingOption = value;
    }

    /**
     * Gets the value of the feePricingRule property.
     * 
     * @return
     *     possible object is
     *     {@link FeePricingRule }
     *     
     */
    public FeePricingRule getFeePricingRule() {
        return feePricingRule;
    }

    /**
     * Sets the value of the feePricingRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeePricingRule }
     *     
     */
    public void setFeePricingRule(FeePricingRule value) {
        this.feePricingRule = value;
    }

    /**
     * Gets the value of the holidayCalendar property.
     * 
     * @return
     *     possible object is
     *     {@link HolidayCalendar }
     *     
     */
    public HolidayCalendar getHolidayCalendar() {
        return holidayCalendar;
    }

    /**
     * Sets the value of the holidayCalendar property.
     * 
     * @param value
     *     allowed object is
     *     {@link HolidayCalendar }
     *     
     */
    public void setHolidayCalendar(HolidayCalendar value) {
        this.holidayCalendar = value;
    }

    /**
     * Gets the value of the misCode property.
     * 
     * @return
     *     possible object is
     *     {@link MISCode }
     *     
     */
    public MISCode getMISCode() {
        return misCode;
    }

    /**
     * Sets the value of the misCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISCode }
     *     
     */
    public void setMISCode(MISCode value) {
        this.misCode = value;
    }

    /**
     * Gets the value of the agreementDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementDate() {
        return agreementDate;
    }

    /**
     * Sets the value of the agreementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementDate(String value) {
        this.agreementDate = value;
    }

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranch() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranch(String value) {
        this.branch = value;
    }

    /**
     * Gets the value of the classification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassification() {
        return classification;
    }

    /**
     * Sets the value of the classification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassification(String value) {
        this.classification = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the dealName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealName() {
        return dealName;
    }

    /**
     * Sets the value of the dealName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealName(String value) {
        this.dealName = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * Gets the value of the expenseCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public String getExpenseCode() {
        return expenseCode;
    }

    /**
     * Sets the value of the expenseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExpenseCode(String value) {
        this.expenseCode = value;
    }

    /**
     * Gets the value of the globalDealProposedCommitmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGlobalDealProposedCommitmentAmount() {
        return globalDealProposedCommitmentAmount;
    }

    /**
     * Sets the value of the globalDealProposedCommitmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGlobalDealProposedCommitmentAmount(BigInteger value) {
        this.globalDealProposedCommitmentAmount = value;
    }

    /**
     * Gets the value of the gracePeriodNumberOfDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGracePeriodNumberOfDays() {
        return gracePeriodNumberOfDays;
    }

    /**
     * Sets the value of the gracePeriodNumberOfDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGracePeriodNumberOfDays(BigInteger value) {
        this.gracePeriodNumberOfDays = value;
    }

    /**
     * Gets the value of the nonHostBankDealIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonHostBankDealIndicator() {
        return nonHostBankDealIndicator;
    }

    /**
     * Sets the value of the nonHostBankDealIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonHostBankDealIndicator(String value) {
        this.nonHostBankDealIndicator = value;
    }

    /**
     * Gets the value of the processingAreaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessingAreaCode() {
        return processingAreaCode;
    }

    /**
     * Sets the value of the processingAreaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessingAreaCode(String value) {
        this.processingAreaCode = value;
    }

    /**
     * Gets the value of the projectedCloseDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectedCloseDate() {
        return projectedCloseDate;
    }

    /**
     * Sets the value of the projectedCloseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectedCloseDate(String value) {
        this.projectedCloseDate = value;
    }

    /**
     * Gets the value of the soleLenderIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoleLenderIndicator() {
        return soleLenderIndicator;
    }

    /**
     * Sets the value of the soleLenderIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoleLenderIndicator(String value) {
        this.soleLenderIndicator = value;
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

}
