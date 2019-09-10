
package response;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "GrpHdr",
    "OrgnlGrpInfAndSts",
    "TxInfAndSts"
})
public class FIToFIPmtStsRpt {

    @JsonProperty("GrpHdr")
    private response.GrpHdr GrpHdr;
    @JsonProperty("OrgnlGrpInfAndSts")
    private response.OrgnlGrpInfAndSts OrgnlGrpInfAndSts;
    @JsonProperty("TxInfAndSts")
    private response.TxInfAndSts TxInfAndSts;

    /**
     * 
     * @return
     *     The GrpHdr
     */
    @JsonProperty("GrpHdr")
    public response.GrpHdr getGrpHdr() {
        return GrpHdr;
    }

    /**
     * 
     * @param GrpHdr
     *     The GrpHdr
     */
    @JsonProperty("GrpHdr")
    public void setGrpHdr(response.GrpHdr GrpHdr) {
        this.GrpHdr = GrpHdr;
    }

    /**
     * 
     * @return
     *     The OrgnlGrpInfAndSts
     */
    @JsonProperty("OrgnlGrpInfAndSts")
    public response.OrgnlGrpInfAndSts getOrgnlGrpInfAndSts() {
        return OrgnlGrpInfAndSts;
    }

    /**
     * 
     * @param OrgnlGrpInfAndSts
     *     The OrgnlGrpInfAndSts
     */
    @JsonProperty("OrgnlGrpInfAndSts")
    public void setOrgnlGrpInfAndSts(response.OrgnlGrpInfAndSts OrgnlGrpInfAndSts) {
        this.OrgnlGrpInfAndSts = OrgnlGrpInfAndSts;
    }

    /**
     * 
     * @return
     *     The TxInfAndSts
     */
    @JsonProperty("TxInfAndSts")
    public response.TxInfAndSts getTxInfAndSts() {
        return TxInfAndSts;
    }

    /**
     * 
     * @param TxInfAndSts
     *     The TxInfAndSts
     */
    @JsonProperty("TxInfAndSts")
    public void setTxInfAndSts(response.TxInfAndSts TxInfAndSts) {
        this.TxInfAndSts = TxInfAndSts;
    }

}
