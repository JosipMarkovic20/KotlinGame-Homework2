package spells

import enemies.Enemy
import player.Player
import kotlin.random.Random

class Fireball(val name: String = "Vatrena kugla",val att: Int = 15, val manaCost: Int = 20): Spells(),
    Effect {

    override fun effect(enemy: Enemy) {
        val effectChance: Int = Random.nextInt(0,100)
        when(effectChance){
            in 0..50 -> enemy.isOnFire=true
        }
    }



    fun attack (player: Player, enemy: Enemy): Int{
        if (player.mana<manaCost){
            println("Nemate dovoljno mane za iskoristiti ovaj napad!")
            return 0
        }else{
            player.castSpell(manaCost)
            val critical: Int = att+10
            val chance: Int = Random.nextInt(0,100)
            when (chance){
                in 0..84 -> {println("Napad je uspjeo i učinili ste $att štete")
                    effect(enemy)
                    return att
                }
                in 85..90 -> {println("Uzrokovali ste kritičnu štetu od $critical bodova")
                    effect(enemy)
                    return critical
                }
                else -> {println("Nažalost vaš je napad promašio")
                    return 0
                }
            }
        }
    }

    override fun toString(): String {
        return "$name - Napad: $att Mana: $manaCost"
    }
}