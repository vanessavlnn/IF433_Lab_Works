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

fun main() {
    var currentKibbleStock = 50

    println("=== TEST MULTIPLE CATCH ===")
    try {
        currentKibbleStock = dispenseKibble(
            requestedGram = 80,
            availableGram = currentKibbleStock,
            isJammer = false
        )
    } catch (e: DispenserJamException) {
        println("Caught Error: ${e.message}")
    } catch (e: FoodEmptyException) {
        println("Caught Error: ${e.message}")
    } catch (e: Exception) {
        println("Caught General Error: ${e.message}")
    } finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }

    println("\n=== TEST RUNCATCHING ===")
    val result = runCatching {
        dispenseKibble(requestedGram = 30, availableGram = 1000, isJammer = false)
    }
}

