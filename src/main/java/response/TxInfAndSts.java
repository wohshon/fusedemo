
package response;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "OrgnlEndToEndId",
    "OrgnlTxId",
    "TxSts",
    "StsRsnInf",
    "ClrSysRef",
    "OrgnlTxRef",
    "SplmtryData"
})
public class TxInfAndSts {

    @JsonProperty("OrgnlEndToEndId")
    private String OrgnlEndToEndId;
    @JsonProperty("OrgnlTxId")
    private String OrgnlTxId;
    @JsonProperty("TxSts")
    private String TxSts;
    @JsonProperty("StsRsnInf")
    private response.StsRsnInf StsRsnInf;
    @JsonProperty("ClrSysRef")
    private String ClrSysRef;
    @JsonProperty("OrgnlTxRef")
    private response.OrgnlTxRef OrgnlTxRef;
    @JsonProperty("SplmtryData")
    private response.SplmtryData SplmtryData;

    /**
     * 
     * @return
     *     The OrgnlEndToEndId
     */
    @JsonProperty("OrgnlEndToEndId")
    public String getOrgnlEndToEndId() {
        return OrgnlEndToEndId;
    }

    /**
     * 
     * @param OrgnlEndToEndId
     *     The OrgnlEndToEndId
     */
    @JsonProperty("OrgnlEndToEndId")
    public void setOrgnlEndToEndId(String OrgnlEndToEndId) {
        this.OrgnlEndToEndId = OrgnlEndToEndId;
    }

    /**
     * 
     * @return
     *     The OrgnlTxId
     */
    @JsonProperty("OrgnlTxId")
    public String getOrgnlTxId() {
        return OrgnlTxId;
    }

    /**
     * 
     * @param OrgnlTxId
     *     The OrgnlTxId
     */
    @JsonProperty("OrgnlTxId")
    public void setOrgnlTxId(String OrgnlTxId) {
        this.OrgnlTxId = OrgnlTxId;
    }

    /**
     * 
     * @return
     *     The TxSts
     */
    @JsonProperty("TxSts")
    public String getTxSts() {
        return TxSts;
    }

    /**
     * 
     * @param TxSts
     *     The TxSts
     */
    @JsonProperty("TxSts")
    public void setTxSts(String TxSts) {
        this.TxSts = TxSts;
    }

    /**
     * 
     * @return
     *     The StsRsnInf
     */
    @JsonProperty("StsRsnInf")
    public response.StsRsnInf getStsRsnInf() {
        return StsRsnInf;
    }

    /**
     * 
     * @param StsRsnInf
     *     The StsRsnInf
     */
    @JsonProperty("StsRsnInf")
    public void setStsRsnInf(response.StsRsnInf StsRsnInf) {
        this.StsRsnInf = StsRsnInf;
    }

    /**
     * 
     * @return
     *     The ClrSysRef
     */
    @JsonProperty("ClrSysRef")
    public String getClrSysRef() {
        return ClrSysRef;
    }

    /**
     * 
     * @param ClrSysRef
     *     The ClrSysRef
     */
    @JsonProperty("ClrSysRef")
    public void setClrSysRef(String ClrSysRef) {
        this.ClrSysRef = ClrSysRef;
    }

    /**
     * 
     * @return
     *     The OrgnlTxRef
     */
    @JsonProperty("OrgnlTxRef")
    public response.OrgnlTxRef getOrgnlTxRef() {
        return OrgnlTxRef;
    }

    /**
     * 
     * @param OrgnlTxRef
     *     The OrgnlTxRef
     */
    @JsonProperty("OrgnlTxRef")
    public void setOrgnlTxRef(response.OrgnlTxRef OrgnlTxRef) {
        this.OrgnlTxRef = OrgnlTxRef;
    }

    /**
     * 
     * @return
     *     The SplmtryData
     */
    @JsonProperty("SplmtryData")
    public response.SplmtryData getSplmtryData() {
        return SplmtryData;
    }

    /**
     * 
     * @param SplmtryData
     *     The SplmtryData
     */
    @JsonProperty("SplmtryData")
    public void setSplmtryData(response.SplmtryData SplmtryData) {
        this.SplmtryData = SplmtryData;
    }

}
