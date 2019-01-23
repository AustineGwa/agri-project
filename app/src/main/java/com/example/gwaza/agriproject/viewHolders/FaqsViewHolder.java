package com.example.gwaza.agriproject.viewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.gwaza.agriproject.R;

/**
 * Created by gwaza on 1/19/2019.
 */

public class FaqsViewHolder extends RecyclerView.ViewHolder {
    TextView question;

    public FaqsViewHolder(View itemView) {
        super(itemView);
        question = itemView.findViewById(R.id.txtquiz);
    }
}
