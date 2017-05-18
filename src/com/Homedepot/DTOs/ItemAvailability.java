
package com.Homedepot.DTOs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "buyable",
    "discontinuedItem",
    "inventoryStatus",
    "backorderable",
    "published",
    "availableInStore",
    "availableOnlineStore"
})
public class ItemAvailability {

    @JsonProperty("buyable")
    private Boolean buyable;
    @JsonProperty("discontinuedItem")
    private Boolean discontinuedItem;
    @JsonProperty("inventoryStatus")
    private Boolean inventoryStatus;
    @JsonProperty("backorderable")
    private Boolean backorderable;
    @JsonProperty("published")
    private Boolean published;
    @JsonProperty("availableInStore")
    private Boolean availableInStore;
    @JsonProperty("availableOnlineStore")
    private Boolean availableOnlineStore;

    @JsonProperty("buyable")
    public Boolean getBuyable() {
        return buyable;
    }

    @JsonProperty("buyable")
    public void setBuyable(Boolean buyable) {
        this.buyable = buyable;
    }

    @JsonProperty("discontinuedItem")
    public Boolean getDiscontinuedItem() {
        return discontinuedItem;
    }

    @JsonProperty("discontinuedItem")
    public void setDiscontinuedItem(Boolean discontinuedItem) {
        this.discontinuedItem = discontinuedItem;
    }

    @JsonProperty("inventoryStatus")
    public Boolean getInventoryStatus() {
        return inventoryStatus;
    }

    @JsonProperty("inventoryStatus")
    public void setInventoryStatus(Boolean inventoryStatus) {
        this.inventoryStatus = inventoryStatus;
    }

    @JsonProperty("backorderable")
    public Boolean getBackorderable() {
        return backorderable;
    }

    @JsonProperty("backorderable")
    public void setBackorderable(Boolean backorderable) {
        this.backorderable = backorderable;
    }

    @JsonProperty("published")
    public Boolean getPublished() {
        return published;
    }

    @JsonProperty("published")
    public void setPublished(Boolean published) {
        this.published = published;
    }

    @JsonProperty("availableInStore")
    public Boolean getAvailableInStore() {
        return availableInStore;
    }

    @JsonProperty("availableInStore")
    public void setAvailableInStore(Boolean availableInStore) {
        this.availableInStore = availableInStore;
    }

    @JsonProperty("availableOnlineStore")
    public Boolean getAvailableOnlineStore() {
        return availableOnlineStore;
    }

    @JsonProperty("availableOnlineStore")
    public void setAvailableOnlineStore(Boolean availableOnlineStore) {
        this.availableOnlineStore = availableOnlineStore;
    }

}
