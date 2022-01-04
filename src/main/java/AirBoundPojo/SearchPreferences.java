
package AirBoundPojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "showMilesPrice"
})
public class SearchPreferences {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("showMilesPrice")
    private Boolean showMilesPrice = true;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("showMilesPrice")
    public Boolean getShowMilesPrice() {
        return showMilesPrice;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("showMilesPrice")
    public void setShowMilesPrice(Boolean showMilesPrice) {
        this.showMilesPrice = showMilesPrice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SearchPreferences.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("showMilesPrice");
        sb.append('=');
        sb.append(((this.showMilesPrice == null)?"<null>":this.showMilesPrice));
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
        result = ((result* 31)+((this.showMilesPrice == null)? 0 :this.showMilesPrice.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SearchPreferences) == false) {
            return false;
        }
        SearchPreferences rhs = ((SearchPreferences) other);
        return ((this.showMilesPrice == rhs.showMilesPrice)||((this.showMilesPrice!= null)&&this.showMilesPrice.equals(rhs.showMilesPrice)));
    }

}
