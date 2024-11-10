package Proxy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SongServiceServer implements SongService{
    private final List<Song> catalog;

    public SongServiceServer () {
        catalog = new ArrayList<>(Arrays.asList(
            new Song(1, "Man in the Mirror", "Michael Jackson", "Bad", 319),
            new Song(2, "Bad", "Michael Jackson", "Bad", 247),
            new Song(3, "The Way You Make Me Feel", "Michael Jackson", "Bad", 298),
            new Song(4, "Somewhere I Belong", "Linkin Park", "Meteora", 213),
            new Song(5, "Faint", "Linkin Park", "Meteora", 162)
        ));
    }

    @Override
    public Song searchById(int songID) {
        try {
            Thread.sleep(1000);
        } catch (Exception ignored) {}
        for (Song song : catalog) {
            if (song.getSongID() == songID) {
                return song;
            }
        }
        return null;
    }

    @Override
    public List<Song> searchByTitle(String title) {
        try {
            Thread.sleep(1000);
        } catch (Exception ignored) {}
        ArrayList<Song> results = new ArrayList<>();
        for (Song song : catalog) {
            if (song.getTitle().toLowerCase().contains(title.toLowerCase())) {
                results.add(song);
            }
        }
        return results;
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        try {
            Thread.sleep(1000);
        } catch (Exception ignored) {}
        ArrayList<Song> results = new ArrayList<>();
        for (Song song : catalog) {
            if (song.getAlbum().toLowerCase().contains(album.toLowerCase())) {
                results.add(song);
            }
        }
        return results;
    }
}
