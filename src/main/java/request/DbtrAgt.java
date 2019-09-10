
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
public class DbtrAgt {

    @JsonProperty("FinInstnId")
    private FinInstnId___ FinInstnId;

    /**
     * 
     * @return
     *     The FinInstnId
     */
    @JsonProperty("FinInstnId")
    public FinInstnId___ getFinInstnId() {
        return FinInstnId;
    }

    /**
     * 
     * @param FinInstnId
     *     The FinInstnId
     */
    @JsonProperty("FinInstnId")
    public void setFinInstnId(FinInstnId___ FinInstnId) {
        this.FinInstnId = FinInstnId;
    }

}
