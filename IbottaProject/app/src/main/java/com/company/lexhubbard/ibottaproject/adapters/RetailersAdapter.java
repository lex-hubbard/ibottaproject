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
import com.company.lexhubbard.ibottaproject.activities.MainActivity;
import com.company.lexhubbard.ibottaproject.data.Retailer;
import com.squareup.picasso.Picasso;

import java.util.List;

public class RetailersAdapter extends RecyclerView.Adapter {

    public interface OnRetailerClickListener {
        void onRetailerClick(Retailer retailer);
    }

    private Context mContext;
    private OnRetailerClickListener mListener;
    private List<Retailer> mRetailers;

    public RetailersAdapter(Context context, List<Retailer> retailerList) {
        mContext = context;
        mListener = (MainActivity) context;
        mRetailers = retailerList;
    }

    public Retailer getItem(int position) {
        return mRetailers.get(position);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_view_retailer, viewGroup, false);
        final RetailerViewHolder viewHolder = new RetailerViewHolder(view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.onRetailerClick(getItem(viewHolder.getAdapterPosition()));
            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Retailer retailer = getItem(position);

        RetailerViewHolder retailerViewHolder = (RetailerViewHolder) holder;
        retailerViewHolder.name.setText(retailer.getName());

        String iconUrl = retailer.getIconUrl();
        if (!TextUtils.isEmpty(iconUrl)) {
            Picasso.with(mContext).load(retailer.getIconUrl()).into(retailerViewHolder.icon);
        }
    }

    @Override
    public int getItemCount() {
        return mRetailers != null ? mRetailers.size() : 0;
    }

    public static class RetailerViewHolder extends RecyclerView.ViewHolder {

        ImageView icon;
        TextView name;

        public RetailerViewHolder(View itemView) {
            super(itemView);
            icon = itemView.findViewById(R.id.retailer_icon);
            name = itemView.findViewById(R.id.retailer_name);
        }
    }

}
