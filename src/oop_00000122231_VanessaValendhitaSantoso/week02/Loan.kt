package oop_00000122231_VanessaValendhitaSantoso.week02

import java.util.Scanner

class Loan (
    val bookTitle: String,
    val borrower: String,
    val loanDuration: Int = 1
) {
    fun calculateFine(): Int {
        return if (loanDuration > 3) {
            (loanDuration - 3) * 2000
        } else {
            0
        }
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    println("~~~ SISTEM PEMINJAMAN PERPUSTAKAAN ~~~")

    print("Masukkan judul buku: ")
    val bookTitle = scanner.nextLine()

    print("Masukkan nama peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan lama pinjam (hari): ")
    var duration = scanner.nextInt()

    if (duration < 0) {
        println("Durasi tidak boleh minus. Diubah menjadi 1 hari.")
        duration = 1
    }

    val loan = Loan(bookTitle, borrower, duration)

    println("\n~~~ DETAIL PEMINJAMAN ~~~")
    println("Judul Buku : ${loan.bookTitle}")
    println("Peminjam   : ${loan.borrower}")
    println("Durasi     : ${loan.loanDuration} hari")
    println("Total Denda: Rp ${loan.calculateFine()}")
}