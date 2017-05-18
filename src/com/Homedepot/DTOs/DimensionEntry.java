
package com.Homedepot.DTOs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dimensionValue",
    "dimensionId",
    "isDefaultBreadCrumb",
    "ancestors",
    "dimensionName"
})
public class DimensionEntry {

    @JsonProperty("dimensionValue")
    private DimensionValue dimensionValue;
    @JsonProperty("dimensionId")
    private Integer dimensionId;
    @JsonProperty("isDefaultBreadCrumb")
    private Boolean isDefaultBreadCrumb;
    @JsonProperty("ancestors")
    private String ancestors;
    @JsonProperty("dimensionName")
    private String dimensionName;

    @JsonProperty("dimensionValue")
    public DimensionValue getDimensionValue() {
        return dimensionValue;
    }

    @JsonProperty("dimensionValue")
    public void setDimensionValue(DimensionValue dimensionValue) {
        this.dimensionValue = dimensionValue;
    }

    @JsonProperty("dimensionId")
    public Integer getDimensionId() {
        return dimensionId;
    }

    @JsonProperty("dimensionId")
    public void setDimensionId(Integer dimensionId) {
        this.dimensionId = dimensionId;
    }

    @JsonProperty("isDefaultBreadCrumb")
    public Boolean getIsDefaultBreadCrumb() {
        return isDefaultBreadCrumb;
    }

    @JsonProperty("isDefaultBreadCrumb")
    public void setIsDefaultBreadCrumb(Boolean isDefaultBreadCrumb) {
        this.isDefaultBreadCrumb = isDefaultBreadCrumb;
    }

    @JsonProperty("ancestors")
    public String getAncestors() {
        return ancestors;
    }

    @JsonProperty("ancestors")
    public void setAncestors(String ancestors) {
        this.ancestors = ancestors;
    }

    @JsonProperty("dimensionName")
    public String getDimensionName() {
        return dimensionName;
    }

    @JsonProperty("dimensionName")
    public void setDimensionName(String dimensionName) {
        this.dimensionName = dimensionName;
    }

}
