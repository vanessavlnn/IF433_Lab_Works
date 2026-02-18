package oop_00000122231_VanessaValendhitaSantoso.week03

fun main() {
    val myWeapon = Weapon("Hand Gun")

    myWeapon.damage = -50
    myWeapon.damage = 9999

    println("Weapon: ${myWeapon.name}, Damage: ${myWeapon.damage}, Tier: ${myWeapon.tier}")
}