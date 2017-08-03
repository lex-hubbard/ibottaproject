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

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public String getLargeUrl() {
        return largeUrl;
    }

    public void setLargeUrl(String largeUrl) {
        this.largeUrl = largeUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Object> getOfferTags() {
        return offerTags;
    }

    public void setOfferTags(List<Object> offerTags) {
        this.offerTags = offerTags;
    }

    public List<Object> getPromos() {
        return promos;
    }

    public void setPromos(List<Object> promos) {
        this.promos = promos;
    }

    public String getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType;
    }

    public List<Integer> getRetailers() {
        return retailers;
    }

    public void setRetailers(List<Integer> retailers) {
        this.retailers = retailers;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
