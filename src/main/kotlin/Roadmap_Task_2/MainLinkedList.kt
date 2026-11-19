package org.example.Roadmap_Task_2

fun main() {
    val list = LinkedList()

    println("--- 1. Создаем список и добавляем элементы ---")
    list.add(10)
    list.add(20)
    list.add(30)
    list.add(40)
    list.printList()

    println("\n--- 2. Проверяем наличие элементов ---")
    println("Содержит 20? ${list.contains(20)}")
    // true
    println("Содержит 50? ${list.contains(50)}")
    // false

    println("\n--- 3. Удаляем элемент 20 (из середины) ---")
    list.remove(20)
    list.printList()

    println("\n--- 4. Удаляем элемент 10 (голову списка) ---")
    list.remove(10)
    list.printList()
}