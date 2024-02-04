package org.example

class Rentadora {
    private var preuBase: Int = 0
    private var càrrega: Int = 5

    constructor(preuBase: Int, càrrega:Int) {
        this.preuBase = preuBase
        this.càrrega = càrrega
    }

    fun getCàrrega(): Int {
        return càrrega
    }
    fun getPreuBase(): Int {
        return preuBase
    }
        fun preuFinal(): Int {
        var preuFinal = preuBase
        preuFinal += when (càrrega) {
            6, 7 -> 55
            8 -> 70
            9 -> 85
            10 -> 100
            else -> {
                println("${RED_BOLD}Càrrega no vàlida. S'utilitzarà el valor per defecte: 5${RESET}")
                5
            }
        }
        return preuFinal
    }
}
