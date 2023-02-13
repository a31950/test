package com.example.test.ch3

fun main(){
    println("=============산술 연산자==================")
    var n = 9
    if((n % 2) == 1){ //홀수
        println("홀수입니다.")
    }
    if((n % 2) == 0) { //짝수
        println("짝수입니다.")
    }
    println("=============증가 연산자와 감소 연산자==================")
    var num1 = 10
    var num2 = 10
    val result1 = ++num1
    val result2 = num2++

    println("result1: $result1")
    println("result2: $result2")
    println("num1: $num1")
    println("num2: $num2")

    println("==============비교연산자&논리연산자=================")
    var check = (5>3) && (5>2)
    check = (5>3) || (2>5)
    check = !(5>3)
}