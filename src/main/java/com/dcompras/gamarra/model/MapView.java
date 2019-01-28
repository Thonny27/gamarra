
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
    "TopLeft",
    "BottomRight"
})
public class MapView {

    @JsonProperty("TopLeft")
    private TopLeft topLeft;
    @JsonProperty("BottomRight")
    private BottomRight bottomRight;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("TopLeft")
    public TopLeft getTopLeft() {
        return topLeft;
    }

    @JsonProperty("TopLeft")
    public void setTopLeft(TopLeft topLeft) {
        this.topLeft = topLeft;
    }

    @JsonProperty("BottomRight")
    public BottomRight getBottomRight() {
        return bottomRight;
    }

    @JsonProperty("BottomRight")
    public void setBottomRight(BottomRight bottomRight) {
        this.bottomRight = bottomRight;
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
