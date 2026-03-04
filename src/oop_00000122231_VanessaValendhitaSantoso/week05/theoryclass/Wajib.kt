package oop_00000122231_VanessaValendhitaSantoso.week05.theoryclass

class Wajib: Matakuliah() {
    override fun set_matkul(sks:Int){
        super.nama = "OOP"
        println("Matkul ${super.nama} sks $sks")
    }

    fun ada_seminar() {
        println("Wajib ada seminar")
    }
}