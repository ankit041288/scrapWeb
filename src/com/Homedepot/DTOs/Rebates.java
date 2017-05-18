
package com.Homedepot.DTOs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "hasEcoRebates"
})
public class Rebates {

    @JsonProperty("hasEcoRebates")
    private Boolean hasEcoRebates;

    @JsonProperty("hasEcoRebates")
    public Boolean getHasEcoRebates() {
        return hasEcoRebates;
    }

    @JsonProperty("hasEcoRebates")
    public void setHasEcoRebates(Boolean hasEcoRebates) {
        this.hasEcoRebates = hasEcoRebates;
    }

}
