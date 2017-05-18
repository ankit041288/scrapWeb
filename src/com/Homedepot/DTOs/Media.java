
package com.Homedepot.DTOs;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "mediaEntry",
    "imageEnhancementFlag"
})
public class Media {

    @JsonProperty("mediaEntry")
    private List<MediaEntry> mediaEntry = null;
    @JsonProperty("imageEnhancementFlag")
    private Boolean imageEnhancementFlag;

    @JsonProperty("mediaEntry")
    public List<MediaEntry> getMediaEntry() {
        return mediaEntry;
    }

    @JsonProperty("mediaEntry")
    public void setMediaEntry(List<MediaEntry> mediaEntry) {
        this.mediaEntry = mediaEntry;
    }

    @JsonProperty("imageEnhancementFlag")
    public Boolean getImageEnhancementFlag() {
        return imageEnhancementFlag;
    }

    @JsonProperty("imageEnhancementFlag")
    public void setImageEnhancementFlag(Boolean imageEnhancementFlag) {
        this.imageEnhancementFlag = imageEnhancementFlag;
    }

}
