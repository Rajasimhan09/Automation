
package AirBoundPojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "companyCode",
    "cardNumber"
})
public class FrequentFlyerCards {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("companyCode")
    private String companyCode = "AC";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cardNumber")
    private String cardNumber;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("companyCode")
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("companyCode")
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cardNumber")
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cardNumber")
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FrequentFlyerCards.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("companyCode");
        sb.append('=');
        sb.append(((this.companyCode == null)?"<null>":this.companyCode));
        sb.append(',');
        sb.append("cardNumber");
        sb.append('=');
        sb.append(((this.cardNumber == null)?"<null>":this.cardNumber));
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
        result = ((result* 31)+((this.companyCode == null)? 0 :this.companyCode.hashCode()));
        result = ((result* 31)+((this.cardNumber == null)? 0 :this.cardNumber.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FrequentFlyerCards) == false) {
            return false;
        }
        FrequentFlyerCards rhs = ((FrequentFlyerCards) other);
        return (((this.companyCode == rhs.companyCode)||((this.companyCode!= null)&&this.companyCode.equals(rhs.companyCode)))&&((this.cardNumber == rhs.cardNumber)||((this.cardNumber!= null)&&this.cardNumber.equals(rhs.cardNumber))));
    }

}
