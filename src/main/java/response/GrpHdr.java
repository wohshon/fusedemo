
package response;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "MsgId",
    "CreDtTm"
})
public class GrpHdr {

    @JsonProperty("MsgId")
    private String MsgId;
    @JsonProperty("CreDtTm")
    private String CreDtTm;

    /**
     * 
     * @return
     *     The MsgId
     */
    @JsonProperty("MsgId")
    public String getMsgId() {
        return MsgId;
    }

    /**
     * 
     * @param MsgId
     *     The MsgId
     */
    @JsonProperty("MsgId")
    public void setMsgId(String MsgId) {
        this.MsgId = MsgId;
    }

    /**
     * 
     * @return
     *     The CreDtTm
     */
    @JsonProperty("CreDtTm")
    public String getCreDtTm() {
        return CreDtTm;
    }

    /**
     * 
     * @param CreDtTm
     *     The CreDtTm
     */
    @JsonProperty("CreDtTm")
    public void setCreDtTm(String CreDtTm) {
        this.CreDtTm = CreDtTm;
    }

}
