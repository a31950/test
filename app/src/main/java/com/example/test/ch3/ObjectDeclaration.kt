package com.example.test.ch3

object OCustomer {
    var name = "Kildong"
    fun greeting() = println("Hello World!")
    val HOBBY = Hobby("Basketball")
    init{
        println("Init!")
    }
}

class Hobby(val name : String)
fun main(){
    OCustomer.greeting()
    OCustomer.name = "Dooly"
    println("name = ${OCustomer.name}")
    println(OCustomer.HOBBY.name)
}