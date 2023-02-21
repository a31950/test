package com.example.test.ch3

class Person2{
    var id : Int = 0
    var name : String = "영철이"
    companion object {
        var language: String = "한국어"
        fun work(){
            println("일하는 중...")
        }
    }
}

fun main(){
    println(Person2.language)
    Person2.language = "영어"
    println(Person2.language)
    Person2.work()
    var per = Person2()
    println(per.name)

}