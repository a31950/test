package com.example.test.ch3

fun main(){
    var data = arrayOf(10,20,30)
    for(i in data.indices){
        print(data[i])
        if(i !== data.size-1) print(",")
    }


    print("별탑을 쌓아보자 : ")
    val n = readLine()!!.toInt()
    for(line in 1..n){
        for(space in 1..(n-line)) print(" ")
        for(star in 1..(2*line - 1)) print("*")
        println()
    }


}