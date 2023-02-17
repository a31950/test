package com.example.test.ch3

class Bird constructor(name : String, wing: Int, beak:String, color: String){
    var name = name
    var wing = wing
    var beak = beak
    var color = color

    fun fly() = println("Fly wing: $wing")
    fun sing(vol : Int) = println("String vol : $vol")
}

class Bird3 (var name: String ="noname", var wing: Int = 2, var beak: String, var color: String){
   init {
       println("--초기화 블록시작")
       println("이름은 $name, 부리는 $beak")
       println("--초기화 블록 끝")
   }
    fun fly() = println("Fly wing: $wing")
    fun sing(vol : Int) = println("String vol : $vol")
}

fun main(){
    var coco = Bird("bird",11,"long","orange")
    println("coco.name : ${coco.name}, coco.wing : ${coco.wing}")
    println("coco.color : ${coco.color}, coco.beak : ${coco.beak}")

    var coco1 = Bird3("bird",11,"long","orange")
    println("coco1.name : ${coco1.name}, coco1.wing : ${coco1.wing}")
    println("coco1.color : ${coco1.color}, coco1.beak : ${coco1.beak}")

    var coco2 = Bird3(beak ="long", color ="orange")
    println("coco2.name : ${coco2.name}, coco2.wing : ${coco2.wing}")
    println("coco2.color : ${coco2.color}, coco2.beak : ${coco2.beak}")
}
