
package rpp_1568087264516;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import iso.std.iso._20022.tech.xsd.head_001_001_1568087264516.Fr;
import iso.std.iso._20022.tech.xsd.head_001_001_1568087264516.To;
import iso.std.iso._20022.tech.xsd.pacs_008_001_1568087264516.CdtTrfTxInfChild;
import iso.std.iso._20022.tech.xsd.pacs_008_001_1568087264516.GrpHdr;


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
 *                   &lt;element name="FIToFICstmrCdtTrf">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.06}GrpHdr"/>
 *                             &lt;element ref="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.06}CdtTrfTxInf"/>
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
     *         &lt;element name="FIToFICstmrCdtTrf">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.06}GrpHdr"/>
     *                   &lt;element ref="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.06}CdtTrfTxInf"/>
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
        "fiToFICstmrCdtTrf"
    })
    public static class Document {

        @XmlElement(name = "FIToFICstmrCdtTrf", required = true)
        protected BusMsg.Document.FIToFICstmrCdtTrf fiToFICstmrCdtTrf;

        /**
         * Gets the value of the fiToFICstmrCdtTrf property.
         * 
         * @return
         *     possible object is
         *     {@link BusMsg.Document.FIToFICstmrCdtTrf }
         *     
         */
        public BusMsg.Document.FIToFICstmrCdtTrf getFIToFICstmrCdtTrf() {
            return fiToFICstmrCdtTrf;
        }

        /**
         * Sets the value of the fiToFICstmrCdtTrf property.
         * 
         * @param value
         *     allowed object is
         *     {@link BusMsg.Document.FIToFICstmrCdtTrf }
         *     
         */
        public void setFIToFICstmrCdtTrf(BusMsg.Document.FIToFICstmrCdtTrf value) {
            this.fiToFICstmrCdtTrf = value;
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
         *         &lt;element ref="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.06}GrpHdr"/>
         *         &lt;element ref="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.06}CdtTrfTxInf"/>
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
            "cdtTrfTxInf"
        })
        public static class FIToFICstmrCdtTrf {

            @XmlElement(name = "GrpHdr", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.06", required = true)
            protected GrpHdr grpHdr;
            @XmlElement(name = "CdtTrfTxInf", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.06", required = true)
            protected CdtTrfTxInfChild cdtTrfTxInf;

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
             * Gets the value of the cdtTrfTxInf property.
             * 
             * @return
             *     possible object is
             *     {@link CdtTrfTxInfChild }
             *     
             */
            public CdtTrfTxInfChild getCdtTrfTxInf() {
                return cdtTrfTxInf;
            }

            /**
             * Sets the value of the cdtTrfTxInf property.
             * 
             * @param value
             *     allowed object is
             *     {@link CdtTrfTxInfChild }
             *     
             */
            public void setCdtTrfTxInf(CdtTrfTxInfChild value) {
                this.cdtTrfTxInf = value;
            }

        }

    }

}
