
package response;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "InstrForCdtrAcct",
    "CdtrAcctCstmrCtg"
})
public class Envlp {

    @JsonProperty("InstrForCdtrAcct")
    private response.InstrForCdtrAcct InstrForCdtrAcct;
    @JsonProperty("CdtrAcctCstmrCtg")
    private String CdtrAcctCstmrCtg;

    /**
     * 
     * @return
     *     The InstrForCdtrAcct
     */
    @JsonProperty("InstrForCdtrAcct")
    public response.InstrForCdtrAcct getInstrForCdtrAcct() {
        return InstrForCdtrAcct;
    }

    /**
     * 
     * @param InstrForCdtrAcct
     *     The InstrForCdtrAcct
     */
    @JsonProperty("InstrForCdtrAcct")
    public void setInstrForCdtrAcct(response.InstrForCdtrAcct InstrForCdtrAcct) {
        this.InstrForCdtrAcct = InstrForCdtrAcct;
    }

    /**
     * 
     * @return
     *     The CdtrAcctCstmrCtg
     */
    @JsonProperty("CdtrAcctCstmrCtg")
    public String getCdtrAcctCstmrCtg() {
        return CdtrAcctCstmrCtg;
    }

    /**
     * 
     * @param CdtrAcctCstmrCtg
     *     The CdtrAcctCstmrCtg
     */
    @JsonProperty("CdtrAcctCstmrCtg")
    public void setCdtrAcctCstmrCtg(String CdtrAcctCstmrCtg) {
        this.CdtrAcctCstmrCtg = CdtrAcctCstmrCtg;
    }

}
