package com.example.test.ch3

fun main() {
    println("======================= 기본테스트 For========================")
    println("=========1~10 짝수=========")
    var sum = 0
    for (x in 0..10 step 2) {
        sum += x
        println("짝수 : $x")
    }
    println("짝수 합 : $sum")
    println("=========1~10 홀수=========")
    sum = 0
    for (x in 1..10 step 2) {
        sum += x
        println("홀수 : $x")
    }
    println("홀수 합 : $sum")
    println("=========10~1 까지 홀수=========")
    for (x in 9 downTo 1 step 2) {
        println("9부터 1 까지 : $x")
    }

    println("======================= 기본테스트 For========================")
    println("=========직급 연봉 알아보기=========")
    print("당신의 직급을 알려주세요!(ex:부장,차장,과장,대리,사원) :")
    val name = readLine()!!.toString()
    var money = 0
    when (name) {
        in "부장" -> money = 600
        in "차장" -> money = 500
        in "과장" -> money = 400
        in "대리" -> money = 300
        in "사원" -> money = 200
    }
    println("우리 $name 님의 월급은 !! $money 만원 입니다.")


    println("=========성적프로그램 만들기=========")
    print("너의 성적을 알려줘 : ")
    val score = readLine()!!.toDouble()

    var grade: Char = 'F'

    when (score) {
        in 90.0..100.0 -> grade = 'A'
        in 80.0..89.9 -> grade = 'B'
        in 70.0..79.9 -> grade = 'C'
        in 60.0..69.9 -> grade = 'D'
        in 50.0..59.9 -> grade = 'E'
        in 0.0..49.9 -> grade = 'F'
    }
    println("Score : $score, Grade : $grade")

}
