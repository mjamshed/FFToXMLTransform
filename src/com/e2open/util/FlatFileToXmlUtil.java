//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.21 at 04:29:29 PM SGT 
//


package com.e2open.util;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="Package" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Mapper">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MappingList" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Format" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="InputFormat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="OutputXPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="loop" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "_package",
    "mapper"
})
@XmlRootElement(name = "FlatFileToXmlUtil")
public class FlatFileToXmlUtil {

    @XmlElement(name = "Package", required = true)
    protected String _package;
    @XmlElement(name = "Mapper", required = true)
    protected FlatFileToXmlUtil.Mapper mapper;

    /**
     * Gets the value of the package property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackage() {
        return _package;
    }

    /**
     * Sets the value of the package property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackage(String value) {
        this._package = value;
    }

    /**
     * Gets the value of the mapper property.
     * 
     * @return
     *     possible object is
     *     {@link FlatFileToXmlUtil.Mapper }
     *     
     */
    public FlatFileToXmlUtil.Mapper getMapper() {
        return mapper;
    }

    /**
     * Sets the value of the mapper property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlatFileToXmlUtil.Mapper }
     *     
     */
    public void setMapper(FlatFileToXmlUtil.Mapper value) {
        this.mapper = value;
    }


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
     *         &lt;element name="MappingList" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Format" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="InputFormat" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="OutputXPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="loop" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "mappingList"
    })
    public static class Mapper {

        @XmlElement(name = "MappingList")
        protected List<FlatFileToXmlUtil.Mapper.MappingList> mappingList;

        /**
         * Gets the value of the mappingList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mappingList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMappingList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FlatFileToXmlUtil.Mapper.MappingList }
         * 
         * 
         */
        public List<FlatFileToXmlUtil.Mapper.MappingList> getMappingList() {
            if (mappingList == null) {
                mappingList = new ArrayList<FlatFileToXmlUtil.Mapper.MappingList>();
            }
            return this.mappingList;
        }


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
         *         &lt;element name="Format" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="InputFormat" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="OutputXPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *       &lt;attribute name="loop" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "format",
            "inputFormat",
            "outputXPath"
        })
        public static class MappingList {

            @XmlElement(name = "Format", required = true)
            protected String format;
            @XmlElement(name = "InputFormat", required = true)
            protected String inputFormat;
            @XmlElement(name = "OutputXPath", required = true)
            protected String outputXPath;
            @XmlAttribute(name = "loop")
            protected String loop;

            /**
             * Gets the value of the format property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFormat() {
                return format;
            }

            /**
             * Sets the value of the format property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFormat(String value) {
                this.format = value;
            }

            /**
             * Gets the value of the inputFormat property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInputFormat() {
                return inputFormat;
            }

            /**
             * Sets the value of the inputFormat property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInputFormat(String value) {
                this.inputFormat = value;
            }

            /**
             * Gets the value of the outputXPath property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOutputXPath() {
                return outputXPath;
            }

            /**
             * Sets the value of the outputXPath property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOutputXPath(String value) {
                this.outputXPath = value;
            }

            /**
             * Gets the value of the loop property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLoop() {
                return loop;
            }

            /**
             * Sets the value of the loop property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLoop(String value) {
                this.loop = value;
            }

        }

    }

}