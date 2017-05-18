
package com.Homedepot.DTOs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "alternatePricingDisplay",
    "uom",
    "originalPrice",
    "dollarOff",
    "lowerPrice",
    "percentageOff",
    "specialPrice",
    "unitsPerCase"
})
public class Pricing {

    @JsonProperty("alternatePricingDisplay")
    private Boolean alternatePricingDisplay;
    @JsonProperty("uom")
    private String uom;
    @JsonProperty("originalPrice")
    private Double originalPrice;
    @JsonProperty("dollarOff")
    private Integer dollarOff;
    @JsonProperty("lowerPrice")
    private Boolean lowerPrice;
    @JsonProperty("percentageOff")
    private Integer percentageOff;
    @JsonProperty("specialPrice")
    private Double specialPrice;
    @JsonProperty("unitsPerCase")
    private Integer unitsPerCase;

    @JsonProperty("alternatePricingDisplay")
    public Boolean getAlternatePricingDisplay() {
        return alternatePricingDisplay;
    }

    @JsonProperty("alternatePricingDisplay")
    public void setAlternatePricingDisplay(Boolean alternatePricingDisplay) {
        this.alternatePricingDisplay = alternatePricingDisplay;
    }

    @JsonProperty("uom")
    public String getUom() {
        return uom;
    }

    @JsonProperty("uom")
    public void setUom(String uom) {
        this.uom = uom;
    }

    @JsonProperty("originalPrice")
    public Double getOriginalPrice() {
        return originalPrice;
    }

    @JsonProperty("originalPrice")
    public void setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
    }

    @JsonProperty("dollarOff")
    public Integer getDollarOff() {
        return dollarOff;
    }

    @JsonProperty("dollarOff")
    public void setDollarOff(Integer dollarOff) {
        this.dollarOff = dollarOff;
    }

    @JsonProperty("lowerPrice")
    public Boolean getLowerPrice() {
        return lowerPrice;
    }

    @JsonProperty("lowerPrice")
    public void setLowerPrice(Boolean lowerPrice) {
        this.lowerPrice = lowerPrice;
    }

    @JsonProperty("percentageOff")
    public Integer getPercentageOff() {
        return percentageOff;
    }

    @JsonProperty("percentageOff")
    public void setPercentageOff(Integer percentageOff) {
        this.percentageOff = percentageOff;
    }

    @JsonProperty("specialPrice")
    public Double getSpecialPrice() {
        return specialPrice;
    }

    @JsonProperty("specialPrice")
    public void setSpecialPrice(Double specialPrice) {
        this.specialPrice = specialPrice;
    }

    @JsonProperty("unitsPerCase")
    public Integer getUnitsPerCase() {
        return unitsPerCase;
    }

    @JsonProperty("unitsPerCase")
    public void setUnitsPerCase(Integer unitsPerCase) {
        this.unitsPerCase = unitsPerCase;
    }

}
