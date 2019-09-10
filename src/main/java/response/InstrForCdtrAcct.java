
package response;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "RsdntSts",
    "ShariaCmpl",
    "Dtls"
})
public class InstrForCdtrAcct {

    @JsonProperty("RsdntSts")
    private String RsdntSts;
    @JsonProperty("ShariaCmpl")
    private String ShariaCmpl;
    @JsonProperty("Dtls")
    private String Dtls;

    /**
     * 
     * @return
     *     The RsdntSts
     */
    @JsonProperty("RsdntSts")
    public String getRsdntSts() {
        return RsdntSts;
    }

    /**
     * 
     * @param RsdntSts
     *     The RsdntSts
     */
    @JsonProperty("RsdntSts")
    public void setRsdntSts(String RsdntSts) {
        this.RsdntSts = RsdntSts;
    }

    /**
     * 
     * @return
     *     The ShariaCmpl
     */
    @JsonProperty("ShariaCmpl")
    public String getShariaCmpl() {
        return ShariaCmpl;
    }

    /**
     * 
     * @param ShariaCmpl
     *     The ShariaCmpl
     */
    @JsonProperty("ShariaCmpl")
    public void setShariaCmpl(String ShariaCmpl) {
        this.ShariaCmpl = ShariaCmpl;
    }

    /**
     * 
     * @return
     *     The Dtls
     */
    @JsonProperty("Dtls")
    public String getDtls() {
        return Dtls;
    }

    /**
     * 
     * @param Dtls
     *     The Dtls
     */
    @JsonProperty("Dtls")
    public void setDtls(String Dtls) {
        this.Dtls = Dtls;
    }

}
