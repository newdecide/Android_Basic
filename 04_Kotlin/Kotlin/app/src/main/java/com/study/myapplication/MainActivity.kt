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

        TwoParameterReturnFunction(200616, "두개의 파라미터 리턴")

        InlineFunction("\nInline Function", "\n한줄이므로 중괄호({}) 생략 가능")

        NoParameterFunction()

        HigherFunction({ViewWrite("\nHigherFunction")})

        HigherFunction(::HelloFunction)

        VariableUseFunction1(ViewWrite("\nVariableUseFunction1"))
        VariableUseFunction2("\nVariableUseFunction2 \n변수로 함수 사용2")

        val ReadOnlyList = listOf<String>("읽기 전용 리스트", "Read", "Only", "List" ,"String")
        ViewWrite("\nCollection_ReadOnlyList")
        for (i in 0 .. ReadOnlyList.size - 1){
            ViewWrite(ReadOnlyList.get(i).toString())
        }
    }
    fun ViewWrite(any: Any?){
        var view_write = findViewById<TextView>(R.id.writetext)
        view_write.text = "${view_write.text}${any.toString()}\n"
    }

    fun StringReturnFunction(s: String): Any? {
        return ViewWrite(s)
    }

    fun TwoParameterReturnFunction(i: Int, s: String){
        ViewWrite("\nTwoParameterReturnFunction\n "+i.toString() + ", " + s)
    }

    fun InlineFunction(s1 : String, s2 : String) = ViewWrite(s1 + s2)

    fun NoParameterFunction(){
        ViewWrite("\nNoParameterFunction\n파라미터 없이 함수 사용 가능")
    }

    fun HigherFunction( f : () -> Unit){
        f()
    }
    fun HelloFunction(){
        ViewWrite("고차 함수 호출")
    }

    var VariableUseFunction1 = { a: Any -> ViewWrite("변수로 함수 사용1")}
    var VariableUseFunction2 : (String) -> Any? = :: StringReturnFunction


}
