package org.example.lesson_1

import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.seconds

fun main() {
    val duration = 6480.seconds
    val durationString = duration.toComponents { hours, minutes, seconds, _ ->
        "%02d:%02d:%02d".format(hours, minutes, seconds)
    }
    println(durationString)
}