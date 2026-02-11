package oop_00000122231_VanessaValendhitaSantoso.week02

class Student(
    val name: String,
    val nim: String,
    var gpa: Double = 0.0,
    var major: String
) {
    init {
        if (nim.length != 5) {
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid")
        } else {
            println("LOG: Objek Student $name berhasil dialokasikan di Memory.")
        }
    }

    constructor(name: String, nim: String)
            : this(name, nim, 0.0, "Non-Matriculated") {
        println("LOG: Menggunakan constructor jalur umum.")
    }

    constructor(name: String, nim: String, major: String)
            : this(name, nim, 0.0, major)
}