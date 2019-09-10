
package response;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "IntrBkSttlmDt",
    "Cdtr",
    "CdtrAcct"
})
public class OrgnlTxRef {

    @JsonProperty("IntrBkSttlmDt")
    private String IntrBkSttlmDt;
    @JsonProperty("Cdtr")
    private response.Cdtr Cdtr;
    @JsonProperty("CdtrAcct")
    private response.CdtrAcct CdtrAcct;

    /**
     * 
     * @return
     *     The IntrBkSttlmDt
     */
    @JsonProperty("IntrBkSttlmDt")
    public String getIntrBkSttlmDt() {
        return IntrBkSttlmDt;
    }

    /**
     * 
     * @param IntrBkSttlmDt
     *     The IntrBkSttlmDt
     */
    @JsonProperty("IntrBkSttlmDt")
    public void setIntrBkSttlmDt(String IntrBkSttlmDt) {
        this.IntrBkSttlmDt = IntrBkSttlmDt;
    }

    /**
     * 
     * @return
     *     The Cdtr
     */
    @JsonProperty("Cdtr")
    public response.Cdtr getCdtr() {
        return Cdtr;
    }

    /**
     * 
     * @param Cdtr
     *     The Cdtr
     */
    @JsonProperty("Cdtr")
    public void setCdtr(response.Cdtr Cdtr) {
        this.Cdtr = Cdtr;
    }

    /**
     * 
     * @return
     *     The CdtrAcct
     */
    @JsonProperty("CdtrAcct")
    public response.CdtrAcct getCdtrAcct() {
        return CdtrAcct;
    }

    /**
     * 
     * @param CdtrAcct
     *     The CdtrAcct
     */
    @JsonProperty("CdtrAcct")
    public void setCdtrAcct(response.CdtrAcct CdtrAcct) {
        this.CdtrAcct = CdtrAcct;
    }

}
