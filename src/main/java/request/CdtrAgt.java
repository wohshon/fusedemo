
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
public class CdtrAgt {

    @JsonProperty("FinInstnId")
    private FinInstnId____ FinInstnId;

    /**
     * 
     * @return
     *     The FinInstnId
     */
    @JsonProperty("FinInstnId")
    public FinInstnId____ getFinInstnId() {
        return FinInstnId;
    }

    /**
     * 
     * @param FinInstnId
     *     The FinInstnId
     */
    @JsonProperty("FinInstnId")
    public void setFinInstnId(FinInstnId____ FinInstnId) {
        this.FinInstnId = FinInstnId;
    }

}
