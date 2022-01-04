
package AirBoundPojo;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "contactType",
    "travelerIds",
    "category",
    "deviceType",
    "purpose",
    "countryPhoneExtension",
    "number",
    "address"
})
public class Contact {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contactType")
    private String contactType = "Phone";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("travelerIds")
    private List<String> travelerIds = new ArrayList<String>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("category")
    private String category = "personal";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("deviceType")
    private String deviceType;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("purpose")
    private String purpose = "standard";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("countryPhoneExtension")
    private String countryPhoneExtension;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("number")
    private String number;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("address")
    private String address;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contactType")
    public String getContactType() {
        return contactType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contactType")
    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("travelerIds")
    public List<String> getTravelerIds() {
        return travelerIds;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("travelerIds")
    public void setTravelerIds(List<String> travelerIds) {
        this.travelerIds = travelerIds;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("deviceType")
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("deviceType")
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("purpose")
    public String getPurpose() {
        return purpose;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("purpose")
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("countryPhoneExtension")
    public String getCountryPhoneExtension() {
        return countryPhoneExtension;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("countryPhoneExtension")
    public void setCountryPhoneExtension(String countryPhoneExtension) {
        this.countryPhoneExtension = countryPhoneExtension;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Contact.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("contactType");
        sb.append('=');
        sb.append(((this.contactType == null)?"<null>":this.contactType));
        sb.append(',');
        sb.append("travelerIds");
        sb.append('=');
        sb.append(((this.travelerIds == null)?"<null>":this.travelerIds));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("deviceType");
        sb.append('=');
        sb.append(((this.deviceType == null)?"<null>":this.deviceType));
        sb.append(',');
        sb.append("purpose");
        sb.append('=');
        sb.append(((this.purpose == null)?"<null>":this.purpose));
        sb.append(',');
        sb.append("countryPhoneExtension");
        sb.append('=');
        sb.append(((this.countryPhoneExtension == null)?"<null>":this.countryPhoneExtension));
        sb.append(',');
        sb.append("number");
        sb.append('=');
        sb.append(((this.number == null)?"<null>":this.number));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
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
        result = ((result* 31)+((this.deviceType == null)? 0 :this.deviceType.hashCode()));
        result = ((result* 31)+((this.number == null)? 0 :this.number.hashCode()));
        result = ((result* 31)+((this.travelerIds == null)? 0 :this.travelerIds.hashCode()));
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.purpose == null)? 0 :this.purpose.hashCode()));
        result = ((result* 31)+((this.countryPhoneExtension == null)? 0 :this.countryPhoneExtension.hashCode()));
        result = ((result* 31)+((this.contactType == null)? 0 :this.contactType.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Contact) == false) {
            return false;
        }
        Contact rhs = ((Contact) other);
        return (((((((((this.deviceType == rhs.deviceType)||((this.deviceType!= null)&&this.deviceType.equals(rhs.deviceType)))&&((this.number == rhs.number)||((this.number!= null)&&this.number.equals(rhs.number))))&&((this.travelerIds == rhs.travelerIds)||((this.travelerIds!= null)&&this.travelerIds.equals(rhs.travelerIds))))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))))&&((this.purpose == rhs.purpose)||((this.purpose!= null)&&this.purpose.equals(rhs.purpose))))&&((this.countryPhoneExtension == rhs.countryPhoneExtension)||((this.countryPhoneExtension!= null)&&this.countryPhoneExtension.equals(rhs.countryPhoneExtension))))&&((this.contactType == rhs.contactType)||((this.contactType!= null)&&this.contactType.equals(rhs.contactType))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))));
    }

}
