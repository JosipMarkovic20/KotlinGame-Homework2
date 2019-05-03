package menu

import weapons.Dagger
import weapons.Sword

fun weaponSelectionMenu(): Int{
    while(true) {
        println("Odaberite oružje:\n1. Mač\n2. Bodež")
        val izbor: Int = readLine()?.toInt() ?: 1
        when (izbor) {
            1 -> return Sword().attack()
            2 -> return Dagger().attack()
        }
    }
}
