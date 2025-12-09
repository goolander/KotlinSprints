package org.example.lesson_4

fun main() {
    print("Какой день тренеровки?: ")
    val trainingDay = readLine()!!.toInt()
    if (trainingDay % 2 == 0) {
        println(
            """|Упражнения для рук:    false
               |Упражнения для ног:    true
               |Упражнения для спины:  true
               |Упражнения для пресса: false""".trimMargin()
        )
    } else {
        println(
            """|Упражнения для рук:    true
               |Упражнения для ног:    false
               |Упражнения для спины:  false
               |Упражнения для пресса: true""".trimMargin()
        )
    }
}