
package iso.std.iso._20022.tech.xsd.pacs_008_001_1568087264516;

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
 *         &lt;element name="MsgId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CreDtTm" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="NbOfTxs" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="SttlmInf">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SttlmMtd" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "msgId",
    "creDtTm",
    "nbOfTxs",
    "sttlmInf"
})
@XmlRootElement(name = "GrpHdr")
public class GrpHdr {

    @XmlElement(name = "MsgId", required = true)
    protected String msgId;
    @XmlElement(name = "CreDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDtTm;
    @XmlElement(name = "NbOfTxs")
    @XmlSchemaType(name = "unsignedByte")
    protected short nbOfTxs;
    @XmlElement(name = "SttlmInf", required = true)
    protected GrpHdr.SttlmInf sttlmInf;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgId(String value) {
        this.msgId = value;
    }

    /**
     * Gets the value of the creDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreDtTm() {
        return creDtTm;
    }

    /**
     * Sets the value of the creDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreDtTm(XMLGregorianCalendar value) {
        this.creDtTm = value;
    }

    /**
     * Gets the value of the nbOfTxs property.
     * 
     */
    public short getNbOfTxs() {
        return nbOfTxs;
    }

    /**
     * Sets the value of the nbOfTxs property.
     * 
     */
    public void setNbOfTxs(short value) {
        this.nbOfTxs = value;
    }

    /**
     * Gets the value of the sttlmInf property.
     * 
     * @return
     *     possible object is
     *     {@link GrpHdr.SttlmInf }
     *     
     */
    public GrpHdr.SttlmInf getSttlmInf() {
        return sttlmInf;
    }

    /**
     * Sets the value of the sttlmInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrpHdr.SttlmInf }
     *     
     */
    public void setSttlmInf(GrpHdr.SttlmInf value) {
        this.sttlmInf = value;
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
     *         &lt;element name="SttlmMtd" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "sttlmMtd"
    })
    public static class SttlmInf {

        @XmlElement(name = "SttlmMtd", required = true)
        protected String sttlmMtd;

        /**
         * Gets the value of the sttlmMtd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSttlmMtd() {
            return sttlmMtd;
        }

        /**
         * Sets the value of the sttlmMtd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSttlmMtd(String value) {
            this.sttlmMtd = value;
        }

    }

}
