package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ToastCounter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast_counter);
    }


    public void showToast(View view){
        Toast toast = Toast.makeText(this,"Hello Toast", Toast.LENGTH_LONG);
        toast.show();
    }

    public void countNumber(View view){
        TextView textView = findViewById(R.id.show_count);
        int number = Integer.parseInt(textView.getText().toString());
        number++;
        String result = Integer.toString(number);
        textView.setText(result);
    }
}