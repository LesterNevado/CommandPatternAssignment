public class ChangePlaylist implements Command{
    private MusicPlayer musicPlayer;

    public ChangePlaylist(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.changePlaylist();
    }  
}
