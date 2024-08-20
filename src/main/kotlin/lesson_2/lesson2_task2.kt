package org.example.lesson_2

fun main() {
    var employees = 50
    var employees_salaries = 30000
    var interns = 30
    var interns_salaries = 20000
    var employees_payments = employees * employees_salaries
    var interns_payments = interns * interns_salaries
    var all_payments = employees_payments + interns_payments
    var average_salaries = (all_payments / (employees + interns))
    println (employees_payments)
    println (all_payments)
    println (average_salaries)
}