package oop_00000122231_VanessaValendhitaSantoso.week04.labclass

fun main() {
    val manager = Manager("Budi", 15000000)
    val developer = Developer("Andi", 10000000, "Kotlin")

    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")
    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}