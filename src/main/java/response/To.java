
package response;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "FIId"
})
public class To {

    @JsonProperty("FIId")
    private FIId_ FIId;

    /**
     * 
     * @return
     *     The FIId
     */
    @JsonProperty("FIId")
    public FIId_ getFIId() {
        return FIId;
    }

    /**
     * 
     * @param FIId
     *     The FIId
     */
    @JsonProperty("FIId")
    public void setFIId(FIId_ FIId) {
        this.FIId = FIId;
    }

}
