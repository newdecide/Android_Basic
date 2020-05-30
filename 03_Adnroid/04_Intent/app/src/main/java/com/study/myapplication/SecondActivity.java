package com.study.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        int data = intent.getIntExtra("INTENT_KEY_INT", 5);
        String data2 = intent.getStringExtra("INTENT_KEY_STRING");
        Log.d("intent_key_int", "" + data);
        Log.d("intent_key_string", "" + data2);

    }
}
