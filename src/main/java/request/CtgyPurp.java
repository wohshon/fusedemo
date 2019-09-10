
package request;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "Prtry"
})
public class CtgyPurp {

    @JsonProperty("Prtry")
    private String Prtry;

    /**
     * 
     * @return
     *     The Prtry
     */
    @JsonProperty("Prtry")
    public String getPrtry() {
        return Prtry;
    }

    /**
     * 
     * @param Prtry
     *     The Prtry
     */
    @JsonProperty("Prtry")
    public void setPrtry(String Prtry) {
        this.Prtry = Prtry;
    }

}
