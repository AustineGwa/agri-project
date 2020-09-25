package com.example.gwaza.agriproject.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.gwaza.agriproject.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFrag extends Fragment {

ImageButton help, contactExpert, faqs, chat;
    public HomeFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        
                // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        help = view.findViewById(R.id.btnhelp);
        contactExpert = view.findViewById(R.id.btnconexpert);
        faqs = view.findViewById(R.id.btnfaqs);
        chat = view.findViewById(R.id.btnchat);
        return view;
        
      
    }

    @Override
    public void onStart() {
        super.onStart();
        
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                helpClicked();
            }
        });
        
        contactExpert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contactExpertClicked();
            }
        });
        
        faqs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                faqsClicked();
                
            }
        });
        
        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chatClicked();
            }
        });
    }

    private void faqsClicked() {
        FragmentTransaction ft  = getFragmentManager().beginTransaction();
        ft.replace(R.id.flmain, new FaqsFragment());
        ft.commit();
    }

    private void chatClicked() {
        Toast.makeText(getActivity(), "Chat  is  currently not Available", Toast.LENGTH_LONG).show();
    }

    private void contactExpertClicked() {
        FragmentTransaction  ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.flmain, new ContactExpertFrag());
        ft.commit();
    }

    private void helpClicked() {
        FragmentTransaction  ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.flmain,new HelpFrag());
        ft.commit();
    }
}
