package com.example.signupapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignUpScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_screen);
    }

    public void sendMessage(View v) {
        // creating the ability to switch screens (addressing the envelope)
        Intent switchIntent = new Intent(this, FinishedScreen.class);
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

