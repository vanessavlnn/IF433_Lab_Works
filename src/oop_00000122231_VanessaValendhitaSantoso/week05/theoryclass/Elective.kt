package oop_00000122231_VanessaValendhitaSantoso.week05.theoryclass

class Elective: Matakuliah() {
    override fun set_matkul(sks: Int) {
        super.nama = "VR Progamming"
        println("Elective ${super.nama} sks $sks")
    }

    fun ada_praktek(){
        println("Wajib di praktekin")
    }
}