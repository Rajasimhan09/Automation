
package AirBoundPojo;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "frequentFlyerCards",
    "corporateCodes",
    "itineraries",
    "commercialFareFamilies",
    "currencyCode",
    "searchPreferences",
    "travelers",
    "promotion"
})
public class AirBound {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("frequentFlyerCards")
    private FrequentFlyerCards frequentFlyerCards;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("corporateCodes")
    private List<String> corporateCodes = new ArrayList<String>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("itineraries")
    private List<Itinerary> itineraries = new ArrayList<Itinerary>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("commercialFareFamilies")
    private List<String> commercialFareFamilies = new ArrayList<String>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("currencyCode")
    private String currencyCode = "CAD";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("searchPreferences")
    private SearchPreferences searchPreferences;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("travelers")
    private List<Traveler> travelers = new ArrayList<Traveler>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("promotion")
    private Promotion promotion;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("frequentFlyerCards")
    public FrequentFlyerCards getFrequentFlyerCards() {
        return frequentFlyerCards;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("frequentFlyerCards")
    public void setFrequentFlyerCards(FrequentFlyerCards frequentFlyerCards) {
        this.frequentFlyerCards = frequentFlyerCards;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("corporateCodes")
    public List<String> getCorporateCodes() {
        return corporateCodes;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("corporateCodes")
    public void setCorporateCodes(List<String> corporateCodes) {
        this.corporateCodes = corporateCodes;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("itineraries")
    public List<Itinerary> getItineraries() {
        return itineraries;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("itineraries")
    public void setItineraries(List<Itinerary> itineraries) {
        this.itineraries = itineraries;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("commercialFareFamilies")
    public List<String> getCommercialFareFamilies() {
        return commercialFareFamilies;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("commercialFareFamilies")
    public void setCommercialFareFamilies(List<String> commercialFareFamilies) {
        this.commercialFareFamilies = commercialFareFamilies;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("currencyCode")
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("currencyCode")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("searchPreferences")
    public SearchPreferences getSearchPreferences() {
        return searchPreferences;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("searchPreferences")
    public void setSearchPreferences(SearchPreferences searchPreferences) {
        this.searchPreferences = searchPreferences;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("travelers")
    public List<Traveler> getTravelers() {
        return travelers;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("travelers")
    public void setTravelers(List<Traveler> travelers) {
        this.travelers = travelers;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("promotion")
    public Promotion getPromotion() {
        return promotion;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("promotion")
    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AirBound.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("frequentFlyerCards");
        sb.append('=');
        sb.append(((this.frequentFlyerCards == null)?"<null>":this.frequentFlyerCards));
        sb.append(',');
        sb.append("corporateCodes");
        sb.append('=');
        sb.append(((this.corporateCodes == null)?"<null>":this.corporateCodes));
        sb.append(',');
        sb.append("itineraries");
        sb.append('=');
        sb.append(((this.itineraries == null)?"<null>":this.itineraries));
        sb.append(',');
        sb.append("commercialFareFamilies");
        sb.append('=');
        sb.append(((this.commercialFareFamilies == null)?"<null>":this.commercialFareFamilies));
        sb.append(',');
        sb.append("currencyCode");
        sb.append('=');
        sb.append(((this.currencyCode == null)?"<null>":this.currencyCode));
        sb.append(',');
        sb.append("searchPreferences");
        sb.append('=');
        sb.append(((this.searchPreferences == null)?"<null>":this.searchPreferences));
        sb.append(',');
        sb.append("travelers");
        sb.append('=');
        sb.append(((this.travelers == null)?"<null>":this.travelers));
        sb.append(',');
        sb.append("promotion");
        sb.append('=');
        sb.append(((this.promotion == null)?"<null>":this.promotion));
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
        result = ((result* 31)+((this.corporateCodes == null)? 0 :this.corporateCodes.hashCode()));
        result = ((result* 31)+((this.itineraries == null)? 0 :this.itineraries.hashCode()));
        result = ((result* 31)+((this.commercialFareFamilies == null)? 0 :this.commercialFareFamilies.hashCode()));
        result = ((result* 31)+((this.frequentFlyerCards == null)? 0 :this.frequentFlyerCards.hashCode()));
        result = ((result* 31)+((this.currencyCode == null)? 0 :this.currencyCode.hashCode()));
        result = ((result* 31)+((this.searchPreferences == null)? 0 :this.searchPreferences.hashCode()));
        result = ((result* 31)+((this.travelers == null)? 0 :this.travelers.hashCode()));
        result = ((result* 31)+((this.promotion == null)? 0 :this.promotion.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AirBound) == false) {
            return false;
        }
        AirBound rhs = ((AirBound) other);
        return (((((((((this.corporateCodes == rhs.corporateCodes)||((this.corporateCodes!= null)&&this.corporateCodes.equals(rhs.corporateCodes)))&&((this.itineraries == rhs.itineraries)||((this.itineraries!= null)&&this.itineraries.equals(rhs.itineraries))))&&((this.commercialFareFamilies == rhs.commercialFareFamilies)||((this.commercialFareFamilies!= null)&&this.commercialFareFamilies.equals(rhs.commercialFareFamilies))))&&((this.frequentFlyerCards == rhs.frequentFlyerCards)||((this.frequentFlyerCards!= null)&&this.frequentFlyerCards.equals(rhs.frequentFlyerCards))))&&((this.currencyCode == rhs.currencyCode)||((this.currencyCode!= null)&&this.currencyCode.equals(rhs.currencyCode))))&&((this.searchPreferences == rhs.searchPreferences)||((this.searchPreferences!= null)&&this.searchPreferences.equals(rhs.searchPreferences))))&&((this.travelers == rhs.travelers)||((this.travelers!= null)&&this.travelers.equals(rhs.travelers))))&&((this.promotion == rhs.promotion)||((this.promotion!= null)&&this.promotion.equals(rhs.promotion))));
    }

}
