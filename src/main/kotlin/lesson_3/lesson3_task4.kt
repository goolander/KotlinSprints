package org.example.lesson_3

fun main() {
    var startPosition: String = "E2"
    var endPosition: String = "E4"
    var countPosition: Short = 1
    val dataPosition = { "[$startPosition-$endPosition; $countPosition]" }
    println(dataPosition())
    startPosition = "D2"
    endPosition = "D3"
    countPosition = 2
    println(dataPosition())
}