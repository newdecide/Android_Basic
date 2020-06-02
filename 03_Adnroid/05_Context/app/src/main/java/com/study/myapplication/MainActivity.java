package com.study.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context activityContext1 = this;
        Context activityContext2 = MainActivity.this;

        Context applicationContext = getApplicationContext();
    }
}
