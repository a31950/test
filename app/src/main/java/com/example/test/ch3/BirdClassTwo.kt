package com.example.test.ch3

class Bird2 {
    var name : String
    var wing : Int
    var beak : String
    var color: String

    constructor(name: String, wing: Int, beak:String, color:String) {
        this.name = name
        this.wing = wing
        this.beak = beak
        this.color = color
    }
    constructor(_name: String, _beak:String) {
        name = _name
        wing = 2
        beak = _beak
        color = "grey"
    }
    fun fly() = println("Fly wing : $wing")
    fun sing(vol:Int) = println("Sing vol : $vol")
}

fun main(){
    var bird1 = Bird2("나의새",2,"쉣","블루")
    var bird2 = Bird2("너의새","롱")
    println("bird1.color : ${bird1.color}")
    println("bird2.color : ${bird2.color}")
    bird1.fly()
    bird2.fly()
    bird1.sing(3)
    bird2.sing(0)
}

