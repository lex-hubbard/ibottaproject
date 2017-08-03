package com.company.lexhubbard.ibottaproject.data;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Retailers {

    @SerializedName("retailers")
    @Expose
    private List<Retailer> retailers;

    public List<Retailer> getRetailers() {
        return retailers;
    }

}