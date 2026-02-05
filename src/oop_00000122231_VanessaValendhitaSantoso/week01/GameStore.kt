package oop_00000122231_VanessaValendhitaSantoso.week01

fun main() {
    val gameTitle: String = "Barbie"
    val price: Int = 67000

    val discount = calculateDiscount(price)
    val finalPrice = price - discount
}

fun calculateDiscount(price: Int): Int = if (price > 500000) {
    (price * 0.2).toInt()
} else {
    (price * 0.1).toInt()
}