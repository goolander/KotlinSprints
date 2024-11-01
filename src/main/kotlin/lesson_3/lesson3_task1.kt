package org.example.lesson_3
import java.time.LocalTime

fun main() {
    val greetingDay = "Добрый день,"
    val startTimeDay = LocalTime.of(10, 0)
    val endTimeDay = LocalTime.of(16, 59)
    val greetingEvening = "Добрый вечер,"
    val startTimeEvening = LocalTime.of(17, 0)
    val endTimeEvening = LocalTime.of(22, 59)
    val nameUser = "Иван"
    val currentTime = LocalTime.now()
    if (currentTime.isAfter(startTimeDay) && currentTime.isBefore(endTimeDay))
    {
        println("$greetingDay $nameUser!")
    }
    if (currentTime.isAfter(startTimeEvening) && currentTime.isBefore(endTimeEvening))
    {
        println("$greetingEvening $nameUser!")
    }
    else {
        println("Здравствуйте, $nameUser!")
    }
}