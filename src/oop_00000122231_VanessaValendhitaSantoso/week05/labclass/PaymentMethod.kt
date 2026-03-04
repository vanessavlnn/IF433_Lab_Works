package oop_00000122231_VanessaValendhitaSantoso.week05.labclass

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}