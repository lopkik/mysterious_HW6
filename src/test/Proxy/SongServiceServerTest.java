package Proxy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SongServiceServerTest {

    @Test
    void searchById() {
        SongServiceServer songServiceServer = new SongServiceServer();
        Song firstSong = songServiceServer.searchById(1);

        assertEquals("Man in the Mirror", firstSong.getTitle());
    }

    @Test
    void searchByTitle() {
        SongServiceServer songServiceServer = new SongServiceServer();
        List<Song> songs = songServiceServer.searchByTitle("the");

        assertEquals(2, songs.size());
    }

    @Test
    void searchByAlbum() {
        SongServiceServer songServiceServer = new SongServiceServer();
        List<Song> songs = songServiceServer.searchByAlbum("bad");

        assertEquals(3, songs.size());
    }
}