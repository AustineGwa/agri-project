package com.example.gwaza.agriproject.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.gwaza.agriproject.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ViewHelpResultFrag extends Fragment {
    ImageButton like, share;


    public ViewHelpResultFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_view_help_result, container, false);
       like = view.findViewById(R.id.btnlike);
       share = view.findViewById(R.id.btnshare);
       return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                likePost();
            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sharePost();
            }
        });
    }

    private void sharePost() {
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_SUBJECT,"AGRI-HELPER");
        shareIntent.putExtra(Intent.EXTRA_TEXT,"Please download this app to get help in agriculture");
        startActivity(Intent.createChooser(shareIntent,"Share using..."));
    }

    private void likePost() {
        Toast.makeText(getActivity(),"Thanks for liking this  post pleaseshare  the app",Toast.LENGTH_SHORT).show();
    }
}
