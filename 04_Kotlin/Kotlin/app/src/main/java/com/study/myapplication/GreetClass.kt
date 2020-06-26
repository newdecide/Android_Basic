package com.study.myapplication

import android.util.Log

class GreetClass{
    var greet : String = "여러분 안녕하세요"
    var introduce : String = "내 이름은 코난 탐정이죠!"

    constructor(){
        Log.d("class","${greet}: ${introduce}")
    }

    constructor(Greet : String, Introduce: String){
        greet  = Greet
        introduce = Introduce
    }

    fun showInfor() = Log.d("class","${greet}: ${introduce}")

}