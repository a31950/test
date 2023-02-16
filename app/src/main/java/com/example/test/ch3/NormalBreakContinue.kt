package com.example.test.ch3

fun main(){
    for(i in 1..5 ){
        if(i==3) break
        print(i)
    }
    println()
    println("outside")
    println("============================================")
    labelBreak()
    println("============================================")
    labelBreak1()
}

fun labelBreak(){
    println("labelBreak")
    for(i in 1..5){
        second@ for (j in 1..5){
            if(j==3) continue
            println("i:$i, j:$j")
        }
        println("after for j")
    }
    println("after for i")
}


fun labelBreak1(){
    println("labelBreak")
    first@ for(i in 1..5){
        second@ for (j in 1..5){
            if(j==3) continue@first
            println("i:$i, j:$j")
        }
        println("after for j")
    }
    println("after for i")
}