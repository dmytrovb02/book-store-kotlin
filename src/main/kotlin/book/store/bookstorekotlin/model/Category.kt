package book.store.bookstorekotlin.model

import jakarta.persistence.*
import org.hibernate.annotations.SQLDelete
import org.hibernate.annotations.SQLRestriction

@Entity
@SQLDelete(sql = "UPDATE categories SET is_deleted = true WHERE id=?")
@SQLRestriction("is_deleted=false")
@Table(name = "categories")
class Category (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,

    @Column(name = "name", nullable = false)
    var name: String,

    @Column(name = "description")
    var description: String?,

    @Column(name = "is_deleted", nullable = false)
    var isDeleted: Boolean
)
