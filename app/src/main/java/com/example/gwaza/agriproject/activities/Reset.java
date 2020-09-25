package com.example.gwaza.agriproject.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.gwaza.agriproject.R;

public class Reset extends Activity {
private Button resetEmail, signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset);

        resetEmail = findViewById(R.id.btnresetemail);
        signin = findViewById(R.id.btnresetsignin);

    }

    @Override
    protected void onStart() {
        super.onStart();
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Login.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
