package com.example.gwaza.agriproject.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import com.example.gwaza.agriproject.R;

import java.util.List;

/**
 * Created by gwaza on 1/24/2019.
 */

public class FaqsAdapter extends RecyclerView.Adapter<FaqsAdapter.FaqsViewHolder> {

    List<String> questions;

    @Override
    public FaqsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(FaqsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return questions.size();
    }

    class FaqsViewHolder extends RecyclerView.ViewHolder{

        TextView quiz;
        public FaqsViewHolder(View itemView) {

            super(itemView);
            quiz = itemView.findViewById(R.id.txtquiz);

        }
    }
}
