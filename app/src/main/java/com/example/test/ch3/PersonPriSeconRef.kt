package com.example.test.ch3

class Person(firstName : String ,out : Unit = println("매인매서드")){
    val fName1 = println("fName1 출력")
    init {
        println("init 출력")
    }
    val fName2 = println("fName2 출력")
    constructor(firstName: String, age: Int, out: Unit= println("지역매서드")): this(firstName){
        println("[지역매서드에 있는 바디 : $firstName, $age")
    }
}

fun main(){
    var p1 = Person("kildong",30)
    println()
    var p2 = Person("Dooly")
}