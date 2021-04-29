package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Intent intent = getIntent();
//        Bundle bundle = intent.getBundleExtra(Main.BUNDLE_KEY);
        String message = intent.getStringExtra(Main.DISPLAY_KEY);
        TextView showMessage = findViewById(R.id.showMessage);
        showMessage.setText(message);

    }
}