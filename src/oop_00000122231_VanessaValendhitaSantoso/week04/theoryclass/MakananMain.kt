package oop_00000122231_VanessaValendhitaSantoso.week04.theoryclass

import oop_00000122231_VanessaValendhitaSantoso.week04.theoryclass.Pasta
import oop_00000122231_VanessaValendhitaSantoso.week04.theoryclass.Sushi

fun main() {
    var susi = Sushi();
    susi.jual_makanan();
    susi.sushi_terjual(jns = "Roll", jml = 3);

    var pst = Pasta();
    pst.jual_makanan();
    pst.pasta_terjual(jml = 6);
}