
package iso.std.iso._20022.tech.xsd.head_001_001_1568087264516;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the iso.std.iso._20022.tech.xsd.head_001_001 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BizMsgIdr_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:head.001.001.01", "BizMsgIdr");
    private final static QName _BizSvc_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:head.001.001.01", "BizSvc");
    private final static QName _PssblDplct_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:head.001.001.01", "PssblDplct");
    private final static QName _CreDt_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:head.001.001.01", "CreDt");
    private final static QName _MsgDefIdr_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:head.001.001.01", "MsgDefIdr");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: iso.std.iso._20022.tech.xsd.head_001_001
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link To }
     * 
     */
    public To createTo() {
        return new To();
    }

    /**
     * Create an instance of {@link Fr }
     * 
     */
    public Fr createFr() {
        return new Fr();
    }

    /**
     * Create an instance of {@link Fr.FIId }
     * 
     */
    public Fr.FIId createFrFIId() {
        return new Fr.FIId();
    }

    /**
     * Create an instance of {@link Fr.FIId.FinInstnId }
     * 
     */
    public Fr.FIId.FinInstnId createFrFIIdFinInstnId() {
        return new Fr.FIId.FinInstnId();
    }

    /**
     * Create an instance of {@link To.FIId }
     * 
     */
    public To.FIId createToFIId() {
        return new To.FIId();
    }

    /**
     * Create an instance of {@link To.FIId.FinInstnId }
     * 
     */
    public To.FIId.FinInstnId createToFIIdFinInstnId() {
        return new To.FIId.FinInstnId();
    }

    /**
     * Create an instance of {@link Fr.FIId.FinInstnId.Othr }
     * 
     */
    public Fr.FIId.FinInstnId.Othr createFrFIIdFinInstnIdOthr() {
        return new Fr.FIId.FinInstnId.Othr();
    }

    /**
     * Create an instance of {@link To.FIId.FinInstnId.Othr }
     * 
     */
    public To.FIId.FinInstnId.Othr createToFIIdFinInstnIdOthr() {
        return new To.FIId.FinInstnId.Othr();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:head.001.001.01", name = "BizMsgIdr")
    public JAXBElement<String> createBizMsgIdr(String value) {
        return new JAXBElement<String>(_BizMsgIdr_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:head.001.001.01", name = "BizSvc")
    public JAXBElement<String> createBizSvc(String value) {
        return new JAXBElement<String>(_BizSvc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:head.001.001.01", name = "PssblDplct")
    public JAXBElement<Boolean> createPssblDplct(Boolean value) {
        return new JAXBElement<Boolean>(_PssblDplct_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:head.001.001.01", name = "CreDt")
    public JAXBElement<XMLGregorianCalendar> createCreDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CreDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:head.001.001.01", name = "MsgDefIdr")
    public JAXBElement<String> createMsgDefIdr(String value) {
        return new JAXBElement<String>(_MsgDefIdr_QNAME, String.class, null, value);
    }

}
