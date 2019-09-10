
package iso.std.iso._20022.tech.xsd.pacs_008_001_1568087264516;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


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
 *         &lt;element name="PmtId">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EndToEndId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TxId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PmtTpInf">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CtgyPurp">
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
 *         &lt;element name="IntrBkSttlmAmt">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>unsignedByte">
 *                 &lt;attribute name="Ccy" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ChrgBr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InstgAgt">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FinInstnId">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PstlAdr">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="StrtNm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="TwnNm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="CtrySubDvsn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Ctry" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Othr">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *         &lt;element name="Dbtr">
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
 *         &lt;element name="DbtrAcct">
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
 *         &lt;element name="DbtrAgt">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FinInstnId">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Othr">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *         &lt;element name="CdtrAgt">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FinInstnId">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Othr">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *                             &lt;element name="InstrForCdtrAgt">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="RecptRef" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *                                       &lt;element name="PaymntDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="ScndValInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="IdTp" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *                                       &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="InstrForDbtrAcct">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="RsdntSts" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *                                       &lt;element name="PrdTp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="ShariaCmpl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Dtls" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Dbtr">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="IPAddr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="CdtTrfTxInf">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PrxyLkUpRef" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "pmtId",
    "pmtTpInf",
    "intrBkSttlmAmt",
    "chrgBr",
    "instgAgt",
    "dbtr",
    "dbtrAcct",
    "dbtrAgt",
    "cdtrAgt",
    "cdtr",
    "cdtrAcct",
    "splmtryData"
})
@XmlRootElement(name = "CdtTrfTxInf")
public class CdtTrfTxInfChild {

    @XmlElement(name = "PmtId", required = true)
    protected CdtTrfTxInfChild.PmtId pmtId;
    @XmlElement(name = "PmtTpInf", required = true)
    protected CdtTrfTxInfChild.PmtTpInf pmtTpInf;
    @XmlElement(name = "IntrBkSttlmAmt", required = true)
    protected CdtTrfTxInfChild.IntrBkSttlmAmt intrBkSttlmAmt;
    @XmlElement(name = "ChrgBr", required = true)
    protected String chrgBr;
    @XmlElement(name = "InstgAgt", required = true)
    protected CdtTrfTxInfChild.InstgAgt instgAgt;
    @XmlElement(name = "Dbtr", required = true)
    protected CdtTrfTxInfChild.Dbtr dbtr;
    @XmlElement(name = "DbtrAcct", required = true)
    protected CdtTrfTxInfChild.DbtrAcct dbtrAcct;
    @XmlElement(name = "DbtrAgt", required = true)
    protected CdtTrfTxInfChild.DbtrAgt dbtrAgt;
    @XmlElement(name = "CdtrAgt", required = true)
    protected CdtTrfTxInfChild.CdtrAgt cdtrAgt;
    @XmlElement(name = "Cdtr", required = true)
    protected CdtTrfTxInfChild.Cdtr cdtr;
    @XmlElement(name = "CdtrAcct", required = true)
    protected CdtTrfTxInfChild.CdtrAcct cdtrAcct;
    @XmlElement(name = "SplmtryData", required = true)
    protected CdtTrfTxInfChild.SplmtryData splmtryData;

    /**
     * Gets the value of the pmtId property.
     * 
     * @return
     *     possible object is
     *     {@link CdtTrfTxInfChild.PmtId }
     *     
     */
    public CdtTrfTxInfChild.PmtId getPmtId() {
        return pmtId;
    }

    /**
     * Sets the value of the pmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CdtTrfTxInfChild.PmtId }
     *     
     */
    public void setPmtId(CdtTrfTxInfChild.PmtId value) {
        this.pmtId = value;
    }

    /**
     * Gets the value of the pmtTpInf property.
     * 
     * @return
     *     possible object is
     *     {@link CdtTrfTxInfChild.PmtTpInf }
     *     
     */
    public CdtTrfTxInfChild.PmtTpInf getPmtTpInf() {
        return pmtTpInf;
    }

