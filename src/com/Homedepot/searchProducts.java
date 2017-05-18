package com.Homedepot;

/**
 * Created by axb4725 on 5/15/17.
 */
public class searchProducts {
    public void setURL(String URL) {
        this.URL = URL;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setCost(String cost) {
        Cost = cost;
    }


    String URL;
    String imageUrl;
    String Cost;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    String CompanyName;

    public String getURL() {
        return URL;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getCost() {
        return Cost;
    }
}
