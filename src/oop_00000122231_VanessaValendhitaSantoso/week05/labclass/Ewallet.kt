package oop_00000122231_VanessaValendhitaSantoso.week05.labclass

class Ewallet (accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Pembayaran sukses menggunakan E-Wallet. Saldo tersisa: $balance")
        } else {
            println("Saldo tidak cukup")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("Top up berhasil. Saldo sekarang: $balance")
    }
}