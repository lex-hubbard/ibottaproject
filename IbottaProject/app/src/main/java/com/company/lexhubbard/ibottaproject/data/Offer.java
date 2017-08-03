package com.company.lexhubbard.ibottaproject.data;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Offer {

    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("expiration")
    @Expose
    private String expiration;
    @SerializedName("large_url")
    @Expose
    private String largeUrl;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("offer_tags")
    @Expose
    private List<Object> offerTags = null;
    @SerializedName("promos")
    @Expose
    private List<Object> promos = null;
    @SerializedName("purchase_type")
    @Expose
    private String purchaseType;
    @SerializedName("retailers")
    @Expose
    private List<Integer> retailers = null;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("active")
    @Expose
    private Boolean active;
    @SerializedName("amount")
    @Expose
    private Double amount;
    @SerializedName("id")
    @Expose
    private Integer id;

    public String getDescription() {
        return description;
    }

    public String getExpiration() {
        return expiration;
    }

    public String getLargeUrl() {
        return largeUrl;
    }

    public String getName() {
        return name;
    }

    public List<Object> getOfferTags() {
        return offerTags;
    }

    public List<Object> getPromos() {
        return promos;
    }

    public String getPurchaseType() {
        return purchaseType;
    }

    public List<Integer> getRetailers() {
        return retailers;
    }

    public String getType() {
        return type;
    }

    public String getUrl() {
        return url;
    }

    public Boolean getActive() {
        return active;
    }

    public Double getAmount() {
        return amount;
    }

    public Integer getId() {
        return id;
    }

}
