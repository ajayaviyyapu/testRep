//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.10.11 um 11:47:27 PM CEST 
//


package com.ajayexamples.soap.api.loanEligibilityObjects;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ajayexamples.soap.api.loanEligibilityObjects package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ajayexamples.soap.api.loanEligibilityObjects
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetLoanEligibilityStatusRequest }
     * 
     */
    public GetLoanEligibilityStatusRequest createGetLoanEligibilityStatusRequest() {
        return new GetLoanEligibilityStatusRequest();
    }

    /**
     * Create an instance of {@link GetLoanEligibilityStatusResponse }
     * 
     */
    public GetLoanEligibilityStatusResponse createGetLoanEligibilityStatusResponse() {
        return new GetLoanEligibilityStatusResponse();
    }

}
