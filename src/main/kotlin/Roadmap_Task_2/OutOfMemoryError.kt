package org.example.Roadmap_Task_2

fun main() {
    catchHugeArray()
    catchInfiniteLoop()
}

// Способ 1: Попытка выделить один гигантский массив
fun catchHugeArray() {
    try {
        val array = IntArray(Int.MAX_VALUE)
        println(array.size) // Чтобы сборщик не удалил неиспользуемую переменную
    } catch (e: OutOfMemoryError) {
        println("Способ 1 (гигантский массив) — поймали: $e")
    }
}

// Способ 2: Постепенное заполнение памяти в бесконечном цикле
fun catchInfiniteLoop() {
    val list = mutableListOf<ByteArray>()
    try {
        while (true) {
            list.add(ByteArray(10 * 1024 * 1024)) // Добавляем по 10 МБ на каждой итерации
        }
    } catch (e: OutOfMemoryError) {
        list.clear() // Освобождаем память, чтобы безопасно выполнить println
        println("Способ 2 (бесконечный цикл) — поймали: $e")
    }
}