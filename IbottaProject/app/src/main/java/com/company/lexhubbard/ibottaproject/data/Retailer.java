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
    @SerializedName("sort_order")
    @Expose
    private Integer sortOrder;

    public String getExclusiveImageUrl() {
        return exclusiveImageUrl;
    }

    public void setExclusiveImageUrl(String exclusiveImageUrl) {
        this.exclusiveImageUrl = exclusiveImageUrl;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Object> getStores() {
        return stores;
    }

    public void setStores(List<Object> stores) {
        this.stores = stores;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

}
