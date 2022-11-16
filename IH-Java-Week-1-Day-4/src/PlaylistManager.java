public class PlaylistManager {

    private Playable playable;

    public PlaylistManager(Playable playable) {
        this.playable = playable;
    }

    public Playable getWebPlayer() {
        return playable;
    }

    public void setWebPlayer(Playable playable) {
        this.playable = playable;
    }
}
