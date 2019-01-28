
package com.dcompras.gamarra.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "City",
    "Street",
    "HouseNumber"
})
public class MatchQuality {

    @JsonProperty("City")
    private Integer city;
    @JsonProperty("Street")
    private List<Double> street = null;
    @JsonProperty("HouseNumber")
    private Integer houseNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("City")
    public Integer getCity() {
        return city;
    }

    @JsonProperty("City")
    public void setCity(Integer city) {
        this.city = city;
    }

    @JsonProperty("Street")
    public List<Double> getStreet() {
        return street;
    }

    @JsonProperty("Street")
    public void setStreet(List<Double> street) {
        this.street = street;
    }

    @JsonProperty("HouseNumber")
    public Integer getHouseNumber() {
        return houseNumber;
    }

    @JsonProperty("HouseNumber")
    public void setHouseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
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
