public class Main {
    public static void main(String[] args) {
        VideoPlayer videoPlayer = new VideoPlayer(new Screen(7.8, "720x1980"), new HardDisk(1000, "Harman"));

        videoPlayer.AddVideo("My birthday video");
        videoPlayer.AddVideo("First time in France");
        videoPlayer.AddVideo("Lviv");
        videoPlayer.AddVideo("Party");
        videoPlayer.AddVideo("Karate competition");

        videoPlayer.TurnOnNextVideo();
        videoPlayer.TurnOnNextVideo();
        videoPlayer.TurnOnNextVideo();

        videoPlayer.TurnOnPrevVideo();
        videoPlayer.TurnOnPrevVideo();
        videoPlayer.TurnOnPrevVideo();
        videoPlayer.TurnOnPrevVideo();

        System.out.println(videoPlayer);
    }
}