package oop_00000122231_VanessaValendhitaSantoso.week04.labclass

class Developer(name: String, baseSalary: Int, val programmingLanguage: String) : Employee(name, baseSalary) {
    override fun work() {
        println("$name sedang ngoding menggunakan $programmingLanguage.")
    }
}