package main

import menu.menu
import stages.stageOne
import stages.stageTwo


fun main() {

    val player = menu()
    val stageOne = stageOne(player)
    if (stageOne==1){
        println("Avantura se nastavlja")
        val stageTwo =stageTwo(player)
        if (stageTwo==1){
            println("Završili ste demo verziju igre!")
        }else{
            println("Game over")
        }
    }else{
        println("Game over")
    }
}

