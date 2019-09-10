
package response;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "Othr"
})
public class Id {

    @JsonProperty("Othr")
    private Othr__ Othr;

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
