
package response;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "Id",
    "Tp"
})
public class CdtrAcct {

    @JsonProperty("Id")
    private response.Id Id;
    @JsonProperty("Tp")
    private response.Tp Tp;

    /**
     * 
     * @return
     *     The Id
     */
    @JsonProperty("Id")
    public response.Id getId() {
        return Id;
    }

    /**
     * 
     * @param Id
     *     The Id
     */
    @JsonProperty("Id")
    public void setId(response.Id Id) {
        this.Id = Id;
    }

    /**
     * 
     * @return
     *     The Tp
     */
    @JsonProperty("Tp")
    public response.Tp getTp() {
        return Tp;
    }

    /**
     * 
     * @param Tp
     *     The Tp
     */
    @JsonProperty("Tp")
    public void setTp(response.Tp Tp) {
        this.Tp = Tp;
    }

}
