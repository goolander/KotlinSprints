package org.example.lesson_4

const val ALL_TABLES = 13
fun main() {
    var bookingToday = 13
    var bookingTomorrow = 9
    println("Доступность столиков на сегодня: ${bookingToday < ALL_TABLES}\n" +
            "Доступность столиков на завтра:  ${bookingTomorrow < ALL_TABLES}")
}