package com.example.test.ch4

class Point(var x:Int = 0, var y : Int = 10){
    operator fun plus(p:Point) : Point{
        return Point(x+ p.x, y + p.y)
    }
}

class Manager {
    operator fun invoke(value: String){
        println(value)
    }
}
data class  Point1(val x: Int,)

fun main(){
    val p1 = Point(3,-8)
    val p2 = Point(2,9)

    var point = Point()
    var manager = Manager()
    point = p1 + p2
    println("point = (${point.x},${point.y})")
    manager("Do something for me!")
}