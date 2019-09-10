
package request;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "Othr"
})
public class FinInstnId___ {

    @JsonProperty("Othr")
    private Othr____ Othr;

    /**
     * 
     * @return
     *     The Othr
     */
    @JsonProperty("Othr")
    public Othr____ getOthr() {
        return Othr;
    }

    /**
     * 
     * @param Othr
     *     The Othr
     */
    @JsonProperty("Othr")
    public void setOthr(Othr____ Othr) {
        this.Othr = Othr;
    }

}
