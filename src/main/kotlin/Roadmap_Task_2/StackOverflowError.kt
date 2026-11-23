package org.example.Roadmap_Task_2

fun crash(): Unit = crash()

fun main() {
    try {
        crash()
    } catch (e: StackOverflowError) {
        println("Поймали StackOverflowError!")
    }
}