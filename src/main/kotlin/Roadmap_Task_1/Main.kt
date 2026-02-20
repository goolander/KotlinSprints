package org.example.Roadmap_Task_1

fun main(){
     val library = Library()
     val randomBook = library.getRandomBook()
     println("Случайная книга: ${randomBook.title}, ${randomBook.author}, цена ${randomBook.price}")
}