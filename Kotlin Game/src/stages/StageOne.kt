package stages

import enemies.Goblin
import menu.itemSelectionMenu
import menu.spellSelectionMenu
import menu.weaponSelectionMenu
import player.Player

fun stageOne(player: Player): Int {
    val goblin = Goblin()
    println("Pred vama se našao goblin, porazite ga kako bi ste napredovali!")
    loop@ while (true) {
        if (player.hp <= 0) {
            println("Goblin vas je porazio!")
            break
        }
        println(player)
        println(goblin)
        print("1. Napad oružjem\n2. Napad magijom\n3. Iskoristite predmet\n4. Bježi")
        val izbor: Int = readLine()?.toInt() ?: 4
        when (izbor) {
            1 -> goblin.takeDamage(weaponSelectionMenu())
            2 -> goblin.takeDamage(spellSelectionMenu(player, goblin))
            3 -> itemSelectionMenu(player)
            4 -> {
                println("Pobjegli ste kući od goblina i odustali od avanture!")
                break@loop
            }
        }
        if (goblin.hp <= 0) {
            println("Čestitamo pobijedili ste goblina!\nMožete nastaviti s vašom avanturom")
            break
        } else {
            player.takeDamage(goblin.goblinAttack())
        }
    }
    if (player.hp<=0)return 0 else return 1
}