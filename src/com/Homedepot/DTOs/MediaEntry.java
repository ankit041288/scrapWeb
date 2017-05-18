
package com.Homedepot.DTOs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "height",
    "location",
    "width",
    "mediaType",
    "videoStill",
    "title",
    "thumbnail",
    "shortDescription",
    "videoId",
    "video"
})
public class MediaEntry {

    @JsonProperty("height")
    private Integer height;
    @JsonProperty("location")
    private String location;
    @JsonProperty("width")
    private Integer width;
    @JsonProperty("mediaType")
    private String mediaType;
    @JsonProperty("videoStill")
    private String videoStill;
    @JsonProperty("title")
    private String title;
    @JsonProperty("thumbnail")
    private String thumbnail;
    @JsonProperty("shortDescription")
    private String shortDescription;
    @JsonProperty("videoId")
    private Integer videoId;
    @JsonProperty("video")
    private String video;

    @JsonProperty("height")
    public Integer getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Integer height) {
        this.height = height;
    }

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    @JsonProperty("width")
    public Integer getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(Integer width) {
        this.width = width;
    }

    @JsonProperty("mediaType")
    public String getMediaType() {
        return mediaType;
    }

    @JsonProperty("mediaType")
    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    @JsonProperty("videoStill")
    public String getVideoStill() {
        return videoStill;
    }

    @JsonProperty("videoStill")
    public void setVideoStill(String videoStill) {
        this.videoStill = videoStill;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("thumbnail")
    public String getThumbnail() {
        return thumbnail;
    }

    @JsonProperty("thumbnail")
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @JsonProperty("shortDescription")
    public String getShortDescription() {
        return shortDescription;
    }

    @JsonProperty("shortDescription")
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    @JsonProperty("videoId")
    public Integer getVideoId() {
        return videoId;
    }

    @JsonProperty("videoId")
    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    @JsonProperty("video")
    public String getVideo() {
        return video;
    }

    @JsonProperty("video")
    public void setVideo(String video) {
        this.video = video;
    }

}
