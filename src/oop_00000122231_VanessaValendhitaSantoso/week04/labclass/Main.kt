package oop_00000122231_VanessaValendhitaSantoso.week04.labclass

fun main(){
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")
    val eCar = ElectricCar("BYD", 4, 85)
    eCar.accelerate()
    eCar.honk()
    eCar.openTrunk()
}