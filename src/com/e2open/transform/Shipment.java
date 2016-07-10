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
 *         &lt;element ref="{}freightPaymentAccount" minOccurs="0"/>
 *         &lt;element ref="{}GlobalCarrierCode" minOccurs="0"/>
 *         &lt;element ref="{}GlobalIncotermsCode" minOccurs="0"/>
 *         &lt;element ref="{}GlobalShipmentChangeDispositionCode" minOccurs="0"/>
 *         &lt;element ref="{}GlobalShipmentModeCode" minOccurs="0"/>
 *         &lt;element ref="{}GlobalShippingServiceLevelCode"/>
 *         &lt;element ref="{}numberOfShippingContainers"/>
 *         &lt;element ref="{}ReceivingPartner"/>
 *         &lt;element ref="{}shipmentChangeReason" minOccurs="0"/>
 *         &lt;element ref="{}shipmentIdentifier"/>
 *         &lt;element ref="{}ShipmentTransportationEvent" maxOccurs="unbounded"/>
 *         &lt;element ref="{}ShippingContainer" maxOccurs="unbounded"/>
 *         &lt;element ref="{}TrackingReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}transportedBy"/>
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
    "freightPaymentAccount",
    "globalCarrierCode",
    "globalIncotermsCode",
    "globalShipmentChangeDispositionCode",
    "globalShipmentModeCode",
    "globalShippingServiceLevelCode",
    "numberOfShippingContainers",
    "receivingPartner",
    "shipmentChangeReason",
    "shipmentIdentifier",
    "shipmentTransportationEvent",
    "shippingContainer",
    "trackingReference",
    "transportedBy"
})
@XmlRootElement(name = "Shipment")
public class Shipment {

    protected FreightPaymentAccount freightPaymentAccount;
    @XmlElement(name = "GlobalCarrierCode")
    protected String globalCarrierCode;
    @XmlElement(name = "GlobalIncotermsCode")
    protected String globalIncotermsCode;
    @XmlElement(name = "GlobalShipmentChangeDispositionCode")
    protected String globalShipmentChangeDispositionCode;
    @XmlElement(name = "GlobalShipmentModeCode")
    protected String globalShipmentModeCode;
    @XmlElement(name = "GlobalShippingServiceLevelCode", required = true)
    protected String globalShippingServiceLevelCode;
    @XmlElement(required = true)
    protected NumberOfShippingContainers numberOfShippingContainers;
    @XmlElement(name = "ReceivingPartner", required = true)
    protected ReceivingPartner receivingPartner;
    protected ShipmentChangeReason shipmentChangeReason;
    @XmlElement(required = true)
    protected ShipmentIdentifier shipmentIdentifier;
    @XmlElement(name = "ShipmentTransportationEvent", required = true)
    protected List<ShipmentTransportationEvent> shipmentTransportationEvent;
    @XmlElement(name = "ShippingContainer", required = true)
    protected List<ShippingContainer> shippingContainer;
    @XmlElement(name = "TrackingReference")
    protected List<TrackingReference> trackingReference;
    @XmlElement(required = true)
    protected TransportedBy transportedBy;

    /**
     * Gets the value of the freightPaymentAccount property.
     * 
     * @return
     *     possible object is
     *     {@link FreightPaymentAccount }
     *     
     */
    public FreightPaymentAccount getFreightPaymentAccount() {
        return freightPaymentAccount;
    }

    /**
     * Sets the value of the freightPaymentAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightPaymentAccount }
     *     
     */
    public void setFreightPaymentAccount(FreightPaymentAccount value) {
        this.freightPaymentAccount = value;
    }

    /**
     * Gets the value of the globalCarrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalCarrierCode() {
        return globalCarrierCode;
    }

    /**
     * Sets the value of the globalCarrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalCarrierCode(String value) {
        this.globalCarrierCode = value;
    }

    /**
     * Gets the value of the globalIncotermsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalIncotermsCode() {
        return globalIncotermsCode;
    }

    /**
     * Sets the value of the globalIncotermsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalIncotermsCode(String value) {
        this.globalIncotermsCode = value;
    }

    /**
     * Gets the value of the globalShipmentChangeDispositionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalShipmentChangeDispositionCode() {
        return globalShipmentChangeDispositionCode;
    }

    /**
     * Sets the value of the globalShipmentChangeDispositionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalShipmentChangeDispositionCode(String value) {
        this.globalShipmentChangeDispositionCode = value;
    }

    /**
     * Gets the value of the globalShipmentModeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalShipmentModeCode() {
        return globalShipmentModeCode;
    }

    /**
     * Sets the value of the globalShipmentModeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalShipmentModeCode(String value) {
        this.globalShipmentModeCode = value;
    }

    /**
     * Gets the value of the globalShippingServiceLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalShippingServiceLevelCode() {
        return globalShippingServiceLevelCode;
    }

    /**
     * Sets the value of the globalShippingServiceLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalShippingServiceLevelCode(String value) {
        this.globalShippingServiceLevelCode = value;
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
     * Gets the value of the receivingPartner property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivingPartner }
     *     
     */
    public ReceivingPartner getReceivingPartner() {
        return receivingPartner;
    }

    /**
     * Sets the value of the receivingPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivingPartner }
     *     
     */
    public void setReceivingPartner(ReceivingPartner value) {
        this.receivingPartner = value;
    }

    /**
     * Gets the value of the shipmentChangeReason property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentChangeReason }
     *     
     */
    public ShipmentChangeReason getShipmentChangeReason() {
        return shipmentChangeReason;
    }

    /**
     * Sets the value of the shipmentChangeReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentChangeReason }
     *     
     */
    public void setShipmentChangeReason(ShipmentChangeReason value) {
        this.shipmentChangeReason = value;
    }

    /**
     * Gets the value of the shipmentIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentIdentifier }
     *     
     */
    public ShipmentIdentifier getShipmentIdentifier() {
        return shipmentIdentifier;
    }

    /**
     * Sets the value of the shipmentIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentIdentifier }
     *     
     */
    public void setShipmentIdentifier(ShipmentIdentifier value) {
        this.shipmentIdentifier = value;
    }

    /**
     * Gets the value of the shipmentTransportationEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentTransportationEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentTransportationEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentTransportationEvent }
     * 
     * 
     */
    public List<ShipmentTransportationEvent> getShipmentTransportationEvent() {
        if (shipmentTransportationEvent == null) {
            shipmentTransportationEvent = new ArrayList<ShipmentTransportationEvent>();
        }
        return this.shipmentTransportationEvent;
    }

    /**
     * Gets the value of the shippingContainer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingContainer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingContainer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingContainer }
     * 
     * 
     */
    public List<ShippingContainer> getShippingContainer() {
        if (shippingContainer == null) {
            shippingContainer = new ArrayList<ShippingContainer>();
        }
        return this.shippingContainer;
    }

    /**
     * Gets the value of the trackingReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trackingReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrackingReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackingReference }
     * 
     * 
     */
    public List<TrackingReference> getTrackingReference() {
        if (trackingReference == null) {
            trackingReference = new ArrayList<TrackingReference>();
        }
        return this.trackingReference;
    }

    /**
     * Gets the value of the transportedBy property.
     * 
     * @return
     *     possible object is
     *     {@link TransportedBy }
     *     
     */
    public TransportedBy getTransportedBy() {
        return transportedBy;
    }

    /**
     * Sets the value of the transportedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportedBy }
     *     
     */
    public void setTransportedBy(TransportedBy value) {
        this.transportedBy = value;
    }

}
