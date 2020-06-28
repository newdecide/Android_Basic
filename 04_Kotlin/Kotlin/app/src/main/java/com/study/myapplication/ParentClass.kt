package com.study.myapplication

import android.util.Log

open class ParentClass{
    open var name = "parent"
    open fun parentlog() = Log.d(name, "부모클래스")
    private fun onlyMyFunc() = Log.d("parent","클래스 내부에서만 사용 가능")

    constructor(){
        onlyMyFunc()
    }
}

class ChildClass : ParentClass(){
    override var name = "child"
    override fun parentlog() = Log.d("child", "부모클래스 사용")

    fun namefunction() = Log.d(name, "자식클래스")
    fun parentfunction() = parentlog()
}