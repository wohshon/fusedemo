
package request;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "AppHdr",
    "Document"
})
public class BusMsg {

    @JsonProperty("AppHdr")
    private request.AppHdr AppHdr;
    @JsonProperty("Document")
    private request.Document Document;

    /**
     * 
     * @return
     *     The AppHdr
     */
    @JsonProperty("AppHdr")
    public request.AppHdr getAppHdr() {
        return AppHdr;
    }

    /**
     * 
     * @param AppHdr
     *     The AppHdr
     */
    @JsonProperty("AppHdr")
    public void setAppHdr(request.AppHdr AppHdr) {
        this.AppHdr = AppHdr;
    }

    /**
     * 
     * @return
     *     The Document
     */
    @JsonProperty("Document")
    public request.Document getDocument() {
        return Document;
    }

    /**
     * 
     * @param Document
     *     The Document
     */
    @JsonProperty("Document")
    public void setDocument(request.Document Document) {
        this.Document = Document;
    }

}
