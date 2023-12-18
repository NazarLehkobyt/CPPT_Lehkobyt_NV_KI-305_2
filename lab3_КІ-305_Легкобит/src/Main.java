public class Main {
    public static void main(String[] args) {
        VideoMagnitophone videoMagnitophone = new VideoMagnitophone(new Screen(7.8, "720x1980"), new HardDisk(1000, "Harman"));

        videoMagnitophone.AddVideo("My birthday video");
        videoMagnitophone.AddVideo("First time in France");
        videoMagnitophone.AddVideo("Lviv");
        videoMagnitophone.AddVideo("Party");
        videoMagnitophone.AddVideo("Karate competition");

        videoMagnitophone.TurnOnNextVideo();
        videoMagnitophone.TurnOnNextVideo();
        videoMagnitophone.TurnOnNextVideo();

        videoMagnitophone.TurnOnPrevVideo();
        videoMagnitophone.TurnOnPrevVideo();
        videoMagnitophone.TurnOnPrevVideo();
        videoMagnitophone.TurnOnPrevVideo();

        System.out.println(videoMagnitophone);
    }
}