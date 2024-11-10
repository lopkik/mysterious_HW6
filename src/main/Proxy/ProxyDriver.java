package Proxy;

import java.util.List;

public class ProxyDriver {
    public static void main (String[] args) {
        SongService songService = new SongServiceProxy();

        Song firstResult = songService.searchById(1);
        System.out.println(firstResult);

        List<Song> searchByTitleBadSongs = songService.searchByTitle("bad");
        for (Song song : searchByTitleBadSongs) {
            System.out.println(song);
        }

        List<Song> searchByAlbumBadSongs = songService.searchByAlbum("bad");
        for (Song song : searchByAlbumBadSongs) {
            System.out.println(song);
        }

        System.out.print("\n");

        Song firstResult2 = songService.searchById(1);
        System.out.println(firstResult2);

        List<Song> searchByTitleBadSongs2 = songService.searchByTitle("bad");
        for (Song song : searchByTitleBadSongs2) {
            System.out.println(song);
        }

        List<Song> searchByAlbumBadSongs2 = songService.searchByAlbum("bad");
        for (Song song : searchByAlbumBadSongs2) {
            System.out.println(song);
        }
    }
}
