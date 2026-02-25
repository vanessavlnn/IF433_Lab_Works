package oop_00000122231_VanessaValendhitaSantoso.week04.labclass

class Manager(name: String, baseSalary: Int) : Employee(name, baseSalary) {
    override fun work() {
        println("$name sedang memimpin rapat divisi.")
    }
    override fun calculateBonus(): Int {
        return super.calculateBonus() + 500000
    }
}