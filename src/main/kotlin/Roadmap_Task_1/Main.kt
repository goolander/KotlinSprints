package org.example.Roadmap_Task_1

fun main() {
     val library = Library()

     // 1. УСПЕШНОЕ ПОЛУЧЕНИЕ КНИГИ
     // выбор гарантированно существующей книги из сгенерированного списка
     val realBook = library.books.first()
     println("--- Тест 1: Успешный поиск ---")
     val foundBook = library.chooseBook(realBook.price + 10, realBook.title, realBook.author)
     println("Книга успешно найдена: $foundBook")


     // 2. НЕУСПЕШНОЕ ПОЛУЧЕНИЕ (БЕЗ try-catch)
     // РАЗКОММЕНТИРОВАТЬ ТРИ СТРОКИ НИЖЕ, ЧТОБЫ УВИДЕТЬ ПАДЕНИЕ ПРОГРАММЫ

     // println("\n--- Тест 2: Падение программы  ---")
     // library.chooseBook(1, "Несуществующая книга", "Неизвестный автор")
     // println("Конец программы") // Эта строка не выполнится при падении


     // 3. НЕУСПЕШНОЕ ПОЛУЧЕНИЕ С ОБРАБОТКОЙ (с try-catch)
     println("\n--- Тест 3: Безопасный неуспешный поиск  ---")
     try {
          // Заведомо невыполнимые условия (цена 0)
          library.chooseBook(0, "Война и мир", "Лев Толстой")
     } catch (e: BookNotFoundException) {
          // Выводим ошибку в консоль ошибок
          System.err.println("Перехвачено исключение: ${e.message}")
     }

     // Проверяем, что приложение не упало и строчка выводится
     println("Конец программы")


     // 4. ТЕСТ СОРТИРОВКИ (Пункт 16)
     println("\n--- Тест 4: Демонстрация сортировки (первые 5 отсортированных книг) ---")
     val sortedList = library.sortedBooks
     sortedList.take(5).forEach { println(it) }
}