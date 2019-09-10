
package request;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "GrpHdr",
    "CdtTrfTxInf"
})
public class FIToFICstmrCdtTrf {

    @JsonProperty("GrpHdr")
    private request.GrpHdr GrpHdr;
    @JsonProperty("CdtTrfTxInf")
    private request.CdtTrfTxInf CdtTrfTxInf;

    /**
     * 
     * @return
     *     The GrpHdr
     */
    @JsonProperty("GrpHdr")
    public request.GrpHdr getGrpHdr() {
        return GrpHdr;
    }

    /**
     * 
     * @param GrpHdr
     *     The GrpHdr
     */
    @JsonProperty("GrpHdr")
    public void setGrpHdr(request.GrpHdr GrpHdr) {
        this.GrpHdr = GrpHdr;
    }

    /**
     * 
     * @return
     *     The CdtTrfTxInf
     */
    @JsonProperty("CdtTrfTxInf")
    public request.CdtTrfTxInf getCdtTrfTxInf() {
        return CdtTrfTxInf;
    }

    /**
     * 
     * @param CdtTrfTxInf
     *     The CdtTrfTxInf
     */
    @JsonProperty("CdtTrfTxInf")
    public void setCdtTrfTxInf(request.CdtTrfTxInf CdtTrfTxInf) {
        this.CdtTrfTxInf = CdtTrfTxInf;
    }

}
