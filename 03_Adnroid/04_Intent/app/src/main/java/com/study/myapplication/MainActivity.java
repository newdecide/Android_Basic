package com.study.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int REQUEST_CODE = 1000;
    TextView resultSuccessText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView explicittext = (TextView) findViewById(R.id.explicit_intent);
        explicittext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Explicitintent = new Intent(getApplicationContext(), SecondActivity.class);
                Explicitintent.putExtra("INTENT_KEY_INT", 5);
                Explicitintent.putExtra("INTENT_KEY_STRING", "STRING");
                startActivity(Explicitintent);
            }
        });

        TextView implicittext = (TextView) findViewById(R.id.implicit_intent);
        implicittext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Implicitintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
                startActivity(Implicitintent);
            }
        });

        resultSuccessText = findViewById(R.id.result_Success);
        resultSuccessText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultIntent = new Intent(getApplicationContext(),SecondActivity.class);
                startActivityForResult(resultIntent, REQUEST_CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == REQUEST_CODE) {
            if (resultCode == 200) {
                String resultSuccess = data.getStringExtra("RESULT");
                Log.d("onActivityResult", "result : " + resultSuccess);
                resultSuccessText.setText(resultSuccess);
            } else {
                Log.d("onActivityResult", "실패");
            }
        }
    }
}
