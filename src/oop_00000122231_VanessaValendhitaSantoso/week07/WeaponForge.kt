package oop_00000122231_VanessaValendhitaSantoso.week07

class Weapon private constructor(val item: GameItem, val durability: Int) {

    companion object {
        fun forgeStarterSword(): Weapon {
            val swordItem = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON)
            return Weapon(swordItem, 50)
        }

        fun forgeEpicSword(): Weapon {
            val swordItem = GameItem("Light Saber", 99, ItemRarity.EPIC)
            return Weapon(swordItem, 100)
        }
    }
}