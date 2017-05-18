
package com.Homedepot.DTOs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "storeSku"
})
public class StoreSkus {

    @JsonProperty("storeSku")
    private StoreSku storeSku;

    @JsonProperty("storeSku")
    public StoreSku getStoreSku() {
        return storeSku;
    }

    @JsonProperty("storeSku")
    public void setStoreSku(StoreSku storeSku) {
        this.storeSku = storeSku;
    }

}
