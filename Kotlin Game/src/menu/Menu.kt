package menu

import items.HealingPotion
import items.Items
import items.ManaPotion
import player.Player
import spells.Fireball
import spells.IceSpike
import spells.Spells
import weapons.Dagger
import weapons.Sword
import weapons.Weapon
import kotlin.system.exitProcess

fun menu(): Player {
    val weaponList: List<Weapon> = listOf(
        Sword(),
        Dagger()
    )
    val itemsList: List<Items> = listOf(
        HealingPotion(),
        ManaPotion()
    )
    val spellsList: List<Spells> = listOf(
        Fireball(),
        IceSpike()
    )
    print("Unesite svoje ime: ")
    val name: String = readLine() ?: "John Doe"
    val player = Player(name)
    println(player)
    loop@ while (true) {
        println("1. Pregled oružja\n2. Pregled predmeta\n3. Pregled magije\n4. Početak avanture\n5. Izlaz iz igre")
        val izbor = readLine()?.toInt() ?: 4
        when (izbor) {
            1 -> println(weaponList)
            2 -> println(itemsList)
            3 -> println(spellsList)
            4 -> {
                println("Avantura počinje!")
                break@loop
            }
            5 -> {
                println("Hvala na igranju!")
                exitProcess(0)
            }
        }
    }
    return player
}


