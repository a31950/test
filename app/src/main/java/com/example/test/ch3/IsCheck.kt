package com.example.test.ch3

fun main(){
    val num = 256

    if(num is Int){
        print(num)
    } else if (num !is Int){
        print("Not a Int")
    }
}