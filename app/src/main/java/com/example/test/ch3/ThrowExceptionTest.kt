package com.example.test.ch3

import java.lang.Exception

class InvalidNameException(message : String) : Exception(message)

fun main(){

    var amount = 600

    try {
        amount -= 100
        checkAmount(amount)
    }catch (e: Exception){
        println(e.message)
    }
    println("amount : $amount")

    println("============================================")
    var name = "ParkHeonMin89"
    try {
        validateName(name)
    }catch (e:InvalidNameException){
        println(e.message)
    }catch (e:Exception){
        println(e.message)
    }
}
fun checkAmount(amount : Int){
    if(amount < 1000)
        throw Exception("잔고가 $amount 으로 1000 이하입니다.")
}fun validateName(name: String){
    if(name.matches(Regex(".*\\d+.*")))
        throw InvalidNameException("Your name : $name : contains numerals")
}



