package Proxy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SongServiceProxyTest {

    @Test
    void searchById() {
        SongServiceProxy songServiceServer = new SongServiceProxy();
        Song firstSong = songServiceServer.searchById(1);

        assertEquals("Man in the Mirror", firstSong.getTitle());
    }

    @Test
    void searchByTitle() {
        SongServiceProxy songServiceServer = new SongServiceProxy();
        List<Song> songs = songServiceServer.searchByTitle("the");

        assertEquals(2, songs.size());
    }

    @Test
    void searchByAlbum() {
        SongServiceProxy songServiceServer = new SongServiceProxy();
        List<Song> songs = songServiceServer.searchByAlbum("bad");

        assertEquals(3, songs.size());
    }
}