package com.example.signupapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SignUpScreen extends AppCompatActivity {

    public static final String EXTRA_NAME = "com.example.signupapp.NAME";
    public static final String EXTRA_USERNAME = "com.example.userinputapp.USERNAME";
    public static final String EXTRA_PHONE = "com.example.userinputapp.PHONE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_screen);
    }

    public void sendMessage(View v) {
        // creating the ability to switch screens (addressing the envelope)
        Intent switchIntent = new Intent(this, FinishedScreen.class);

        EditText nameET = findViewById(R.id.editTextTextPersonName);
        EditText usernameET = findViewById(R.id.editTextTextPersonName2);
        EditText phoneET = findViewById(R.id.editTextTextPersonName3);

        String name = nameET.getText().toString();
        String username = usernameET.getText().toString();
        String phone = phoneET.getText().toString();

        switchIntent.putExtra(EXTRA_NAME, name);
        switchIntent.putExtra(EXTRA_USERNAME, username);
        switchIntent.putExtra(EXTRA_PHONE, phone);

        startActivity(switchIntent);
    }

    public void goHome(View v) {
        // creating the ability to switch screens (addressing the envelope)
        Intent switchIntent = new Intent(this, MainActivity.class);
        startActivity(switchIntent);
    }
    public void submit(View v) {
        // creating the ability to switch screens (addressing the envelope)
        Intent switchIntent = new Intent(this, FinishedScreen.class);
        startActivity(switchIntent);
    }
}

