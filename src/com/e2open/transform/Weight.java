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
 *         &lt;element ref="{}GlobalPhysicalUnitOfMeasureCode"/>
 *         &lt;element ref="{}Mass"/>
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
    "globalPhysicalUnitOfMeasureCode",
    "mass"
})
@XmlRootElement(name = "Weight")
public class Weight {

    @XmlElement(name = "GlobalPhysicalUnitOfMeasureCode", required = true)
    protected String globalPhysicalUnitOfMeasureCode;
    @XmlElement(name = "Mass", required = true)
    protected String mass;

    /**
     * Gets the value of the globalPhysicalUnitOfMeasureCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalPhysicalUnitOfMeasureCode() {
        return globalPhysicalUnitOfMeasureCode;
    }

    /**
     * Sets the value of the globalPhysicalUnitOfMeasureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalPhysicalUnitOfMeasureCode(String value) {
        this.globalPhysicalUnitOfMeasureCode = value;
    }

    /**
     * Gets the value of the mass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMass() {
        return mass;
    }

    /**
     * Sets the value of the mass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMass(String value) {
        this.mass = value;
    }

}
