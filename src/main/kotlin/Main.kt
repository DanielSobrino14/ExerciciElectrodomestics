package org.example

fun main() {
    val electrodomestics = arrayOf(
        Electrodomestic(35, "blanc", "D", 9),
        Electrodomestic(35, "platejat", "E", 49),
        Electrodomestic(35, "blanc", "F", 5),
        Electrodomestic(35, "platejat", "A", 66),
        Electrodomestic(35, "blanc", "B", 99),
        Electrodomestic(35, "platejat", "C", 121),
        Rentadora(400, 5),
        Rentadora(250, 8),
        Televisio(320, 52),
        Televisio(130, 28),
    )

    for (electrodomestic in electrodomestics) {
        when (electrodomestic) {
            is Electrodomestic -> {
                println("Electrodomèstic:")
                println("Preu base: ${electrodomestic.getPreuBase()}€")
                println("Color: ${electrodomestic.getColor()}")
                println("Consum: ${electrodomestic.getConsum()}")
                println("Pes: ${electrodomestic.getPes()}kg")
                println("Preu Final: ${electrodomestic.preuFinal()}€")
            }

            is Rentadora -> {
                println("Rentadora:")
                println("Preu base: ${electrodomestic.getPreuBase()}€")
                println("Càrrega: ${electrodomestic.getCàrrega()}kg")
                println("Preu final: ${electrodomestic.preuFinal()}€")
            }

            is Televisio -> {
                println("Televisió:")
                println("Preu base: ${electrodomestic.getPreuBase()}€")
                println("Mida: ${electrodomestic.getMida()}\"")
                println("Preu final: ${electrodomestic.preuFinal()}€")
            }
        }
        println()
    }
}