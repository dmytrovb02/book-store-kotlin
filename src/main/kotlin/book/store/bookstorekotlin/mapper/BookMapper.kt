package book.store.bookstorekotlin.mapper

import book.store.bookstorekotlin.dto.BookRequestDto
import book.store.bookstorekotlin.dto.BookResponseDto
import book.store.bookstorekotlin.dto.BookResponseDtoWithoutCategory
import book.store.bookstorekotlin.model.Book
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface BookMapper {
    fun toDto(book: Book): BookResponseDto

    fun toDtoWithoutCategory(book: Book): BookResponseDtoWithoutCategory

    fun toEntity(bookRequestDto: BookRequestDto): Book
}
