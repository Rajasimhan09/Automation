
package Enrollment;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "source",
    "memberProfile"
})
public class Enrollment {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("source")
    private String source = "website";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("memberProfile")
    private MemberProfile memberProfile;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("memberProfile")
    public MemberProfile getMemberProfile() {
        return memberProfile;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("memberProfile")
    public void setMemberProfile(MemberProfile memberProfile) {
        this.memberProfile = memberProfile;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Enrollment.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("memberProfile");
        sb.append('=');
        sb.append(((this.memberProfile == null)?"<null>":this.memberProfile));
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
        result = ((result* 31)+((this.memberProfile == null)? 0 :this.memberProfile.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Enrollment) == false) {
            return false;
        }
        Enrollment rhs = ((Enrollment) other);
        return (((this.memberProfile == rhs.memberProfile)||((this.memberProfile!= null)&&this.memberProfile.equals(rhs.memberProfile)))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))));
    }

}
