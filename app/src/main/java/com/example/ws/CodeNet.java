package com.example.ws;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CodeNet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_net);
    }
    public void codenet(View view) {
        Intent intent = new Intent(this, authreg.class);
        startActivity(intent);
    }
    public void next(View view) {
        Intent intent = new Intent(this, CreatePassword.class);
        startActivity(intent);
    }
}