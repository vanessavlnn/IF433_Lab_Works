package oop_00000122231_VanessaValendhitaSantoso.week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url...")
    }
}