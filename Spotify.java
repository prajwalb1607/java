class Spotify extends MusicPlayer {
    public static void main(String[] args) {
        MusicPlayer.play();
        MusicPlayer.pause();

        Spotify s = new Spotify();
        s.stop();
        s.nextTrack();
    }
}