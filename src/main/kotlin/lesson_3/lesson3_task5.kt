package org.example.lesson_3

fun main() {
    val dataPosition = "D2-D4;0"
    val (startPosition, endPosition, countPosition) = dataPosition.split("-", ";")
    println(startPosition)
    println(endPosition)
    println(countPosition)
}