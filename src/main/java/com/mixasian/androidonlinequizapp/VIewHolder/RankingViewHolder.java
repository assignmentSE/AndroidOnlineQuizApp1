package com.mixasian.androidonlinequizapp.VIewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.mixasian.androidonlinequizapp.Interface.ItemClickListener;
import com.mixasian.androidonlinequizapp.R;

/**
 * Created by Asus on 12/19/2017.
 */

public class RankingViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView txt_name, txt_score;

    private ItemClickListener itemClickListener;

    public RankingViewHolder(View itemView) {
        super(itemView);
        txt_name =(TextView) itemView.findViewById(R.id.txt_name);
        txt_score =(TextView) itemView.findViewById(R.id.txt_score);
        itemView.setOnClickListener(this);

    }

    public void setTxt_name(TextView txt_name) {
        this.txt_name = txt_name;
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View view) {
        itemClickListener.onClick(view,getAdapterPosition(),false);

    }
}
