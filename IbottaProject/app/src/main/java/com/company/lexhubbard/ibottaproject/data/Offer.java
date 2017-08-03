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
    @SerializedName("retailers")
    @Expose
    private List<Integer> retailers = null;
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

    public List<Integer> getRetailers() {
        return retailers;
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
