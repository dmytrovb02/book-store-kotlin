package book.store.bookstorekotlin.dto

import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import java.math.BigDecimal

class BookRequestDto(

    @field:NotNull
    var title: String,

    @field:NotNull
    var author: String,

    @field:NotNull
    @Size(min = 12, max = 12)
    var isbn: String,

    @field:NotNull
    @DecimalMin(value = "0.0")
    var price: BigDecimal,

    var description: String,

    var coverImage: String,

)
