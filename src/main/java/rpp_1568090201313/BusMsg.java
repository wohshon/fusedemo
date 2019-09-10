
package rpp_1568090201313;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import iso.std.iso._20022.tech.xsd.head_001_001_1568090201313.Fr;
import iso.std.iso._20022.tech.xsd.head_001_001_1568090201313.To;
import iso.std.iso._20022.tech.xsd.pacs_002_001_1568090201313.GrpHdr;
import iso.std.iso._20022.tech.xsd.pacs_002_001_1568090201313.OrgnlGrpInfAndSts;
import iso.std.iso._20022.tech.xsd.pacs_002_001_1568090201313.TxInfAndSts;


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
 *         &lt;element name="AppHdr">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{urn:iso:std:iso:20022:tech:xsd:head.001.001.01}Fr"/>
 *                   &lt;element ref="{urn:iso:std:iso:20022:tech:xsd:head.001.001.01}To"/>
 *                   &lt;element ref="{urn:iso:std:iso:20022:tech:xsd:head.001.001.01}BizMsgIdr"/>
 *                   &lt;element ref="{urn:iso:std:iso:20022:tech:xsd:head.001.001.01}MsgDefIdr"/>
 *                   &lt;element ref="{urn:iso:std:iso:20022:tech:xsd:head.001.001.01}BizSvc"/>
 *                   &lt;element ref="{urn:iso:std:iso:20022:tech:xsd:head.001.001.01}CreDt"/>
 *                   &lt;element ref="{urn:iso:std:iso:20022:tech:xsd:head.001.001.01}CpyDplct"/>
 *                   &lt;element ref="{urn:iso:std:iso:20022:tech:xsd:head.001.001.01}PssblDplct"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Document">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FIToFIPmtStsRpt">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.08}GrpHdr"/>
 *                             &lt;element ref="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.08}OrgnlGrpInfAndSts"/>
 *                             &lt;element ref="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.08}TxInfAndSts"/>
 *                           &lt;/sequence>
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
    "appHdr",
    "document"
})
@XmlRootElement(name = "BusMsg")
public class BusMsg {

    @XmlElement(name = "AppHdr", required = true)
    protected BusMsg.AppHdr appHdr;
    @XmlElement(name = "Document", required = true)
    protected BusMsg.Document document;

    /**
     * Gets the value of the appHdr property.
     * 
     * @return
     *     possible object is
     *     {@link BusMsg.AppHdr }
     *     
     */
    public BusMsg.AppHdr getAppHdr() {
        return appHdr;
    }

