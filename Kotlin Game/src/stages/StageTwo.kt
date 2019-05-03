package stages

import enemies.Troll
import menu.itemSelectionMenu
import menu.spellSelectionMenu
import menu.weaponSelectionMenu
import player.Player

fun stageTwo(player: Player): Int {
    val troll = Troll()
    println("Pred vama se našao trol, porazite ga kako bi ste napredovali!")
    loop@ while (true) {
        if (player.hp <= 0) {
            println("Trol vas je porazio!")
            break
        }
        println(player)
        println(troll)
        print("1. Napad oružjem\n2. Napad magijom\n3. Iskoristite predmet\n4. Bježi")
        val izbor: Int = readLine()?.toInt() ?: 4
        when (izbor) {
            1 -> troll.takeDamage(weaponSelectionMenu())
            2 -> troll.takeDamage(spellSelectionMenu(player, troll))
            3 -> itemSelectionMenu(player)
            4 -> {
                println("Pobjegli ste kući od trola i odustali od avanture!")
                break@loop
            }
        }
        if (troll.hp <= 0) {
            println("Čestitamo pobijedili ste trola!\nMožete nastaviti s vašom avanturom")
            break
        } else {
            player.takeDamage(troll.trollAttack())
        }
    }
    if (player.hp<=0)return 0 else return 1
}