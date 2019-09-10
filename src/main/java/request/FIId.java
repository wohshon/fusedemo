
package request;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "FinInstnId"
})
public class FIId {

    @JsonProperty("FinInstnId")
    private request.FinInstnId FinInstnId;

    /**
     * 
     * @return
     *     The FinInstnId
     */
    @JsonProperty("FinInstnId")
    public request.FinInstnId getFinInstnId() {
        return FinInstnId;
    }

    /**
     * 
     * @param FinInstnId
     *     The FinInstnId
     */
    @JsonProperty("FinInstnId")
    public void setFinInstnId(request.FinInstnId FinInstnId) {
        this.FinInstnId = FinInstnId;
    }

}
