package oop_00000122231_VanessaValendhitaSantoso.week06

class SmartLamp(override val id: String,
                override val name: String
) : SmartDevice, Switchable {
    override fun turnOn() {
        println("Lampu $name menyala: Memberikan cahaya terang.")
    }

    override fun turnOff() {
        println("Lampu $name mati: Ruangan menjadi gelap.")
    }
}