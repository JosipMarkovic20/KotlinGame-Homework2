package spells

import enemies.Enemy

open class Spells

interface Effect{
    fun effect(enemy: Enemy)
}


