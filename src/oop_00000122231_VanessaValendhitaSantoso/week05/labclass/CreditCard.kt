package oop_00000122231_VanessaValendhitaSantoso.week05.labclass

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Pembayaran sukses menggunakan Kartu Kredit. Sisa limit: ${limit - usedAmount}")
        } else {
            println("Transaksi ditolak. Melebihi limit")
        }
    }
}