
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
    "LocationId",
    "LocationType",
    "DisplayPosition",
    "NavigationPosition",
    "MapView",
    "Address"
})
public class Location {

    @JsonProperty("LocationId")
    private String locationId;
    @JsonProperty("LocationType")
    private String locationType;
    @JsonProperty("DisplayPosition")
    private DisplayPosition displayPosition;
    @JsonProperty("NavigationPosition")
    private List<NavigationPosition> navigationPosition = null;
    @JsonProperty("MapView")
    private MapView mapView;
    @JsonProperty("Address")
    private Address address;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("LocationId")
    public String getLocationId() {
        return locationId;
    }

    @JsonProperty("LocationId")
    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    @JsonProperty("LocationType")
    public String getLocationType() {
        return locationType;
    }

    @JsonProperty("LocationType")
    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    @JsonProperty("DisplayPosition")
    public DisplayPosition getDisplayPosition() {
        return displayPosition;
    }

    @JsonProperty("DisplayPosition")
    public void setDisplayPosition(DisplayPosition displayPosition) {
        this.displayPosition = displayPosition;
    }

    @JsonProperty("NavigationPosition")
    public List<NavigationPosition> getNavigationPosition() {
        return navigationPosition;
    }

    @JsonProperty("NavigationPosition")
    public void setNavigationPosition(List<NavigationPosition> navigationPosition) {
        this.navigationPosition = navigationPosition;
    }

    @JsonProperty("MapView")
    public MapView getMapView() {
        return mapView;
    }

    @JsonProperty("MapView")
    public void setMapView(MapView mapView) {
        this.mapView = mapView;
    }

    @JsonProperty("Address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("Address")
    public void setAddress(Address address) {
        this.address = address;
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
