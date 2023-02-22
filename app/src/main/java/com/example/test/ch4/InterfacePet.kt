package com.example.test.ch4

interface Pet {
    var category : String
    val msgTags: String
        get() = "I'm your lovely pet!"
    fun feeding()
    fun patting(){
        println("Keep partting")
    }
}
class Cat(override var category: String) : Pet{
    override fun feeding(){
        println("Feed the cat a tuna can!")
    }
}
fun main(){
    val obj = Cat("small")
    println("pet Message Tags: ${obj.msgTags}")
    println("Pet Category: ${obj.category}")
    obj.feeding()
    obj.patting()
}