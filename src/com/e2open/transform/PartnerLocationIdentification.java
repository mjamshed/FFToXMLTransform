//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.22 at 04:49:09 PM SGT 
//


package com.e2open.transform;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{}ProprietaryDomainIdentifier"/>
 *         &lt;element ref="{}ProprietaryIdentifierAuthority" minOccurs="0"/>
 *         &lt;element ref="{}ProprietaryLocationIdentifier"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "proprietaryDomainIdentifier",
    "proprietaryIdentifierAuthority",
    "proprietaryLocationIdentifier"
})
@XmlRootElement(name = "PartnerLocationIdentification")
public class PartnerLocationIdentification {

    @XmlElement(name = "ProprietaryDomainIdentifier", required = true)
    protected String proprietaryDomainIdentifier;
    @XmlElement(name = "ProprietaryIdentifierAuthority")
    protected String proprietaryIdentifierAuthority;
    @XmlElement(name = "ProprietaryLocationIdentifier", required = true)
    protected String proprietaryLocationIdentifier;

    /**
     * Gets the value of the proprietaryDomainIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProprietaryDomainIdentifier() {
        return proprietaryDomainIdentifier;
    }

    /**
     * Sets the value of the proprietaryDomainIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProprietaryDomainIdentifier(String value) {
        this.proprietaryDomainIdentifier = value;
    }

    /**
     * Gets the value of the proprietaryIdentifierAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProprietaryIdentifierAuthority() {
        return proprietaryIdentifierAuthority;
    }

    /**
     * Sets the value of the proprietaryIdentifierAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProprietaryIdentifierAuthority(String value) {
        this.proprietaryIdentifierAuthority = value;
    }

    /**
     * Gets the value of the proprietaryLocationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProprietaryLocationIdentifier() {
        return proprietaryLocationIdentifier;
    }

    /**
     * Sets the value of the proprietaryLocationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProprietaryLocationIdentifier(String value) {
        this.proprietaryLocationIdentifier = value;
    }

}
