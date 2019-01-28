
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
    "Label",
    "Country",
    "State",
    "County",
    "City",
    "District",
    "Street",
    "HouseNumber",
    "PostalCode",
    "AdditionalData"
})
public class Address {

    @JsonProperty("Label")
    private String label;
    @JsonProperty("Country")
    private String country;
    @JsonProperty("State")
    private String state;
    @JsonProperty("County")
    private String county;
    @JsonProperty("City")
    private String city;
    @JsonProperty("District")
    private String district;
    @JsonProperty("Street")
    private String street;
    @JsonProperty("HouseNumber")
    private String houseNumber;
    @JsonProperty("PostalCode")
    private String postalCode;
    @JsonProperty("AdditionalData")
    private List<AdditionalDatum> additionalData = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("Label")
    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("Country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("Country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("State")
    public String getState() {
        return state;
    }

    @JsonProperty("State")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("County")
    public String getCounty() {
        return county;
    }

    @JsonProperty("County")
    public void setCounty(String county) {
        this.county = county;
    }

    @JsonProperty("City")
    public String getCity() {
        return city;
    }

    @JsonProperty("City")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("District")
    public String getDistrict() {
        return district;
    }

    @JsonProperty("District")
    public void setDistrict(String district) {
        this.district = district;
    }

    @JsonProperty("Street")
    public String getStreet() {
        return street;
    }

    @JsonProperty("Street")
    public void setStreet(String street) {
        this.street = street;
    }

    @JsonProperty("HouseNumber")
    public String getHouseNumber() {
        return houseNumber;
    }

    @JsonProperty("HouseNumber")
    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    @JsonProperty("PostalCode")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty("PostalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @JsonProperty("AdditionalData")
    public List<AdditionalDatum> getAdditionalData() {
        return additionalData;
    }

    @JsonProperty("AdditionalData")
    public void setAdditionalData(List<AdditionalDatum> additionalData) {
        this.additionalData = additionalData;
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
