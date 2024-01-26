package book.store.bookstorekotlin.controller

import book.store.bookstorekotlin.dto.BookRequestDto
import book.store.bookstorekotlin.dto.BookResponseDto
import book.store.bookstorekotlin.dto.BookResponseDtoWithoutCategory
import book.store.bookstorekotlin.service.book.BookServiceImpl
import lombok.RequiredArgsConstructor
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
class BookController (
    private val bookServiceImpl: BookServiceImpl
) {

    @GetMapping
    fun getAllBooks(): List<BookResponseDtoWithoutCategory?> = bookServiceImpl.getAll()

    @PostMapping
    fun createNewBook(@RequestBody bookRequestDto: BookRequestDto): BookResponseDto = bookServiceImpl.create(bookRequestDto)
}
