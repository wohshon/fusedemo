
package response;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "AppHdr",
    "Document",
    "_xmlns:ns",
    "_xmlns:ns1",
    "_xmlns:ns2",
    "__prefix"
})
public class BusMsg {

    @JsonProperty("AppHdr")
    private response.AppHdr AppHdr;
    @JsonProperty("Document")
    private response.Document Document;
    @JsonProperty("_xmlns:ns")
    private String XmlnsNs;
    @JsonProperty("_xmlns:ns1")
    private String XmlnsNs1;
    @JsonProperty("_xmlns:ns2")
    private String XmlnsNs2;
    @JsonProperty("__prefix")
    private String Prefix;

    /**
     * 
     * @return
     *     The AppHdr
     */
    @JsonProperty("AppHdr")
    public response.AppHdr getAppHdr() {
        return AppHdr;
    }

    /**
     * 
     * @param AppHdr
     *     The AppHdr
     */
    @JsonProperty("AppHdr")
    public void setAppHdr(response.AppHdr AppHdr) {
        this.AppHdr = AppHdr;
    }

    /**
     * 
     * @return
     *     The Document
     */
    @JsonProperty("Document")
    public response.Document getDocument() {
        return Document;
    }

    /**
     * 
     * @param Document
     *     The Document
     */
    @JsonProperty("Document")
    public void setDocument(response.Document Document) {
        this.Document = Document;
    }

    /**
     * 
     * @return
     *     The XmlnsNs
     */
    @JsonProperty("_xmlns:ns")
    public String getXmlnsNs() {
        return XmlnsNs;
    }

    /**
     * 
     * @param XmlnsNs
     *     The _xmlns:ns
     */
    @JsonProperty("_xmlns:ns")
    public void setXmlnsNs(String XmlnsNs) {
        this.XmlnsNs = XmlnsNs;
    }

    /**
     * 
     * @return
     *     The XmlnsNs1
     */
    @JsonProperty("_xmlns:ns1")
    public String getXmlnsNs1() {
        return XmlnsNs1;
    }

    /**
     * 
     * @param XmlnsNs1
     *     The _xmlns:ns1
     */
    @JsonProperty("_xmlns:ns1")
    public void setXmlnsNs1(String XmlnsNs1) {
        this.XmlnsNs1 = XmlnsNs1;
    }

    /**
     * 
     * @return
     *     The XmlnsNs2
     */
    @JsonProperty("_xmlns:ns2")
    public String getXmlnsNs2() {
        return XmlnsNs2;
    }

    /**
     * 
     * @param XmlnsNs2
     *     The _xmlns:ns2
     */
    @JsonProperty("_xmlns:ns2")
    public void setXmlnsNs2(String XmlnsNs2) {
        this.XmlnsNs2 = XmlnsNs2;
    }

    /**
     * 
     * @return
     *     The Prefix
     */
    @JsonProperty("__prefix")
    public String getPrefix() {
        return Prefix;
    }

    /**
     * 
     * @param Prefix
     *     The __prefix
     */
    @JsonProperty("__prefix")
    public void setPrefix(String Prefix) {
        this.Prefix = Prefix;
    }

}
