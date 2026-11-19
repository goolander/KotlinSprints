package org.example.Roadmap_Task_2

import java.util.Objects
import java.util.HashMap

// Исправленный класс — назван FixedPerson во избежание конфликта имен, переопределены equals и hashCode
// я бы все упростил, написав data class :)
class FixedPerson(val name: String, val age: Int) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FixedPerson) return false
        return name == other.name && age == other.age
    }

    override fun hashCode(): Int {
        return Objects.hash(name, age)
    }

    //переопределяем, чтобы в консоль вывелся читаемый результат:
    override fun toString(): String {
        return "Person(name='$name', age=$age)"
    }
}

fun main() {
    val map = HashMap<FixedPerson, String>()

    val p1 = FixedPerson("Алексей", 30)
    val p2 = FixedPerson("Алексей", 30)
    val p3 = FixedPerson("Мария", 22)

    map[p1] = "Тимлид"
    map[p3] = "Дизайнер"

    // Перезаписываем значение для Алексея
    map[p2] = "Архитектор"

    println("=== ТЕСТ С ПЕРЕОПРЕДЕЛЕННЫМ EQUALS И HASHCODE ===")

    val searchPerson = FixedPerson("Алексей", 30)
    println("Ищем 'Алексей, 30': ${map[searchPerson]}")
    // Выведет: Архитектор

    println("\n=== ВСЕ КЛЮЧИ И ЗНАЧЕНИЯ HASHMAP ===")
    for ((key, value) in map) {
        println("$key => Должность: $value")
    }
}