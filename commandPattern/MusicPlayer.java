public class MusicPlayer implements Device {
    @Override
    public void turnOn() {
        System.out.println("The Music Player is Switched On!");
    }

    @Override
    public void turnOff() {
        System.out.println("The Music Player is Switched Off!");
    }

    public void changePlaylist() {
        System.out.println("Changing Playlist...");
    }
}
