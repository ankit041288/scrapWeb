
package com.Homedepot.DTOs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
    "productDepartment",
    "productLabel",
    "specialOrderSKU",
    "brandName",
    "showProduct",
    "productClass",
    "backOrderFlag",
    "onlineStatus",
    "hasIrgItems",
    "description",
    "upc",
    "isAppliance",
    "isTopSeller",
    "buyOnlinePickupInStoreEligible",
    "genericBrandFlag",
    "shipType",
    "buyOnlineShipToStoreEligible",
    "modelNumber",
    "productSubClass",
    "vendorNumber",
    "hasFbtItems",
    "showLocalPrice"
})
public class Info {

    @JsonProperty("productDepartment")
    private Integer productDepartment;
    @JsonProperty("productLabel")
    private String productLabel;
    @JsonProperty("specialOrderSKU")
    private Integer specialOrderSKU;
    @JsonProperty("brandName")
    private String brandName;
    @JsonProperty("showProduct")
    private Boolean showProduct;
    @JsonProperty("productClass")
    private Integer productClass;
    @JsonProperty("backOrderFlag")
    private Boolean backOrderFlag;
    @JsonProperty("onlineStatus")
    private Boolean onlineStatus;
    @JsonProperty("hasIrgItems")
    private Boolean hasIrgItems;
    @JsonProperty("description")
    private String description;
    @JsonProperty("upc")
    private String upc;
    @JsonProperty("isAppliance")
    private Boolean isAppliance;
    @JsonProperty("isTopSeller")
    private Boolean isTopSeller;
    @JsonProperty("buyOnlinePickupInStoreEligible")
    private Boolean buyOnlinePickupInStoreEligible;
    @JsonProperty("genericBrandFlag")
    private Boolean genericBrandFlag;
    @JsonProperty("shipType")
    private Integer shipType;
    @JsonProperty("buyOnlineShipToStoreEligible")
    private Boolean buyOnlineShipToStoreEligible;
    @JsonProperty("modelNumber")
    private String modelNumber;
    @JsonProperty("productSubClass")
    private Integer productSubClass;
    @JsonProperty("vendorNumber")
    private Integer vendorNumber;
    @JsonProperty("hasFbtItems")
    private Boolean hasFbtItems;
    @JsonProperty("showLocalPrice")
    private Boolean showLocalPrice;

    @JsonProperty("productDepartment")
    public Integer getProductDepartment() {
        return productDepartment;
    }

    @JsonProperty("productDepartment")
    public void setProductDepartment(Integer productDepartment) {
        this.productDepartment = productDepartment;
    }

    @JsonProperty("productLabel")
    public String getProductLabel() {
        return productLabel;
    }

    @JsonProperty("productLabel")
    public void setProductLabel(String productLabel) {
        this.productLabel = productLabel;
    }

    @JsonProperty("specialOrderSKU")
    public Integer getSpecialOrderSKU() {
        return specialOrderSKU;
    }

    @JsonProperty("specialOrderSKU")
    public void setSpecialOrderSKU(Integer specialOrderSKU) {
        this.specialOrderSKU = specialOrderSKU;
    }

    @JsonProperty("brandName")
    public String getBrandName() {
        return brandName;
    }

    @JsonProperty("brandName")
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @JsonProperty("showProduct")
    public Boolean getShowProduct() {
        return showProduct;
    }

    @JsonProperty("showProduct")
    public void setShowProduct(Boolean showProduct) {
        this.showProduct = showProduct;
    }

    @JsonProperty("productClass")
    public Integer getProductClass() {
        return productClass;
    }

    @JsonProperty("productClass")
    public void setProductClass(Integer productClass) {
        this.productClass = productClass;
    }

    @JsonProperty("backOrderFlag")
    public Boolean getBackOrderFlag() {
        return backOrderFlag;
    }

    @JsonProperty("backOrderFlag")
    public void setBackOrderFlag(Boolean backOrderFlag) {
        this.backOrderFlag = backOrderFlag;
    }

