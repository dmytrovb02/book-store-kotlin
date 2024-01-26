package book.store.bookstorekotlin.service.book

import book.store.bookstorekotlin.dto.BookRequestDto
import book.store.bookstorekotlin.dto.BookResponseDto
import book.store.bookstorekotlin.dto.BookResponseDtoWithoutCategory
import book.store.bookstorekotlin.mapper.BookMapper
import book.store.bookstorekotlin.model.Book
import book.store.bookstorekotlin.repository.BookRepository
import lombok.RequiredArgsConstructor
import org.springframework.stereotype.Service

@Service
@RequiredArgsConstructor
class BookServiceImpl(
    private val bookRepository: BookRepository,
    private val bookMapper: BookMapper
) : BookService {

    override fun getAll(): List<BookResponseDtoWithoutCategory> {
        return bookRepository.findAll()
            .map(bookMapper::toDtoWithoutCategory)
            .toList()
    }

    override fun create(bookRequestDto: BookRequestDto): BookResponseDto {
        val book: Book = bookMapper.toEntity(bookRequestDto)
        bookRepository.save(book)
        return bookMapper.toDto(book)
    }
}
