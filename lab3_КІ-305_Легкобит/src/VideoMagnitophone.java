/**
 * Class VideoMagnitophone
 * @version 1.0
 */
public class VideoMagnitophone extends VideoPlayer implements VideoRecord
{
    /**
     * Constructor
     *
     * @param screen
     * @param hardDisk
     */
    public VideoMagnitophone(Screen screen, HardDisk hardDisk) {
        super(screen, hardDisk);
    }

    /**
     * Overrided method to turn on next video
     */
    @Override
    public void TurnOnNextVideo() {
        logger.log(logger.infoFlag + "TurnOnNextVideo VideoPlayer method was called");
        if(curVideo == videos.size() - 1)
        {
            System.out.println("You push button " + nextVideo.getAction());
            System.out.println("Now showing " + videos.get(curVideo));
            curVideo = 0;
        } else if (curVideo < videos.size() - 1) {
            System.out.println("You push button " + nextVideo.getAction());
            System.out.println("Now showing " + videos.get(curVideo));
            curVideo++;
        }
    }
    /**
     * Overrided method to turn on prev video
     */
    @Override
    public void TurnOnPrevVideo() {
        logger.log(logger.infoFlag + "TurnPrevNextVideo VideoPlayer method was called");
        if(curVideo == 0)
        {
            System.out.println("You push button " + prevVideo.getAction());
            System.out.println("Now showing " + videos.get(curVideo));
            curVideo = videos.size() - 1;
        } else if (curVideo > 0) {
            System.out.println("You push button " + prevVideo.getAction());
            System.out.println("Now showing " + videos.get(curVideo));
            curVideo--;
        }
    }

    @Override
    public void RecordVideo(String voice) {
        videos.add("Voice Record - " + voice);
    }

    @Override
    public String toString() {
        return "Dictaphone{ " +
                ", screen=" + screen + "\n" +
                ", hardDisk=" + hardDisk + "\n" +
                ", video=" + videos + "\n" +
                ", curVideo=" + curVideo + "\n" +
                '}';
    }
}
