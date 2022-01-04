
package AirBoundPojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "originLocationCode",
    "destinationLocationCode",
    "departureDateTime",
    "isRequestedBound"
})
public class Itinerary {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("originLocationCode")
    private String originLocationCode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("destinationLocationCode")
    private String destinationLocationCode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("departureDateTime")
    private String departureDateTime;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("isRequestedBound")
    private Boolean isRequestedBound;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("originLocationCode")
    public String getOriginLocationCode() {
        return originLocationCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("originLocationCode")
    public void setOriginLocationCode(String originLocationCode) {
        this.originLocationCode = originLocationCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("destinationLocationCode")
    public String getDestinationLocationCode() {
        return destinationLocationCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("destinationLocationCode")
    public void setDestinationLocationCode(String destinationLocationCode) {
        this.destinationLocationCode = destinationLocationCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("departureDateTime")
    public String getDepartureDateTime() {
        return departureDateTime;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("departureDateTime")
    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("isRequestedBound")
    public Boolean getIsRequestedBound() {
        return isRequestedBound;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("isRequestedBound")
    public void setIsRequestedBound(Boolean isRequestedBound) {
        this.isRequestedBound = isRequestedBound;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Itinerary.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("originLocationCode");
        sb.append('=');
        sb.append(((this.originLocationCode == null)?"<null>":this.originLocationCode));
        sb.append(',');
        sb.append("destinationLocationCode");
        sb.append('=');
        sb.append(((this.destinationLocationCode == null)?"<null>":this.destinationLocationCode));
        sb.append(',');
        sb.append("departureDateTime");
        sb.append('=');
        sb.append(((this.departureDateTime == null)?"<null>":this.departureDateTime));
        sb.append(',');
        sb.append("isRequestedBound");
        sb.append('=');
        sb.append(((this.isRequestedBound == null)?"<null>":this.isRequestedBound));
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
        result = ((result* 31)+((this.originLocationCode == null)? 0 :this.originLocationCode.hashCode()));
        result = ((result* 31)+((this.departureDateTime == null)? 0 :this.departureDateTime.hashCode()));
        result = ((result* 31)+((this.isRequestedBound == null)? 0 :this.isRequestedBound.hashCode()));
        result = ((result* 31)+((this.destinationLocationCode == null)? 0 :this.destinationLocationCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Itinerary) == false) {
            return false;
        }
        Itinerary rhs = ((Itinerary) other);
        return (((((this.originLocationCode == rhs.originLocationCode)||((this.originLocationCode!= null)&&this.originLocationCode.equals(rhs.originLocationCode)))&&((this.departureDateTime == rhs.departureDateTime)||((this.departureDateTime!= null)&&this.departureDateTime.equals(rhs.departureDateTime))))&&((this.isRequestedBound == rhs.isRequestedBound)||((this.isRequestedBound!= null)&&this.isRequestedBound.equals(rhs.isRequestedBound))))&&((this.destinationLocationCode == rhs.destinationLocationCode)||((this.destinationLocationCode!= null)&&this.destinationLocationCode.equals(rhs.destinationLocationCode))));
    }

}
