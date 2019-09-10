
package request;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "Nm"
})
public class Dbtr {

    @JsonProperty("Nm")
    private String Nm;

    /**
     * 
     * @return
     *     The Nm
     */
    @JsonProperty("Nm")
    public String getNm() {
        return Nm;
    }

    /**
     * 
     * @param Nm
     *     The Nm
     */
    @JsonProperty("Nm")
    public void setNm(String Nm) {
        this.Nm = Nm;
    }

}
