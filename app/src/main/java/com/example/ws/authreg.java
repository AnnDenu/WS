package com.example.ws;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class authreg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authreg);
    }
    public void authreg(View view) {
        Intent intent = new Intent(this, CodeNet.class);
        startActivity(intent);
    }

}