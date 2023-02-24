package com.example.test.ch5

fun <T> find(a:Array<T>, Target: T): Int {
    for (i in a.indices){
        if(a[i]== Target) return i
    }
    return -1
}

fun <T> add(a:T, b:T, op:(T,T) -> T) : T{
    return op(a,b)
}
fun <T> minus(a:T, b:T, op1:(T,T) -> T) : T{
    return op1(a,b)
}
fun main(){
    val arr1 : Array<String> = arrayOf("애플","바나나","체리","두리안")
    val arr2 : Array<Int> = arrayOf(1,2,3,4)

    println("arr.indices ${arr1.indices}")
    println(find<String>(arr1,"체리"))
    println(find(arr2,2))

    println("==========================================================")
    val result = add("2","3",{a, b -> a + b})
    val result1 = minus(3,2,{a, b -> a - b})
    println(result)
    println(result1)
}