
package com.Homedepot.DTOs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "shipToHome",
    "fulfillable"
})
public class FulfillmentOptions {

    @JsonProperty("shipToHome")
    private ShipToHome shipToHome;
    @JsonProperty("fulfillable")
    private Boolean fulfillable;

    @JsonProperty("shipToHome")
    public ShipToHome getShipToHome() {
        return shipToHome;
    }

    @JsonProperty("shipToHome")
    public void setShipToHome(ShipToHome shipToHome) {
        this.shipToHome = shipToHome;
    }

    @JsonProperty("fulfillable")
    public Boolean getFulfillable() {
        return fulfillable;
    }

    @JsonProperty("fulfillable")
    public void setFulfillable(Boolean fulfillable) {
        this.fulfillable = fulfillable;
    }

}
