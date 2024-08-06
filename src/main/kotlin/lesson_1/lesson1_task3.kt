package org.example.lesson_1

fun main() {
    val year = 1961
    var hour = 9
    var hourWithLeadingZero = String.format("%02d", hour)
    var minute = 7
    var minuteWithLeadingZero = String.format("%02d", minute)
    println(year)
    println(hourWithLeadingZero)
    println(minuteWithLeadingZero)

    hour = 10
    hourWithLeadingZero = String.format("%02d", hour)
    minute = 55
    minuteWithLeadingZero = String.format("%02d", minute)
    print(hourWithLeadingZero + ":" + minuteWithLeadingZero)
}