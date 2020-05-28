package com.study.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String TAG = "ThreadUse";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Thread(new Runnable() {
            @Override
            public void run(){
                Log.d(TAG, "thread_run01");
            }
        }).start();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Log.d(TAG, "thread_run02");
            }
        };

        Thread thread2 = new Thread(runnable);
        thread2.start();

        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MainActivity.this, "thread_run03", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
