//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.05 at 03:50:08 PM IST 
//


package com.poc.loans.bbgtrades.xml.response;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

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

    private final static QName _Message_QNAME = new QName("", "Message");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.jeff.jaxb.test
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link XmlResponse }
     * 
     */
    public XmlResponse createResponse() {
        return new XmlResponse();
    }

    /**
     * Create an instance of {@link Result }
     * 
     */
    public Result createResult() {
        return new Result();
    }

    /**
     * Create an instance of {@link CircleAsReturnValue }
     * 
     */
    public CircleAsReturnValue createCircleAsReturnValue() {
        return new CircleAsReturnValue();
    }

    public DealAsReturnValue createDealAsReturnValue() {
    	return new DealAsReturnValue();
    }
    /**
     * Create an instance of {@link Messages }
     * 
     */
    public Messages createMessages() {
        return new Messages();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Message")
    public JAXBElement<String> createMessage(String value) {
        return new JAXBElement<String>(_Message_QNAME, String.class, null, value);
    }

}
