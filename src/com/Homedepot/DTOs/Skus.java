
package com.Homedepot.DTOs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
    "sku"
})
public class Skus {

    @JsonProperty("sku")
    private Sku sku;

    @JsonProperty("sku")
    public Sku getSku() {
        return sku;
    }

    @JsonProperty("sku")
    public void setSku(Sku sku) {
        this.sku = sku;
    }

}
