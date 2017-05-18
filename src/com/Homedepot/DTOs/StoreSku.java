
package com.Homedepot.DTOs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fulfillmentOptions",
    "storeAvailability",
    "storeId",
    "storeStatusType",
    "storeStatus",
    "pricing"
})
public class StoreSku {

    @JsonProperty("fulfillmentOptions")
    private FulfillmentOptions fulfillmentOptions;
    @JsonProperty("storeAvailability")
    private StoreAvailability storeAvailability;
    @JsonProperty("storeId")
    private Integer storeId;
    @JsonProperty("storeStatusType")
    private String storeStatusType;
    @JsonProperty("storeStatus")
    private Boolean storeStatus;
    @JsonProperty("pricing")
    private Pricing pricing;

    @JsonProperty("fulfillmentOptions")
    public FulfillmentOptions getFulfillmentOptions() {
        return fulfillmentOptions;
    }

    @JsonProperty("fulfillmentOptions")
    public void setFulfillmentOptions(FulfillmentOptions fulfillmentOptions) {
        this.fulfillmentOptions = fulfillmentOptions;
    }

    @JsonProperty("storeAvailability")
    public StoreAvailability getStoreAvailability() {
        return storeAvailability;
    }

    @JsonProperty("storeAvailability")
    public void setStoreAvailability(StoreAvailability storeAvailability) {
        this.storeAvailability = storeAvailability;
    }

    @JsonProperty("storeId")
    public Integer getStoreId() {
        return storeId;
    }

    @JsonProperty("storeId")
    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    @JsonProperty("storeStatusType")
    public String getStoreStatusType() {
        return storeStatusType;
    }

    @JsonProperty("storeStatusType")
    public void setStoreStatusType(String storeStatusType) {
        this.storeStatusType = storeStatusType;
    }

    @JsonProperty("storeStatus")
    public Boolean getStoreStatus() {
        return storeStatus;
    }

    @JsonProperty("storeStatus")
    public void setStoreStatus(Boolean storeStatus) {
        this.storeStatus = storeStatus;
    }

    @JsonProperty("pricing")
    public Pricing getPricing() {
        return pricing;
    }

    @JsonProperty("pricing")
    public void setPricing(Pricing pricing) {
        this.pricing = pricing;
    }

}
