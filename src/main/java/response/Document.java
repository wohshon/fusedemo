
package response;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "FIToFIPmtStsRpt"
})
public class Document {

    @JsonProperty("FIToFIPmtStsRpt")
    private response.FIToFIPmtStsRpt FIToFIPmtStsRpt;

    /**
     * 
     * @return
     *     The FIToFIPmtStsRpt
     */
    @JsonProperty("FIToFIPmtStsRpt")
    public response.FIToFIPmtStsRpt getFIToFIPmtStsRpt() {
        return FIToFIPmtStsRpt;
    }

    /**
     * 
     * @param FIToFIPmtStsRpt
     *     The FIToFIPmtStsRpt
     */
    @JsonProperty("FIToFIPmtStsRpt")
    public void setFIToFIPmtStsRpt(response.FIToFIPmtStsRpt FIToFIPmtStsRpt) {
        this.FIToFIPmtStsRpt = FIToFIPmtStsRpt;
    }

}
