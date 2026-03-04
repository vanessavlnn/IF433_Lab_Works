package oop_00000122231_VanessaValendhitaSantoso.week05.labclass

class Dosen(nama: String, val nidn:  String) : Pegawai(nama) {
    override fun bekerja() {
        println("[$nama] sedang menyiapkan materi perkuliahan dan merevisi RPKPS.")
    }

    fun mengajar(){
        println("[$nama] sedang mengajar mahasiswa di kelas.")
    }
}