
package com.Homedepot.DTOs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "totalReviews",
    "averageRating"
})
public class RatingsReviews {

    @JsonProperty("totalReviews")
    private Integer totalReviews;
    @JsonProperty("averageRating")
    private Double averageRating;

    @JsonProperty("totalReviews")
    public Integer getTotalReviews() {
        return totalReviews;
    }

    @JsonProperty("totalReviews")
    public void setTotalReviews(Integer totalReviews) {
        this.totalReviews = totalReviews;
    }

    @JsonProperty("averageRating")
    public Double getAverageRating() {
        return averageRating;
    }

    @JsonProperty("averageRating")
    public void setAverageRating(Double averageRating) {
        this.averageRating = averageRating;
    }

}
