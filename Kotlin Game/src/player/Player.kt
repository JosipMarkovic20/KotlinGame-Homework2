package player

class Player(val name: String, var hp: Int = 100, var mana: Int = 100){

    fun takeDamage(damage: Int){
        hp -= damage
    }

    fun castSpell(cost: Int){
        mana -= cost
    }

    override fun toString(): String {
        return "$name - HP: $hp Mana: $mana"
    }

}
