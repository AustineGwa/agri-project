package com.example.gwaza.agriproject.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import com.example.gwaza.agriproject.R;
import com.example.gwaza.agriproject.interfaces.OnQuestionClick;
import com.example.gwaza.agriproject.models.Faqs;

import java.util.List;

/**
 * Created by gwaza on 1/24/2019.
 */

public class FaqsAdapter extends RecyclerView.Adapter<FaqsAdapter.FaqsViewHolder> {

    private List<Faqs> questions;
    private OnQuestionClick onQuestionClick;

    public FaqsAdapter(List<Faqs> questions, OnQuestionClick onQuestionClick) {
        this.questions = questions;
        this.onQuestionClick = onQuestionClick;
    }

    @Override
    public FaqsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.faqs_row, parent,false);
        FaqsViewHolder holder = new FaqsViewHolder(onQuestionClick,view);
        return holder;
    }

    @Override
    public void onBindViewHolder(FaqsViewHolder holder, int position) {

        holder.quiz.setText(questions.get(position).getQuestion());
    }

    @Override
    public int getItemCount() {
        return questions.size();
    }

    class FaqsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        OnQuestionClick onQuestionClick;
        TextView quiz;
        public FaqsViewHolder(OnQuestionClick onQuestionClick , View itemView) {

            super(itemView);
            itemView.setOnClickListener(this);
            this.onQuestionClick = onQuestionClick;
            quiz = itemView.findViewById(R.id.txtquiz);

        }

        @Override
        public void onClick(View view) {

            onQuestionClick.onclick(view,getAdapterPosition());
        }
    }
}
