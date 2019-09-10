
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
public class Id_ {

    @JsonProperty("Othr")
    private Othr______ Othr;

    /**
     * 
     * @return
     *     The Othr
     */
    @JsonProperty("Othr")
    public Othr______ getOthr() {
        return Othr;
    }

    /**
     * 
     * @param Othr
     *     The Othr
     */
    @JsonProperty("Othr")
    public void setOthr(Othr______ Othr) {
        this.Othr = Othr;
    }

}
