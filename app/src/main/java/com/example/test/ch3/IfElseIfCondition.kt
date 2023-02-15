package com.example.test.ch3

fun main() {
    println("================조건과 블록 함께 사용====================")
    val a = 12
    val b = 7

    val max = if (a > b) {
        println("a 선택")
        a
    }
    else {
        println("b 선택")
        b
    }
    println(max)
    println("================범위 연산자====================")
    print("Enter the score: ")
    val score = readLine()!!.toDouble() // 콘솔로부터 입력 받음
    var grade: Char = 'F'
//    if (score >= 90.0) {
//        grade = 'A'
//    } else if (score >= 80.0 && score <= 89.9) {
//        grade = 'B'
//    } else if (score >=70.0 && score <= 79.9) {
//        grade = 'C'
//    }
    if (score >= 90) {
        grade = 'A'
    } else if (score in 80.0..89.9) {
        grade = 'B'
    } else if (score in 70.0..79.9) {
        grade = 'C'
    }
    println("Score: $score, Grade: $grade")

    println("================조건문 반복문 (if ~ esle)====================")
    var data = 10
    var result = if(data > 0 ){
        println("data>0")
        true
    } else {
        println("data <= 0")
        false
    }
    println(result)
    println("================조건문 반복문 (when)====================")

        var data1 = 10
        when(data1){
            10 -> println("data is 10")
            20 -> println("data is 20")
            else -> {
                println("data is not valid data")
            }
        }

    var x = 2
    when (x){
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> print("x는 1 또는 2가 아닙니다.")
    }






}