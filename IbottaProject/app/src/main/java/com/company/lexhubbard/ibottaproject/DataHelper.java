package com.company.lexhubbard.ibottaproject;

import android.content.Context;
import android.util.Log;

import com.company.lexhubbard.ibottaproject.data.Offer;
import com.company.lexhubbard.ibottaproject.data.Offers;
import com.company.lexhubbard.ibottaproject.data.Retailer;
import com.company.lexhubbard.ibottaproject.data.Retailers;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class DataHelper {

    private static final String TAG = DataHelper.class.getSimpleName();

    private static final String RETAILERS_JSON = "Retailers.json";
    private static final String OFFERS_JSON = "Offers.json";

    private static List<Offer> sOffers;

    public static void initOffers(Context context) {
        sOffers = loadOffers(context);
    }

    public static List<Offer> getOffers(Context context) {
        if (sOffers == null) {
            initOffers(context);
        }
        return sOffers;
    }

    public static List<Offer> loadOffers(Context context) {
        Gson gson = new Gson();
        Offers offers = gson.fromJson(loadJSONFromAsset(context, OFFERS_JSON), Offers.class);
        return offers.getOffers();
    }

    public static List<Retailer> loadRetailers(Context context) {
        Gson gson = new Gson();
        Retailers retailers = gson.fromJson(loadJSONFromAsset(context, RETAILERS_JSON), Retailers.class);
        return retailers.getRetailers();
    }

    public static String loadJSONFromAsset(Context context, String fileName) {
        String json = null;
        try {
            InputStream inputStream = context.getAssets().open(fileName);

            int size = inputStream.available();
            byte[] buffer = new byte[size];

            inputStream.read(buffer);
            inputStream.close();

            json = new String(buffer, "UTF-8");

        } catch (IOException e) {
            Log.e(TAG, "There was a problem loading a JSON asset: " + fileName, e);
            return null;
        }

        return json;
    }
}
