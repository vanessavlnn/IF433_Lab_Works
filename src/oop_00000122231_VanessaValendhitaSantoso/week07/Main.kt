package oop_00000122231_VanessaValendhitaSantoso.week07

fun main() {
    GameManager.startGame()
    GameManager.startGame() // Test duplikasi

    println("---")

    println("Drop chance Legendary: ${ItemRarity.LEGENDARY.dropChance}%")
    val starterWeapon = Weapon.forgeStarterSword()
    println("Senjata awal: ${starterWeapon.item.name}, Damage: ${starterWeapon.item.damage}")

    println("---")

    val upgradedItem = starterWeapon.item.copy(damage = 25)

    processEvent(SafeZone)
    processEvent(MonsterEncounter("Goblin Nakal"))
    processEvent(LootDropped(upgradedItem))
    processEvent(GameOver("Terkena jebakan racun"))
}