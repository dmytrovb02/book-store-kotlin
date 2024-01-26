package book.store.bookstorekotlin.dto

import java.math.BigDecimal

class BookResponseDtoWithoutCategory (
    var id: Long,
    var title: String,
    var author: String,
    var isbn: String,
    var price: BigDecimal,
    var description: String,
    var coverImage: String
)