    /**
     * Sets the value of the appHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusMsg.AppHdr }
     *     
     */
    public void setAppHdr(BusMsg.AppHdr value) {
        this.appHdr = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link BusMsg.Document }
     *     
     */
    public BusMsg.Document getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusMsg.Document }
     *     
     */
    public void setDocument(BusMsg.Document value) {
        this.document = value;
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
     *         &lt;element ref="{urn:iso:std:iso:20022:tech:xsd:head.001.001.01}Fr"/>
     *         &lt;element ref="{urn:iso:std:iso:20022:tech:xsd:head.001.001.01}To"/>
     *         &lt;element ref="{urn:iso:std:iso:20022:tech:xsd:head.001.001.01}BizMsgIdr"/>
     *         &lt;element ref="{urn:iso:std:iso:20022:tech:xsd:head.001.001.01}MsgDefIdr"/>
     *         &lt;element ref="{urn:iso:std:iso:20022:tech:xsd:head.001.001.01}BizSvc"/>
     *         &lt;element ref="{urn:iso:std:iso:20022:tech:xsd:head.001.001.01}CreDt"/>
     *         &lt;element ref="{urn:iso:std:iso:20022:tech:xsd:head.001.001.01}CpyDplct"/>
     *         &lt;element ref="{urn:iso:std:iso:20022:tech:xsd:head.001.001.01}PssblDplct"/>
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
        "fr",
        "to",
        "bizMsgIdr",
        "msgDefIdr",
        "bizSvc",
        "creDt",
        "cpyDplct",
        "pssblDplct"
    })
    public static class AppHdr {

        @XmlElement(name = "Fr", namespace = "urn:iso:std:iso:20022:tech:xsd:head.001.001.01", required = true)
        protected Fr fr;
        @XmlElement(name = "To", namespace = "urn:iso:std:iso:20022:tech:xsd:head.001.001.01", required = true)
        protected To to;
        @XmlElement(name = "BizMsgIdr", namespace = "urn:iso:std:iso:20022:tech:xsd:head.001.001.01", required = true)
        protected String bizMsgIdr;
        @XmlElement(name = "MsgDefIdr", namespace = "urn:iso:std:iso:20022:tech:xsd:head.001.001.01", required = true)
        protected String msgDefIdr;
        @XmlElement(name = "BizSvc", namespace = "urn:iso:std:iso:20022:tech:xsd:head.001.001.01", required = true)
        protected String bizSvc;
        @XmlElement(name = "CreDt", namespace = "urn:iso:std:iso:20022:tech:xsd:head.001.001.01", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar creDt;
        @XmlElement(name = "CpyDplct", namespace = "urn:iso:std:iso:20022:tech:xsd:head.001.001.01", required = true)
        protected String cpyDplct;
        @XmlElement(name = "PssblDplct", namespace = "urn:iso:std:iso:20022:tech:xsd:head.001.001.01")
        protected boolean pssblDplct;

        /**
         * Gets the value of the fr property.
         * 
         * @return
         *     possible object is
         *     {@link Fr }
         *     
         */
        public Fr getFr() {
            return fr;
        }

        /**
         * Sets the value of the fr property.
         * 
         * @param value
         *     allowed object is
         *     {@link Fr }
         *     
         */
        public void setFr(Fr value) {
            this.fr = value;
        }

        /**
         * Gets the value of the to property.
         * 
         * @return
         *     possible object is
         *     {@link To }
         *     
         */
        public To getTo() {
            return to;
        }

        /**
         * Sets the value of the to property.
         * 
         * @param value
         *     allowed object is
         *     {@link To }
         *     
         */
        public void setTo(To value) {
            this.to = value;
        }

        /**
         * Gets the value of the bizMsgIdr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBizMsgIdr() {
            return bizMsgIdr;
        }

        /**
         * Sets the value of the bizMsgIdr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBizMsgIdr(String value) {
            this.bizMsgIdr = value;
        }

        /**
         * Gets the value of the msgDefIdr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMsgDefIdr() {
            return msgDefIdr;
        }

        /**
         * Sets the value of the msgDefIdr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMsgDefIdr(String value) {
            this.msgDefIdr = value;
        }

        /**
         * Gets the value of the bizSvc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBizSvc() {
            return bizSvc;
        }

        /**
         * Sets the value of the bizSvc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBizSvc(String value) {
            this.bizSvc = value;
        }

        /**
         * Gets the value of the creDt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCreDt() {
            return creDt;
        }

        /**
         * Sets the value of the creDt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCreDt(XMLGregorianCalendar value) {
            this.creDt = value;
        }

        /**
         * Gets the value of the cpyDplct property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpyDplct() {
            return cpyDplct;
        }

        /**
         * Sets the value of the cpyDplct property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpyDplct(String value) {
            this.cpyDplct = value;
        }

        /**
         * Gets the value of the pssblDplct property.
         * 
         */
        public boolean isPssblDplct() {
            return pssblDplct;
        }

        /**
         * Sets the value of the pssblDplct property.
         * 
         */
        public void setPssblDplct(boolean value) {
            this.pssblDplct = value;
        }

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
     *         &lt;element name="FIToFIPmtStsRpt">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.08}GrpHdr"/>
     *                   &lt;element ref="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.08}OrgnlGrpInfAndSts"/>
     *                   &lt;element ref="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.08}TxInfAndSts"/>
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
        "fiToFIPmtStsRpt"
    })
    public static class Document {

        @XmlElement(name = "FIToFIPmtStsRpt", required = true)
        protected BusMsg.Document.FIToFIPmtStsRpt fiToFIPmtStsRpt;

        /**
         * Gets the value of the fiToFIPmtStsRpt property.
         * 
         * @return
         *     possible object is
         *     {@link BusMsg.Document.FIToFIPmtStsRpt }
         *     
         */
        public BusMsg.Document.FIToFIPmtStsRpt getFIToFIPmtStsRpt() {
            return fiToFIPmtStsRpt;
        }

        /**
         * Sets the value of the fiToFIPmtStsRpt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BusMsg.Document.FIToFIPmtStsRpt }
         *     
         */
        public void setFIToFIPmtStsRpt(BusMsg.Document.FIToFIPmtStsRpt value) {
            this.fiToFIPmtStsRpt = value;
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
         *         &lt;element ref="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.08}GrpHdr"/>
         *         &lt;element ref="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.08}OrgnlGrpInfAndSts"/>
         *         &lt;element ref="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.08}TxInfAndSts"/>
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
            "grpHdr",
            "orgnlGrpInfAndSts",
            "txInfAndSts"
        })
        public static class FIToFIPmtStsRpt {

            @XmlElement(name = "GrpHdr", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.002.001.08", required = true)
            protected GrpHdr grpHdr;
            @XmlElement(name = "OrgnlGrpInfAndSts", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.002.001.08", required = true)
            protected OrgnlGrpInfAndSts orgnlGrpInfAndSts;
            @XmlElement(name = "TxInfAndSts", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.002.001.08", required = true)
            protected TxInfAndSts txInfAndSts;

            /**
             * Gets the value of the grpHdr property.
             * 
             * @return
             *     possible object is
             *     {@link GrpHdr }
             *     
             */
            public GrpHdr getGrpHdr() {
                return grpHdr;
            }

            /**
             * Sets the value of the grpHdr property.
             * 
             * @param value
             *     allowed object is
             *     {@link GrpHdr }
             *     
             */
            public void setGrpHdr(GrpHdr value) {
                this.grpHdr = value;
            }

            /**
             * Gets the value of the orgnlGrpInfAndSts property.
             * 
             * @return
             *     possible object is
             *     {@link OrgnlGrpInfAndSts }
             *     
             */
            public OrgnlGrpInfAndSts getOrgnlGrpInfAndSts() {
                return orgnlGrpInfAndSts;
            }

            /**
             * Sets the value of the orgnlGrpInfAndSts property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrgnlGrpInfAndSts }
             *     
             */
            public void setOrgnlGrpInfAndSts(OrgnlGrpInfAndSts value) {
                this.orgnlGrpInfAndSts = value;
            }

            /**
             * Gets the value of the txInfAndSts property.
             * 
             * @return
             *     possible object is
             *     {@link TxInfAndSts }
             *     
             */
            public TxInfAndSts getTxInfAndSts() {
                return txInfAndSts;
            }

            /**
             * Sets the value of the txInfAndSts property.
             * 
             * @param value
             *     allowed object is
             *     {@link TxInfAndSts }
             *     
             */
            public void setTxInfAndSts(TxInfAndSts value) {
                this.txInfAndSts = value;
            }

        }

    }

}
