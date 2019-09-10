
package request;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "URL"
})
public class CdtTrfTxInf_ {

    @JsonProperty("URL")
    private String URL;

    /**
     * 
     * @return
     *     The URL
     */
    @JsonProperty("URL")
    public String getURL() {
        return URL;
    }

    /**
     * 
     * @param URL
     *     The URL
     */
    @JsonProperty("URL")
    public void setURL(String URL) {
        this.URL = URL;
    }

}
