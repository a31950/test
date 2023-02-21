package com.example.test.ch3

class LazyTest {
    init {
        println("init block")
    }
    val subject by lazy{
        println("lazy initialized")
        "Kotilin Programming"
    }
    fun flow(){
        println("not initialized")
        println("subject one : $subject")
        println("subject two : $subject")
    }
}
fun main(){
    val test = LazyTest()
    test.flow()
}