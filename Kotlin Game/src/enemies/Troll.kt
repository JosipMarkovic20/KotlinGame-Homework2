package enemies

import kotlin.random.Random

class Troll(name: String = "Trol", hp: Int = 120, val att: Int = 20): Enemy(name,hp){

    fun trollAttack(): Int{
        if (turnsSinceFrozen>3){
            turnsSinceFrozen=0
            isFrozen=false
        }
        if(turnsSinceSetOnFire>3){
            turnsSinceSetOnFire=0
            isOnFire=false
        }
        if (isFrozen){
            println("Trol je zamrzunt i ne može vas napasti!")
            turnsSinceFrozen++
            return 0
        }else if(isOnFire){
            println("Trol gori i vatra je uzrokovala 5 štete")
            takeDamage(5)
            turnsSinceSetOnFire++
        }
        val damage = att
        val chance: Int = Random.nextInt(0,100)
        when (chance){
            in 0..90 -> {println("Trol je pogodio svojim napadom i uzrokovao $att štete")
                return damage
            }
            else -> {println("Trol je promašio napad")
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