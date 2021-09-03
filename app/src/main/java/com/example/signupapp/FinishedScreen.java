package com.example.signupapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FinishedScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finished_screen);
    }

    public void startOver(View v) {
        // creating the ability to switch screens (addressing the envelope)
        Intent switchIntent = new Intent(this, MainActivity.class);
        startActivity(switchIntent);
    }
}