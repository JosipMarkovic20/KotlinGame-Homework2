package weapons

import kotlin.random.Random

class Dagger(val name: String = "Bodež", val att: Int = 5): Weapon(){
    fun attack(): Int {
        val critical: Int = att+10
        val chance: Int = Random.nextInt(0,100)
        when (chance){
            in 0..69 -> {println("Napad je uspjeo i učinili ste $att štete")
                return att
            }
            in 70..90 -> {println("Uzrokovali ste kritičnu štetu od $critical bodova")
                return critical
            }
            else -> {println("Nažalost vaš je napad promašio")
                return 0
            }
        }
    }

    override fun toString(): String {
        return "$name - Napad: $att"
    }
}