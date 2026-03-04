package oop_00000122231_VanessaValendhitaSantoso.week05.theoryclass

fun main() {
    val listMatkul:List<Matakuliah> = listOf(
        Wajib(),
        Elective()
    )
    println("banyak tipe matkul: $listMatkul");

    for(mku in listMatkul) {
        mku.set_matkul(3)

        if(mku is Wajib) {
            mku.ada_seminar();
        } else if (mku is Elective) {
            mku.ada_praktek()
        }

        when(mku) {
            is Wajib -> {
                println("Wajib dari When:")
                mku.ada_seminar();
            }
            is Elective -> {
                println("Elective dari When:")
                mku.ada_praktek()
            }
        }
    }



    //val matkul = Matakuliah()
    //matkul.nama = "OOP"
    //matkul.set_matkul(4)
    //val wjb = Wajib()
    //wjb.set_matkul(3)

    //val elc = Elective()
    //elc.set_matkul(2)
}