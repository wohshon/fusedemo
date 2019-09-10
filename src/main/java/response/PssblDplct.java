
package response;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "__prefix",
    "__text"
})
public class PssblDplct {

    @JsonProperty("__prefix")
    private String Prefix;
    @JsonProperty("__text")
    private String Text;

    /**
     * 
     * @return
     *     The Prefix
     */
    @JsonProperty("__prefix")
    public String getPrefix() {
        return Prefix;
    }

    /**
     * 
     * @param Prefix
     *     The __prefix
     */
    @JsonProperty("__prefix")
    public void setPrefix(String Prefix) {
        this.Prefix = Prefix;
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
