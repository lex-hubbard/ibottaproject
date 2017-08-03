package com.company.lexhubbard.ibottaproject.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.MenuItem;
import android.widget.ImageView;

import com.company.lexhubbard.ibottaproject.DataHelper;
import com.company.lexhubbard.ibottaproject.R;
import com.company.lexhubbard.ibottaproject.adapters.OffersAdapter;
import com.company.lexhubbard.ibottaproject.data.Offer;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class OffersActivity extends AppCompatActivity implements OffersAdapter.OnOfferClickListener {

    public static final String OFFER_IMAGE_URL = "offerImage";
    public static final String OFFER_NAME = "offerName";
    public static final String OFFER_AMOUNT = "offerAmount";
    public static final String OFFER_DESCRIPTION = "offerDescription";
    public static final String OFFER_ACTIVE = "offerActive";
    public static final String OFFER_EXPIRATION = "offerExpiration";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offers);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        String retailerBannerUrl = getIntent().getStringExtra(RetailersActivity.RETAILER_BANNER_URL);
        if (!TextUtils.isEmpty(retailerBannerUrl)) {
            ImageView bannerView = (ImageView) findViewById(R.id.retailer_banner);
            Picasso.with(this).load(retailerBannerUrl).into(bannerView);
        }

        setUpOffers();
    }

    private void setUpOffers() {
        Integer retailerId = getIntent().getIntExtra(RetailersActivity.RETAILER_ID, -1);

        List<Offer> offers = DataHelper.getOffers(this);
        List<Offer> retailerOffers = new ArrayList<>();
        for (Offer offer : offers) {
            if (offer.getRetailers().contains(retailerId)) {
                retailerOffers.add(offer);
            }
        }

        OffersAdapter adapter = new OffersAdapter(this, retailerOffers);
        RecyclerView retailerRecyclerView = (RecyclerView) findViewById(R.id.offers_recycler);
        retailerRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        retailerRecyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                OffersActivity.this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onOfferClick(Offer offer) {
        Intent intent = new Intent(getBaseContext(), OfferDetailActivity.class);
        intent.putExtra(OFFER_IMAGE_URL, offer.getLargeUrl());
        intent.putExtra(OFFER_NAME, offer.getName());
        intent.putExtra(OFFER_AMOUNT, offer.getAmount());
        intent.putExtra(OFFER_DESCRIPTION, offer.getDescription());
        intent.putExtra(OFFER_ACTIVE, offer.getActive());
        intent.putExtra(OFFER_EXPIRATION, offer.getExpiration());
        startActivity(intent);
    }

}
