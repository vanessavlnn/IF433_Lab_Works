package oop_00000122231_VanessaValendhitaSantoso.week05.labclass

//fun main() {
    //val dosen1 = Dosen("Pak Alex",  "0123456")
    //val admin1 = Admin("Bu Siti")

    //val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    //println("=== AKTIVITAS PEGAWAI ===")
    //for (pegawai in daftarPegawai) {
        //pegawai.bekerja()

        //when (pegawai) {
            //is Dosen -> {
                //println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                //pegawai.mengajar()
            //}
            //is Admin -> {
                //println("=> Terdeteksi sebagai Admin")
                //pegawai.doAdminWork()
            //}
        //}
        //println("-------------------------")
    //}
//}

//fun main() {
    //val mathHelper = MathHelper()

    //val luasPersegi = mathHelper.hitungLuas(5)
    //println("Luas Persegi (sisi 5): $luasPersegi")

    //val luasPersegiPanjang = mathHelper.hitungLuas(5, 10)
    //println("Luas Persegi Panjang (5x10): $luasPersegiPanjang")

    //val luasLingkaran = mathHelper.hitungLuas(7.0)
    //println("Luas Lingkaran (r 7): $luasLingkaran")
//}

fun main() {
    val myEWallet = Ewallet("Akun Utama", 50000.0)
    val myCreditCard = CreditCard("Kartu Utama", 100000.0)

    val daftarPembayaran: List<PaymentMethod> = listOf(myEWallet, myCreditCard)

    for (metode in daftarPembayaran) {
        metode.processPayment(75000.0)

        if (metode is Ewallet) {
            metode.topUp(50000.0)
            metode.processPayment(75000.0)
        }
    }
}