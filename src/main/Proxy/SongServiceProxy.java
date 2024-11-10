package Proxy;

import java.util.HashMap;
import java.util.List;

public class SongServiceProxy implements SongService {
    private final SongServiceServer songServiceServer = new SongServiceServer();

    HashMap<Integer, Song> searchByIdCache = new HashMap<>();
    HashMap<String, List<Song>> searchByTitleCache = new HashMap<>();
    HashMap<String, List<Song>> searchByAlbumCache = new HashMap<>();

    @Override
    public Song searchById(int songID) {
        if (searchByIdCache.containsKey(songID)) {
            return searchByIdCache.get(songID);
        }

        Song result = songServiceServer.searchById(songID);
        searchByIdCache.put(songID, result);
        return result;
    }

    @Override
    public List<Song> searchByTitle(String title) {
        if (searchByTitleCache.containsKey(title)) {
            return searchByTitleCache.get(title);
        }

        List<Song> results = songServiceServer.searchByTitle(title);
        searchByTitleCache.put(title.toLowerCase(), results);
        return results;
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        if (searchByAlbumCache.containsKey(album)) {
            return searchByAlbumCache.get(album);
        }

        List<Song> results = songServiceServer.searchByAlbum(album);
        searchByAlbumCache.put(album.toLowerCase(), results);
        return results;
    }
}
