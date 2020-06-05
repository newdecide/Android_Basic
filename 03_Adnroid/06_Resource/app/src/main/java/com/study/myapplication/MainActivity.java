package com.study.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView dog1, dog2;
    TextView resourceTextview, changeTextview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // xml의 뷰 컴포넌트를 가져오는 방법
        dog1 = findViewById(R.id.dog1);
        dog2 = findViewById(R.id.dog2);
        resourceTextview = findViewById(R.id.text);
        changeTextview = findViewById(R.id.chagetext);

        // xml의 뷰 컴포넌트를 동적으로 변경하는 방법
        dog2.setImageResource(R.drawable.dog3);
        resourceTextview.setText("안녕하십니까");

        // res에 정의된 string을 가져오는 방법
        String content = getApplicationContext().getResources().getString(R.string.define_string);
        changeTextview.setText(content);
        
    }
}