    /**
     * Sets the value of the pmtTpInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CdtTrfTxInfChild.PmtTpInf }
     *     
     */
    public void setPmtTpInf(CdtTrfTxInfChild.PmtTpInf value) {
        this.pmtTpInf = value;
    }

    /**
     * Gets the value of the intrBkSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CdtTrfTxInfChild.IntrBkSttlmAmt }
     *     
     */
    public CdtTrfTxInfChild.IntrBkSttlmAmt getIntrBkSttlmAmt() {
        return intrBkSttlmAmt;
    }

    /**
     * Sets the value of the intrBkSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CdtTrfTxInfChild.IntrBkSttlmAmt }
     *     
     */
    public void setIntrBkSttlmAmt(CdtTrfTxInfChild.IntrBkSttlmAmt value) {
        this.intrBkSttlmAmt = value;
    }

    /**
     * Gets the value of the chrgBr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChrgBr() {
        return chrgBr;
    }

    /**
     * Sets the value of the chrgBr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChrgBr(String value) {
        this.chrgBr = value;
    }

    /**
     * Gets the value of the instgAgt property.
     * 
     * @return
     *     possible object is
     *     {@link CdtTrfTxInfChild.InstgAgt }
     *     
     */
    public CdtTrfTxInfChild.InstgAgt getInstgAgt() {
        return instgAgt;
    }

