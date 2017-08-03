package com.company.lexhubbard.ibottaproject.activities;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.company.lexhubbard.ibottaproject.R;
import com.company.lexhubbard.ibottaproject.adapters.RetailersAdapter;
import com.company.lexhubbard.ibottaproject.data.Offer;
import com.company.lexhubbard.ibottaproject.data.Offers;
import com.company.lexhubbard.ibottaproject.data.Retailer;
import com.company.lexhubbard.ibottaproject.data.Retailers;
import com.google.gson.Gson;

import java.util.List;

public class MainActivity extends BaseActivity implements RetailersAdapter.OnRetailerClickListener {

    private static final String OFFERS_JSON = "Offers.json";
    private static final String RETAILERS_JSON = "Retailers.json";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RetailersAdapter adapter = new RetailersAdapter(this, getRetailers());
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    public List<Retailer> getRetailers() {
        Gson gson = new Gson();
        Retailers retailers = gson.fromJson(loadJSONFromAsset(RETAILERS_JSON), Retailers.class);
        return retailers.getRetailers();
    }

    public List<Offer> getOffers() {
        Gson gson = new Gson();
        Offers offers = gson.fromJson(loadJSONFromAsset(OFFERS_JSON), Offers.class);
        return offers.getOffers();
    }

    @Override
    public void onRetailerClick(Retailer retailer) {
        Toast.makeText(this, retailer.getName() + " clicked!", Toast.LENGTH_LONG).show();
    }

}
