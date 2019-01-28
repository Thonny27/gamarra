
package com.dcompras.gamarra.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Relevance",
    "MatchLevel",
    "MatchQuality",
    "MatchType",
    "Location"
})
public class Result {

    @JsonProperty("Relevance")
    private Double relevance;
    @JsonProperty("MatchLevel")
    private String matchLevel;
    @JsonProperty("MatchQuality")
    private MatchQuality matchQuality;
    @JsonProperty("MatchType")
    private String matchType;
    @JsonProperty("Location")
    private Location location;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Relevance")
    public Double getRelevance() {
        return relevance;
    }

    @JsonProperty("Relevance")
    public void setRelevance(Double relevance) {
        this.relevance = relevance;
    }

    @JsonProperty("MatchLevel")
    public String getMatchLevel() {
        return matchLevel;
    }

    @JsonProperty("MatchLevel")
    public void setMatchLevel(String matchLevel) {
        this.matchLevel = matchLevel;
    }

    @JsonProperty("MatchQuality")
    public MatchQuality getMatchQuality() {
        return matchQuality;
    }

    @JsonProperty("MatchQuality")
    public void setMatchQuality(MatchQuality matchQuality) {
        this.matchQuality = matchQuality;
    }

    @JsonProperty("MatchType")
    public String getMatchType() {
        return matchType;
    }

    @JsonProperty("MatchType")
    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    @JsonProperty("Location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("Location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
