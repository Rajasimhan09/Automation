
package AirBoundPojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "passengerTypeCode"
})
public class Traveler {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("passengerTypeCode")
    private String passengerTypeCode;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("passengerTypeCode")
    public String getPassengerTypeCode() {
        return passengerTypeCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("passengerTypeCode")
    public void setPassengerTypeCode(String passengerTypeCode) {
        this.passengerTypeCode = passengerTypeCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Traveler.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("passengerTypeCode");
        sb.append('=');
        sb.append(((this.passengerTypeCode == null)?"<null>":this.passengerTypeCode));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.passengerTypeCode == null)? 0 :this.passengerTypeCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Traveler) == false) {
            return false;
        }
        Traveler rhs = ((Traveler) other);
        return ((this.passengerTypeCode == rhs.passengerTypeCode)||((this.passengerTypeCode!= null)&&this.passengerTypeCode.equals(rhs.passengerTypeCode)));
    }

}
