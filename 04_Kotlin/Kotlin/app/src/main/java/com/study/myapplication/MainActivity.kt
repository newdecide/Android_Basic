package com.study.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.lang.Exception
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

        val ReadOnlyList = listOf<String>("읽기 전용 리스트", "Read", "Only", "List" ,"String" ,"수정 불가능")
        ViewWrite("\nCollection_ReadOnlyList")
        for (i in 0 .. ReadOnlyList.size - 1){
            ViewWrite(ReadOnlyList.get(i).toString())
        }

        val EditableList = mutableListOf<String>()
        ViewWrite("\nCollection_EditableList")
        EditableList.add("수정 가능 리스트")
        EditableList.add("Editable")
        EditableList.add("List")
        EditableList.add("String")
        EditableList.add("수정가능")
        ViewWrite(EditableList.toString())

        EditableList.removeAt(3)
        ViewWrite("EditableList 3번째 요소 제거")
        ViewWrite(EditableList.toString())

        ViewWrite("\nfiveToExitLoop")
        fiveToExitLoop()

        ViewWrite("\nArithmeticException")
        var divNumber = 0;
        try {
            624 / divNumber
        } catch (e: Exception){
            ViewWrite(e)
        } finally {
            ViewWrite("0으로 나눌 수 없습니다.")
        }

        ViewWrite("\nNull 체크")

        //var notnullable:Int = null
        var nullbale:Int? = null

        ViewWrite("var notnullable:Int = null -> error")
        ViewWrite("var nullbale:Int? = null")

        ViewWrite("\nGreetClass")
        GreetClass()
        GreetClass("hello everyone", "my name is Detective Conan").showInfor()
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

    fun fiveToExitLoop(){
        fiveToExit@ for (i in 0..2){
            for (j in 0..10){
                if(j == 5) break@fiveToExit
                ViewWrite("i -> $i, j -> $j")
            }
        }
    }
}
