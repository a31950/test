package com.example.test.ch3

fun main(){
    retFunc()
    retFunc1()
}

inline fun inlineLambda(a:Int, b: Int, out: (Int,Int) -> Unit){
    out(a,b)
}


fun retFunc(){ //람다식에서 라벨과 함께 return 사용하기
    println("start of retFunc")
    inlineLambda(12,3) lit@{
        a , b -> val result = a+b
        if(result>10) return@lit
        println("result: $result")
    }
    println("end of retFunc")
}

fun retFunc1(){ //람다식에서 라벨과 함께 return 사용하기(암묵적 라벨)
    println("start of retFunc1")
    inlineLambda(12,3) {
            a , b -> val result = a+b
        if(result>10) return@inlineLambda
        println("result: $result")
    }
    println("end of retFunc1")
}