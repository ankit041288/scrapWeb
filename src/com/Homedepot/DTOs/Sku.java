
package com.Homedepot.DTOs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
    "itemType",
    "rebates",
    "productId",
    "canonicalURL",
    "itemAvailability",
    "media",
    "storeSkus",
    "itemId",
    "availabilityType",
    "promotions",
    "shipping",
    "webUrl",
    "relatedItemGroups",
    "ratingsReviews",
    "partNumber",
    "info",
    "attributeGroups",
    "dimensions"
})
public class Sku {

    @JsonProperty("itemType")
    private String itemType;
    @JsonProperty("rebates")
    private Rebates rebates;
    @JsonProperty("productId")
    private Integer productId;
    @JsonProperty("canonicalURL")
    private String canonicalURL;
    @JsonProperty("itemAvailability")
    private ItemAvailability itemAvailability;
    @JsonProperty("media")
    private Media media;
    @JsonProperty("storeSkus")
    private StoreSkus storeSkus;
    @JsonProperty("itemId")
    private Integer itemId;
    @JsonProperty("availabilityType")
    private String availabilityType;
    @JsonProperty("promotions")
    private String promotions;
    @JsonProperty("shipping")
    private Shipping shipping;
    @JsonProperty("webUrl")
    private String webUrl;
    @JsonProperty("relatedItemGroups")
    private RelatedItemGroups relatedItemGroups;
    @JsonProperty("ratingsReviews")
    private RatingsReviews ratingsReviews;
    @JsonProperty("partNumber")
    private Integer partNumber;
    @JsonProperty("info")
    private Info info;
    @JsonProperty("attributeGroups")
    private AttributeGroups attributeGroups;
    @JsonProperty("dimensions")
    private Dimensions dimensions;

    @JsonProperty("itemType")
    public String getItemType() {
        return itemType;
    }

    @JsonProperty("itemType")
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    @JsonProperty("rebates")
    public Rebates getRebates() {
        return rebates;
    }

    @JsonProperty("rebates")
    public void setRebates(Rebates rebates) {
        this.rebates = rebates;
    }

    @JsonProperty("productId")
    public Integer getProductId() {
        return productId;
    }

    @JsonProperty("productId")
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @JsonProperty("canonicalURL")
    public String getCanonicalURL() {
        return canonicalURL;
    }

    @JsonProperty("canonicalURL")
    public void setCanonicalURL(String canonicalURL) {
        this.canonicalURL = canonicalURL;
    }

    @JsonProperty("itemAvailability")
    public ItemAvailability getItemAvailability() {
        return itemAvailability;
    }

    @JsonProperty("itemAvailability")
    public void setItemAvailability(ItemAvailability itemAvailability) {
        this.itemAvailability = itemAvailability;
    }

    @JsonProperty("media")
    public Media getMedia() {
        return media;
    }

    @JsonProperty("media")
    public void setMedia(Media media) {
        this.media = media;
    }

    @JsonProperty("storeSkus")
    public StoreSkus getStoreSkus() {
        return storeSkus;
    }

    @JsonProperty("storeSkus")
    public void setStoreSkus(StoreSkus storeSkus) {
        this.storeSkus = storeSkus;
    }

    @JsonProperty("itemId")
    public Integer getItemId() {
        return itemId;
    }

    @JsonProperty("itemId")
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    @JsonProperty("availabilityType")
    public String getAvailabilityType() {
        return availabilityType;
    }

    @JsonProperty("availabilityType")
    public void setAvailabilityType(String availabilityType) {
        this.availabilityType = availabilityType;
    }

    @JsonProperty("promotions")
    public String getPromotions() {
        return promotions;
    }

    @JsonProperty("promotions")
    public void setPromotions(String promotions) {
        this.promotions = promotions;
    }

    @JsonProperty("shipping")
    public Shipping getShipping() {
        return shipping;
    }

    @JsonProperty("shipping")
    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    @JsonProperty("webUrl")
    public String getWebUrl() {
        return webUrl;
    }

    @JsonProperty("webUrl")
    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    @JsonProperty("relatedItemGroups")
    public RelatedItemGroups getRelatedItemGroups() {
        return relatedItemGroups;
    }

    @JsonProperty("relatedItemGroups")
    public void setRelatedItemGroups(RelatedItemGroups relatedItemGroups) {
        this.relatedItemGroups = relatedItemGroups;
    }

    @JsonProperty("ratingsReviews")
    public RatingsReviews getRatingsReviews() {
        return ratingsReviews;
    }

    @JsonProperty("ratingsReviews")
    public void setRatingsReviews(RatingsReviews ratingsReviews) {
        this.ratingsReviews = ratingsReviews;
    }

    @JsonProperty("partNumber")
    public Integer getPartNumber() {
        return partNumber;
    }

    @JsonProperty("partNumber")
    public void setPartNumber(Integer partNumber) {
        this.partNumber = partNumber;
    }

    @JsonProperty("info")
    public Info getInfo() {
        return info;
    }

    @JsonProperty("info")
    public void setInfo(Info info) {
        this.info = info;
    }

    @JsonProperty("attributeGroups")
    public AttributeGroups getAttributeGroups() {
        return attributeGroups;
    }

    @JsonProperty("attributeGroups")
    public void setAttributeGroups(AttributeGroups attributeGroups) {
        this.attributeGroups = attributeGroups;
    }

    @JsonProperty("dimensions")
    public Dimensions getDimensions() {
        return dimensions;
    }

    @JsonProperty("dimensions")
    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

}
