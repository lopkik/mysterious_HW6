package Proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SongTest {

    @Test
    void testToString() {
        Song testSong = new Song(1, "title", "artist", "album", 100);

        assertEquals("[001]: title (01:40) by artist from album", testSong.toString());
    }
}