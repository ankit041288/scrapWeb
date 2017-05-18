
package com.Homedepot.DTOs;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dimensionEntry"
})
public class Dimensions {

    @JsonProperty("dimensionEntry")
    private List<DimensionEntry> dimensionEntry = null;

    @JsonProperty("dimensionEntry")
    public List<DimensionEntry> getDimensionEntry() {
        return dimensionEntry;
    }

    @JsonProperty("dimensionEntry")
    public void setDimensionEntry(List<DimensionEntry> dimensionEntry) {
        this.dimensionEntry = dimensionEntry;
    }

}
