package com.example.datapassing_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Home extends AppCompatActivity {
    TextView textViewemail;
    TextView textViewpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        textViewemail  = findViewById(R.id.email);
        textViewpassword = findViewById(R.id.password);

        Intent i = getIntent();
        String email = i.getStringExtra("email");
        String password = i.getStringExtra("password");

        textViewemail.setText(""+email);
        textViewpassword.setText(""+password);





    }
}