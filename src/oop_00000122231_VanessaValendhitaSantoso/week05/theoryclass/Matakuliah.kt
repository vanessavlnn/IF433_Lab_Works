package oop_00000122231_VanessaValendhitaSantoso.week05.theoryclass

abstract class Matakuliah {
    var nama:String = ""

    abstract fun set_matkul(sks:Int)

    fun hasil_matkul() {
        println("Matkul diminati")
    }
}