
package com.Homedepot.DTOs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "messageKey",
    "messageValue"
})
public class AvailabilityMessageEntry {

    @JsonProperty("messageKey")
    private String messageKey;
    @JsonProperty("messageValue")
    private String messageValue;

    @JsonProperty("messageKey")
    public String getMessageKey() {
        return messageKey;
    }

    @JsonProperty("messageKey")
    public void setMessageKey(String messageKey) {
        this.messageKey = messageKey;
    }

    @JsonProperty("messageValue")
    public String getMessageValue() {
        return messageValue;
    }

    @JsonProperty("messageValue")
    public void setMessageValue(String messageValue) {
        this.messageValue = messageValue;
    }

}
