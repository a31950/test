package com.example.test.ch3

class Person1{
    lateinit var name: String
    fun test(){
        if(!::name.isInitialized){
            println("not initialized")
        } else{
            println("initialized")
        }
    }
}

fun main(){
    val kildong = Person1()
    kildong.test()
    kildong.name = "Kildong"
    kildong.test()
    println("name = ${kildong.name}")
}