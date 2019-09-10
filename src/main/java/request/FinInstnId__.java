
package request;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "PstlAdr",
    "Othr"
})
public class FinInstnId__ {

    @JsonProperty("PstlAdr")
    private request.PstlAdr PstlAdr;
    @JsonProperty("Othr")
    private Othr__ Othr;

    /**
     * 
     * @return
     *     The PstlAdr
     */
    @JsonProperty("PstlAdr")
    public request.PstlAdr getPstlAdr() {
        return PstlAdr;
    }

    /**
     * 
     * @param PstlAdr
     *     The PstlAdr
     */
    @JsonProperty("PstlAdr")
    public void setPstlAdr(request.PstlAdr PstlAdr) {
        this.PstlAdr = PstlAdr;
    }

    /**
     * 
     * @return
     *     The Othr
     */
    @JsonProperty("Othr")
    public Othr__ getOthr() {
        return Othr;
    }

    /**
     * 
     * @param Othr
     *     The Othr
     */
    @JsonProperty("Othr")
    public void setOthr(Othr__ Othr) {
        this.Othr = Othr;
    }

}
