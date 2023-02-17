package com.example.test.ch3

import org.intellij.lang.annotations.Language

open class Bird4(var name:String, var wing:Int, var beak:String, var color:String){
    fun fly()= println("Fly wing : $wing")
    open fun sing(vol: Int) = println("ing vol : $vol")
}
class Parrot(name: String, wing: Int = 2, beak: String, color: String, var language: String="natural") : Bird4(name, wing,beak,color){
    fun speak() = println("speak! $language")
    override fun sing(vol: Int){
        println("I'm a parrot! The volume level is $vol")
        speak()
    }
}

fun main(){
    val parrot = Parrot(name = "myparrot", beak = "short", color="multiple")
    parrot.language = "English"
    println("Parrot : ${parrot.name}, ${parrot.wing}, ${parrot.beak}, ${parrot.color}, ${parrot.language}")
    parrot.sing(5)
}