
package Enrollment;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "isPinLocked",
    "pin"
})
public class PinDetails {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("isPinLocked")
    private Boolean isPinLocked = false;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pin")
    private String pin = "3421";

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("isPinLocked")
    public Boolean getIsPinLocked() {
        return isPinLocked;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("isPinLocked")
    public void setIsPinLocked(Boolean isPinLocked) {
        this.isPinLocked = isPinLocked;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pin")
    public String getPin() {
        return pin;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pin")
    public void setPin(String pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PinDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("isPinLocked");
        sb.append('=');
        sb.append(((this.isPinLocked == null)?"<null>":this.isPinLocked));
        sb.append(',');
        sb.append("pin");
        sb.append('=');
        sb.append(((this.pin == null)?"<null>":this.pin));
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
        result = ((result* 31)+((this.isPinLocked == null)? 0 :this.isPinLocked.hashCode()));
        result = ((result* 31)+((this.pin == null)? 0 :this.pin.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PinDetails) == false) {
            return false;
        }
        PinDetails rhs = ((PinDetails) other);
        return (((this.isPinLocked == rhs.isPinLocked)||((this.isPinLocked!= null)&&this.isPinLocked.equals(rhs.isPinLocked)))&&((this.pin == rhs.pin)||((this.pin!= null)&&this.pin.equals(rhs.pin))));
    }

}
