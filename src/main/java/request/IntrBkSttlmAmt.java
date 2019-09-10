
package request;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "_Ccy",
    "__text"
})
public class IntrBkSttlmAmt {

    @JsonProperty("_Ccy")
    private String Ccy;
    @JsonProperty("__text")
    private String Text;

    /**
     * 
     * @return
     *     The Ccy
     */
    @JsonProperty("_Ccy")
    public String getCcy() {
        return Ccy;
    }

    /**
     * 
     * @param Ccy
     *     The _Ccy
     */
    @JsonProperty("_Ccy")
    public void setCcy(String Ccy) {
        this.Ccy = Ccy;
    }

    /**
     * 
     * @return
     *     The Text
     */
    @JsonProperty("__text")
    public String getText() {
        return Text;
    }

    /**
     * 
     * @param Text
     *     The __text
     */
    @JsonProperty("__text")
    public void setText(String Text) {
        this.Text = Text;
    }

}
