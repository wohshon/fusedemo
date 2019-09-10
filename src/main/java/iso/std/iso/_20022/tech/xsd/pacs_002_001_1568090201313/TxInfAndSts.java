
package iso.std.iso._20022.tech.xsd.pacs_002_001_1568090201313;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="OrgnlEndToEndId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OrgnlTxId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TxSts" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StsRsnInf">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Rsn">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Prtry" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *         &lt;element name="ClrSysRef" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="OrgnlTxRef">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="IntrBkSttlmDt" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="Cdtr">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Nm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CdtrAcct">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Id">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Othr">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Tp">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Prtry" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
 *         &lt;element name="SplmtryData">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PlcAndNm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Envlp">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="InstrForCdtrAcct">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="RsdntSts" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *                                       &lt;element name="ShariaCmpl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Dtls" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="CdtrAcctCstmrCtg" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "orgnlEndToEndId",
    "orgnlTxId",
    "txSts",
    "stsRsnInf",
    "clrSysRef",
    "orgnlTxRef",
    "splmtryData"
})
@XmlRootElement(name = "TxInfAndSts")
public class TxInfAndSts {

    @XmlElement(name = "OrgnlEndToEndId", required = true)
    protected String orgnlEndToEndId;
    @XmlElement(name = "OrgnlTxId", required = true)
    protected String orgnlTxId;
    @XmlElement(name = "TxSts", required = true)
    protected String txSts;
    @XmlElement(name = "StsRsnInf", required = true)
    protected TxInfAndSts.StsRsnInf stsRsnInf;
    @XmlElement(name = "ClrSysRef")
    @XmlSchemaType(name = "unsignedByte")
    protected short clrSysRef;
    @XmlElement(name = "OrgnlTxRef", required = true)
    protected TxInfAndSts.OrgnlTxRef orgnlTxRef;
    @XmlElement(name = "SplmtryData", required = true)
    protected TxInfAndSts.SplmtryData splmtryData;

    /**
     * Gets the value of the orgnlEndToEndId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlEndToEndId() {
        return orgnlEndToEndId;
    }

    /**
     * Sets the value of the orgnlEndToEndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlEndToEndId(String value) {
        this.orgnlEndToEndId = value;
    }

    /**
     * Gets the value of the orgnlTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlTxId() {
        return orgnlTxId;
    }

    /**
     * Sets the value of the orgnlTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlTxId(String value) {
        this.orgnlTxId = value;
    }

    /**
     * Gets the value of the txSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxSts() {
        return txSts;
    }

    /**
     * Sets the value of the txSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxSts(String value) {
        this.txSts = value;
    }

    /**
     * Gets the value of the stsRsnInf property.
     * 
     * @return
     *     possible object is
     *     {@link TxInfAndSts.StsRsnInf }
     *     
     */
    public TxInfAndSts.StsRsnInf getStsRsnInf() {
        return stsRsnInf;
    }

    /**
     * Sets the value of the stsRsnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxInfAndSts.StsRsnInf }
     *     
     */
    public void setStsRsnInf(TxInfAndSts.StsRsnInf value) {
        this.stsRsnInf = value;
    }

    /**
     * Gets the value of the clrSysRef property.
     * 
     */
    public short getClrSysRef() {
        return clrSysRef;
    }

    /**
     * Sets the value of the clrSysRef property.
     * 
     */
    public void setClrSysRef(short value) {
        this.clrSysRef = value;
    }

    /**
     * Gets the value of the orgnlTxRef property.
     * 
     * @return
     *     possible object is
     *     {@link TxInfAndSts.OrgnlTxRef }
     *     
     */
    public TxInfAndSts.OrgnlTxRef getOrgnlTxRef() {
        return orgnlTxRef;
    }

