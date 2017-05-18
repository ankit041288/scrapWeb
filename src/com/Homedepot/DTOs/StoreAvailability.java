
package com.Homedepot.DTOs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "itemAvilabilityMessages",
    "availableInLocalStore",
    "itemAvailable"
})
public class StoreAvailability {

    @JsonProperty("itemAvilabilityMessages")
    private ItemAvilabilityMessages itemAvilabilityMessages;
    @JsonProperty("availableInLocalStore")
    private Boolean availableInLocalStore;
    @JsonProperty("itemAvailable")
    private Boolean itemAvailable;

    @JsonProperty("itemAvilabilityMessages")
    public ItemAvilabilityMessages getItemAvilabilityMessages() {
        return itemAvilabilityMessages;
    }

    @JsonProperty("itemAvilabilityMessages")
    public void setItemAvilabilityMessages(ItemAvilabilityMessages itemAvilabilityMessages) {
        this.itemAvilabilityMessages = itemAvilabilityMessages;
    }

    @JsonProperty("availableInLocalStore")
    public Boolean getAvailableInLocalStore() {
        return availableInLocalStore;
    }

    @JsonProperty("availableInLocalStore")
    public void setAvailableInLocalStore(Boolean availableInLocalStore) {
        this.availableInLocalStore = availableInLocalStore;
    }

    @JsonProperty("itemAvailable")
    public Boolean getItemAvailable() {
        return itemAvailable;
    }

    @JsonProperty("itemAvailable")
    public void setItemAvailable(Boolean itemAvailable) {
        this.itemAvailable = itemAvailable;
    }

}
