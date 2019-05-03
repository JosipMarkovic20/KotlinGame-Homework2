package items

import player.Player

class HealingPotion(val name: String = "Napitak ozdravljenja", val healAmount: Int = 25): Items(){
    fun heal(player: Player){
        player.hp+=healAmount
        println("Vratili ste $healAmount bodova zdravlja")
    }

    override fun toString(): String {
        return "$name - Količina ozdravljenja: $healAmount"
    }
}