
package response;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "OrgnlMsgId",
    "OrgnlMsgNmId"
})
public class OrgnlGrpInfAndSts {

    @JsonProperty("OrgnlMsgId")
    private String OrgnlMsgId;
    @JsonProperty("OrgnlMsgNmId")
    private String OrgnlMsgNmId;

    /**
     * 
     * @return
     *     The OrgnlMsgId
     */
    @JsonProperty("OrgnlMsgId")
    public String getOrgnlMsgId() {
        return OrgnlMsgId;
    }

    /**
     * 
     * @param OrgnlMsgId
     *     The OrgnlMsgId
     */
    @JsonProperty("OrgnlMsgId")
    public void setOrgnlMsgId(String OrgnlMsgId) {
        this.OrgnlMsgId = OrgnlMsgId;
    }

    /**
     * 
     * @return
     *     The OrgnlMsgNmId
     */
    @JsonProperty("OrgnlMsgNmId")
    public String getOrgnlMsgNmId() {
        return OrgnlMsgNmId;
    }

    /**
     * 
     * @param OrgnlMsgNmId
     *     The OrgnlMsgNmId
     */
    @JsonProperty("OrgnlMsgNmId")
    public void setOrgnlMsgNmId(String OrgnlMsgNmId) {
        this.OrgnlMsgNmId = OrgnlMsgNmId;
    }

}
