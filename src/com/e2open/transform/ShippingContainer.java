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
 *         &lt;element ref="{}GlobalPackageTypeCode" minOccurs="0"/>
 *         &lt;element ref="{}LinearPhysicalDimension" minOccurs="0"/>
 *         &lt;element ref="{}MassPhysicalDimension" minOccurs="0"/>
 *         &lt;element ref="{}numberOfShippingContainers" minOccurs="0"/>
 *         &lt;element ref="{}shippingContainerIdentifier" minOccurs="0"/>
 *         &lt;element ref="{}ShippingContainerItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}SubContainer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}TrackingReference" minOccurs="0"/>
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
    "globalPackageTypeCode",
    "linearPhysicalDimension",
    "massPhysicalDimension",
    "numberOfShippingContainers",
    "shippingContainerIdentifier",
    "shippingContainerItem",
    "subContainer",
    "trackingReference"
})
@XmlRootElement(name = "ShippingContainer")
public class ShippingContainer {

    @XmlElement(name = "GlobalPackageTypeCode")
    protected String globalPackageTypeCode;
    @XmlElement(name = "LinearPhysicalDimension")
    protected LinearPhysicalDimension linearPhysicalDimension;
    @XmlElement(name = "MassPhysicalDimension")
    protected MassPhysicalDimension massPhysicalDimension;
    protected NumberOfShippingContainers numberOfShippingContainers;
    protected ShippingContainerIdentifier shippingContainerIdentifier;
    @XmlElement(name = "ShippingContainerItem")
    protected List<ShippingContainerItem> shippingContainerItem;
    @XmlElement(name = "SubContainer")
    protected List<SubContainer> subContainer;
    @XmlElement(name = "TrackingReference")
    protected TrackingReference trackingReference;

    /**
     * Gets the value of the globalPackageTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalPackageTypeCode() {
        return globalPackageTypeCode;
    }

    /**
     * Sets the value of the globalPackageTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalPackageTypeCode(String value) {
        this.globalPackageTypeCode = value;
    }

    /**
     * Gets the value of the linearPhysicalDimension property.
     * 
     * @return
     *     possible object is
     *     {@link LinearPhysicalDimension }
     *     
     */
    public LinearPhysicalDimension getLinearPhysicalDimension() {
        return linearPhysicalDimension;
    }

    /**
     * Sets the value of the linearPhysicalDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearPhysicalDimension }
     *     
     */
    public void setLinearPhysicalDimension(LinearPhysicalDimension value) {
        this.linearPhysicalDimension = value;
    }

    /**
     * Gets the value of the massPhysicalDimension property.
     * 
     * @return
     *     possible object is
     *     {@link MassPhysicalDimension }
     *     
     */
    public MassPhysicalDimension getMassPhysicalDimension() {
        return massPhysicalDimension;
    }

    /**
     * Sets the value of the massPhysicalDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link MassPhysicalDimension }
     *     
     */
    public void setMassPhysicalDimension(MassPhysicalDimension value) {
        this.massPhysicalDimension = value;
    }

    /**
     * Gets the value of the numberOfShippingContainers property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfShippingContainers }
     *     
     */
    public NumberOfShippingContainers getNumberOfShippingContainers() {
        return numberOfShippingContainers;
    }

    /**
     * Sets the value of the numberOfShippingContainers property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfShippingContainers }
     *     
     */
    public void setNumberOfShippingContainers(NumberOfShippingContainers value) {
        this.numberOfShippingContainers = value;
    }

    /**
     * Gets the value of the shippingContainerIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingContainerIdentifier }
     *     
     */
    public ShippingContainerIdentifier getShippingContainerIdentifier() {
        return shippingContainerIdentifier;
    }

    /**
     * Sets the value of the shippingContainerIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingContainerIdentifier }
     *     
     */
    public void setShippingContainerIdentifier(ShippingContainerIdentifier value) {
        this.shippingContainerIdentifier = value;
    }

    /**
     * Gets the value of the shippingContainerItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingContainerItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingContainerItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingContainerItem }
     * 
     * 
     */
    public List<ShippingContainerItem> getShippingContainerItem() {
        if (shippingContainerItem == null) {
            shippingContainerItem = new ArrayList<ShippingContainerItem>();
        }
        return this.shippingContainerItem;
    }

    /**
     * Gets the value of the subContainer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subContainer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubContainer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubContainer }
     * 
     * 
     */
    public List<SubContainer> getSubContainer() {
        if (subContainer == null) {
            subContainer = new ArrayList<SubContainer>();
        }
        return this.subContainer;
    }

    /**
     * Gets the value of the trackingReference property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingReference }
     *     
     */
    public TrackingReference getTrackingReference() {
        return trackingReference;
    }

    /**
     * Sets the value of the trackingReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingReference }
     *     
     */
    public void setTrackingReference(TrackingReference value) {
        this.trackingReference = value;
    }

}
