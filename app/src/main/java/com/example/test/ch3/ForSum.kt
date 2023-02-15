package com.example.test.ch3


fun main (){
    for (x in 1..5){
        println(x)
    }

    println("==================1~10 합================")
    var sum = 0
    for(x in 1..10) {
        sum += x
    }

    println("sum : $sum")

    println("===============1~10 짝수 합===================")
    var sum2 = 0
    for(x in 1..10) {
        if(x%2 == 0) {
            sum2 += x
        }
    }
    println("sum2 : $sum2")
    println("===============1~10 짝수 합 step===================")


    var sum3 = 0
    for(x in 0..10 step 2) {
            sum3 += x

    }

    println("sum3 : $sum3")
}
