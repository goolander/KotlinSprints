package lesson_2

fun main() {
    val principalAmount = 70000
    val interestRate = 16.7
    val timePeriod = 20
    val convertToDecimal = 100
    val compoundInterest = principalAmount.toDouble() * Math.pow((1 + interestRate
            / convertToDecimal),timePeriod.toDouble())
    println((String.format("%.3f", compoundInterest)))
}
