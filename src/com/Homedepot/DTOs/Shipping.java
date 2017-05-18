
package com.Homedepot.DTOs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bossEstimatedShippingEndDate",
    "sthEstimatedShippingStartDate",
    "itemLevelFreeShip",
    "sthEstimatedShippingEndDate",
    "freeShippingMessageNumber",
    "excludedShipStates",
    "freeShippingMessage",
    "eligibleForFreeShipping",
    "bossEstimatedShippingStartDate"
})
public class Shipping {

    @JsonProperty("bossEstimatedShippingEndDate")
    private String bossEstimatedShippingEndDate;
    @JsonProperty("sthEstimatedShippingStartDate")
    private String sthEstimatedShippingStartDate;
    @JsonProperty("itemLevelFreeShip")
    private Boolean itemLevelFreeShip;
    @JsonProperty("sthEstimatedShippingEndDate")
    private String sthEstimatedShippingEndDate;
    @JsonProperty("freeShippingMessageNumber")
    private Integer freeShippingMessageNumber;
    @JsonProperty("excludedShipStates")
    private String excludedShipStates;
    @JsonProperty("freeShippingMessage")
    private String freeShippingMessage;
    @JsonProperty("eligibleForFreeShipping")
    private Boolean eligibleForFreeShipping;
    @JsonProperty("bossEstimatedShippingStartDate")
    private String bossEstimatedShippingStartDate;

    @JsonProperty("bossEstimatedShippingEndDate")
    public String getBossEstimatedShippingEndDate() {
        return bossEstimatedShippingEndDate;
    }

    @JsonProperty("bossEstimatedShippingEndDate")
    public void setBossEstimatedShippingEndDate(String bossEstimatedShippingEndDate) {
        this.bossEstimatedShippingEndDate = bossEstimatedShippingEndDate;
    }

    @JsonProperty("sthEstimatedShippingStartDate")
    public String getSthEstimatedShippingStartDate() {
        return sthEstimatedShippingStartDate;
    }

    @JsonProperty("sthEstimatedShippingStartDate")
    public void setSthEstimatedShippingStartDate(String sthEstimatedShippingStartDate) {
        this.sthEstimatedShippingStartDate = sthEstimatedShippingStartDate;
    }

    @JsonProperty("itemLevelFreeShip")
    public Boolean getItemLevelFreeShip() {
        return itemLevelFreeShip;
    }

    @JsonProperty("itemLevelFreeShip")
    public void setItemLevelFreeShip(Boolean itemLevelFreeShip) {
        this.itemLevelFreeShip = itemLevelFreeShip;
    }

    @JsonProperty("sthEstimatedShippingEndDate")
    public String getSthEstimatedShippingEndDate() {
        return sthEstimatedShippingEndDate;
    }

    @JsonProperty("sthEstimatedShippingEndDate")
    public void setSthEstimatedShippingEndDate(String sthEstimatedShippingEndDate) {
        this.sthEstimatedShippingEndDate = sthEstimatedShippingEndDate;
    }

    @JsonProperty("freeShippingMessageNumber")
    public Integer getFreeShippingMessageNumber() {
        return freeShippingMessageNumber;
    }

    @JsonProperty("freeShippingMessageNumber")
    public void setFreeShippingMessageNumber(Integer freeShippingMessageNumber) {
        this.freeShippingMessageNumber = freeShippingMessageNumber;
    }

    @JsonProperty("excludedShipStates")
    public String getExcludedShipStates() {
        return excludedShipStates;
    }

    @JsonProperty("excludedShipStates")
    public void setExcludedShipStates(String excludedShipStates) {
        this.excludedShipStates = excludedShipStates;
    }

    @JsonProperty("freeShippingMessage")
    public String getFreeShippingMessage() {
        return freeShippingMessage;
    }

    @JsonProperty("freeShippingMessage")
    public void setFreeShippingMessage(String freeShippingMessage) {
        this.freeShippingMessage = freeShippingMessage;
    }

    @JsonProperty("eligibleForFreeShipping")
    public Boolean getEligibleForFreeShipping() {
        return eligibleForFreeShipping;
    }

    @JsonProperty("eligibleForFreeShipping")
    public void setEligibleForFreeShipping(Boolean eligibleForFreeShipping) {
        this.eligibleForFreeShipping = eligibleForFreeShipping;
    }

    @JsonProperty("bossEstimatedShippingStartDate")
    public String getBossEstimatedShippingStartDate() {
        return bossEstimatedShippingStartDate;
    }

    @JsonProperty("bossEstimatedShippingStartDate")
    public void setBossEstimatedShippingStartDate(String bossEstimatedShippingStartDate) {
        this.bossEstimatedShippingStartDate = bossEstimatedShippingStartDate;
    }

}
