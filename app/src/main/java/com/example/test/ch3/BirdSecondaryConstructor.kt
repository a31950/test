package com.example.test.ch3

class Bird1{
    var name : String
    var wing : Int
    var beak : String
    var color : String

    constructor(name: String, wing: Int, beak:String, color:String){
        this.name = name
        this.wing =wing
        this.beak = beak
        this.color = color
    }
    fun fly() = println("Fly wing: $wing")
    fun sing(vol : Int) = println("String Vol: $vol")
}

fun main(){
    val coco = Bird1("나의새", 4, "쉣", "블루")
    println("coco.color : ${coco.color}")
    coco.fly()
    coco.sing(3)
}