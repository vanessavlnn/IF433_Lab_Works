package oop_00000122231_VanessaValendhitaSantoso.week06

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("CCTV $name aktif.")
        startRecord()
    }

    override fun turnOff() {
        println("CCTV $name dinonaktifkan.")
    }

    override fun startRecord() {
        println("CCTV $name: Mulai merekam video.")
    }
}