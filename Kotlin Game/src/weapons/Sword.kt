package weapons

import kotlin.random.Random

class Sword(val name: String = "Mač", val att: Int = 10): Weapon(){

    fun attack(): Int {
        val critical: Int = att+10
        val chance: Int = Random.nextInt(0,100)
        when (chance){
            in 0..84 -> {println("Napad je uspjeo i učinili ste $att štete")
                return att
            }
            in 85..90 -> {println("Uzrokovali ste kritičnu štetu od $critical bodova")
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