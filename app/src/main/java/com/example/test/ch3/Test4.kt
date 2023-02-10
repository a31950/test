package com.example.test.ch3

lateinit var data1 : String

val data4 : Int by lazy {
    println("in main...........1")
    println("in main...........2")
    10
}


fun main(){
    println("==============================")
    println(data4+10)
    println("==============================")
    println(data4+20)
    println("==============================")
    println(data4+30)
}