package com.example.test.ch3

fun main(args: Array<String>){
    namedParam(x=200, z=100)
    namedParam(z=150)

    normalVarargs(1,2,3,4)
    normalVarargs(4,5,6)

    println("=============기초 타입 arrayOf()===============")
    val data1 = intArrayOf(10,20,30)
    val data2 = booleanArrayOf(true,false,true)
    println("array size1 : ${data1.size}")
    println("array data1 : ${data1[0]},${data1[1]},${data1[2]}")
    println("array size2 : ${data2.size}")
    println("array data2 : ${data2[0]},${data2[1]},${data2[2]}")

}

fun namedParam(x:Int = 100, y: Int = 200, z : Int){
    println(x+y+z)
}

fun normalVarargs(vararg counts: Int){
    for(num in counts){
        println("$num" )
    }
    print("\n")
}






