package com.example.test.ch4

data class Customer(var name:String, var email:String){
    var job:String = "Unknown"
    constructor(name: String, email: String, _job:String):this(name,email){
        job= _job
    }
    init{
        println("Init 실행")
    }
}


val cus1 = Customer("Sean", "sean@mail.com")
val cus2 = Customer("Sean", "sean@mail.com")

fun main() {
    println(cus1 == cus2)
    println(cus1.equals(cus2))

}


