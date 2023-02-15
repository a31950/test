package com.example.test.ch3

class MyClass

fun main(){
    cases("Hello")
    cases(1)
    cases(System.currentTimeMillis())
    cases(MyClass())

    println("==================문자열 타입 조건문====================")
    var data = "hello"
    when (data) {
        "hello" -> println("data is hello")
        "world" -> println("data is world")
        else -> {
            println("data is not valid data")
        }
    }
        var data2 : Any = 10
        when(data2){
            is String -> println("data is String")
            20, 30 -> println("data is 20 or 30")
            in 1..10 -> println("data is 1..10")
            else -> println("data is not valid")
        }

    }




fun cases(obj: Any){
    when (obj){
        1-> println("Int: $obj")
        "Hello"-> println("String: $obj")
        is Long-> println("Long: $obj")
        !is String-> println("Not a String")
        else-> println("Unknown")
    }
}