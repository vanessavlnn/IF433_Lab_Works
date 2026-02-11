package oop_00000122231_VanessaValendhitaSantoso.week02

import java.util.Scanner

class Hero(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100
) {
    fun attack(targetName: String) {
        println("$name menebas $targetName!")
    }
    fun takeDamage(damage: Int) {
        hp -= damage

        if (hp < 0) {
            hp = 0
        }
        println("$name menerima $damage damage. HP tersisa: $hp")
    }
    fun isAlive(): Boolean {
        return hp > 0
    }
}

fun main() {
    val reader = Scanner(System.`in`)
    print("Masukkan Nama Hero: ")
    val inputName = reader.nextLine()
    print("Masukkan Base Damage: ")
    val inputDamage = reader.nextInt()
    val myHero = Hero(inputName, inputDamage)
    var enemyHp = 100

    println("\n~~~ PERTANDINGAN DIMULAI ~~~")
    println("${myHero.name} vs Monster (HP: $enemyHp)\n")

    while (myHero.isAlive() && enemyHp > 0) {
        println("------- MENU -------")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")

        when (reader.nextInt()) {
            1 -> {
                myHero.attack("Monster")
                enemyHp -= myHero.baseDamage
                if (enemyHp < 0) enemyHp = 0
                println("HP Musuh tersisa: $enemyHp")

                if (enemyHp > 0) {
                    val monsterDamage = (10..20).random()
                    println("\nMonster menyerang balik!")
                    myHero.takeDamage(monsterDamage)
                    println("Sisa HP ${myHero.name}: ${myHero.hp}\n")
                }
            }
            2 -> {
                println("${myHero.name} memilih untuk kabur dari medan perang!")
                break
            }
            else -> println("Pilihan tidak valid!")
        }
    }

    println("\n=== PERTANDINGAN BERAKHIR ===")
    if (enemyHp <= 0) {
        println("Selamat! ${myHero.name} berhasil memenangkan game!")
    } else if (!myHero.isAlive()) {
        println("Sayang sekali... ${myHero.name} gugur dalam pertempuran.")
    } else {
        println("Pertarungan berakhir karena anda melarikan diri.")
    }
}