    /**
     * Sets the value of the orgnlTxRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxInfAndSts.OrgnlTxRef }
     *     
     */
    public void setOrgnlTxRef(TxInfAndSts.OrgnlTxRef value) {
        this.orgnlTxRef = value;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * @return
     *     possible object is
     *     {@link TxInfAndSts.SplmtryData }
     *     
     */
    public TxInfAndSts.SplmtryData getSplmtryData() {
        return splmtryData;
    }

    /**
     * Sets the value of the splmtryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxInfAndSts.SplmtryData }
     *     
     */
    public void setSplmtryData(TxInfAndSts.SplmtryData value) {
        this.splmtryData = value;
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
     *         &lt;element name="IntrBkSttlmDt" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="Cdtr">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Nm" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CdtrAcct">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Id">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Othr">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Tp">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Prtry" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "intrBkSttlmDt",
        "cdtr",
        "cdtrAcct"
    })
    public static class OrgnlTxRef {

        @XmlElement(name = "IntrBkSttlmDt", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar intrBkSttlmDt;
        @XmlElement(name = "Cdtr", required = true)
        protected TxInfAndSts.OrgnlTxRef.Cdtr cdtr;
        @XmlElement(name = "CdtrAcct", required = true)
        protected TxInfAndSts.OrgnlTxRef.CdtrAcct cdtrAcct;

        /**
         * Gets the value of the intrBkSttlmDt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getIntrBkSttlmDt() {
            return intrBkSttlmDt;
        }

        /**
         * Sets the value of the intrBkSttlmDt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setIntrBkSttlmDt(XMLGregorianCalendar value) {
            this.intrBkSttlmDt = value;
        }

        /**
         * Gets the value of the cdtr property.
         * 
         * @return
         *     possible object is
         *     {@link TxInfAndSts.OrgnlTxRef.Cdtr }
         *     
         */
        public TxInfAndSts.OrgnlTxRef.Cdtr getCdtr() {
            return cdtr;
        }

        /**
         * Sets the value of the cdtr property.
         * 
         * @param value
         *     allowed object is
         *     {@link TxInfAndSts.OrgnlTxRef.Cdtr }
         *     
         */
        public void setCdtr(TxInfAndSts.OrgnlTxRef.Cdtr value) {
            this.cdtr = value;
        }

        /**
         * Gets the value of the cdtrAcct property.
         * 
         * @return
         *     possible object is
         *     {@link TxInfAndSts.OrgnlTxRef.CdtrAcct }
         *     
         */
        public TxInfAndSts.OrgnlTxRef.CdtrAcct getCdtrAcct() {
            return cdtrAcct;
        }

        /**
         * Sets the value of the cdtrAcct property.
         * 
         * @param value
         *     allowed object is
         *     {@link TxInfAndSts.OrgnlTxRef.CdtrAcct }
         *     
         */
        public void setCdtrAcct(TxInfAndSts.OrgnlTxRef.CdtrAcct value) {
            this.cdtrAcct = value;
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
         *         &lt;element name="Nm" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "nm"
        })
        public static class Cdtr {

            @XmlElement(name = "Nm", required = true)
            protected String nm;

            /**
             * Gets the value of the nm property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNm() {
                return nm;
            }

            /**
             * Sets the value of the nm property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNm(String value) {
                this.nm = value;
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
         *         &lt;element name="Id">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Othr">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
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
         *         &lt;element name="Tp">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Prtry" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "id",
            "tp"
        })
        public static class CdtrAcct {

            @XmlElement(name = "Id", required = true)
            protected TxInfAndSts.OrgnlTxRef.CdtrAcct.Id id;
            @XmlElement(name = "Tp", required = true)
            protected TxInfAndSts.OrgnlTxRef.CdtrAcct.Tp tp;

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link TxInfAndSts.OrgnlTxRef.CdtrAcct.Id }
             *     
             */
            public TxInfAndSts.OrgnlTxRef.CdtrAcct.Id getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link TxInfAndSts.OrgnlTxRef.CdtrAcct.Id }
             *     
             */
            public void setId(TxInfAndSts.OrgnlTxRef.CdtrAcct.Id value) {
                this.id = value;
            }

