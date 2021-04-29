package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main extends AppCompatActivity {
    private static final String Debug = "Debug_Main_Act";
    public static final String DISPLAY_KEY = "Display_Key";
    public static final String BUNDLE_KEY = "Bundle_Key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(Debug, "On Create!!");
    }

    //  在MainActivity顯示輸入訊息
    public void displayHere(View view) {
        EditText mainActivityMessage = findViewById(R.id.MainActivityMessage);
        String message = mainActivityMessage.getText().toString();
        TextView messageResult = findViewById(R.id.MessageResult);
        messageResult.setText(message);
    }

    //  將輸入訊息送至DisplayAct
    public void sendToDisplay(View view) {
        Intent intent = new Intent(this, Display.class);
        EditText editText = findViewById(R.id.MainActivityMessage);
        String message = editText.getText().toString();
//        Bundle bundle = new Bundle();
//        bundle.putString(BUNDLE_KEY, message);
        intent.putExtra(DISPLAY_KEY, message);
//        intent.putExtra(BUNDLE_KEY, bundle);
        startActivity(intent);
    }

    public void toOtherAct(View view) {
//        Log.d(Debug, view.toString());
        Integer id = view.getId();
        switch (id) {
            case R.id.Toast:
                Intent intent = new Intent(this, ToastCounter.class);
                startActivity(intent);
                break;
            case R.id.Other:
                Toast.makeText(this, "功能尚未實作",Toast.LENGTH_LONG).show();
                break;
        }


    }
}