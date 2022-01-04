
package Enrollment;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "companyCode",
    "programCode",
    "customerNumber",
    "accountStatus",
    "enrolmentSource",
    "enrolmentSourceCode",
    "enrolmentDate",
    "periodType",
    "period",
    "extendToDay",
    "extendToMonth",
    "tier",
    "tierFromDate",
    "membershipType",
    "membershipStatus"
})
public class MemberAccount {

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
    @JsonProperty("programCode")
    private String programCode = "ACRP";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("customerNumber")
    private String customerNumber = "25200";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("accountStatus")
    private String accountStatus = "A";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("enrolmentSource")
    private String enrolmentSource = "C";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("enrolmentSourceCode")
    private Object enrolmentSourceCode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("enrolmentDate")
    private String enrolmentDate = "2020-03-20";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("periodType")
    private String periodType = "O";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("period")
    private String period = "0";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("extendToDay")
    private String extendToDay = "0";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("extendToMonth")
    private String extendToMonth = "0";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tier")
    private String tier = "BASE";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tierFromDate")
    private String tierFromDate = "2020-01-01";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("membershipType")
    private String membershipType = "I";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("membershipStatus")
    private String membershipStatus = "A";

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
    @JsonProperty("programCode")
    public String getProgramCode() {
        return programCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("programCode")
    public void setProgramCode(String programCode) {
        this.programCode = programCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("customerNumber")
    public String getCustomerNumber() {
        return customerNumber;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("customerNumber")
    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("accountStatus")
    public String getAccountStatus() {
        return accountStatus;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("accountStatus")
    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("enrolmentSource")
    public String getEnrolmentSource() {
        return enrolmentSource;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("enrolmentSource")
    public void setEnrolmentSource(String enrolmentSource) {
        this.enrolmentSource = enrolmentSource;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("enrolmentSourceCode")
    public Object getEnrolmentSourceCode() {
        return enrolmentSourceCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("enrolmentSourceCode")
    public void setEnrolmentSourceCode(Object enrolmentSourceCode) {
        this.enrolmentSourceCode = enrolmentSourceCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("enrolmentDate")
    public String getEnrolmentDate() {
        return enrolmentDate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("enrolmentDate")
    public void setEnrolmentDate(String enrolmentDate) {
        this.enrolmentDate = enrolmentDate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("periodType")
    public String getPeriodType() {
        return periodType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("periodType")
    public void setPeriodType(String periodType) {
        this.periodType = periodType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("period")
    public String getPeriod() {
        return period;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("period")
    public void setPeriod(String period) {
        this.period = period;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("extendToDay")
    public String getExtendToDay() {
        return extendToDay;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("extendToDay")
    public void setExtendToDay(String extendToDay) {
        this.extendToDay = extendToDay;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("extendToMonth")
    public String getExtendToMonth() {
        return extendToMonth;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("extendToMonth")
    public void setExtendToMonth(String extendToMonth) {
        this.extendToMonth = extendToMonth;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tier")
    public String getTier() {
        return tier;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tier")
    public void setTier(String tier) {
        this.tier = tier;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tierFromDate")
    public String getTierFromDate() {
        return tierFromDate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tierFromDate")
    public void setTierFromDate(String tierFromDate) {
        this.tierFromDate = tierFromDate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("membershipType")
    public String getMembershipType() {
        return membershipType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("membershipType")
    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("membershipStatus")
    public String getMembershipStatus() {
        return membershipStatus;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("membershipStatus")
    public void setMembershipStatus(String membershipStatus) {
        this.membershipStatus = membershipStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MemberAccount.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("companyCode");
        sb.append('=');
        sb.append(((this.companyCode == null)?"<null>":this.companyCode));
        sb.append(',');
        sb.append("programCode");
        sb.append('=');
        sb.append(((this.programCode == null)?"<null>":this.programCode));
        sb.append(',');
        sb.append("customerNumber");
        sb.append('=');
        sb.append(((this.customerNumber == null)?"<null>":this.customerNumber));
        sb.append(',');
        sb.append("accountStatus");
        sb.append('=');
        sb.append(((this.accountStatus == null)?"<null>":this.accountStatus));
        sb.append(',');
        sb.append("enrolmentSource");
        sb.append('=');
        sb.append(((this.enrolmentSource == null)?"<null>":this.enrolmentSource));
        sb.append(',');
        sb.append("enrolmentSourceCode");
        sb.append('=');
        sb.append(((this.enrolmentSourceCode == null)?"<null>":this.enrolmentSourceCode));
        sb.append(',');
        sb.append("enrolmentDate");
        sb.append('=');
        sb.append(((this.enrolmentDate == null)?"<null>":this.enrolmentDate));
        sb.append(',');
        sb.append("periodType");
        sb.append('=');
        sb.append(((this.periodType == null)?"<null>":this.periodType));
        sb.append(',');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
        sb.append(',');
        sb.append("extendToDay");
        sb.append('=');
        sb.append(((this.extendToDay == null)?"<null>":this.extendToDay));
        sb.append(',');
        sb.append("extendToMonth");
        sb.append('=');
        sb.append(((this.extendToMonth == null)?"<null>":this.extendToMonth));
        sb.append(',');
        sb.append("tier");
        sb.append('=');
        sb.append(((this.tier == null)?"<null>":this.tier));
        sb.append(',');
        sb.append("tierFromDate");
        sb.append('=');
        sb.append(((this.tierFromDate == null)?"<null>":this.tierFromDate));
        sb.append(',');
        sb.append("membershipType");
        sb.append('=');
        sb.append(((this.membershipType == null)?"<null>":this.membershipType));
        sb.append(',');
        sb.append("membershipStatus");
        sb.append('=');
        sb.append(((this.membershipStatus == null)?"<null>":this.membershipStatus));
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
        result = ((result* 31)+((this.membershipType == null)? 0 :this.membershipType.hashCode()));
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this.extendToDay == null)? 0 :this.extendToDay.hashCode()));
        result = ((result* 31)+((this.programCode == null)? 0 :this.programCode.hashCode()));
        result = ((result* 31)+((this.customerNumber == null)? 0 :this.customerNumber.hashCode()));
        result = ((result* 31)+((this.membershipStatus == null)? 0 :this.membershipStatus.hashCode()));
        result = ((result* 31)+((this.accountStatus == null)? 0 :this.accountStatus.hashCode()));
        result = ((result* 31)+((this.enrolmentDate == null)? 0 :this.enrolmentDate.hashCode()));
        result = ((result* 31)+((this.enrolmentSourceCode == null)? 0 :this.enrolmentSourceCode.hashCode()));
        result = ((result* 31)+((this.periodType == null)? 0 :this.periodType.hashCode()));
        result = ((result* 31)+((this.tier == null)? 0 :this.tier.hashCode()));
        result = ((result* 31)+((this.tierFromDate == null)? 0 :this.tierFromDate.hashCode()));
        result = ((result* 31)+((this.enrolmentSource == null)? 0 :this.enrolmentSource.hashCode()));
        result = ((result* 31)+((this.extendToMonth == null)? 0 :this.extendToMonth.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MemberAccount) == false) {
            return false;
        }
        MemberAccount rhs = ((MemberAccount) other);
        return ((((((((((((((((this.companyCode == rhs.companyCode)||((this.companyCode!= null)&&this.companyCode.equals(rhs.companyCode)))&&((this.membershipType == rhs.membershipType)||((this.membershipType!= null)&&this.membershipType.equals(rhs.membershipType))))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))))&&((this.extendToDay == rhs.extendToDay)||((this.extendToDay!= null)&&this.extendToDay.equals(rhs.extendToDay))))&&((this.programCode == rhs.programCode)||((this.programCode!= null)&&this.programCode.equals(rhs.programCode))))&&((this.customerNumber == rhs.customerNumber)||((this.customerNumber!= null)&&this.customerNumber.equals(rhs.customerNumber))))&&((this.membershipStatus == rhs.membershipStatus)||((this.membershipStatus!= null)&&this.membershipStatus.equals(rhs.membershipStatus))))&&((this.accountStatus == rhs.accountStatus)||((this.accountStatus!= null)&&this.accountStatus.equals(rhs.accountStatus))))&&((this.enrolmentDate == rhs.enrolmentDate)||((this.enrolmentDate!= null)&&this.enrolmentDate.equals(rhs.enrolmentDate))))&&((this.enrolmentSourceCode == rhs.enrolmentSourceCode)||((this.enrolmentSourceCode!= null)&&this.enrolmentSourceCode.equals(rhs.enrolmentSourceCode))))&&((this.periodType == rhs.periodType)||((this.periodType!= null)&&this.periodType.equals(rhs.periodType))))&&((this.tier == rhs.tier)||((this.tier!= null)&&this.tier.equals(rhs.tier))))&&((this.tierFromDate == rhs.tierFromDate)||((this.tierFromDate!= null)&&this.tierFromDate.equals(rhs.tierFromDate))))&&((this.enrolmentSource == rhs.enrolmentSource)||((this.enrolmentSource!= null)&&this.enrolmentSource.equals(rhs.enrolmentSource))))&&((this.extendToMonth == rhs.extendToMonth)||((this.extendToMonth!= null)&&this.extendToMonth.equals(rhs.extendToMonth))));
    }

}
