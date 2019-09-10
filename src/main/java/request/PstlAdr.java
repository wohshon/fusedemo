
package request;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "StrtNm",
    "TwnNm",
    "CtrySubDvsn",
    "Ctry"
})
public class PstlAdr {

    @JsonProperty("StrtNm")
    private String StrtNm;
    @JsonProperty("TwnNm")
    private String TwnNm;
    @JsonProperty("CtrySubDvsn")
    private String CtrySubDvsn;
    @JsonProperty("Ctry")
    private String Ctry;

    /**
     * 
     * @return
     *     The StrtNm
     */
    @JsonProperty("StrtNm")
    public String getStrtNm() {
        return StrtNm;
    }

    /**
     * 
     * @param StrtNm
     *     The StrtNm
     */
    @JsonProperty("StrtNm")
    public void setStrtNm(String StrtNm) {
        this.StrtNm = StrtNm;
    }

    /**
     * 
     * @return
     *     The TwnNm
     */
    @JsonProperty("TwnNm")
    public String getTwnNm() {
        return TwnNm;
    }

    /**
     * 
     * @param TwnNm
     *     The TwnNm
     */
    @JsonProperty("TwnNm")
    public void setTwnNm(String TwnNm) {
        this.TwnNm = TwnNm;
    }

    /**
     * 
     * @return
     *     The CtrySubDvsn
     */
    @JsonProperty("CtrySubDvsn")
    public String getCtrySubDvsn() {
        return CtrySubDvsn;
    }

    /**
     * 
     * @param CtrySubDvsn
     *     The CtrySubDvsn
     */
    @JsonProperty("CtrySubDvsn")
    public void setCtrySubDvsn(String CtrySubDvsn) {
        this.CtrySubDvsn = CtrySubDvsn;
    }

    /**
     * 
     * @return
     *     The Ctry
     */
    @JsonProperty("Ctry")
    public String getCtry() {
        return Ctry;
    }

    /**
     * 
     * @param Ctry
     *     The Ctry
     */
    @JsonProperty("Ctry")
    public void setCtry(String Ctry) {
        this.Ctry = Ctry;
    }

}
