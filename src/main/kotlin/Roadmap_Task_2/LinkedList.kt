package org.example.Roadmap_Task_2

// 1. Класс узла списка
class Node(val value: Int) {
    var next: Node? = null // Ссылка на следующий элемент (null, если элемент последний)
}

// 2. Класс односвязного списка
class LinkedList {
    private var head: Node? = null // Точка входа в список. Изначально список пуст.

    // Добавление элемента в конец списка
    fun add(value: Int) {
        val newNode = Node(value)

        // Если список пуст, новый узел становится головой
        if (head == null) {
            head = newNode
            return
        }

        // Иначе идем до самого последнего элемента
        var current = head
        while (current?.next != null) {
            current = current.next
        }
        // Привязываем новый узел к бывшему последнему
        current?.next = newNode
    }

    // Удаление первого найденного элемента с заданным значением
    fun remove(value: Int): Boolean {
        // Если список пуст, удалять нечего
        if (head == null) return false

        // Если нужно удалить первый элемент
        if (head?.value == value) {
            head = head?.next
            return true
        }

        // Ищем элемент в глубине списка, отслеживая предыдущий узел
        var current = head
        while (current?.next != null) {
            if (current.next?.value == value) {
                // Перешагиваем через удаляемый узел
                current.next = current.next?.next
                return true
            }
            current = current.next
        }
        return false // Элемент не нашли
    }

    // Проверка, есть ли элемент в списке
    fun contains(value: Int): Boolean {
        var current = head
        while (current != null) {
            if (current.value == value) {
                return true
            }
            current = current.next
        }
        return false
    }

    // Вывод всех элементов списка в консоль
    fun printList() {
        if (head == null) {
            println("Список пуст")
            return
        }

        val result = mutableListOf<Int>()
        var current = head
        while (current != null) {
            result.add(current.value)
            current = current.next
        }
        println(result.joinToString(separator = " -> "))
    }
}