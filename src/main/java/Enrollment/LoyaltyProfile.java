
package Enrollment;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "hasLinkedCards",
    "isLegacyMillionMiler",
    "isMillionMiler",
    "millionMilerLevel",
    "isGhostCardProfile",
    "isAccrualValid",
    "isRedemptionValid",
    "isPoolMember",
    "lastActivityDate",
    "memberAccount",
    "frozenFlags"
})
public class LoyaltyProfile {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("hasLinkedCards")
    private Boolean hasLinkedCards = false;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("isLegacyMillionMiler")
    private Boolean isLegacyMillionMiler = false;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("isMillionMiler")
    private Boolean isMillionMiler = false;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("millionMilerLevel")
    private String millionMilerLevel = "0";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("isGhostCardProfile")
    private Boolean isGhostCardProfile = false;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("isAccrualValid")
    private String isAccrualValid = "NA";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("isRedemptionValid")
    private String isRedemptionValid = "NA";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("isPoolMember")
    private Boolean isPoolMember = false;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("lastActivityDate")
    private String lastActivityDate = "2020-01-01";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("memberAccount")
    private MemberAccount memberAccount;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("frozenFlags")
    private String frozenFlags;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("hasLinkedCards")
    public Boolean getHasLinkedCards() {
        return hasLinkedCards;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("hasLinkedCards")
    public void setHasLinkedCards(Boolean hasLinkedCards) {
        this.hasLinkedCards = hasLinkedCards;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("isLegacyMillionMiler")
    public Boolean getIsLegacyMillionMiler() {
        return isLegacyMillionMiler;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("isLegacyMillionMiler")
    public void setIsLegacyMillionMiler(Boolean isLegacyMillionMiler) {
        this.isLegacyMillionMiler = isLegacyMillionMiler;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("isMillionMiler")
    public Boolean getIsMillionMiler() {
        return isMillionMiler;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("isMillionMiler")
    public void setIsMillionMiler(Boolean isMillionMiler) {
        this.isMillionMiler = isMillionMiler;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("millionMilerLevel")
    public String getMillionMilerLevel() {
        return millionMilerLevel;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("millionMilerLevel")
    public void setMillionMilerLevel(String millionMilerLevel) {
        this.millionMilerLevel = millionMilerLevel;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("isGhostCardProfile")
    public Boolean getIsGhostCardProfile() {
        return isGhostCardProfile;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("isGhostCardProfile")
    public void setIsGhostCardProfile(Boolean isGhostCardProfile) {
        this.isGhostCardProfile = isGhostCardProfile;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("isAccrualValid")
    public String getIsAccrualValid() {
        return isAccrualValid;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("isAccrualValid")
    public void setIsAccrualValid(String isAccrualValid) {
        this.isAccrualValid = isAccrualValid;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("isRedemptionValid")
    public String getIsRedemptionValid() {
        return isRedemptionValid;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("isRedemptionValid")
    public void setIsRedemptionValid(String isRedemptionValid) {
        this.isRedemptionValid = isRedemptionValid;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("isPoolMember")
    public Boolean getIsPoolMember() {
        return isPoolMember;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("isPoolMember")
    public void setIsPoolMember(Boolean isPoolMember) {
        this.isPoolMember = isPoolMember;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("lastActivityDate")
    public String getLastActivityDate() {
        return lastActivityDate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("lastActivityDate")
    public void setLastActivityDate(String lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("memberAccount")
    public MemberAccount getMemberAccount() {
        return memberAccount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("memberAccount")
    public void setMemberAccount(MemberAccount memberAccount) {
        this.memberAccount = memberAccount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("frozenFlags")
    public String getFrozenFlags() {
        return frozenFlags;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("frozenFlags")
    public void setFrozenFlags(String frozenFlags) {
        this.frozenFlags = frozenFlags;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LoyaltyProfile.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("hasLinkedCards");
        sb.append('=');
        sb.append(((this.hasLinkedCards == null)?"<null>":this.hasLinkedCards));
        sb.append(',');
        sb.append("isLegacyMillionMiler");
        sb.append('=');
        sb.append(((this.isLegacyMillionMiler == null)?"<null>":this.isLegacyMillionMiler));
        sb.append(',');
        sb.append("isMillionMiler");
        sb.append('=');
        sb.append(((this.isMillionMiler == null)?"<null>":this.isMillionMiler));
        sb.append(',');
        sb.append("millionMilerLevel");
        sb.append('=');
        sb.append(((this.millionMilerLevel == null)?"<null>":this.millionMilerLevel));
        sb.append(',');
        sb.append("isGhostCardProfile");
        sb.append('=');
        sb.append(((this.isGhostCardProfile == null)?"<null>":this.isGhostCardProfile));
        sb.append(',');
        sb.append("isAccrualValid");
        sb.append('=');
        sb.append(((this.isAccrualValid == null)?"<null>":this.isAccrualValid));
        sb.append(',');
        sb.append("isRedemptionValid");
        sb.append('=');
        sb.append(((this.isRedemptionValid == null)?"<null>":this.isRedemptionValid));
        sb.append(',');
        sb.append("isPoolMember");
        sb.append('=');
        sb.append(((this.isPoolMember == null)?"<null>":this.isPoolMember));
        sb.append(',');
        sb.append("lastActivityDate");
        sb.append('=');
        sb.append(((this.lastActivityDate == null)?"<null>":this.lastActivityDate));
        sb.append(',');
        sb.append("memberAccount");
        sb.append('=');
        sb.append(((this.memberAccount == null)?"<null>":this.memberAccount));
        sb.append(',');
        sb.append("frozenFlags");
        sb.append('=');
        sb.append(((this.frozenFlags == null)?"<null>":this.frozenFlags));
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
        result = ((result* 31)+((this.frozenFlags == null)? 0 :this.frozenFlags.hashCode()));
        result = ((result* 31)+((this.isGhostCardProfile == null)? 0 :this.isGhostCardProfile.hashCode()));
        result = ((result* 31)+((this.isPoolMember == null)? 0 :this.isPoolMember.hashCode()));
        result = ((result* 31)+((this.millionMilerLevel == null)? 0 :this.millionMilerLevel.hashCode()));
        result = ((result* 31)+((this.lastActivityDate == null)? 0 :this.lastActivityDate.hashCode()));
        result = ((result* 31)+((this.isRedemptionValid == null)? 0 :this.isRedemptionValid.hashCode()));
        result = ((result* 31)+((this.isMillionMiler == null)? 0 :this.isMillionMiler.hashCode()));
        result = ((result* 31)+((this.isLegacyMillionMiler == null)? 0 :this.isLegacyMillionMiler.hashCode()));
        result = ((result* 31)+((this.memberAccount == null)? 0 :this.memberAccount.hashCode()));
        result = ((result* 31)+((this.isAccrualValid == null)? 0 :this.isAccrualValid.hashCode()));
        result = ((result* 31)+((this.hasLinkedCards == null)? 0 :this.hasLinkedCards.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LoyaltyProfile) == false) {
            return false;
        }
        LoyaltyProfile rhs = ((LoyaltyProfile) other);
        return ((((((((((((this.frozenFlags == rhs.frozenFlags)||((this.frozenFlags!= null)&&this.frozenFlags.equals(rhs.frozenFlags)))&&((this.isGhostCardProfile == rhs.isGhostCardProfile)||((this.isGhostCardProfile!= null)&&this.isGhostCardProfile.equals(rhs.isGhostCardProfile))))&&((this.isPoolMember == rhs.isPoolMember)||((this.isPoolMember!= null)&&this.isPoolMember.equals(rhs.isPoolMember))))&&((this.millionMilerLevel == rhs.millionMilerLevel)||((this.millionMilerLevel!= null)&&this.millionMilerLevel.equals(rhs.millionMilerLevel))))&&((this.lastActivityDate == rhs.lastActivityDate)||((this.lastActivityDate!= null)&&this.lastActivityDate.equals(rhs.lastActivityDate))))&&((this.isRedemptionValid == rhs.isRedemptionValid)||((this.isRedemptionValid!= null)&&this.isRedemptionValid.equals(rhs.isRedemptionValid))))&&((this.isMillionMiler == rhs.isMillionMiler)||((this.isMillionMiler!= null)&&this.isMillionMiler.equals(rhs.isMillionMiler))))&&((this.isLegacyMillionMiler == rhs.isLegacyMillionMiler)||((this.isLegacyMillionMiler!= null)&&this.isLegacyMillionMiler.equals(rhs.isLegacyMillionMiler))))&&((this.memberAccount == rhs.memberAccount)||((this.memberAccount!= null)&&this.memberAccount.equals(rhs.memberAccount))))&&((this.isAccrualValid == rhs.isAccrualValid)||((this.isAccrualValid!= null)&&this.isAccrualValid.equals(rhs.isAccrualValid))))&&((this.hasLinkedCards == rhs.hasLinkedCards)||((this.hasLinkedCards!= null)&&this.hasLinkedCards.equals(rhs.hasLinkedCards))));
    }

}
