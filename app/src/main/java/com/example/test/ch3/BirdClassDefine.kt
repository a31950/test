package com.example.test.ch3

class Bird0{

    var name : String = "mybird"
    var wing : Int = 2
    var beak : String = "short"
    var color : String = "blue"

    fun fly() = println("Fly wing : $wing")
    fun sing(vol : Int) = println("Sing vol : $vol")
}

fun main(){
    val coco0 = Bird0()
    coco0.color ="red"
    println("coco0.color : ${coco0.color}")
    coco0.fly()
    coco0.sing(3)
}