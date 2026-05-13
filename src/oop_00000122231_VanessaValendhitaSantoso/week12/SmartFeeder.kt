package oop_00000122231_VanessaValendhitaSantoso.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammer: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }

    if (isJammer) {
        throw DispenserJamException()
    }

    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }

    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}
}
