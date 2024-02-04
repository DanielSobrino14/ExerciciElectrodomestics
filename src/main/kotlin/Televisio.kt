package org.example

class Televisio {
    private var preuBase: Int = 0
    private var mida: Int = 28

    constructor(preuBase: Int, mida: Int) {
        this.preuBase = preuBase
        this.mida = mida
    }

    fun getPreuBase(): Int {
        return preuBase
    }

    fun getMida(): Int {
        return mida
    }

    fun preuFinal(): Int {
        var preuFinal = preuBase

        preuFinal += when (mida) {
            in 29..32 -> 50
            in 33..42 -> 100
            in 43..50 -> 150
            in 51..250-> 200
            else -> {
                println("${RED_BOLD}Mida no vàlida. S'utilitzarà el valor per defecte: 28${RESET}")
                28
            }
        }
        return preuFinal
    }
}
