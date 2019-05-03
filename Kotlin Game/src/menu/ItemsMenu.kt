package menu

import enemies.Enemy
import player.Player
import spells.Fireball
import spells.IceSpike

fun spellSelectionMenu(player: Player, enemy: Enemy): Int{
    while(true) {
        println("Odaberite magiju:\n1. Vatrena kugla\n2. Ledeni šiljak")
        val izbor: Int = readLine()?.toInt() ?: 1
        when (izbor) {
            1 -> return Fireball().attack(player, enemy)
            2 -> return IceSpike().attack(player, enemy)
        }
    }
}