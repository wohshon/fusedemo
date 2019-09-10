
package request;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "EndToEndId",
    "TxId"
})
public class PmtId {

    @JsonProperty("EndToEndId")
    private String EndToEndId;
    @JsonProperty("TxId")
    private String TxId;

    /**
     * 
     * @return
     *     The EndToEndId
     */
    @JsonProperty("EndToEndId")
    public String getEndToEndId() {
        return EndToEndId;
    }

    /**
     * 
     * @param EndToEndId
     *     The EndToEndId
     */
    @JsonProperty("EndToEndId")
    public void setEndToEndId(String EndToEndId) {
        this.EndToEndId = EndToEndId;
    }

    /**
     * 
     * @return
     *     The TxId
     */
    @JsonProperty("TxId")
    public String getTxId() {
        return TxId;
    }

    /**
     * 
     * @param TxId
     *     The TxId
     */
    @JsonProperty("TxId")
    public void setTxId(String TxId) {
        this.TxId = TxId;
    }

}
