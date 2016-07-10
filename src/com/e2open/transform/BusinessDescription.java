//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.22 at 04:49:09 PM SGT 
//


package com.e2open.transform;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{}businessName" minOccurs="0"/>
 *         &lt;element ref="{}GlobalBusinessIdentifier" minOccurs="0"/>
 *         &lt;element ref="{}PartnerBusinessIdentification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}GlobalSupplyChainCode" minOccurs="0"/>
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
    "businessName",
    "globalBusinessIdentifier",
    "partnerBusinessIdentification",
    "globalSupplyChainCode"
})
@XmlRootElement(name = "BusinessDescription")
public class BusinessDescription {

    protected BusinessName businessName;
    @XmlElement(name = "GlobalBusinessIdentifier")
    protected String globalBusinessIdentifier;
    @XmlElement(name = "PartnerBusinessIdentification")
    protected List<PartnerBusinessIdentification> partnerBusinessIdentification;
    @XmlElement(name = "GlobalSupplyChainCode")
    protected String globalSupplyChainCode;

    /**
     * Gets the value of the businessName property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessName }
     *     
     */
    public BusinessName getBusinessName() {
        return businessName;
    }

    /**
     * Sets the value of the businessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessName }
     *     
     */
    public void setBusinessName(BusinessName value) {
        this.businessName = value;
    }

    /**
     * Gets the value of the globalBusinessIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalBusinessIdentifier() {
        return globalBusinessIdentifier;
    }

    /**
     * Sets the value of the globalBusinessIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalBusinessIdentifier(String value) {
        this.globalBusinessIdentifier = value;
    }

    /**
     * Gets the value of the partnerBusinessIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerBusinessIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerBusinessIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartnerBusinessIdentification }
     * 
     * 
     */
    public List<PartnerBusinessIdentification> getPartnerBusinessIdentification() {
        if (partnerBusinessIdentification == null) {
            partnerBusinessIdentification = new ArrayList<PartnerBusinessIdentification>();
        }
        return this.partnerBusinessIdentification;
    }

    /**
     * Gets the value of the globalSupplyChainCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalSupplyChainCode() {
        return globalSupplyChainCode;
    }

    /**
     * Sets the value of the globalSupplyChainCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalSupplyChainCode(String value) {
        this.globalSupplyChainCode = value;
    }

}