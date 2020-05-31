package com.study.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int REQUEST_CODE = 1000;
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
                startActivityForResult(Explicitintent, REQUEST_CODE);
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
    }
}
