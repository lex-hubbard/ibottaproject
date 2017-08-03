package com.company.lexhubbard.ibottaproject.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Retailer {

    @SerializedName("exclusive_image_url")
    @Expose
    private String exclusiveImageUrl;
    @SerializedName("icon_url")
    @Expose
    private String iconUrl;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("stores")
    @Expose
    private List<Object> stores = null;
    @SerializedName("id")
    @Expose
    private Integer id;

    public String getExclusiveImageUrl() {
        return exclusiveImageUrl;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public String getName() {
        return name;
    }

    public List<Object> getStores() {
        return stores;
    }

    public Integer getId() {
        return id;
    }

}
