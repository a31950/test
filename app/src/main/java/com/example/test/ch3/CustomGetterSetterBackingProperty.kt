package com.example.test.ch3

class User1(id:Int, name:String, age:Int){
    val id : Int =id
    private var tempName : String? = null
    var name = name
    get(){
        if(tempName == null) tempName = "NONAME"
        return tempName ?: throw AssertionError("Asserted by otrers")
    }
    var age = age
}

fun main(){
    val user1 = User1(1,"kildong",35)
    user1.name = ""
    println("user3.name = ${user1.name}")
}