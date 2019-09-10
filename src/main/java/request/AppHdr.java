
package request;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "Fr",
    "To",
    "BizMsgIdr",
    "MsgDefIdr",
    "BizSvc",
    "CreDt",
    "PssblDplct"
})
public class AppHdr {

    @JsonProperty("Fr")
    private request.Fr Fr;
    @JsonProperty("To")
    private request.To To;
    @JsonProperty("BizMsgIdr")
    private String BizMsgIdr;
    @JsonProperty("MsgDefIdr")
    private String MsgDefIdr;
    @JsonProperty("BizSvc")
    private String BizSvc;
    @JsonProperty("CreDt")
    private String CreDt;
    @JsonProperty("PssblDplct")
    private String PssblDplct;

    /**
     * 
     * @return
     *     The Fr
     */
    @JsonProperty("Fr")
    public request.Fr getFr() {
        return Fr;
    }

    /**
     * 
     * @param Fr
     *     The Fr
     */
    @JsonProperty("Fr")
    public void setFr(request.Fr Fr) {
        this.Fr = Fr;
    }

    /**
     * 
     * @return
     *     The To
     */
    @JsonProperty("To")
    public request.To getTo() {
        return To;
    }

    /**
     * 
     * @param To
     *     The To
     */
    @JsonProperty("To")
    public void setTo(request.To To) {
        this.To = To;
    }

    /**
     * 
     * @return
     *     The BizMsgIdr
     */
    @JsonProperty("BizMsgIdr")
    public String getBizMsgIdr() {
        return BizMsgIdr;
    }

    /**
     * 
     * @param BizMsgIdr
     *     The BizMsgIdr
     */
    @JsonProperty("BizMsgIdr")
    public void setBizMsgIdr(String BizMsgIdr) {
        this.BizMsgIdr = BizMsgIdr;
    }

    /**
     * 
     * @return
     *     The MsgDefIdr
     */
    @JsonProperty("MsgDefIdr")
    public String getMsgDefIdr() {
        return MsgDefIdr;
    }

    /**
     * 
     * @param MsgDefIdr
     *     The MsgDefIdr
     */
    @JsonProperty("MsgDefIdr")
    public void setMsgDefIdr(String MsgDefIdr) {
        this.MsgDefIdr = MsgDefIdr;
    }

    /**
     * 
     * @return
     *     The BizSvc
     */
    @JsonProperty("BizSvc")
    public String getBizSvc() {
        return BizSvc;
    }

    /**
     * 
     * @param BizSvc
     *     The BizSvc
     */
    @JsonProperty("BizSvc")
    public void setBizSvc(String BizSvc) {
        this.BizSvc = BizSvc;
    }

    /**
     * 
     * @return
     *     The CreDt
     */
    @JsonProperty("CreDt")
    public String getCreDt() {
        return CreDt;
    }

    /**
     * 
     * @param CreDt
     *     The CreDt
     */
    @JsonProperty("CreDt")
    public void setCreDt(String CreDt) {
        this.CreDt = CreDt;
    }

    /**
     * 
     * @return
     *     The PssblDplct
     */
    @JsonProperty("PssblDplct")
    public String getPssblDplct() {
        return PssblDplct;
    }

    /**
     * 
     * @param PssblDplct
     *     The PssblDplct
     */
    @JsonProperty("PssblDplct")
    public void setPssblDplct(String PssblDplct) {
        this.PssblDplct = PssblDplct;
    }

}
