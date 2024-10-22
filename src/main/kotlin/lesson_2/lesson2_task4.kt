package lesson_2

fun main() {
    var crystalMinerals = 7
    var ironMinerals = 11
    val buff = 20
    val convertBuff = buff / 10
    val buffCrystalMinerals = (convertBuff * crystalMinerals).toInt()
    val buffIronMinerals = (convertBuff * ironMinerals).toInt()
    println("Дополнительно получено $buffCrystalMinerals кристалической руды")
    println("Дополнительно получено $buffIronMinerals железеой руды")
}