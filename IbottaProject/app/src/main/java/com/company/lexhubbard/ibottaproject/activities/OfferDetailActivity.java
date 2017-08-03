package com.company.lexhubbard.ibottaproject.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.company.lexhubbard.ibottaproject.R;
import com.squareup.picasso.Picasso;

public class OfferDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offer_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Intent intent = getIntent();
        setUpOfferDetail(intent);
    }

    private void setUpOfferDetail(Intent intent) {
        String offerImageUrl = intent.getStringExtra(OffersActivity.OFFER_IMAGE_URL);
        if (!TextUtils.isEmpty(offerImageUrl)) {
            ImageView offerImageView = (ImageView) findViewById(R.id.offer_image);
            Picasso.with(this).load(offerImageUrl).into(offerImageView);
        }

        String offerName = intent.getStringExtra(OffersActivity.OFFER_NAME);
        double offerAmount = intent.getDoubleExtra(OffersActivity.OFFER_AMOUNT, 0);
        String offerDescription = intent.getStringExtra(OffersActivity.OFFER_DESCRIPTION);
        boolean offerActive = intent.getBooleanExtra(OffersActivity.OFFER_ACTIVE, false);
        String offerExpiration = intent.getStringExtra(OffersActivity.OFFER_EXPIRATION);

        TextView name = (TextView) findViewById(R.id.offer_name);
        TextView amount = (TextView) findViewById(R.id.offer_amount);
        TextView description = (TextView) findViewById(R.id.offer_description);
        TextView active = (TextView) findViewById(R.id.offer_active);
        TextView expiration = (TextView) findViewById(R.id.offer_expiration);

        name.setText(offerName);
        amount.setText(Double.toString(offerAmount));
        description.setText(offerDescription);
        active.setText(offerActive ? getString(R.string.active) : getString(R.string.inactive));
        expiration.setText(offerExpiration);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                OfferDetailActivity.this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
