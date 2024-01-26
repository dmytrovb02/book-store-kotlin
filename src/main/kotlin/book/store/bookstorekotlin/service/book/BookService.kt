package book.store.bookstorekotlin.service.book

import book.store.bookstorekotlin.dto.BookRequestDto
import book.store.bookstorekotlin.dto.BookResponseDto
import book.store.bookstorekotlin.dto.BookResponseDtoWithoutCategory

interface BookService {

    fun getAll(): List<BookResponseDtoWithoutCategory>

    fun create(bookRequestDto: BookRequestDto): BookResponseDto
}
