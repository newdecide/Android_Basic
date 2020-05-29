package com.study.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent comingIntent = getIntent();
        boolean again = comingIntent.getBooleanExtra("AGAIN", true);

        if (again == true) {
            Intent secondintent = new Intent(this, SecondActivity.class);
            startActivity(secondintent);
        }
    }
}
