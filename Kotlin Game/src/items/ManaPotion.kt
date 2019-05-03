package items

import player.Player

class ManaPotion(val name: String = "Mana napitak", val manaAmount: Int = 10): Items(){

    fun retriveMana(player: Player){
        player.mana+=manaAmount
        println("Vratili ste $manaAmount bodova mane")
    }

    override fun toString(): String {
        return "$name - Količina vraćene mane: $manaAmount"
    }
}