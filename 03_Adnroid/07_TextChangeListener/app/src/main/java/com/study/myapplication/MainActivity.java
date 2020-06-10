package com.study.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText inputText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText = findViewById(R.id.inputtext);
        inputText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Log.d("beforeTextChanged","s : " + s);
                Log.d("beforeTextChanged","start : " + start);
                Log.d("beforeTextChanged","count : " + count);
                Log.d("beforeTextChanged","after : " + after);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d("onTextChanged","s : " + s);
                Log.d("onTextChanged","start : " + start);
                Log.d("onTextChanged","before : " + before);
                Log.d("onTextChanged","count : " + count);
            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.d("afterTextChanged", "s : "+ s);
            }
        });
    }
}
