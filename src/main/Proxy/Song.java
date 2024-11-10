package Proxy;

public class Song {
    private final int songID;
    private final String title;
    private final String artist;
    private final String album;
    private final int duration;

    public Song (int songID, String title, String artist, String album, int duration) {
        this.songID = songID;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
    }

    public int getSongID() {
        return songID;
    }

    public String getTitle() {
        return title;
    }

    public String getAlbum() {
        return album;
    }

    @Override
    public String toString() {
        return String.format("[%03d]:", songID) + " " + title +" "+ String.format("(%02d:%02d)", duration / 60, duration % 60) + " by " + artist + " from " + album;
    }
}
