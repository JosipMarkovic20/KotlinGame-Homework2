package enemies

import kotlin.random.Random

class Goblin(name: String = "Goblin", hp: Int = 50, val att: Int = 5): Enemy(name,hp){

    fun goblinAttack(): Int{
        if (turnsSinceFrozen>3){
            turnsSinceFrozen=0
            isFrozen=false
        }
        if(turnsSinceSetOnFire>3){
            turnsSinceSetOnFire=0
            isOnFire=false
        }
        if (isFrozen){
            println("Goblin je zamrzunt i ne može vas napasti!")
            turnsSinceFrozen++
            return 0
        }else if(isOnFire){
            println("Goblin gori i vatra je uzrokovala 5 štete")
            takeDamage(5)
            turnsSinceSetOnFire++
        }
        val damage = att
        val chance: Int = Random.nextInt(0,100)
        when (chance){
            in 0..90 -> {println("Goblin je pogodio svojim napadom i uzrokovao $att štete")
                return damage
            }
            else -> {println("Goblin je promašio napad")
                return 0
            }
        }
    }

    fun takeDamage(damage: Int){
        hp -= damage
    }

    override fun toString(): String {
        return "$name - HP: $hp"
    }

}