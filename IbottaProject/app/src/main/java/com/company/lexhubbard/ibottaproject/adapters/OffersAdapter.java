package com.company.lexhubbard.ibottaproject.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.company.lexhubbard.ibottaproject.R;
import com.company.lexhubbard.ibottaproject.activities.OffersActivity;
import com.company.lexhubbard.ibottaproject.data.Offer;
import com.squareup.picasso.Picasso;

import java.util.List;

public class OffersAdapter extends RecyclerView.Adapter {

    public interface OnOfferClickListener {
        void onOfferClick(Offer offer);
    }

    private Context mContext;
    private OnOfferClickListener mListener;
    private List<Offer> mOffers;

    public OffersAdapter(Context context, List<Offer> offers) {
        mContext = context;
        mListener = (OffersActivity) context;
        mOffers = offers;
    }

    public Offer getItem(int position) {
        return mOffers.get(position);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_view_retailer, viewGroup, false);
        final OfferViewHolder viewHolder = new OfferViewHolder(view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.onOfferClick(getItem(viewHolder.getAdapterPosition()));
            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Offer offer = getItem(position);

        OfferViewHolder retailerViewHolder = (OfferViewHolder) holder;
        retailerViewHolder.name.setText(offer.getName());

        String largeUrl = offer.getLargeUrl();
        if (!TextUtils.isEmpty(largeUrl)) {
            Picasso.with(mContext).load(largeUrl).into(retailerViewHolder.icon);
        }
    }

    @Override
    public int getItemCount() {
        return mOffers != null ? mOffers.size() : 0;
    }

    public static class OfferViewHolder extends RecyclerView.ViewHolder {

        ImageView icon;
        TextView name;

        public OfferViewHolder(View itemView) {
            super(itemView);
            icon = itemView.findViewById(R.id.retailer_icon);
            name = itemView.findViewById(R.id.retailer_name);
        }
    }

}
