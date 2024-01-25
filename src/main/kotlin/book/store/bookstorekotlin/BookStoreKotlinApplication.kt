package book.store.bookstorekotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BookStoreKotlinApplication

fun main(args: Array<String>) {
	runApplication<BookStoreKotlinApplication>(*args)
}
