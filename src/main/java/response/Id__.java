
package response;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "Othr",
    "__prefix"
})
public class Id__ {

    @JsonProperty("Othr")
    private Othr__ Othr;
    @JsonProperty("__prefix")
    private String Prefix;

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

    /**
     * 
     * @return
     *     The Prefix
     */
    @JsonProperty("__prefix")
    public String getPrefix() {
        return Prefix;
    }

    /**
     * 
     * @param Prefix
     *     The __prefix
     */
    @JsonProperty("__prefix")
    public void setPrefix(String Prefix) {
        this.Prefix = Prefix;
    }

}
