package book.store.bookstorekotlin.model

import jakarta.persistence.*
import org.hibernate.annotations.SQLDelete
import org.hibernate.annotations.SQLRestriction
import java.math.BigDecimal

@Entity
@SQLDelete(sql = "UPDATE books SET is_deleted = true WHERE id=?")
@SQLRestriction("is_deleted=false")
@Table(name = "books")
data class Book(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long,

    @Column(name = "title", nullable = false)
    var title: String,

    @Column(name = "author", nullable = false)
    var author: String,

    @Column(name = "isbn", nullable = false, unique = true)
    var isbn: String,

    @Column(name = "price", nullable = false)
    var price: BigDecimal,

    @Column(name = "description")
    var description: String?,

    @Column(name = "cover_image")
    var coverImage: String?,

    @Column(name = "is_deleted", nullable = false)
    var isDeleted: Boolean,

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "books_categories",
        joinColumns = [JoinColumn(name = "book_id")],
        inverseJoinColumns = [JoinColumn(name = "category_id")]
    )
    var categories: Set<Category> = HashSet()
)
