
package request;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "CtgyPurp"
})
public class PmtTpInf {

    @JsonProperty("CtgyPurp")
    private request.CtgyPurp CtgyPurp;

    /**
     * 
     * @return
     *     The CtgyPurp
     */
    @JsonProperty("CtgyPurp")
    public request.CtgyPurp getCtgyPurp() {
        return CtgyPurp;
    }

    /**
     * 
     * @param CtgyPurp
     *     The CtgyPurp
     */
    @JsonProperty("CtgyPurp")
    public void setCtgyPurp(request.CtgyPurp CtgyPurp) {
        this.CtgyPurp = CtgyPurp;
    }

}
