package com.company.lexhubbard.ibottaproject.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Offers {

    @SerializedName("offers")
    @Expose
    private List<Offer> offers;

    public List<Offer> getOffers() {
        return offers;
    }

}
