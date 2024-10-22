package org.example.lesson_2

fun main() {
   var markStudent1 = 3
   var markStudent2 = 4
   var markStudent3 = 3
   var markStudent4 = 5
   var allStudents = 4
   var averageMark: Float = (((markStudent1 + markStudent2 + markStudent3 + markStudent4)
           / allStudents).toFloat())
    println((String.format("%.2f", averageMark)))
}