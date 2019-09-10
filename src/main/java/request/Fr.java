
package request;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "FIId"
})
public class Fr {

    @JsonProperty("FIId")
    private request.FIId FIId;

    /**
     * 
     * @return
     *     The FIId
     */
    @JsonProperty("FIId")
    public request.FIId getFIId() {
        return FIId;
    }

    /**
     * 
     * @param FIId
     *     The FIId
     */
    @JsonProperty("FIId")
    public void setFIId(request.FIId FIId) {
        this.FIId = FIId;
    }

}
