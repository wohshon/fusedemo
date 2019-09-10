
package response;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "Rsn"
})
public class StsRsnInf {

    @JsonProperty("Rsn")
    private response.Rsn Rsn;

    /**
     * 
     * @return
     *     The Rsn
     */
    @JsonProperty("Rsn")
    public response.Rsn getRsn() {
        return Rsn;
    }

    /**
     * 
     * @param Rsn
     *     The Rsn
     */
    @JsonProperty("Rsn")
    public void setRsn(response.Rsn Rsn) {
        this.Rsn = Rsn;
    }

}
