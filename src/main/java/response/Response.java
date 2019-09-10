
package response;

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
public class Response {

    @JsonProperty("AppHdr")
    private response.AppHdr AppHdr;
    @JsonProperty("Document")
    private response.Document Document;

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

}
