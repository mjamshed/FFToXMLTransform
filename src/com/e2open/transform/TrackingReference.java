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
 *         &lt;element ref="{}GlobalTrackingReferenceTypeCode"/>
 *         &lt;element ref="{}ProprietaryShipmentTrackingIdentifier"/>
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
    "globalTrackingReferenceTypeCode",
    "proprietaryShipmentTrackingIdentifier"
})
@XmlRootElement(name = "TrackingReference")
public class TrackingReference {

    @XmlElement(name = "GlobalTrackingReferenceTypeCode", required = true)
    protected String globalTrackingReferenceTypeCode;
    @XmlElement(name = "ProprietaryShipmentTrackingIdentifier", required = true)
    protected String proprietaryShipmentTrackingIdentifier;

    /**
     * Gets the value of the globalTrackingReferenceTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalTrackingReferenceTypeCode() {
        return globalTrackingReferenceTypeCode;
    }

    /**
     * Sets the value of the globalTrackingReferenceTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalTrackingReferenceTypeCode(String value) {
        this.globalTrackingReferenceTypeCode = value;
    }

    /**
     * Gets the value of the proprietaryShipmentTrackingIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProprietaryShipmentTrackingIdentifier() {
        return proprietaryShipmentTrackingIdentifier;
    }

    /**
     * Sets the value of the proprietaryShipmentTrackingIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProprietaryShipmentTrackingIdentifier(String value) {
        this.proprietaryShipmentTrackingIdentifier = value;
    }

}