            /**
             * Gets the value of the tp property.
             * 
             * @return
             *     possible object is
             *     {@link TxInfAndSts.OrgnlTxRef.CdtrAcct.Tp }
             *     
             */
            public TxInfAndSts.OrgnlTxRef.CdtrAcct.Tp getTp() {
                return tp;
            }

            /**
             * Sets the value of the tp property.
             * 
             * @param value
             *     allowed object is
             *     {@link TxInfAndSts.OrgnlTxRef.CdtrAcct.Tp }
             *     
             */
            public void setTp(TxInfAndSts.OrgnlTxRef.CdtrAcct.Tp value) {
                this.tp = value;
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
             *         &lt;element name="Othr">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
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
                "othr"
            })
            public static class Id {

                @XmlElement(name = "Othr", required = true)
                protected TxInfAndSts.OrgnlTxRef.CdtrAcct.Id.Othr othr;

                /**
                 * Gets the value of the othr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TxInfAndSts.OrgnlTxRef.CdtrAcct.Id.Othr }
                 *     
                 */
                public TxInfAndSts.OrgnlTxRef.CdtrAcct.Id.Othr getOthr() {
                    return othr;
                }

                /**
                 * Sets the value of the othr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TxInfAndSts.OrgnlTxRef.CdtrAcct.Id.Othr }
                 *     
                 */
                public void setOthr(TxInfAndSts.OrgnlTxRef.CdtrAcct.Id.Othr value) {
                    this.othr = value;
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
                 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
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
                    "id"
                })
                public static class Othr {

                    @XmlElement(name = "Id")
                    @XmlSchemaType(name = "unsignedInt")
                    protected long id;

                    /**
                     * Gets the value of the id property.
                     * 
                     */
                    public long getId() {
                        return id;
                    }

