package com.study.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var current_time = "${"지금시각은 - "+ Date()}"
        println(current_time)

        var current_time_textview = findViewById<TextView>(R.id.current_time_textview)
        current_time_textview.setText(current_time)



    }
}
