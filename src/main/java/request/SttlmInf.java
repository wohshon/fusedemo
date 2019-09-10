
package request;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "SttlmMtd"
})
public class SttlmInf {

    @JsonProperty("SttlmMtd")
    private String SttlmMtd;

    /**
     * 
     * @return
     *     The SttlmMtd
     */
    @JsonProperty("SttlmMtd")
    public String getSttlmMtd() {
        return SttlmMtd;
    }

    /**
     * 
     * @param SttlmMtd
     *     The SttlmMtd
     */
    @JsonProperty("SttlmMtd")
    public void setSttlmMtd(String SttlmMtd) {
        this.SttlmMtd = SttlmMtd;
    }

}
