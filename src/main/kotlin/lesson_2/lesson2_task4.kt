package lesson_2

fun main() {
    var crystalMinerals = 7
    var ironMinerals = 11
    val buff = 20
    val convertToDecimal = 10
    val convertBuff = buff / convertToDecimal
    val buffCrystalMinerals = (convertBuff * crystalMinerals).toInt()
    val buffIronMinerals = (convertBuff * ironMinerals).toInt()
    println("Дополнительно получено $buffCrystalMinerals кристалической руды")
    println("Дополнительно получено $buffIronMinerals железеой руды")
}