package oop_00000122231_VanessaValendhitaSantoso.week04.labclass

open class Vehicle(val brand: String){
    var speed: Int = 0

    open fun accelerate(){
        speed += 10
        println("$brand melaju. Kecepatan $speed km/jam")
    }

    open fun honk() {
        println("Beep Beep!")
    }
}