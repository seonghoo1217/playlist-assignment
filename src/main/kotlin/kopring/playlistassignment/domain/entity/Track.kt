package kopring.playlistassignment.domain.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import lombok.AccessLevel
import lombok.NoArgsConstructor

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
data class Track(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "track_id")
    val id: Long ?= null,

    val artist : String,

    val title : String,

    val duration : String
) {
}