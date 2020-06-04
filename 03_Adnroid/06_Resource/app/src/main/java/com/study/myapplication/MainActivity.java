package com.study.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView dog1, dog2, dog3;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // xml의 뷰 컴포넌트를 가져오는 방법
        dog1 = findViewById(R.id.dog1);
        dog2 = findViewById(R.id.dog2);
        textView = findViewById(R.id.text);

        // xml의 뷰 컴포넌트를 동적으로 변경하는 방법
        dog2.setImageResource(R.drawable.dog3);
        textView.setText("안녕하십니까");

    }
}
