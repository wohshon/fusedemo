
package rpp_1568087264516;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the rpp package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: rpp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BusMsg }
     * 
     */
    public BusMsg createBusMsg() {
        return new BusMsg();
    }

    /**
     * Create an instance of {@link BusMsg.Document }
     * 
     */
    public BusMsg.Document createBusMsgDocument() {
        return new BusMsg.Document();
    }

    /**
     * Create an instance of {@link BusMsg.AppHdr }
     * 
     */
    public BusMsg.AppHdr createBusMsgAppHdr() {
        return new BusMsg.AppHdr();
    }

    /**
     * Create an instance of {@link BusMsg.Document.FIToFICstmrCdtTrf }
     * 
     */
    public BusMsg.Document.FIToFICstmrCdtTrf createBusMsgDocumentFIToFICstmrCdtTrf() {
        return new BusMsg.Document.FIToFICstmrCdtTrf();
    }

}
