package com.example.gwaza.agriproject;


import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.gwaza.agriproject.models.Question;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContactExpertFrag extends Fragment {

    Button btnsubmit;
    ImageButton  btnCall, btnEmail;
    EditText subject, messageBody;

    ProgressDialog progressDialog;

    FirebaseDatabase mDatabase =FirebaseDatabase.getInstance();
    DatabaseReference mRef = mDatabase.getReference("Questions");



    public ContactExpertFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_contact_expert, container, false);

       btnsubmit = view.findViewById(R.id.btnsubmit);
       btnCall = view.findViewById(R.id.btncall);
       btnEmail = view.findViewById(R.id.btnemail);

       subject=view.findViewById(R.id.txtsubject);
       messageBody=view.findViewById(R.id.txtmessagebody);

       progressDialog = new ProgressDialog(getActivity());

       return view;
    }

    @Override
    public void onStart() {
        super.onStart();

        btnsubmit.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {

                String qSubject =subject.getText().toString();
                String qMessageBody=messageBody.getText().toString();

                if(TextUtils.isEmpty(qSubject)){
                    Toast.makeText(getActivity(),"please enter  subject ",Toast.LENGTH_SHORT).show();
                }

                if(TextUtils.isEmpty(qMessageBody)){
                    Toast.makeText(getActivity(),"Please Enter Your message ",Toast.LENGTH_SHORT).show();

                }

                mRef.setValue(new Question(qSubject,qMessageBody));
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.flmain,new SuccessFrag());
                ft.commit();
            }
        });

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startCall();
            }
        });

        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendEmail();
            }
        });

    }

    private void sendEmail() {

        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");

        emailIntent.putExtra(Intent.EXTRA_EMAIL  , new String[]{"agriproject@gmail.com"});
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "FARMER SEEKING HELP");
        emailIntent.putExtra(Intent.EXTRA_TEXT, messageBody.getText().toString());
        try {
            startActivity(Intent.createChooser(emailIntent, "Send mail..."));
            getActivity().finish();
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getActivity(), "There is no email client installed.", Toast.LENGTH_SHORT).show();
        }
    }

    private void startCall() {
        Intent callIntent  =   new Intent(Intent.ACTION_DIAL);
        startActivity(callIntent);

    }

}
