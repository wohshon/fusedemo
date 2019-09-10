
package request;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "RecptRef",
    "PaymntDesc",
    "ScndValInd",
    "IdTp",
    "Id"
})
public class InstrForCdtrAgt {

    @JsonProperty("RecptRef")
    private String RecptRef;
    @JsonProperty("PaymntDesc")
    private String PaymntDesc;
    @JsonProperty("ScndValInd")
    private String ScndValInd;
    @JsonProperty("IdTp")
    private String IdTp;
    @JsonProperty("Id")
    private String Id;

    /**
     * 
     * @return
     *     The RecptRef
     */
    @JsonProperty("RecptRef")
    public String getRecptRef() {
        return RecptRef;
    }

    /**
     * 
     * @param RecptRef
     *     The RecptRef
     */
    @JsonProperty("RecptRef")
    public void setRecptRef(String RecptRef) {
        this.RecptRef = RecptRef;
    }

    /**
     * 
     * @return
     *     The PaymntDesc
     */
    @JsonProperty("PaymntDesc")
    public String getPaymntDesc() {
        return PaymntDesc;
    }

    /**
     * 
     * @param PaymntDesc
     *     The PaymntDesc
     */
    @JsonProperty("PaymntDesc")
    public void setPaymntDesc(String PaymntDesc) {
        this.PaymntDesc = PaymntDesc;
    }

    /**
     * 
     * @return
     *     The ScndValInd
     */
    @JsonProperty("ScndValInd")
    public String getScndValInd() {
        return ScndValInd;
    }

    /**
     * 
     * @param ScndValInd
     *     The ScndValInd
     */
    @JsonProperty("ScndValInd")
    public void setScndValInd(String ScndValInd) {
        this.ScndValInd = ScndValInd;
    }

    /**
     * 
     * @return
     *     The IdTp
     */
    @JsonProperty("IdTp")
    public String getIdTp() {
        return IdTp;
    }

    /**
     * 
     * @param IdTp
     *     The IdTp
     */
    @JsonProperty("IdTp")
    public void setIdTp(String IdTp) {
        this.IdTp = IdTp;
    }

    /**
     * 
     * @return
     *     The Id
     */
    @JsonProperty("Id")
    public String getId() {
        return Id;
    }

    /**
     * 
     * @param Id
     *     The Id
     */
    @JsonProperty("Id")
    public void setId(String Id) {
        this.Id = Id;
    }

}
