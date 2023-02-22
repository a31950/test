package com.example.test.ch4

abstract class Vehicle(val name : String, val  color: String, val weight: Double){
    abstract var maxSpeed: Int
    var year = "2018"
    abstract fun start()
    abstract fun stop()
    fun displaySpecs(){
        println("Name: $ name, Color : $color, Weight : $weight, Year : $year, Max Speed : $maxSpeed")
    }
}
class Car(name: String, color: String, weight: Double, override var maxSpeed :Int )
    : Vehicle(name, color, weight){
        override fun start(){
            println("Car Started")
        }
    override fun stop(){
        println("Car Stopped")
    }
    }
class Motorcycle(name: String, color: String, weight: Double, override var maxSpeed :Int )
    : Vehicle(name, color, weight){
    override fun start(){
        println("Bike Started")
    }
    override fun stop(){
        println("Bike Stopped")
    }
}



fun main(){
    var car = Car("Super영철", "영철이색",170.3, 65)
    var motor = Motorcycle("Super진영", "개색ㄲ!",181.3, 72)

    car.year = "2023"

    car.displaySpecs()
    car.start()
    motor.displaySpecs()
    motor.start()

}