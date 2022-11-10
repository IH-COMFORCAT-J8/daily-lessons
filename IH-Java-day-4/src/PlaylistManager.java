public class PlaylistManager {

    private Playable playable;

    public PlaylistManager(Playable playable) {
        this.playable = playable;
    }

    public WebPlayer getWebPlayer() {
        return webPlayer;
    }

    public void setWebPlayer(WebPlayer webPlayer) {
        this.webPlayer = webPlayer;
    }
}
