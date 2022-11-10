public class WebPlayer implements Playable {
    private String currentSong;
    private int volume;

    public WebPlayer(String currentSong) {
        this.currentSong = currentSong;
        this.volume = 50;
    }

    public String getCurrentSong() {
        return currentSong;
    }

    public void setCurrentSong(String currentSong) {
        this.currentSong = currentSong;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void play() {

    }

    public void pause() {

    }

    public void nextSong() {

    }

    public String showSongPlaying() {
        return null;
    }

    public void volumeUp(int volume) {
        this.volume += volume;

    }

    public void volumeDown(int volume) {
        this.volume -= volume;

    }
}
