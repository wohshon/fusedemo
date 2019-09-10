
package request;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "BusMsg"
})
public class Request {

    @JsonProperty("BusMsg")
    private request.BusMsg BusMsg;

    /**
     * 
     * @return
     *     The BusMsg
     */
    @JsonProperty("BusMsg")
    public request.BusMsg getBusMsg() {
        return BusMsg;
    }

    /**
     * 
     * @param BusMsg
     *     The BusMsg
     */
    @JsonProperty("BusMsg")
    public void setBusMsg(request.BusMsg BusMsg) {
        this.BusMsg = BusMsg;
    }

}
