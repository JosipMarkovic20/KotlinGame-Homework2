package menu

import items.HealingPotion
import items.ManaPotion
import player.Player

fun itemSelectionMenu(player: Player){
    println("Odaberite predmet:\n1. Napitak ozdravljenja\n2. Mana napitak")
    val izbor: Int = readLine()?.toInt() ?: 1
    when (izbor) {
        1 -> HealingPotion().heal(player)
        2 -> ManaPotion().retriveMana(player)
    }
}