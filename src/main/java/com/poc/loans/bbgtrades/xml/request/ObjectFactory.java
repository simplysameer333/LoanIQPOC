//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.23 at 06:15:50 PM IST 
//


package com.poc.loans.bbgtrades.xml.request;

import javax.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.jeff.jaxb.test package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.jeff.jaxb.test
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Counterparty }
     * 
     */
    public Counterparty createCounterparty() {
        return new Counterparty();
    }

    /**
     * Create an instance of {@link FacilityPosition }
     * 
     */
    public FacilityPosition createFacilityPosition() {
        return new FacilityPosition();
    }

    /**
     * Create an instance of {@link PortfolioAllocation }
     * 
     */
    public PortfolioAllocation createPortfolioAllocation() {
        return new PortfolioAllocation();
    }

    /**
     * Create an instance of {@link CreateTrade }
     * 
     */
    public CreateTrade createCreateTrade() {
        return new CreateTrade();
    }

    /**
     * Create an instance of {@link  DealAdminAgent}
     * 
     */
    public DealAdminAgent createDealAdminAgent() {
        return new DealAdminAgent();
    }

    /**
     * Create an instance of {@link  DealAdminServicingGroup}
     * 
     */
    public DealAdminServicingGroup createDealAdminServicingGroup() {
        return new DealAdminServicingGroup();
    }

    /**
     * Create an instance of {@link  DealBorrower}
     * 
     */
    public DealBorrower createDealBorrower() {
        return new DealBorrower();
      
    }

    /**
     * Create an instance of {@link  DealBorrowerServicingGroup}
     * 
     */
    public DealBorrowerServicingGroup createDealBorrowerServicingGroup() {
        return new DealBorrowerServicingGroup();
    }
    
    public FeePricing createFeePricing() {
        return new FeePricing();
    }
    /**
     * Create an instance of {@link  FeePricingRule}
     * 
     */
    public FeePricingRule createFeePricingRule() {
        return new FeePricingRule();
    }
    /**
     * Create an instance of {@link  HolidayCalendar}
     * 
     */
    public HolidayCalendar createHolidayCalendar() {
        return new HolidayCalendar();
    }
    /**
     * Create an instance of {@link  InterestPricingOption}
     * 
     */
    public InterestPricingOption createInterestPricingOption() {
        return new InterestPricingOption();
    }
    /**
     * Create an instance of {@link  LoanPurpose}
     * 
     */
    public LoanPurpose createLoanPurpose() {
        return new LoanPurpose();
    }

    /**
     * Create an instance of {@link  MISCode}
     * 
     */
    public MISCode createMISCode() {
        return new MISCode();
    }
    /**
     * Create an instance of {@link  Risk}
     * 
     */
    public Risk createRisk() {
        return new Risk();
    }
    /**
     * Create an instance of {@link  ServicingGroup}
     * 
     */
    public ServicingGroup createServicingGroup() {
        return new ServicingGroup();
    }
     
    public CreateDeal createCreateDeal() {
    	return new CreateDeal();
    }
    
    public CreateFacility createCreateFacility() {
    	return new CreateFacility();
    }
    public CancelTrade createCancelTrade() {
        return new CancelTrade();
    }
}
