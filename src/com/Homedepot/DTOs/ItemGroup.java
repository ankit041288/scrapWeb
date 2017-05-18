
package com.Homedepot.DTOs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "groupType",
    "groupItemIds"
})
public class ItemGroup {

    @JsonProperty("groupType")
    private String groupType;
    @JsonProperty("groupItemIds")
    private GroupItemIds groupItemIds;

    @JsonProperty("groupType")
    public String getGroupType() {
        return groupType;
    }

    @JsonProperty("groupType")
    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    @JsonProperty("groupItemIds")
    public GroupItemIds getGroupItemIds() {
        return groupItemIds;
    }

    @JsonProperty("groupItemIds")
    public void setGroupItemIds(GroupItemIds groupItemIds) {
        this.groupItemIds = groupItemIds;
    }

}
