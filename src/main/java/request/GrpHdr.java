
package request;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "MsgId",
    "CreDtTm",
    "NbOfTxs",
    "SttlmInf"
})
public class GrpHdr {

    @JsonProperty("MsgId")
    private String MsgId;
    @JsonProperty("CreDtTm")
    private String CreDtTm;
    @JsonProperty("NbOfTxs")
    private String NbOfTxs;
    @JsonProperty("SttlmInf")
    private request.SttlmInf SttlmInf;

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

    /**
     * 
     * @return
     *     The NbOfTxs
     */
    @JsonProperty("NbOfTxs")
    public String getNbOfTxs() {
        return NbOfTxs;
    }

    /**
     * 
     * @param NbOfTxs
     *     The NbOfTxs
     */
    @JsonProperty("NbOfTxs")
    public void setNbOfTxs(String NbOfTxs) {
        this.NbOfTxs = NbOfTxs;
    }

    /**
     * 
     * @return
     *     The SttlmInf
     */
    @JsonProperty("SttlmInf")
    public request.SttlmInf getSttlmInf() {
        return SttlmInf;
    }

    /**
     * 
     * @param SttlmInf
     *     The SttlmInf
     */
    @JsonProperty("SttlmInf")
    public void setSttlmInf(request.SttlmInf SttlmInf) {
        this.SttlmInf = SttlmInf;
    }

}
