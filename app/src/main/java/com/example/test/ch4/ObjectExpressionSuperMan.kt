package com.example.test.ch4

open class Superman() {
    fun work() = println("Taking photos")
    fun talk() = println("Talking with people.")
    open fun fly() = println("Flying in the air.")
}

fun main(){
    val pretendedMan = object : Superman(){
            override fun fly() = println("난 진짜 슈퍼멘이 아니다. 그래서 날 수 없어.")
}
    pretendedMan.work()
    pretendedMan.talk()
    pretendedMan.fly()
}
