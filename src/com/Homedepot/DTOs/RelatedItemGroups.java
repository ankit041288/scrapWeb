
package com.Homedepot.DTOs;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "itemGroup"
})
public class RelatedItemGroups {

    @JsonProperty("itemGroup")
    private List<ItemGroup> itemGroup = null;

    @JsonProperty("itemGroup")
    public List<ItemGroup> getItemGroup() {
        return itemGroup;
    }

    @JsonProperty("itemGroup")
    public void setItemGroup(List<ItemGroup> itemGroup) {
        this.itemGroup = itemGroup;
    }

}
