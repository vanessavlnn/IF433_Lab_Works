package oop_00000122231_VanessaValendhitaSantoso.week10

open class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun findByName(query: String): List<T> {
        return items.filter {
            when (it) {
                is Coin -> it.name.contains(query, ignoreCase = true)
                else -> false
            }
        }
    }
}