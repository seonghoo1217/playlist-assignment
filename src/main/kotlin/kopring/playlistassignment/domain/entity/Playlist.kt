package kopring.playlistassignment.domain.entity

import jakarta.persistence.*
import kopring.playlistassignment.global.BaseEntity
import lombok.AccessLevel
import lombok.NoArgsConstructor

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
data class Playlist(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "playlist_id")
    val id: Long? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    val hostId: Member,

    val title: String,

    val playlistImage: String,

    @OneToMany(targetEntity = TrackPlaylist::class, fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    val trackPlaylists: MutableList<TrackPlaylist> = mutableListOf()
) : BaseEntity() {
}