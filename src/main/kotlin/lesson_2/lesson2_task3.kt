package org.example.lesson_2

import java.time.LocalTime
import java.time.format.DateTimeFormatter
import kotlin.time.Duration.Companion.seconds

fun main() {
    var timeStart = "9:39"
    val timeStartWithLeadingZero = timeStart.padStart(5, '0')
    val formatterTimeStart = DateTimeFormatter.ofPattern("HH:mm")
    val formattedTimeStart = LocalTime.parse("$timeStartWithLeadingZero", formatterTimeStart)
    val convertFormattedTimeStart = formattedTimeStart.toSecondOfDay()
    var timeTravel = "457"
    val converToSecond = 60
    val convertTimeTravel = (timeTravel.toInt()) * converToSecond
    val timeFinishSec = (convertFormattedTimeStart + convertTimeTravel).seconds
    val timeFinish = timeFinishSec.toComponents { hours, minutes, seconds, _ ->
        "%02d:%02d".format(hours, minutes, seconds) }

    println("Время прибытие поезда: $timeFinish")
    }