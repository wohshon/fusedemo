
package response;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "PlcAndNm",
    "Envlp"
})
public class SplmtryData {

    @JsonProperty("PlcAndNm")
    private String PlcAndNm;
    @JsonProperty("Envlp")
    private response.Envlp Envlp;

    /**
     * 
     * @return
     *     The PlcAndNm
     */
    @JsonProperty("PlcAndNm")
    public String getPlcAndNm() {
        return PlcAndNm;
    }

    /**
     * 
     * @param PlcAndNm
     *     The PlcAndNm
     */
    @JsonProperty("PlcAndNm")
    public void setPlcAndNm(String PlcAndNm) {
        this.PlcAndNm = PlcAndNm;
    }

    /**
     * 
     * @return
     *     The Envlp
     */
    @JsonProperty("Envlp")
    public response.Envlp getEnvlp() {
        return Envlp;
    }

    /**
     * 
     * @param Envlp
     *     The Envlp
     */
    @JsonProperty("Envlp")
    public void setEnvlp(response.Envlp Envlp) {
        this.Envlp = Envlp;
    }

}
