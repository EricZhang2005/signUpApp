package com.example.signupapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FinishedScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finished_screen);

        Intent signUpInfo = getIntent();

        String name = signUpInfo.getStringExtra(SignUpScreen.EXTRA_NAME);
        String username = signUpInfo.getStringExtra(SignUpScreen.EXTRA_USERNAME);
        String phone = signUpInfo.getStringExtra(SignUpScreen.EXTRA_PHONE);

        TextView displayName = findViewById(R.id.nameSubmit);
        TextView displayUsername = findViewById(R.id.usernameSubmit);
        TextView displayPhone = findViewById(R.id.phoneSubmit);

        displayName.setText(name);
        displayUsername.setText(username);
        displayPhone.setText(phone);

    }

    public void startOver(View v) {
        // creating the ability to switch screens (addressing the envelope)
        Intent switchIntent = new Intent(this, MainActivity.class);
        startActivity(switchIntent);
    }
}