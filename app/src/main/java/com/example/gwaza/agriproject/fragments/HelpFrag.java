package com.example.gwaza.agriproject.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;

import com.example.gwaza.agriproject.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class HelpFrag extends Fragment {

    Spinner spinner,goatOptions;
    Button  okButton,okButton2,okButton3 ;
    LinearLayout layout2,layout3;



    public HelpFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_help, container, false);
        spinner = view.findViewById(R.id.help_spinner);
        okButton = view.findViewById(R.id.btnsubmitselection);
        okButton2 = view.findViewById(R.id.btnsubmitselection2_goat);
        okButton3 = view.findViewById(R.id.btnsubmitselection3_goat);

        goatOptions = view.findViewById(R.id.help_goat_options);
        layout2 = view.findViewById(R.id.second_options);
        layout2 = view.findViewById(R.id.third_options);
        return view;

    }

    @Override
    public void onStart() {
        super.onStart();


        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int selection = spinner.getSelectedItemPosition();
                if(selection==1){
                    layout2.setVisibility(View.VISIBLE);
                }else if(selection==2){

                }


            }
        });
        okButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int selection = spinner.getSelectedItemPosition();
                if(selection==1){
                    layout3.setVisibility(View.VISIBLE);
                }else if(selection==2){

                }
            }
        });

        okButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            showHelp();
            }
        });




    }

    public void showHelp(){
        FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.flmain, new ViewHelpResultFrag());
        ft.commit();

    }



}