                    /**
                     * Sets the value of the id property.
                     * 
                     */
                    public void setId(long value) {
                        this.id = value;
                    }

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
             *         &lt;element name="Prtry" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "prtry"
            })
            public static class Tp {

                @XmlElement(name = "Prtry", required = true)
                protected String prtry;

                /**
                 * Gets the value of the prtry property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPrtry() {
                    return prtry;
                }

                /**
                 * Sets the value of the prtry property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPrtry(String value) {
                    this.prtry = value;
                }

            }

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
     *         &lt;element name="PlcAndNm" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Envlp">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="InstrForCdtrAcct">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="RsdntSts" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
     *                             &lt;element name="ShariaCmpl" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Dtls" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="CdtrAcctCstmrCtg" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "plcAndNm",
        "envlp"
    })
    public static class SplmtryData {

        @XmlElement(name = "PlcAndNm", required = true)
        protected String plcAndNm;
        @XmlElement(name = "Envlp", required = true)
        protected TxInfAndSts.SplmtryData.Envlp envlp;

        /**
         * Gets the value of the plcAndNm property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlcAndNm() {
            return plcAndNm;
        }

        /**
         * Sets the value of the plcAndNm property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlcAndNm(String value) {
            this.plcAndNm = value;
        }

        /**
         * Gets the value of the envlp property.
         * 
         * @return
         *     possible object is
         *     {@link TxInfAndSts.SplmtryData.Envlp }
         *     
         */
        public TxInfAndSts.SplmtryData.Envlp getEnvlp() {
            return envlp;
        }

        /**
         * Sets the value of the envlp property.
         * 
         * @param value
         *     allowed object is
         *     {@link TxInfAndSts.SplmtryData.Envlp }
         *     
         */
        public void setEnvlp(TxInfAndSts.SplmtryData.Envlp value) {
            this.envlp = value;
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
         *         &lt;element name="InstrForCdtrAcct">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="RsdntSts" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
         *                   &lt;element name="ShariaCmpl" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Dtls" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="CdtrAcctCstmrCtg" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "instrForCdtrAcct",
            "cdtrAcctCstmrCtg"
        })
        public static class Envlp {

            @XmlElement(name = "InstrForCdtrAcct", required = true)
            protected TxInfAndSts.SplmtryData.Envlp.InstrForCdtrAcct instrForCdtrAcct;
            @XmlElement(name = "CdtrAcctCstmrCtg", required = true)
            protected String cdtrAcctCstmrCtg;

            /**
             * Gets the value of the instrForCdtrAcct property.
             * 
             * @return
             *     possible object is
             *     {@link TxInfAndSts.SplmtryData.Envlp.InstrForCdtrAcct }
             *     
             */
            public TxInfAndSts.SplmtryData.Envlp.InstrForCdtrAcct getInstrForCdtrAcct() {
                return instrForCdtrAcct;
            }

            /**
             * Sets the value of the instrForCdtrAcct property.
             * 
             * @param value
             *     allowed object is
             *     {@link TxInfAndSts.SplmtryData.Envlp.InstrForCdtrAcct }
             *     
             */
            public void setInstrForCdtrAcct(TxInfAndSts.SplmtryData.Envlp.InstrForCdtrAcct value) {
                this.instrForCdtrAcct = value;
            }

            /**
             * Gets the value of the cdtrAcctCstmrCtg property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdtrAcctCstmrCtg() {
                return cdtrAcctCstmrCtg;
            }

            /**
             * Sets the value of the cdtrAcctCstmrCtg property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdtrAcctCstmrCtg(String value) {
                this.cdtrAcctCstmrCtg = value;
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
             *         &lt;element name="RsdntSts" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
             *         &lt;element name="ShariaCmpl" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Dtls" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
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
                "rsdntSts",
                "shariaCmpl",
                "dtls"
            })
            public static class InstrForCdtrAcct {

                @XmlElement(name = "RsdntSts")
                @XmlSchemaType(name = "unsignedByte")
                protected short rsdntSts;
                @XmlElement(name = "ShariaCmpl", required = true)
                protected String shariaCmpl;
                @XmlElement(name = "Dtls")
                @XmlSchemaType(name = "unsignedByte")
                protected short dtls;

                /**
                 * Gets the value of the rsdntSts property.
                 * 
                 */
                public short getRsdntSts() {
                    return rsdntSts;
                }

                /**
                 * Sets the value of the rsdntSts property.
                 * 
                 */
                public void setRsdntSts(short value) {
                    this.rsdntSts = value;
                }

                /**
                 * Gets the value of the shariaCmpl property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getShariaCmpl() {
                    return shariaCmpl;
                }

                /**
                 * Sets the value of the shariaCmpl property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setShariaCmpl(String value) {
                    this.shariaCmpl = value;
                }

                /**
                 * Gets the value of the dtls property.
                 * 
                 */
                public short getDtls() {
                    return dtls;
                }

                /**
                 * Sets the value of the dtls property.
                 * 
                 */
                public void setDtls(short value) {
                    this.dtls = value;
                }

            }

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
     *         &lt;element name="Rsn">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Prtry" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "rsn"
    })
    public static class StsRsnInf {

        @XmlElement(name = "Rsn", required = true)
        protected TxInfAndSts.StsRsnInf.Rsn rsn;

        /**
         * Gets the value of the rsn property.
         * 
         * @return
         *     possible object is
         *     {@link TxInfAndSts.StsRsnInf.Rsn }
         *     
         */
        public TxInfAndSts.StsRsnInf.Rsn getRsn() {
            return rsn;
        }

        /**
         * Sets the value of the rsn property.
         * 
         * @param value
         *     allowed object is
         *     {@link TxInfAndSts.StsRsnInf.Rsn }
         *     
         */
        public void setRsn(TxInfAndSts.StsRsnInf.Rsn value) {
            this.rsn = value;
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
         *         &lt;element name="Prtry" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "prtry"
        })
        public static class Rsn {

            @XmlElement(name = "Prtry", required = true)
            protected String prtry;

            /**
             * Gets the value of the prtry property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrtry() {
                return prtry;
            }

            /**
             * Sets the value of the prtry property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrtry(String value) {
                this.prtry = value;
            }

        }

    }

}
