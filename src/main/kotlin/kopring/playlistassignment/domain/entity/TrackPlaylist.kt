package kopring.playlistassignment.domain.entity

import jakarta.persistence.*
import kopring.playlistassignment.global.BaseEntity
import lombok.AccessLevel
import lombok.NoArgsConstructor

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
data class TrackPlaylist(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "track_playlist_id")
    val id: Long? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    val playlistId: Playlist,

    @ManyToOne(fetch = FetchType.LAZY)
    val trackId: Track
) : BaseEntity() {

}