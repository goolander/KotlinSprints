package org.example.Roadmap_Task_2
import java.util.HashMap

// Класс Person с переопределенным equals, но БЕЗ hashCode
class Person(val name: String, val age: Int) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Person) return false
        return name == other.name && age == other.age
    }

    // hashCode не переопределен
}

fun main() {
    val map = HashMap<Person, String>()

    val person1 = Person("Иван", 25)
    val person2 = Person("Иван", 25)

    map[person1] = "Разработчик"

    println("=== ТЕСТ БЕЗ HASHCODE ===")
    println("Равны ли объекты по equals?: ${person1 == person2}")
    // true

    // Пытаемся достать данные по второму объекту
    val result = map[person2]
    println("Результат поиска в HashMap: $result")
    // Выведет: null

}
