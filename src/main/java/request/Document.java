
package request;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "FIToFICstmrCdtTrf"
})
public class Document {

    @JsonProperty("FIToFICstmrCdtTrf")
    private request.FIToFICstmrCdtTrf FIToFICstmrCdtTrf;

    /**
     * 
     * @return
     *     The FIToFICstmrCdtTrf
     */
    @JsonProperty("FIToFICstmrCdtTrf")
    public request.FIToFICstmrCdtTrf getFIToFICstmrCdtTrf() {
        return FIToFICstmrCdtTrf;
    }

    /**
     * 
     * @param FIToFICstmrCdtTrf
     *     The FIToFICstmrCdtTrf
     */
    @JsonProperty("FIToFICstmrCdtTrf")
    public void setFIToFICstmrCdtTrf(request.FIToFICstmrCdtTrf FIToFICstmrCdtTrf) {
        this.FIToFICstmrCdtTrf = FIToFICstmrCdtTrf;
    }

}
