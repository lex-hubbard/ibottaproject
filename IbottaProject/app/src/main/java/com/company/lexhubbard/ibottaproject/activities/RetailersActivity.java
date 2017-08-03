package com.company.lexhubbard.ibottaproject.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.company.lexhubbard.ibottaproject.DataHelper;
import com.company.lexhubbard.ibottaproject.R;
import com.company.lexhubbard.ibottaproject.adapters.RetailersAdapter;
import com.company.lexhubbard.ibottaproject.data.Retailer;

public class RetailersActivity extends AppCompatActivity implements RetailersAdapter.OnRetailerClickListener {

    public static final String RETAILER_ID = "retailerId";
    public static final String RETAILER_BANNER_URL = "retailerBannerUrl";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retailers);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RetailersAdapter adapter = new RetailersAdapter(this, DataHelper.loadRetailers(this));
        RecyclerView retailerRecyclerView = (RecyclerView) findViewById(R.id.retailers_recycler);
        retailerRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        retailerRecyclerView.setAdapter(adapter);

        DataHelper.initOffers(this);
    }

    @Override
    public void onRetailerClick(Retailer retailer) {
        Intent intent = new Intent(getBaseContext(), OffersActivity.class);
        intent.putExtra(RETAILER_ID, retailer.getId());
        intent.putExtra(RETAILER_BANNER_URL, retailer.getExclusiveImageUrl());
        startActivity(intent);
    }

}
