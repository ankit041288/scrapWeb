
package com.Homedepot.DTOs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "superSku",
    "skus",
    "productId",
    "defaultSku"
})
public class Product {

    @JsonProperty("superSku")
    private Boolean superSku;
    @JsonProperty("skus")
    private Skus skus;
    @JsonProperty("productId")
    private Integer productId;
    @JsonProperty("defaultSku")
    private Integer defaultSku;

    @JsonProperty("superSku")
    public Boolean getSuperSku() {
        return superSku;
    }

    @JsonProperty("superSku")
    public void setSuperSku(Boolean superSku) {
        this.superSku = superSku;
    }

    @JsonProperty("skus")
    public Skus getSkus() {
        return skus;
    }

    @JsonProperty("skus")
    public void setSkus(Skus skus) {
        this.skus = skus;
    }

    @JsonProperty("productId")
    public Integer getProductId() {
        return productId;
    }

    @JsonProperty("productId")
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @JsonProperty("defaultSku")
    public Integer getDefaultSku() {
        return defaultSku;
    }

    @JsonProperty("defaultSku")
    public void setDefaultSku(Integer defaultSku) {
        this.defaultSku = defaultSku;
    }

}
