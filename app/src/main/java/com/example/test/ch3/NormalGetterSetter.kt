package com.example.test.ch3

import com.example.test.User

class User(id : Int, name : String, age : Int){
    val id = id
        get() = field
    var name = name
        get() = field
    set(value){
        field = value
    }
    var age = age
        get() = field
        set(value){
            field = field
        }
}

fun main(){
    val user = User(1,"Sean", 30)
    val name = user.name
    user.age = 412

    println("name : $name, ${user.age}")
}