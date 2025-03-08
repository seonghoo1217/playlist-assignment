package kopring.playlistassignment

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PlaylistAssignmentApplication

fun main(args: Array<String>) {
    println("Application Running!")
    runApplication<PlaylistAssignmentApplication>(*args)
}
