package oop_00000122231_VanessaValendhitaSantoso.week04.theoryclass

class Pasta: Makanan() {
    private var topping:String = "";
    public fun pasta_terjual(jml:Int) {
        this.topping="grilled chicken";
        super.harga = jml * 120;
        println("Pasta $topping laris $harga");
    }
    override public fun jual_makanan(){
        println("Saya jual PASTA enak")
    }
}