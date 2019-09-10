
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
public class CdtrAcct {

    @JsonProperty("Id")
    private Id_ Id;
    @JsonProperty("Tp")
    private Tp_ Tp;

    /**
     * 
     * @return
     *     The Id
     */
    @JsonProperty("Id")
    public Id_ getId() {
        return Id;
    }

    /**
     * 
     * @param Id
     *     The Id
     */
    @JsonProperty("Id")
    public void setId(Id_ Id) {
        this.Id = Id;
    }

    /**
     * 
     * @return
     *     The Tp
     */
    @JsonProperty("Tp")
    public Tp_ getTp() {
        return Tp;
    }

    /**
     * 
     * @param Tp
     *     The Tp
     */
    @JsonProperty("Tp")
    public void setTp(Tp_ Tp) {
        this.Tp = Tp;
    }

}
