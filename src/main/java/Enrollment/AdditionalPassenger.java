
package Enrollment;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "lastName",
    "firstName",
    "passengerType",
    "seatPref",
    "gender",
    "mealPref",
    "prefix",
    "id",
    "nationality",
    "email",
    "mobile",
    "countryCode",
    "specialNeeds",
    "ktn",
    "redressNumber",
    "fqtv",
    "fqtvProgram"
})
public class AdditionalPassenger {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("lastName")
    private String lastName = "Jackie";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("firstName")
    private String firstName = "Miller";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("passengerType")
    private String passengerType = "PT";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("seatPref")
    private String seatPref = "SP";
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
    @JsonProperty("mealPref")
    private String mealPref = "MP";
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
    @JsonProperty("id")
    private String id = "1";
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
    @JsonProperty("email")
    private String email = "helloWorld@ac.com";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobile")
    private String mobile = "2348728934";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("countryCode")
    private Integer countryCode = 1;
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
    private String ktn = "213";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("redressNumber")
    private String redressNumber = "124352";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fqtv")
    private String fqtv = "23432";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fqtvProgram")
    private String fqtvProgram = "Tester";

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
    @JsonProperty("passengerType")
    public String getPassengerType() {
        return passengerType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("passengerType")
    public void setPassengerType(String passengerType) {
        this.passengerType = passengerType;
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
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
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
    @JsonProperty("mobile")
    public String getMobile() {
        return mobile;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mobile")
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("countryCode")
    public Integer getCountryCode() {
        return countryCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("countryCode")
    public void setCountryCode(Integer countryCode) {
        this.countryCode = countryCode;
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
    @JsonProperty("fqtv")
    public String getFqtv() {
        return fqtv;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fqtv")
    public void setFqtv(String fqtv) {
        this.fqtv = fqtv;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fqtvProgram")
    public String getFqtvProgram() {
        return fqtvProgram;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fqtvProgram")
    public void setFqtvProgram(String fqtvProgram) {
        this.fqtvProgram = fqtvProgram;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdditionalPassenger.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("passengerType");
        sb.append('=');
        sb.append(((this.passengerType == null)?"<null>":this.passengerType));
        sb.append(',');
        sb.append("seatPref");
        sb.append('=');
        sb.append(((this.seatPref == null)?"<null>":this.seatPref));
        sb.append(',');
        sb.append("gender");
        sb.append('=');
        sb.append(((this.gender == null)?"<null>":this.gender));
        sb.append(',');
        sb.append("mealPref");
        sb.append('=');
        sb.append(((this.mealPref == null)?"<null>":this.mealPref));
        sb.append(',');
        sb.append("prefix");
        sb.append('=');
        sb.append(((this.prefix == null)?"<null>":this.prefix));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("nationality");
        sb.append('=');
        sb.append(((this.nationality == null)?"<null>":this.nationality));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("mobile");
        sb.append('=');
        sb.append(((this.mobile == null)?"<null>":this.mobile));
        sb.append(',');
        sb.append("countryCode");
        sb.append('=');
        sb.append(((this.countryCode == null)?"<null>":this.countryCode));
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
        sb.append("fqtv");
        sb.append('=');
        sb.append(((this.fqtv == null)?"<null>":this.fqtv));
        sb.append(',');
        sb.append("fqtvProgram");
        sb.append('=');
        sb.append(((this.fqtvProgram == null)?"<null>":this.fqtvProgram));
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
        result = ((result* 31)+((this.seatPref == null)? 0 :this.seatPref.hashCode()));
        result = ((result* 31)+((this.gender == null)? 0 :this.gender.hashCode()));
        result = ((result* 31)+((this.ktn == null)? 0 :this.ktn.hashCode()));
        result = ((result* 31)+((this.prefix == null)? 0 :this.prefix.hashCode()));
        result = ((result* 31)+((this.redressNumber == null)? 0 :this.redressNumber.hashCode()));
        result = ((result* 31)+((this.mobile == null)? 0 :this.mobile.hashCode()));
        result = ((result* 31)+((this.fqtvProgram == null)? 0 :this.fqtvProgram.hashCode()));
        result = ((result* 31)+((this.specialNeeds == null)? 0 :this.specialNeeds.hashCode()));
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.passengerType == null)? 0 :this.passengerType.hashCode()));
        result = ((result* 31)+((this.nationality == null)? 0 :this.nationality.hashCode()));
        result = ((result* 31)+((this.mealPref == null)? 0 :this.mealPref.hashCode()));
        result = ((result* 31)+((this.countryCode == null)? 0 :this.countryCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.fqtv == null)? 0 :this.fqtv.hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdditionalPassenger) == false) {
            return false;
        }
        AdditionalPassenger rhs = ((AdditionalPassenger) other);
        return ((((((((((((((((((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName)))&&((this.seatPref == rhs.seatPref)||((this.seatPref!= null)&&this.seatPref.equals(rhs.seatPref))))&&((this.gender == rhs.gender)||((this.gender!= null)&&this.gender.equals(rhs.gender))))&&((this.ktn == rhs.ktn)||((this.ktn!= null)&&this.ktn.equals(rhs.ktn))))&&((this.prefix == rhs.prefix)||((this.prefix!= null)&&this.prefix.equals(rhs.prefix))))&&((this.redressNumber == rhs.redressNumber)||((this.redressNumber!= null)&&this.redressNumber.equals(rhs.redressNumber))))&&((this.mobile == rhs.mobile)||((this.mobile!= null)&&this.mobile.equals(rhs.mobile))))&&((this.fqtvProgram == rhs.fqtvProgram)||((this.fqtvProgram!= null)&&this.fqtvProgram.equals(rhs.fqtvProgram))))&&((this.specialNeeds == rhs.specialNeeds)||((this.specialNeeds!= null)&&this.specialNeeds.equals(rhs.specialNeeds))))&&((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName))))&&((this.passengerType == rhs.passengerType)||((this.passengerType!= null)&&this.passengerType.equals(rhs.passengerType))))&&((this.nationality == rhs.nationality)||((this.nationality!= null)&&this.nationality.equals(rhs.nationality))))&&((this.mealPref == rhs.mealPref)||((this.mealPref!= null)&&this.mealPref.equals(rhs.mealPref))))&&((this.countryCode == rhs.countryCode)||((this.countryCode!= null)&&this.countryCode.equals(rhs.countryCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.fqtv == rhs.fqtv)||((this.fqtv!= null)&&this.fqtv.equals(rhs.fqtv))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))));
    }

}