    /**
     * Sets the value of the instgAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CdtTrfTxInfChild.InstgAgt }
     *     
     */
    public void setInstgAgt(CdtTrfTxInfChild.InstgAgt value) {
        this.instgAgt = value;
    }

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link CdtTrfTxInfChild.Dbtr }
     *     
     */
    public CdtTrfTxInfChild.Dbtr getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CdtTrfTxInfChild.Dbtr }
     *     
     */
    public void setDbtr(CdtTrfTxInfChild.Dbtr value) {
        this.dbtr = value;
    }

    /**
     * Gets the value of the dbtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CdtTrfTxInfChild.DbtrAcct }
     *     
     */
    public CdtTrfTxInfChild.DbtrAcct getDbtrAcct() {
        return dbtrAcct;
    }

    /**
     * Sets the value of the dbtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CdtTrfTxInfChild.DbtrAcct }
     *     
     */
    public void setDbtrAcct(CdtTrfTxInfChild.DbtrAcct value) {
        this.dbtrAcct = value;
    }

    /**
     * Gets the value of the dbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link CdtTrfTxInfChild.DbtrAgt }
     *     
     */
    public CdtTrfTxInfChild.DbtrAgt getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Sets the value of the dbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CdtTrfTxInfChild.DbtrAgt }
     *     
     */
    public void setDbtrAgt(CdtTrfTxInfChild.DbtrAgt value) {
        this.dbtrAgt = value;
    }

    /**
     * Gets the value of the cdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link CdtTrfTxInfChild.CdtrAgt }
     *     
     */
    public CdtTrfTxInfChild.CdtrAgt getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Sets the value of the cdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CdtTrfTxInfChild.CdtrAgt }
     *     
     */
    public void setCdtrAgt(CdtTrfTxInfChild.CdtrAgt value) {
        this.cdtrAgt = value;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link CdtTrfTxInfChild.Cdtr }
     *     
     */
    public CdtTrfTxInfChild.Cdtr getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CdtTrfTxInfChild.Cdtr }
     *     
     */
    public void setCdtr(CdtTrfTxInfChild.Cdtr value) {
        this.cdtr = value;
    }

    /**
     * Gets the value of the cdtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CdtTrfTxInfChild.CdtrAcct }
     *     
     */
    public CdtTrfTxInfChild.CdtrAcct getCdtrAcct() {
        return cdtrAcct;
    }

    /**
     * Sets the value of the cdtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CdtTrfTxInfChild.CdtrAcct }
     *     
     */
    public void setCdtrAcct(CdtTrfTxInfChild.CdtrAcct value) {
        this.cdtrAcct = value;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * @return
     *     possible object is
     *     {@link CdtTrfTxInfChild.SplmtryData }
     *     
     */
    public CdtTrfTxInfChild.SplmtryData getSplmtryData() {
        return splmtryData;
    }

    /**
     * Sets the value of the splmtryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CdtTrfTxInfChild.SplmtryData }
     *     
     */
    public void setSplmtryData(CdtTrfTxInfChild.SplmtryData value) {
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
        protected CdtTrfTxInfChild.CdtrAcct.Id id;
        @XmlElement(name = "Tp", required = true)
        protected CdtTrfTxInfChild.CdtrAcct.Tp tp;

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link CdtTrfTxInfChild.CdtrAcct.Id }
         *     
         */
        public CdtTrfTxInfChild.CdtrAcct.Id getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link CdtTrfTxInfChild.CdtrAcct.Id }
         *     
         */
        public void setId(CdtTrfTxInfChild.CdtrAcct.Id value) {
            this.id = value;
        }

        /**
         * Gets the value of the tp property.
         * 
         * @return
         *     possible object is
         *     {@link CdtTrfTxInfChild.CdtrAcct.Tp }
         *     
         */
        public CdtTrfTxInfChild.CdtrAcct.Tp getTp() {
            return tp;
        }

        /**
         * Sets the value of the tp property.
         * 
         * @param value
         *     allowed object is
         *     {@link CdtTrfTxInfChild.CdtrAcct.Tp }
         *     
         */
        public void setTp(CdtTrfTxInfChild.CdtrAcct.Tp value) {
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
            protected CdtTrfTxInfChild.CdtrAcct.Id.Othr othr;

            /**
             * Gets the value of the othr property.
             * 
             * @return
             *     possible object is
             *     {@link CdtTrfTxInfChild.CdtrAcct.Id.Othr }
             *     
             */
            public CdtTrfTxInfChild.CdtrAcct.Id.Othr getOthr() {
                return othr;
            }

            /**
             * Sets the value of the othr property.
             * 
             * @param value
             *     allowed object is
             *     {@link CdtTrfTxInfChild.CdtrAcct.Id.Othr }
             *     
             */
            public void setOthr(CdtTrfTxInfChild.CdtrAcct.Id.Othr value) {
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
     *         &lt;element name="FinInstnId">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Othr">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "finInstnId"
    })
    public static class CdtrAgt {

        @XmlElement(name = "FinInstnId", required = true)
        protected CdtTrfTxInfChild.CdtrAgt.FinInstnId finInstnId;

        /**
         * Gets the value of the finInstnId property.
         * 
         * @return
         *     possible object is
         *     {@link CdtTrfTxInfChild.CdtrAgt.FinInstnId }
         *     
         */
        public CdtTrfTxInfChild.CdtrAgt.FinInstnId getFinInstnId() {
            return finInstnId;
        }

        /**
         * Sets the value of the finInstnId property.
         * 
         * @param value
         *     allowed object is
         *     {@link CdtTrfTxInfChild.CdtrAgt.FinInstnId }
         *     
         */
        public void setFinInstnId(CdtTrfTxInfChild.CdtrAgt.FinInstnId value) {
            this.finInstnId = value;
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
         *                   &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        public static class FinInstnId {

            @XmlElement(name = "Othr", required = true)
            protected CdtTrfTxInfChild.CdtrAgt.FinInstnId.Othr othr;

            /**
             * Gets the value of the othr property.
             * 
             * @return
             *     possible object is
             *     {@link CdtTrfTxInfChild.CdtrAgt.FinInstnId.Othr }
             *     
             */
            public CdtTrfTxInfChild.CdtrAgt.FinInstnId.Othr getOthr() {
                return othr;
            }

            /**
             * Sets the value of the othr property.
             * 
             * @param value
             *     allowed object is
             *     {@link CdtTrfTxInfChild.CdtrAgt.FinInstnId.Othr }
             *     
             */
            public void setOthr(CdtTrfTxInfChild.CdtrAgt.FinInstnId.Othr value) {
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
             *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
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

                @XmlElement(name = "Id", required = true)
                protected String id;

                /**
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getId() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setId(String value) {
                    this.id = value;
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
    public static class Dbtr {

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
    public static class DbtrAcct {

        @XmlElement(name = "Id", required = true)
        protected CdtTrfTxInfChild.DbtrAcct.Id id;
        @XmlElement(name = "Tp", required = true)
        protected CdtTrfTxInfChild.DbtrAcct.Tp tp;

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link CdtTrfTxInfChild.DbtrAcct.Id }
         *     
         */
        public CdtTrfTxInfChild.DbtrAcct.Id getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link CdtTrfTxInfChild.DbtrAcct.Id }
         *     
         */
        public void setId(CdtTrfTxInfChild.DbtrAcct.Id value) {
            this.id = value;
        }

        /**
         * Gets the value of the tp property.
         * 
         * @return
         *     possible object is
         *     {@link CdtTrfTxInfChild.DbtrAcct.Tp }
         *     
         */
        public CdtTrfTxInfChild.DbtrAcct.Tp getTp() {
            return tp;
        }

        /**
         * Sets the value of the tp property.
         * 
         * @param value
         *     allowed object is
         *     {@link CdtTrfTxInfChild.DbtrAcct.Tp }
         *     
         */
        public void setTp(CdtTrfTxInfChild.DbtrAcct.Tp value) {
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
            protected CdtTrfTxInfChild.DbtrAcct.Id.Othr othr;

            /**
             * Gets the value of the othr property.
             * 
             * @return
             *     possible object is
             *     {@link CdtTrfTxInfChild.DbtrAcct.Id.Othr }
             *     
             */
            public CdtTrfTxInfChild.DbtrAcct.Id.Othr getOthr() {
                return othr;
            }

            /**
             * Sets the value of the othr property.
             * 
             * @param value
             *     allowed object is
             *     {@link CdtTrfTxInfChild.DbtrAcct.Id.Othr }
             *     
             */
            public void setOthr(CdtTrfTxInfChild.DbtrAcct.Id.Othr value) {
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
     *         &lt;element name="FinInstnId">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Othr">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "finInstnId"
    })
    public static class DbtrAgt {

        @XmlElement(name = "FinInstnId", required = true)
        protected CdtTrfTxInfChild.DbtrAgt.FinInstnId finInstnId;

        /**
         * Gets the value of the finInstnId property.
         * 
         * @return
         *     possible object is
         *     {@link CdtTrfTxInfChild.DbtrAgt.FinInstnId }
         *     
         */
        public CdtTrfTxInfChild.DbtrAgt.FinInstnId getFinInstnId() {
            return finInstnId;
        }

        /**
         * Sets the value of the finInstnId property.
         * 
         * @param value
         *     allowed object is
         *     {@link CdtTrfTxInfChild.DbtrAgt.FinInstnId }
         *     
         */
        public void setFinInstnId(CdtTrfTxInfChild.DbtrAgt.FinInstnId value) {
            this.finInstnId = value;
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
         *                   &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        public static class FinInstnId {

            @XmlElement(name = "Othr", required = true)
            protected CdtTrfTxInfChild.DbtrAgt.FinInstnId.Othr othr;

            /**
             * Gets the value of the othr property.
             * 
             * @return
             *     possible object is
             *     {@link CdtTrfTxInfChild.DbtrAgt.FinInstnId.Othr }
             *     
             */
            public CdtTrfTxInfChild.DbtrAgt.FinInstnId.Othr getOthr() {
                return othr;
            }

            /**
             * Sets the value of the othr property.
             * 
             * @param value
             *     allowed object is
             *     {@link CdtTrfTxInfChild.DbtrAgt.FinInstnId.Othr }
             *     
             */
            public void setOthr(CdtTrfTxInfChild.DbtrAgt.FinInstnId.Othr value) {
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
             *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
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

                @XmlElement(name = "Id", required = true)
                protected String id;

                /**
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getId() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setId(String value) {
                    this.id = value;
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
     *         &lt;element name="FinInstnId">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PstlAdr">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="StrtNm" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="TwnNm" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="CtrySubDvsn" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Ctry" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Othr">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "finInstnId"
    })
    public static class InstgAgt {

        @XmlElement(name = "FinInstnId", required = true)
        protected CdtTrfTxInfChild.InstgAgt.FinInstnId finInstnId;

        /**
         * Gets the value of the finInstnId property.
         * 
         * @return
         *     possible object is
         *     {@link CdtTrfTxInfChild.InstgAgt.FinInstnId }
         *     
         */
        public CdtTrfTxInfChild.InstgAgt.FinInstnId getFinInstnId() {
            return finInstnId;
        }

        /**
         * Sets the value of the finInstnId property.
         * 
         * @param value
         *     allowed object is
         *     {@link CdtTrfTxInfChild.InstgAgt.FinInstnId }
         *     
         */
        public void setFinInstnId(CdtTrfTxInfChild.InstgAgt.FinInstnId value) {
            this.finInstnId = value;
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
         *         &lt;element name="PstlAdr">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="StrtNm" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="TwnNm" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="CtrySubDvsn" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Ctry" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Othr">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "pstlAdr",
            "othr"
        })
        public static class FinInstnId {

            @XmlElement(name = "PstlAdr", required = true)
            protected CdtTrfTxInfChild.InstgAgt.FinInstnId.PstlAdr pstlAdr;
            @XmlElement(name = "Othr", required = true)
            protected CdtTrfTxInfChild.InstgAgt.FinInstnId.Othr othr;

            /**
             * Gets the value of the pstlAdr property.
             * 
             * @return
             *     possible object is
             *     {@link CdtTrfTxInfChild.InstgAgt.FinInstnId.PstlAdr }
             *     
             */
            public CdtTrfTxInfChild.InstgAgt.FinInstnId.PstlAdr getPstlAdr() {
                return pstlAdr;
            }

            /**
             * Sets the value of the pstlAdr property.
             * 
             * @param value
             *     allowed object is
             *     {@link CdtTrfTxInfChild.InstgAgt.FinInstnId.PstlAdr }
             *     
             */
            public void setPstlAdr(CdtTrfTxInfChild.InstgAgt.FinInstnId.PstlAdr value) {
                this.pstlAdr = value;
            }

            /**
             * Gets the value of the othr property.
             * 
             * @return
             *     possible object is
             *     {@link CdtTrfTxInfChild.InstgAgt.FinInstnId.Othr }
             *     
             */
            public CdtTrfTxInfChild.InstgAgt.FinInstnId.Othr getOthr() {
                return othr;
            }

            /**
             * Sets the value of the othr property.
             * 
             * @param value
             *     allowed object is
             *     {@link CdtTrfTxInfChild.InstgAgt.FinInstnId.Othr }
             *     
             */
            public void setOthr(CdtTrfTxInfChild.InstgAgt.FinInstnId.Othr value) {
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
             *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
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

                @XmlElement(name = "Id", required = true)
                protected String id;

                /**
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getId() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setId(String value) {
                    this.id = value;
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
             *         &lt;element name="StrtNm" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="TwnNm" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="CtrySubDvsn" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Ctry" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "strtNm",
                "twnNm",
                "ctrySubDvsn",
                "ctry"
            })
            public static class PstlAdr {

                @XmlElement(name = "StrtNm", required = true)
                protected String strtNm;
                @XmlElement(name = "TwnNm", required = true)
                protected String twnNm;
                @XmlElement(name = "CtrySubDvsn", required = true)
                protected String ctrySubDvsn;
                @XmlElement(name = "Ctry", required = true)
                protected String ctry;

                /**
                 * Gets the value of the strtNm property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStrtNm() {
                    return strtNm;
                }

                /**
                 * Sets the value of the strtNm property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStrtNm(String value) {
                    this.strtNm = value;
                }

                /**
                 * Gets the value of the twnNm property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTwnNm() {
                    return twnNm;
                }

                /**
                 * Sets the value of the twnNm property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTwnNm(String value) {
                    this.twnNm = value;
                }

                /**
                 * Gets the value of the ctrySubDvsn property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCtrySubDvsn() {
                    return ctrySubDvsn;
                }

                /**
                 * Sets the value of the ctrySubDvsn property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCtrySubDvsn(String value) {
                    this.ctrySubDvsn = value;
                }

                /**
                 * Gets the value of the ctry property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCtry() {
                    return ctry;
                }

                /**
                 * Sets the value of the ctry property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCtry(String value) {
                    this.ctry = value;
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>unsignedByte">
     *       &lt;attribute name="Ccy" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class IntrBkSttlmAmt {

        @XmlValue
        @XmlSchemaType(name = "unsignedByte")
        protected short value;
        @XmlAttribute(name = "Ccy", required = true)
        protected String ccy;

        /**
         * Gets the value of the value property.
         * 
         */
        public short getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         */
        public void setValue(short value) {
            this.value = value;
        }

        /**
         * Gets the value of the ccy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCcy() {
            return ccy;
        }

        /**
         * Sets the value of the ccy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCcy(String value) {
            this.ccy = value;
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
     *         &lt;element name="EndToEndId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="TxId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "endToEndId",
        "txId"
    })
    public static class PmtId {

        @XmlElement(name = "EndToEndId", required = true)
        protected String endToEndId;
        @XmlElement(name = "TxId", required = true)
        protected String txId;

        /**
         * Gets the value of the endToEndId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEndToEndId() {
            return endToEndId;
        }

        /**
         * Sets the value of the endToEndId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEndToEndId(String value) {
            this.endToEndId = value;
        }

        /**
         * Gets the value of the txId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTxId() {
            return txId;
        }

        /**
         * Sets the value of the txId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTxId(String value) {
            this.txId = value;
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
     *         &lt;element name="CtgyPurp">
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
        "ctgyPurp"
    })
    public static class PmtTpInf {

        @XmlElement(name = "CtgyPurp", required = true)
        protected CdtTrfTxInfChild.PmtTpInf.CtgyPurp ctgyPurp;

        /**
         * Gets the value of the ctgyPurp property.
         * 
         * @return
         *     possible object is
         *     {@link CdtTrfTxInfChild.PmtTpInf.CtgyPurp }
         *     
         */
        public CdtTrfTxInfChild.PmtTpInf.CtgyPurp getCtgyPurp() {
            return ctgyPurp;
        }

        /**
         * Sets the value of the ctgyPurp property.
         * 
         * @param value
         *     allowed object is
         *     {@link CdtTrfTxInfChild.PmtTpInf.CtgyPurp }
         *     
         */
        public void setCtgyPurp(CdtTrfTxInfChild.PmtTpInf.CtgyPurp value) {
            this.ctgyPurp = value;
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
        public static class CtgyPurp {

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
     *                   &lt;element name="InstrForCdtrAgt">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="RecptRef" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
     *                             &lt;element name="PaymntDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="ScndValInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="IdTp" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
     *                             &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="InstrForDbtrAcct">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="RsdntSts" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
     *                             &lt;element name="PrdTp" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="ShariaCmpl" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Dtls" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Dbtr">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="IPAddr" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="CdtTrfTxInf">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PrxyLkUpRef" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        protected CdtTrfTxInfChild.SplmtryData.Envlp envlp;

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
         *     {@link CdtTrfTxInfChild.SplmtryData.Envlp }
         *     
         */
        public CdtTrfTxInfChild.SplmtryData.Envlp getEnvlp() {
            return envlp;
        }

        /**
         * Sets the value of the envlp property.
         * 
         * @param value
         *     allowed object is
         *     {@link CdtTrfTxInfChild.SplmtryData.Envlp }
         *     
         */
        public void setEnvlp(CdtTrfTxInfChild.SplmtryData.Envlp value) {
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
         *         &lt;element name="InstrForCdtrAgt">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="RecptRef" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
         *                   &lt;element name="PaymntDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="ScndValInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="IdTp" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
         *                   &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="InstrForDbtrAcct">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="RsdntSts" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
         *                   &lt;element name="PrdTp" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="ShariaCmpl" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Dtls" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Dbtr">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="IPAddr" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="CdtTrfTxInf">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PrxyLkUpRef" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "instrForCdtrAgt",
            "instrForDbtrAcct",
            "dbtr",
            "cdtTrfTxInf",
            "prxyLkUpRef"
        })
        public static class Envlp {

            @XmlElement(name = "InstrForCdtrAgt", required = true)
            protected CdtTrfTxInfChild.SplmtryData.Envlp.InstrForCdtrAgt instrForCdtrAgt;
            @XmlElement(name = "InstrForDbtrAcct", required = true)
            protected CdtTrfTxInfChild.SplmtryData.Envlp.InstrForDbtrAcct instrForDbtrAcct;
            @XmlElement(name = "Dbtr", required = true)
            protected CdtTrfTxInfChild.SplmtryData.Envlp.Dbtr dbtr;
            @XmlElement(name = "CdtTrfTxInf", required = true)
            protected CdtTrfTxInfChild.SplmtryData.Envlp.CdtTrfTxInf cdtTrfTxInf;
            @XmlElement(name = "PrxyLkUpRef", required = true)
            protected String prxyLkUpRef;

            /**
             * Gets the value of the instrForCdtrAgt property.
             * 
             * @return
             *     possible object is
             *     {@link CdtTrfTxInfChild.SplmtryData.Envlp.InstrForCdtrAgt }
             *     
             */
            public CdtTrfTxInfChild.SplmtryData.Envlp.InstrForCdtrAgt getInstrForCdtrAgt() {
                return instrForCdtrAgt;
            }

            /**
             * Sets the value of the instrForCdtrAgt property.
             * 
             * @param value
             *     allowed object is
             *     {@link CdtTrfTxInfChild.SplmtryData.Envlp.InstrForCdtrAgt }
             *     
             */
            public void setInstrForCdtrAgt(CdtTrfTxInfChild.SplmtryData.Envlp.InstrForCdtrAgt value) {
                this.instrForCdtrAgt = value;
            }

            /**
             * Gets the value of the instrForDbtrAcct property.
             * 
             * @return
             *     possible object is
             *     {@link CdtTrfTxInfChild.SplmtryData.Envlp.InstrForDbtrAcct }
             *     
             */
            public CdtTrfTxInfChild.SplmtryData.Envlp.InstrForDbtrAcct getInstrForDbtrAcct() {
                return instrForDbtrAcct;
            }

            /**
             * Sets the value of the instrForDbtrAcct property.
             * 
             * @param value
             *     allowed object is
             *     {@link CdtTrfTxInfChild.SplmtryData.Envlp.InstrForDbtrAcct }
             *     
             */
            public void setInstrForDbtrAcct(CdtTrfTxInfChild.SplmtryData.Envlp.InstrForDbtrAcct value) {
                this.instrForDbtrAcct = value;
            }

            /**
             * Gets the value of the dbtr property.
             * 
             * @return
             *     possible object is
             *     {@link CdtTrfTxInfChild.SplmtryData.Envlp.Dbtr }
             *     
             */
            public CdtTrfTxInfChild.SplmtryData.Envlp.Dbtr getDbtr() {
                return dbtr;
            }

            /**
             * Sets the value of the dbtr property.
             * 
             * @param value
             *     allowed object is
             *     {@link CdtTrfTxInfChild.SplmtryData.Envlp.Dbtr }
             *     
             */
            public void setDbtr(CdtTrfTxInfChild.SplmtryData.Envlp.Dbtr value) {
                this.dbtr = value;
            }

            /**
             * Gets the value of the cdtTrfTxInf property.
             * 
             * @return
             *     possible object is
             *     {@link CdtTrfTxInfChild.SplmtryData.Envlp.CdtTrfTxInf }
             *     
             */
            public CdtTrfTxInfChild.SplmtryData.Envlp.CdtTrfTxInf getCdtTrfTxInf() {
                return cdtTrfTxInf;
            }

            /**
             * Sets the value of the cdtTrfTxInf property.
             * 
             * @param value
             *     allowed object is
             *     {@link CdtTrfTxInfChild.SplmtryData.Envlp.CdtTrfTxInf }
             *     
             */
            public void setCdtTrfTxInf(CdtTrfTxInfChild.SplmtryData.Envlp.CdtTrfTxInf value) {
                this.cdtTrfTxInf = value;
            }

            /**
             * Gets the value of the prxyLkUpRef property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrxyLkUpRef() {
                return prxyLkUpRef;
            }

            /**
             * Sets the value of the prxyLkUpRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrxyLkUpRef(String value) {
                this.prxyLkUpRef = value;
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
             *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "url"
            })
            public static class CdtTrfTxInf {

                @XmlElement(name = "URL", required = true)
                protected String url;

                /**
                 * Gets the value of the url property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getURL() {
                    return url;
                }

                /**
                 * Sets the value of the url property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setURL(String value) {
                    this.url = value;
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
             *         &lt;element name="IPAddr" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "ipAddr",
                "id"
            })
            public static class Dbtr {

                @XmlElement(name = "IPAddr", required = true)
                protected String ipAddr;
                @XmlElement(name = "Id")
                @XmlSchemaType(name = "unsignedInt")
                protected long id;

                /**
                 * Gets the value of the ipAddr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIPAddr() {
                    return ipAddr;
                }

                /**
                 * Sets the value of the ipAddr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIPAddr(String value) {
                    this.ipAddr = value;
                }

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
             *         &lt;element name="RecptRef" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
             *         &lt;element name="PaymntDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="ScndValInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="IdTp" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
             *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
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
                "recptRef",
                "paymntDesc",
                "scndValInd",
                "idTp",
                "id"
            })
            public static class InstrForCdtrAgt {

                @XmlElement(name = "RecptRef", required = true)
                @XmlSchemaType(name = "unsignedLong")
                protected BigInteger recptRef;
                @XmlElement(name = "PaymntDesc", required = true)
                protected String paymntDesc;
                @XmlElement(name = "ScndValInd", required = true)
                protected String scndValInd;
                @XmlElement(name = "IdTp")
                @XmlSchemaType(name = "unsignedByte")
                protected short idTp;
                @XmlElement(name = "Id", required = true)
                @XmlSchemaType(name = "unsignedLong")
                protected BigInteger id;

                /**
                 * Gets the value of the recptRef property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getRecptRef() {
                    return recptRef;
                }

                /**
                 * Sets the value of the recptRef property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setRecptRef(BigInteger value) {
                    this.recptRef = value;
                }

                /**
                 * Gets the value of the paymntDesc property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPaymntDesc() {
                    return paymntDesc;
                }

                /**
                 * Sets the value of the paymntDesc property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPaymntDesc(String value) {
                    this.paymntDesc = value;
                }

                /**
                 * Gets the value of the scndValInd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getScndValInd() {
                    return scndValInd;
                }

                /**
                 * Sets the value of the scndValInd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setScndValInd(String value) {
                    this.scndValInd = value;
                }

                /**
                 * Gets the value of the idTp property.
                 * 
                 */
                public short getIdTp() {
                    return idTp;
                }

                /**
                 * Sets the value of the idTp property.
                 * 
                 */
                public void setIdTp(short value) {
                    this.idTp = value;
                }

                /**
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getId() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setId(BigInteger value) {
                    this.id = value;
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
             *         &lt;element name="RsdntSts" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
             *         &lt;element name="PrdTp" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "prdTp",
                "shariaCmpl",
                "dtls"
            })
            public static class InstrForDbtrAcct {

                @XmlElement(name = "RsdntSts")
                @XmlSchemaType(name = "unsignedByte")
                protected short rsdntSts;
                @XmlElement(name = "PrdTp", required = true)
                protected String prdTp;
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
                 * Gets the value of the prdTp property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPrdTp() {
                    return prdTp;
                }

                /**
                 * Sets the value of the prdTp property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPrdTp(String value) {
                    this.prdTp = value;
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

}
