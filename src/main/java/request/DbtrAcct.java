
package request;

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
public class DbtrAcct {

    @JsonProperty("Id")
    private request.Id Id;
    @JsonProperty("Tp")
    private request.Tp Tp;

    /**
     * 
     * @return
     *     The Id
     */
    @JsonProperty("Id")
    public request.Id getId() {
        return Id;
    }

    /**
     * 
     * @param Id
     *     The Id
     */
    @JsonProperty("Id")
    public void setId(request.Id Id) {
        this.Id = Id;
    }

    /**
     * 
     * @return
     *     The Tp
     */
    @JsonProperty("Tp")
    public request.Tp getTp() {
        return Tp;
    }

    /**
     * 
     * @param Tp
     *     The Tp
     */
    @JsonProperty("Tp")
    public void setTp(request.Tp Tp) {
        this.Tp = Tp;
    }

}
