package enemies

open class Enemy(val name: String,var hp: Int = 100, var isOnFire: Boolean = false, var isFrozen: Boolean = false,
                 var turnsSinceFrozen: Int = 0, var turnsSinceSetOnFire: Int = 0  )

