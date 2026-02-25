package oop_00000122231_VanessaValendhitaSantoso.week04.theoryclass

open class Makanan {
    private var namaResto: String? = "";
    protected var harga:Int= 0;
    protected var stok:Int = 10;

    init {
        namaResto= "Steak 12";
        println("Resto saya $namaResto");
    }

    open public fun jual_makanan() {
        println("Saya jual makanan");
    }

}