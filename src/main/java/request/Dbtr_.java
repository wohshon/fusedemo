
package request;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "IPAddr",
    "Id"
})
public class Dbtr_ {

    @JsonProperty("IPAddr")
    private String IPAddr;
    @JsonProperty("Id")
    private String Id;

    /**
     * 
     * @return
     *     The IPAddr
     */
    @JsonProperty("IPAddr")
    public String getIPAddr() {
        return IPAddr;
    }

    /**
     * 
     * @param IPAddr
     *     The IPAddr
     */
    @JsonProperty("IPAddr")
    public void setIPAddr(String IPAddr) {
        this.IPAddr = IPAddr;
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
