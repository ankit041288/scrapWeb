
package com.Homedepot.DTOs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "attribute"
})
public class Entries {

    @JsonProperty("attribute")
    private Attribute attribute;

    @JsonProperty("attribute")
    public Attribute getAttribute() {
        return attribute;
    }

    @JsonProperty("attribute")
    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

}
