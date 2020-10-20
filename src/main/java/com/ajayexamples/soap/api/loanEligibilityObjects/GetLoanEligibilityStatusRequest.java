//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.10.11 um 11:47:27 PM CEST 
//


package com.ajayexamples.soap.api.loanEligibilityObjects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="yearlyIncome" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="cibilScore" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="employmentMode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "customerName",
    "age",
    "yearlyIncome",
    "cibilScore",
    "employmentMode"
})
@XmlRootElement(name = "getLoanEligibilityStatusRequest")
public class GetLoanEligibilityStatusRequest {

    @XmlElement(required = true)
    protected String customerName;
    protected int age;
    protected long yearlyIncome;
    protected int cibilScore;
    @XmlElement(required = true)
    protected String employmentMode;

    /**
     * Ruft den Wert der customerName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Legt den Wert der customerName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Ruft den Wert der age-Eigenschaft ab.
     * 
     */
    public int getAge() {
        return age;
    }

    /**
     * Legt den Wert der age-Eigenschaft fest.
     * 
     */
    public void setAge(int value) {
        this.age = value;
    }

    /**
     * Ruft den Wert der yearlyIncome-Eigenschaft ab.
     * 
     */
    public long getYearlyIncome() {
        return yearlyIncome;
    }

    /**
     * Legt den Wert der yearlyIncome-Eigenschaft fest.
     * 
     */
    public void setYearlyIncome(long value) {
        this.yearlyIncome = value;
    }

    /**
     * Ruft den Wert der cibilScore-Eigenschaft ab.
     * 
     */
    public int getCibilScore() {
        return cibilScore;
    }

    /**
     * Legt den Wert der cibilScore-Eigenschaft fest.
     * 
     */
    public void setCibilScore(int value) {
        this.cibilScore = value;
    }

    /**
     * Ruft den Wert der employmentMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmploymentMode() {
        return employmentMode;
    }

    /**
     * Legt den Wert der employmentMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmploymentMode(String value) {
        this.employmentMode = value;
    }

}
