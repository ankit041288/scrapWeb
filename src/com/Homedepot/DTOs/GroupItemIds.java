
package com.Homedepot.DTOs;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "itemId"
})
public class GroupItemIds {

    @JsonProperty("itemId")
    private List<Integer> itemId = null;

    @JsonProperty("itemId")
    public List<Integer> getItemId() {
        return itemId;
    }

    @JsonProperty("itemId")
    public void setItemId(List<Integer> itemId) {
        this.itemId = itemId;
    }

}
