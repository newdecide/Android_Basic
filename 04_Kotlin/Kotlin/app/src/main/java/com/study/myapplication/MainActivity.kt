package com.study.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var current_time = "${"지금시각은 - "+ Date()}"
        println(current_time)

        var current_time_textview = findViewById<TextView>(R.id.current_time_textview)
        current_time_textview.setText(current_time)


        var AnyType : Any

        AnyType = "문자열 입력"
        if (AnyType is String){
            ViewWrite("String 타입 입니다.")
        }
        AnyType =12.00f
        if (AnyType is Float){
            ViewWrite("Float 타입 입니다.")
        }
        AnyType = 1234.5678
        if (AnyType is Double){
            ViewWrite("Double 타입 입니다.")
        }
        AnyType = 1234
        if (AnyType is Int){
            ViewWrite("Int 타입 입니다.")
        }
        AnyType = 123456789L
        if (AnyType is Long){
            ViewWrite("Long 타입 입니다.")
        }

        StringReturnFunction("\nStringReturnFunction\n문자열 리턴 함수")

    }
    fun ViewWrite(any : Any){
        var view_write = findViewById<TextView>(R.id.writetext)
        view_write.text = "${view_write.text}${any.toString()}\n"
    }

    fun StringReturnFunction(s: String): Any? {
        return ViewWrite(s)
    }
    
}
