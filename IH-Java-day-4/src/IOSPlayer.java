import java.util.*;

public class IOSPlayer {

    private double volume;
    private List<String> songs;

    public IOSPlayer(double volume, List<String> songs) {
        this.volume = volume;
        this.songs = songs;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public List<String> getSongs() {
        return songs;
    }

    public void setSongs(List<String> songs) {
        this.songs = songs;
    }
}
