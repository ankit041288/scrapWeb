
package com.Homedepot.DTOs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "groupType",
    "entries"
})
public class Group {

    @JsonProperty("groupType")
    private String groupType;
    @JsonProperty("entries")
    private Entries entries;

    @JsonProperty("groupType")
    public String getGroupType() {
        return groupType;
    }

    @JsonProperty("groupType")
    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    @JsonProperty("entries")
    public Entries getEntries() {
        return entries;
    }

    @JsonProperty("entries")
    public void setEntries(Entries entries) {
        this.entries = entries;
    }

}
