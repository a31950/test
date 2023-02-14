package com.example.test.ch3

fun main(){
    println("===================List===================")
    var list = listOf<Int>(10,20,30)
    println("list size : ${list.size}")
    println("list data : ${list[0]},${list[1]},${list[2]}")
    println("===================MutableList===================")
    var mutableList = mutableListOf<Int>(10,20,30)
    mutableList.add(3,40)
    mutableList.set(0,50)
    println("list size : ${mutableList.size}")
    println("list size : ${mutableList[0]},${mutableList.get
        (1)},${mutableList.get(2)},${mutableList.get(3)}")
}