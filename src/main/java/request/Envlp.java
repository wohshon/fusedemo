
package request;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "InstrForCdtrAgt",
    "InstrForDbtrAcct",
    "Dbtr",
    "CdtTrfTxInf",
    "PrxyLkUpRef"
})
public class Envlp {

    @JsonProperty("InstrForCdtrAgt")
    private request.InstrForCdtrAgt InstrForCdtrAgt;
    @JsonProperty("InstrForDbtrAcct")
    private request.InstrForDbtrAcct InstrForDbtrAcct;
    @JsonProperty("Dbtr")
    private Dbtr_ Dbtr;
    @JsonProperty("CdtTrfTxInf")
    private CdtTrfTxInf_ CdtTrfTxInf;
    @JsonProperty("PrxyLkUpRef")
    private String PrxyLkUpRef;

    /**
     * 
     * @return
     *     The InstrForCdtrAgt
     */
    @JsonProperty("InstrForCdtrAgt")
    public request.InstrForCdtrAgt getInstrForCdtrAgt() {
        return InstrForCdtrAgt;
    }

    /**
     * 
     * @param InstrForCdtrAgt
     *     The InstrForCdtrAgt
     */
    @JsonProperty("InstrForCdtrAgt")
    public void setInstrForCdtrAgt(request.InstrForCdtrAgt InstrForCdtrAgt) {
        this.InstrForCdtrAgt = InstrForCdtrAgt;
    }

    /**
     * 
     * @return
     *     The InstrForDbtrAcct
     */
    @JsonProperty("InstrForDbtrAcct")
    public request.InstrForDbtrAcct getInstrForDbtrAcct() {
        return InstrForDbtrAcct;
    }

    /**
     * 
     * @param InstrForDbtrAcct
     *     The InstrForDbtrAcct
     */
    @JsonProperty("InstrForDbtrAcct")
    public void setInstrForDbtrAcct(request.InstrForDbtrAcct InstrForDbtrAcct) {
        this.InstrForDbtrAcct = InstrForDbtrAcct;
    }

    /**
     * 
     * @return
     *     The Dbtr
     */
    @JsonProperty("Dbtr")
    public Dbtr_ getDbtr() {
        return Dbtr;
    }

    /**
     * 
     * @param Dbtr
     *     The Dbtr
     */
    @JsonProperty("Dbtr")
    public void setDbtr(Dbtr_ Dbtr) {
        this.Dbtr = Dbtr;
    }

    /**
     * 
     * @return
     *     The CdtTrfTxInf
     */
    @JsonProperty("CdtTrfTxInf")
    public CdtTrfTxInf_ getCdtTrfTxInf() {
        return CdtTrfTxInf;
    }

    /**
     * 
     * @param CdtTrfTxInf
     *     The CdtTrfTxInf
     */
    @JsonProperty("CdtTrfTxInf")
    public void setCdtTrfTxInf(CdtTrfTxInf_ CdtTrfTxInf) {
        this.CdtTrfTxInf = CdtTrfTxInf;
    }

    /**
     * 
     * @return
     *     The PrxyLkUpRef
     */
    @JsonProperty("PrxyLkUpRef")
    public String getPrxyLkUpRef() {
        return PrxyLkUpRef;
    }

    /**
     * 
     * @param PrxyLkUpRef
     *     The PrxyLkUpRef
     */
    @JsonProperty("PrxyLkUpRef")
    public void setPrxyLkUpRef(String PrxyLkUpRef) {
        this.PrxyLkUpRef = PrxyLkUpRef;
    }

}
