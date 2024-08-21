package lesson_2

fun main() {
    var crystalMinerals = 7
    var ironMinerals = 11
    val buff = 0.2
    val buffCrystalMinerals = (buff * crystalMinerals).toInt()
    val buffIronMinerals = (buff * ironMinerals).toInt()
    println("Дополнительно получено $buffCrystalMinerals кристалической руды")
    println("Дополнительно получено $buffIronMinerals железеой руды")
}