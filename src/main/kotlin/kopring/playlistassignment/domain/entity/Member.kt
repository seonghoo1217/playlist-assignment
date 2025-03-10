package kopring.playlistassignment.domain.entity

import jakarta.persistence.*
import kopring.playlistassignment.global.BaseEntity
import lombok.AccessLevel
import lombok.AllArgsConstructor
import lombok.NoArgsConstructor
import java.util.*

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
data class Member(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    val id: Long? = null,

    @Column(nullable = false, unique = true)
    val fakeId: UUID,

    @Column(nullable = false, unique = true)
    val username: String,

    @Column(nullable = false)
    val password: String,

    @Enumerated(EnumType.STRING)
    val status: MemberStatus

) : BaseEntity()
