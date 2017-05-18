
package com.Homedepot.DTOs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "group"
})
public class AttributeGroups {

    @JsonProperty("group")
    private List<Group> group = null;

    @JsonProperty("group")
    public List<Group> getGroup() {
        return group;
    }

    @JsonProperty("group")
    public void setGroup(List<Group> group) {
        this.group = group;
    }

}
