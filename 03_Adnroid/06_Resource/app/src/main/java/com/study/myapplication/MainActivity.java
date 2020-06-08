package com.study.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageView dog1, dog2;
    TextView resourceTextview, changeTextview;
    ArrayList<String> greetArray = new ArrayList<>();

    private long mLastClickTime = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // xml의 뷰 컴포넌트를 가져오는 방법
        dog1 = findViewById(R.id.dog1);
        dog2 = findViewById(R.id.dog2);
        resourceTextview = findViewById(R.id.text);
        changeTextview = findViewById(R.id.changetext);

        // xml의 뷰 컴포넌트를 동적으로 변경하는 방법
        dog2.setImageResource(R.drawable.dog3);
        resourceTextview.setText("여러나라 인사");

        // res에 정의된 string을 가져오는 방법
        String content = getApplicationContext().getResources().getString(R.string.define_string);
        changeTextview.setText(content);

        resourceTextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (SystemClock.elapsedRealtime() - mLastClickTime < 1000){
                    return;
                }
                mLastClickTime = SystemClock.elapsedRealtime();
                for (String greeting : getApplicationContext().getResources().getStringArray(R.array.define_string_array)){
                    Toast.makeText(getApplicationContext(),greeting,Toast.LENGTH_SHORT).show();
                    greetArray.add(greeting);
                }
                System.out.println(greetArray);
                resourceTextview.append("\n");
                for (String greet : greetArray){
                    resourceTextview.append(greet+ ", ");
                }
            }
        });
    }
}
