package com.example.ws;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OnboardThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboard_three);
    }
    public void onboardThree(View view) {
        Intent intent = new Intent(this, authreg.class);
        startActivity(intent);
    }
}