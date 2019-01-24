package com.example.gwaza.agriproject;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.gwaza.agriproject.adapters.FaqsAdapter;
import com.example.gwaza.agriproject.interfaces.OnQuestionClick;
import com.example.gwaza.agriproject.models.Faqs;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FaqsFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<Faqs> questions;


    public FaqsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_faqs, container, false);

        questions = new ArrayList<>();

        questions.add(new Faqs("How many times should a goat eat"));
        questions.add(new Faqs("What is the best goat meal "));
        questions.add(new Faqs("what is sweet potato vines"));


        OnQuestionClick onQuestionClick = new OnQuestionClick() {
            @Override
            public void onclick(View view, int adapterPosition) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.flmain,new FaqsResult());
                ft.commit();
            }
        };

        mRecyclerView = view.findViewById(R.id.recycler_quizes);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new FaqsAdapter(questions,onQuestionClick);
        mRecyclerView.setAdapter(mAdapter);
        return view;
    }

}
