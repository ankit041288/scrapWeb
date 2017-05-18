
package com.Homedepot.DTOs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "availabilityMessageEntry"
})
public class ItemAvilabilityMessages {

    @JsonProperty("availabilityMessageEntry")
    private AvailabilityMessageEntry availabilityMessageEntry;

    @JsonProperty("availabilityMessageEntry")
    public AvailabilityMessageEntry getAvailabilityMessageEntry() {
        return availabilityMessageEntry;
    }

    @JsonProperty("availabilityMessageEntry")
    public void setAvailabilityMessageEntry(AvailabilityMessageEntry availabilityMessageEntry) {
        this.availabilityMessageEntry = availabilityMessageEntry;
    }

}
