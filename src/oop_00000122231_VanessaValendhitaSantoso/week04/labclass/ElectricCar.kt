package oop_00000122231_VanessaValendhitaSantoso.week04.labclass

class ElectricCar(brand:String, numberOfDoors:Int, val batteryCapacity:Int): Car(brand, numberOfDoors) {
    final override fun accelerate() {
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%.")
    }
}