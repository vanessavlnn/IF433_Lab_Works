package oop_00000122231_VanessaValendhitaSantoso.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 1.5))
    coinRepo.add(Coin("ETH", 10.0))
    coinRepo.add(Coin("USDT", 500.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())
    println("Status: ${response.status}")
    println("--- Coin List ---")
    response.data.forEach { coin ->
        println("Coin: ${coin.name} | Balance: ${coin.balance}")
    }

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX001", 0.5))
    txRepo.add(Transaction("TX002", 150.0))

    println("\n--- Transaction List ---")
    txRepo.getAll().forEach { tx ->
        println("ID: ${tx.id} | Amount: ${tx.amount}")
    }
}