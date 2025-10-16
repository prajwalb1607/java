class Spotify extends MusicPlayer {
	   void stop() { 
	System.out.println("Stopping  a music"); 
	}
    void nextTrack() {
	System.out.println("Next  track will be played"); 
	}
    public static void main(String[] args) {
        MusicPlayer.play();
        MusicPlayer.pause();
		MusicPlayer m=new MusicPlayer();
		m.stop();
		m.nextTrack();

        Spotify s = new Spotify();
        s.stop();
        s.nextTrack();
		
		MusicPlayer m1=new  MusicPlayer();
		m1.stop();
		m1.nextTrack();
    }
}