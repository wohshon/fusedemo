
package request;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "RsdntSts",
    "PrdTp",
    "ShariaCmpl",
    "Dtls"
})
public class InstrForDbtrAcct {

    @JsonProperty("RsdntSts")
    private String RsdntSts;
    @JsonProperty("PrdTp")
    private String PrdTp;
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
     *     The PrdTp
     */
    @JsonProperty("PrdTp")
    public String getPrdTp() {
        return PrdTp;
    }

    /**
     * 
     * @param PrdTp
     *     The PrdTp
     */
    @JsonProperty("PrdTp")
    public void setPrdTp(String PrdTp) {
        this.PrdTp = PrdTp;
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
