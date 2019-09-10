
package request;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "PmtId",
    "PmtTpInf",
    "IntrBkSttlmAmt",
    "ChrgBr",
    "InstgAgt",
    "Dbtr",
    "DbtrAcct",
    "DbtrAgt",
    "CdtrAgt",
    "Cdtr",
    "CdtrAcct",
    "SplmtryData"
})
public class CdtTrfTxInf {

    @JsonProperty("PmtId")
    private request.PmtId PmtId;
    @JsonProperty("PmtTpInf")
    private request.PmtTpInf PmtTpInf;
    @JsonProperty("IntrBkSttlmAmt")
    private request.IntrBkSttlmAmt IntrBkSttlmAmt;
    @JsonProperty("ChrgBr")
    private String ChrgBr;
    @JsonProperty("InstgAgt")
    private request.InstgAgt InstgAgt;
    @JsonProperty("Dbtr")
    private request.Dbtr Dbtr;
    @JsonProperty("DbtrAcct")
    private request.DbtrAcct DbtrAcct;
    @JsonProperty("DbtrAgt")
    private request.DbtrAgt DbtrAgt;
    @JsonProperty("CdtrAgt")
    private request.CdtrAgt CdtrAgt;
    @JsonProperty("Cdtr")
    private request.Cdtr Cdtr;
    @JsonProperty("CdtrAcct")
    private request.CdtrAcct CdtrAcct;
    @JsonProperty("SplmtryData")
    private request.SplmtryData SplmtryData;

    /**
     * 
     * @return
     *     The PmtId
     */
    @JsonProperty("PmtId")
    public request.PmtId getPmtId() {
        return PmtId;
    }

    /**
     * 
     * @param PmtId
     *     The PmtId
     */
    @JsonProperty("PmtId")
    public void setPmtId(request.PmtId PmtId) {
        this.PmtId = PmtId;
    }

    /**
     * 
     * @return
     *     The PmtTpInf
     */
    @JsonProperty("PmtTpInf")
    public request.PmtTpInf getPmtTpInf() {
        return PmtTpInf;
    }

    /**
     * 
     * @param PmtTpInf
     *     The PmtTpInf
     */
    @JsonProperty("PmtTpInf")
    public void setPmtTpInf(request.PmtTpInf PmtTpInf) {
        this.PmtTpInf = PmtTpInf;
    }

    /**
     * 
     * @return
     *     The IntrBkSttlmAmt
     */
    @JsonProperty("IntrBkSttlmAmt")
    public request.IntrBkSttlmAmt getIntrBkSttlmAmt() {
        return IntrBkSttlmAmt;
    }

    /**
     * 
     * @param IntrBkSttlmAmt
     *     The IntrBkSttlmAmt
     */
    @JsonProperty("IntrBkSttlmAmt")
    public void setIntrBkSttlmAmt(request.IntrBkSttlmAmt IntrBkSttlmAmt) {
        this.IntrBkSttlmAmt = IntrBkSttlmAmt;
    }

    /**
     * 
     * @return
     *     The ChrgBr
     */
    @JsonProperty("ChrgBr")
    public String getChrgBr() {
        return ChrgBr;
    }

    /**
     * 
     * @param ChrgBr
     *     The ChrgBr
     */
    @JsonProperty("ChrgBr")
    public void setChrgBr(String ChrgBr) {
        this.ChrgBr = ChrgBr;
    }

    /**
     * 
     * @return
     *     The InstgAgt
     */
    @JsonProperty("InstgAgt")
    public request.InstgAgt getInstgAgt() {
        return InstgAgt;
    }

    /**
     * 
     * @param InstgAgt
     *     The InstgAgt
     */
    @JsonProperty("InstgAgt")
    public void setInstgAgt(request.InstgAgt InstgAgt) {
        this.InstgAgt = InstgAgt;
    }

    /**
     * 
     * @return
     *     The Dbtr
     */
    @JsonProperty("Dbtr")
    public request.Dbtr getDbtr() {
        return Dbtr;
    }

    /**
     * 
     * @param Dbtr
     *     The Dbtr
     */
    @JsonProperty("Dbtr")
    public void setDbtr(request.Dbtr Dbtr) {
        this.Dbtr = Dbtr;
    }

    /**
     * 
     * @return
     *     The DbtrAcct
     */
    @JsonProperty("DbtrAcct")
    public request.DbtrAcct getDbtrAcct() {
        return DbtrAcct;
    }

    /**
     * 
     * @param DbtrAcct
     *     The DbtrAcct
     */
    @JsonProperty("DbtrAcct")
    public void setDbtrAcct(request.DbtrAcct DbtrAcct) {
        this.DbtrAcct = DbtrAcct;
    }

    /**
     * 
     * @return
     *     The DbtrAgt
     */
    @JsonProperty("DbtrAgt")
    public request.DbtrAgt getDbtrAgt() {
        return DbtrAgt;
    }

    /**
     * 
     * @param DbtrAgt
     *     The DbtrAgt
     */
    @JsonProperty("DbtrAgt")
    public void setDbtrAgt(request.DbtrAgt DbtrAgt) {
        this.DbtrAgt = DbtrAgt;
    }

    /**
     * 
     * @return
     *     The CdtrAgt
     */
    @JsonProperty("CdtrAgt")
    public request.CdtrAgt getCdtrAgt() {
        return CdtrAgt;
    }

    /**
     * 
     * @param CdtrAgt
     *     The CdtrAgt
     */
    @JsonProperty("CdtrAgt")
    public void setCdtrAgt(request.CdtrAgt CdtrAgt) {
        this.CdtrAgt = CdtrAgt;
    }

    /**
     * 
     * @return
     *     The Cdtr
     */
    @JsonProperty("Cdtr")
    public request.Cdtr getCdtr() {
        return Cdtr;
    }

    /**
     * 
     * @param Cdtr
     *     The Cdtr
     */
    @JsonProperty("Cdtr")
    public void setCdtr(request.Cdtr Cdtr) {
        this.Cdtr = Cdtr;
    }

    /**
     * 
     * @return
     *     The CdtrAcct
     */
    @JsonProperty("CdtrAcct")
    public request.CdtrAcct getCdtrAcct() {
        return CdtrAcct;
    }

    /**
     * 
     * @param CdtrAcct
     *     The CdtrAcct
     */
    @JsonProperty("CdtrAcct")
    public void setCdtrAcct(request.CdtrAcct CdtrAcct) {
        this.CdtrAcct = CdtrAcct;
    }

    /**
     * 
     * @return
     *     The SplmtryData
     */
    @JsonProperty("SplmtryData")
    public request.SplmtryData getSplmtryData() {
        return SplmtryData;
    }

    /**
     * 
     * @param SplmtryData
     *     The SplmtryData
     */
    @JsonProperty("SplmtryData")
    public void setSplmtryData(request.SplmtryData SplmtryData) {
        this.SplmtryData = SplmtryData;
    }

}
