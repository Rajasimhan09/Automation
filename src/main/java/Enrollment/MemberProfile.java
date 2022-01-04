
package Enrollment;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "prefix",
    "isActive",
    "firstName",
    "lastName",
    "dob",
    "gender",
    "officialACLanguageCode",
    "email",
    "address",
    "phones",
    "isConsentGranted",
    "seatPref",
    "mealPref",
    "specialNeeds",
    "ktn",
    "redressNumber",
    "additionalEmail",
    "FQTV",
    "nationality",
    "additionalPassenger",
    "pinDetails",
    "loyaltyProfile"
})
public class MemberProfile {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("prefix")
    private String prefix = "MR";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("isActive")
    private Boolean isActive = true;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("firstName")
    private String firstName = "{{$randomFirstName}}";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("lastName")
    private String lastName = "{{$randomLastName}}";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dob")
    private String dob = "1994-10-20";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("gender")
    private String gender = "m";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("officialACLanguageCode")
    private String officialACLanguageCode = "en";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("email")
    private String email = "{{$randomFirstName}}@gmail.com";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("address")
    private List<Address> address = new ArrayList<Address>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("phones")
    private List<Phone> phones = new ArrayList<Phone>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("isConsentGranted")
    private Boolean isConsentGranted = false;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("seatPref")
    private String seatPref = "Aisle";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mealPref")
    private String mealPref = "AVML";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("specialNeeds")
    private List<String> specialNeeds = new ArrayList<String>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ktn")
    private String ktn = "463453";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("redressNumber")
    private String redressNumber = "238479";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("additionalEmail")
    private String additionalEmail = "testing@ac.com";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("FQTV")
    private Fqtv fqtv;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("nationality")
    private String nationality = "CAN";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("additionalPassenger")
    private List<AdditionalPassenger> additionalPassenger = new ArrayList<AdditionalPassenger>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pinDetails")
    private PinDetails pinDetails;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("loyaltyProfile")
    private LoyaltyProfile loyaltyProfile;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("prefix")
    public String getPrefix() {
        return prefix;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("prefix")
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("isActive")
    public Boolean getIsActive() {
        return isActive;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("isActive")
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dob")
    public String getDob() {
        return dob;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dob")
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("officialACLanguageCode")
    public String getOfficialACLanguageCode() {
        return officialACLanguageCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("officialACLanguageCode")
    public void setOfficialACLanguageCode(String officialACLanguageCode) {
        this.officialACLanguageCode = officialACLanguageCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("address")
    public List<Address> getAddress() {
        return address;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("address")
    public void setAddress(List<Address> address) {
        this.address = address;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("phones")
    public List<Phone> getPhones() {
        return phones;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("phones")
    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("isConsentGranted")
    public Boolean getIsConsentGranted() {
        return isConsentGranted;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("isConsentGranted")
    public void setIsConsentGranted(Boolean isConsentGranted) {
        this.isConsentGranted = isConsentGranted;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("seatPref")
    public String getSeatPref() {
        return seatPref;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("seatPref")
    public void setSeatPref(String seatPref) {
        this.seatPref = seatPref;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mealPref")
    public String getMealPref() {
        return mealPref;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mealPref")
    public void setMealPref(String mealPref) {
        this.mealPref = mealPref;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("specialNeeds")
    public List<String> getSpecialNeeds() {
        return specialNeeds;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("specialNeeds")
    public void setSpecialNeeds(List<String> specialNeeds) {
        this.specialNeeds = specialNeeds;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ktn")
    public String getKtn() {
        return ktn;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ktn")
    public void setKtn(String ktn) {
        this.ktn = ktn;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("redressNumber")
    public String getRedressNumber() {
        return redressNumber;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("redressNumber")
    public void setRedressNumber(String redressNumber) {
        this.redressNumber = redressNumber;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("additionalEmail")
    public String getAdditionalEmail() {
        return additionalEmail;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("additionalEmail")
    public void setAdditionalEmail(String additionalEmail) {
        this.additionalEmail = additionalEmail;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("FQTV")
    public Fqtv getFqtv() {
        return fqtv;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("FQTV")
    public void setFqtv(Fqtv fqtv) {
        this.fqtv = fqtv;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("nationality")
    public String getNationality() {
        return nationality;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("nationality")
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("additionalPassenger")
    public List<AdditionalPassenger> getAdditionalPassenger() {
        return additionalPassenger;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("additionalPassenger")
    public void setAdditionalPassenger(List<AdditionalPassenger> additionalPassenger) {
        this.additionalPassenger = additionalPassenger;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pinDetails")
    public PinDetails getPinDetails() {
        return pinDetails;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pinDetails")
    public void setPinDetails(PinDetails pinDetails) {
        this.pinDetails = pinDetails;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("loyaltyProfile")
    public LoyaltyProfile getLoyaltyProfile() {
        return loyaltyProfile;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("loyaltyProfile")
    public void setLoyaltyProfile(LoyaltyProfile loyaltyProfile) {
        this.loyaltyProfile = loyaltyProfile;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MemberProfile.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("prefix");
        sb.append('=');
        sb.append(((this.prefix == null)?"<null>":this.prefix));
        sb.append(',');
        sb.append("isActive");
        sb.append('=');
        sb.append(((this.isActive == null)?"<null>":this.isActive));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("dob");
        sb.append('=');
        sb.append(((this.dob == null)?"<null>":this.dob));
        sb.append(',');
        sb.append("gender");
        sb.append('=');
        sb.append(((this.gender == null)?"<null>":this.gender));
        sb.append(',');
        sb.append("officialACLanguageCode");
        sb.append('=');
        sb.append(((this.officialACLanguageCode == null)?"<null>":this.officialACLanguageCode));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("phones");
        sb.append('=');
        sb.append(((this.phones == null)?"<null>":this.phones));
        sb.append(',');
        sb.append("isConsentGranted");
        sb.append('=');
        sb.append(((this.isConsentGranted == null)?"<null>":this.isConsentGranted));
        sb.append(',');
        sb.append("seatPref");
        sb.append('=');
        sb.append(((this.seatPref == null)?"<null>":this.seatPref));
        sb.append(',');
        sb.append("mealPref");
        sb.append('=');
        sb.append(((this.mealPref == null)?"<null>":this.mealPref));
        sb.append(',');
        sb.append("specialNeeds");
        sb.append('=');
        sb.append(((this.specialNeeds == null)?"<null>":this.specialNeeds));
        sb.append(',');
        sb.append("ktn");
        sb.append('=');
        sb.append(((this.ktn == null)?"<null>":this.ktn));
        sb.append(',');
        sb.append("redressNumber");
        sb.append('=');
        sb.append(((this.redressNumber == null)?"<null>":this.redressNumber));
        sb.append(',');
        sb.append("additionalEmail");
        sb.append('=');
        sb.append(((this.additionalEmail == null)?"<null>":this.additionalEmail));
        sb.append(',');
        sb.append("fqtv");
        sb.append('=');
        sb.append(((this.fqtv == null)?"<null>":this.fqtv));
        sb.append(',');
        sb.append("nationality");
        sb.append('=');
        sb.append(((this.nationality == null)?"<null>":this.nationality));
        sb.append(',');
        sb.append("additionalPassenger");
        sb.append('=');
        sb.append(((this.additionalPassenger == null)?"<null>":this.additionalPassenger));
        sb.append(',');
        sb.append("pinDetails");
        sb.append('=');
        sb.append(((this.pinDetails == null)?"<null>":this.pinDetails));
        sb.append(',');
        sb.append("loyaltyProfile");
        sb.append('=');
        sb.append(((this.loyaltyProfile == null)?"<null>":this.loyaltyProfile));
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
        result = ((result* 31)+((this.lastName == null)? 0 :this.lastName.hashCode()));
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.isConsentGranted == null)? 0 :this.isConsentGranted.hashCode()));
        result = ((result* 31)+((this.seatPref == null)? 0 :this.seatPref.hashCode()));
        result = ((result* 31)+((this.gender == null)? 0 :this.gender.hashCode()));
        result = ((result* 31)+((this.ktn == null)? 0 :this.ktn.hashCode()));
        result = ((result* 31)+((this.prefix == null)? 0 :this.prefix.hashCode()));
        result = ((result* 31)+((this.redressNumber == null)? 0 :this.redressNumber.hashCode()));
        result = ((result* 31)+((this.pinDetails == null)? 0 :this.pinDetails.hashCode()));
        result = ((result* 31)+((this.phones == null)? 0 :this.phones.hashCode()));
        result = ((result* 31)+((this.isActive == null)? 0 :this.isActive.hashCode()));
        result = ((result* 31)+((this.specialNeeds == null)? 0 :this.specialNeeds.hashCode()));
        result = ((result* 31)+((this.loyaltyProfile == null)? 0 :this.loyaltyProfile.hashCode()));
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.additionalEmail == null)? 0 :this.additionalEmail.hashCode()));
        result = ((result* 31)+((this.nationality == null)? 0 :this.nationality.hashCode()));
        result = ((result* 31)+((this.additionalPassenger == null)? 0 :this.additionalPassenger.hashCode()));
        result = ((result* 31)+((this.officialACLanguageCode == null)? 0 :this.officialACLanguageCode.hashCode()));
        result = ((result* 31)+((this.mealPref == null)? 0 :this.mealPref.hashCode()));
        result = ((result* 31)+((this.dob == null)? 0 :this.dob.hashCode()));
        result = ((result* 31)+((this.fqtv == null)? 0 :this.fqtv.hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MemberProfile) == false) {
            return false;
        }
        MemberProfile rhs = ((MemberProfile) other);
        return (((((((((((((((((((((((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName)))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))))&&((this.isConsentGranted == rhs.isConsentGranted)||((this.isConsentGranted!= null)&&this.isConsentGranted.equals(rhs.isConsentGranted))))&&((this.seatPref == rhs.seatPref)||((this.seatPref!= null)&&this.seatPref.equals(rhs.seatPref))))&&((this.gender == rhs.gender)||((this.gender!= null)&&this.gender.equals(rhs.gender))))&&((this.ktn == rhs.ktn)||((this.ktn!= null)&&this.ktn.equals(rhs.ktn))))&&((this.prefix == rhs.prefix)||((this.prefix!= null)&&this.prefix.equals(rhs.prefix))))&&((this.redressNumber == rhs.redressNumber)||((this.redressNumber!= null)&&this.redressNumber.equals(rhs.redressNumber))))&&((this.pinDetails == rhs.pinDetails)||((this.pinDetails!= null)&&this.pinDetails.equals(rhs.pinDetails))))&&((this.phones == rhs.phones)||((this.phones!= null)&&this.phones.equals(rhs.phones))))&&((this.isActive == rhs.isActive)||((this.isActive!= null)&&this.isActive.equals(rhs.isActive))))&&((this.specialNeeds == rhs.specialNeeds)||((this.specialNeeds!= null)&&this.specialNeeds.equals(rhs.specialNeeds))))&&((this.loyaltyProfile == rhs.loyaltyProfile)||((this.loyaltyProfile!= null)&&this.loyaltyProfile.equals(rhs.loyaltyProfile))))&&((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName))))&&((this.additionalEmail == rhs.additionalEmail)||((this.additionalEmail!= null)&&this.additionalEmail.equals(rhs.additionalEmail))))&&((this.nationality == rhs.nationality)||((this.nationality!= null)&&this.nationality.equals(rhs.nationality))))&&((this.additionalPassenger == rhs.additionalPassenger)||((this.additionalPassenger!= null)&&this.additionalPassenger.equals(rhs.additionalPassenger))))&&((this.officialACLanguageCode == rhs.officialACLanguageCode)||((this.officialACLanguageCode!= null)&&this.officialACLanguageCode.equals(rhs.officialACLanguageCode))))&&((this.mealPref == rhs.mealPref)||((this.mealPref!= null)&&this.mealPref.equals(rhs.mealPref))))&&((this.dob == rhs.dob)||((this.dob!= null)&&this.dob.equals(rhs.dob))))&&((this.fqtv == rhs.fqtv)||((this.fqtv!= null)&&this.fqtv.equals(rhs.fqtv))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))));
    }

}
