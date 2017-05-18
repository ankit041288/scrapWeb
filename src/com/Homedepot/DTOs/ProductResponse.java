
package com.Homedepot.DTOs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "products"
})
public class ProductResponse {

    @JsonProperty("products")
    private Products products;

    @JsonProperty("products")
    public Products getProducts() {
        return products;
    }

    @JsonProperty("products")
    public void setProducts(Products products) {
        this.products = products;
    }

}