    @JsonProperty("onlineStatus")
    public Boolean getOnlineStatus() {
        return onlineStatus;
    }

    @JsonProperty("onlineStatus")
    public void setOnlineStatus(Boolean onlineStatus) {
        this.onlineStatus = onlineStatus;
    }

    @JsonProperty("hasIrgItems")
    public Boolean getHasIrgItems() {
        return hasIrgItems;
    }

    @JsonProperty("hasIrgItems")
    public void setHasIrgItems(Boolean hasIrgItems) {
        this.hasIrgItems = hasIrgItems;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("upc")
    public String getUpc() {
        return upc;
    }

    @JsonProperty("upc")
    public void setUpc(String upc) {
        this.upc = upc;
    }

    @JsonProperty("isAppliance")
    public Boolean getIsAppliance() {
        return isAppliance;
    }

    @JsonProperty("isAppliance")
    public void setIsAppliance(Boolean isAppliance) {
        this.isAppliance = isAppliance;
    }

    @JsonProperty("isTopSeller")
    public Boolean getIsTopSeller() {
        return isTopSeller;
    }

    @JsonProperty("isTopSeller")
    public void setIsTopSeller(Boolean isTopSeller) {
        this.isTopSeller = isTopSeller;
    }

    @JsonProperty("buyOnlinePickupInStoreEligible")
    public Boolean getBuyOnlinePickupInStoreEligible() {
        return buyOnlinePickupInStoreEligible;
    }

    @JsonProperty("buyOnlinePickupInStoreEligible")
    public void setBuyOnlinePickupInStoreEligible(Boolean buyOnlinePickupInStoreEligible) {
        this.buyOnlinePickupInStoreEligible = buyOnlinePickupInStoreEligible;
    }

    @JsonProperty("genericBrandFlag")
    public Boolean getGenericBrandFlag() {
        return genericBrandFlag;
    }

    @JsonProperty("genericBrandFlag")
    public void setGenericBrandFlag(Boolean genericBrandFlag) {
        this.genericBrandFlag = genericBrandFlag;
    }

    @JsonProperty("shipType")
    public Integer getShipType() {
        return shipType;
    }

    @JsonProperty("shipType")
    public void setShipType(Integer shipType) {
        this.shipType = shipType;
    }

    @JsonProperty("buyOnlineShipToStoreEligible")
    public Boolean getBuyOnlineShipToStoreEligible() {
        return buyOnlineShipToStoreEligible;
    }

    @JsonProperty("buyOnlineShipToStoreEligible")
    public void setBuyOnlineShipToStoreEligible(Boolean buyOnlineShipToStoreEligible) {
        this.buyOnlineShipToStoreEligible = buyOnlineShipToStoreEligible;
    }

    @JsonProperty("modelNumber")
    public String getModelNumber() {
        return modelNumber;
    }

    @JsonProperty("modelNumber")
    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    @JsonProperty("productSubClass")
    public Integer getProductSubClass() {
        return productSubClass;
    }

    @JsonProperty("productSubClass")
    public void setProductSubClass(Integer productSubClass) {
        this.productSubClass = productSubClass;
    }

    @JsonProperty("vendorNumber")
    public Integer getVendorNumber() {
        return vendorNumber;
    }

    @JsonProperty("vendorNumber")
    public void setVendorNumber(Integer vendorNumber) {
        this.vendorNumber = vendorNumber;
    }

    @JsonProperty("hasFbtItems")
    public Boolean getHasFbtItems() {
        return hasFbtItems;
    }

    @JsonProperty("hasFbtItems")
    public void setHasFbtItems(Boolean hasFbtItems) {
        this.hasFbtItems = hasFbtItems;
    }

    @JsonProperty("showLocalPrice")
    public Boolean getShowLocalPrice() {
        return showLocalPrice;
    }

    @JsonProperty("showLocalPrice")
    public void setShowLocalPrice(Boolean showLocalPrice) {
        this.showLocalPrice = showLocalPrice;
    }

}
