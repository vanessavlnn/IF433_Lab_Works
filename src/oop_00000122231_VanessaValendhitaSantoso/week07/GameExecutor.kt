package oop_00000122231_VanessaValendhitaSantoso.week07

fun processEvent(event: BattleState) {
    when (event) {
        is MonsterEncounter -> println("Awas! Kamu bertemu monster: ${event.monsterName}")
        is LootDropped -> {
            val (name, _, rarity) = event.item
            println("Selamat! Kamu dapet item: $name dengan rarity: $rarity")
        }
        is GameOver -> println("Game Berakhir karena: ${event.reason}")
        SafeZone -> println("Kamu sedang berada di area aman. Silakan beristirahat.")
    }
}