package com.example.datapassing_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTextemail,editTextpassword;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextemail = findViewById(R.id.Textemail);
        editTextpassword = findViewById(R.id.Textpassword);
        login =  findViewById(R.id.btn_login);
        login.setOnClickListener(v -> {
               GoToLogin();
        });

    }

    private void GoToLogin() {
        Intent i = new Intent(MainActivity.this,Home.class);
        String email = editTextemail.getText().toString();
        String password = editTextpassword.getText().toString();
        i.putExtra("email",email);
        i.putExtra("password",password);
        startActivity(i);

    }
}