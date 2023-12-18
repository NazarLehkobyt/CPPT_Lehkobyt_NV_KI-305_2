import java.util.ArrayList;

/**
 * Class VideoPlayer
 * @author
 * @version 1.0
 */
public class VideoPlayer
{
    private final Button nextVideo = new Button("next video");
    private final Button prevVideo = new Button("prev video");
    private final Button pause = new Button("pause");
    private Logger logger = Logger.getLogger("logs.txt");
    private Screen screen;
    private HardDisk hardDisk;
    private ArrayList<String> videos = new ArrayList<>();
    public final int curVideo  = 0;
    
    /**
     * Constructor
     * @param screen
     * @param hardDisk
     */
     VideoPlayer() {
        super;
    }

    /**
     * Method to add new video to player
     * @param video
     */
    public void AddVideo(String video)
    {
        videos.add(video);
        System.out.println(video + " was added to video player");
        logger.log(logger.infoFlag + "VideoPlayer AddVideo method was called");
    }


    /**
     * Method to turn on next video
     */
    public void TurnOnNextVideo()
    {
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
     * Method to turn on prev video
     */
    public void TurnOnPrevVideo()
    {
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

    public Button getNextVideo() {
        return nextVideo;
    }

    public Button getPrevVideo() {
        return prevVideo;
    }

    public Button getPause() {
        return pause;
    }

    public Logger getLogger() {
        return logger;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public ArrayList<String> getVideos() {
        return videos;
    }

    public void setVideos(ArrayList<String> songs) {
        this.videos = songs;
    }

    public int getCurVideo() {
        return curVideo;
    }

    public void setCurVideo(int curVideo) {
        this.curVideo = curVideo;
    }

    @Override
    public String toString() {
        return "AudioPlayer{ " +
                " screen=" + screen + "\n" +
                ", hardDisk=" + hardDisk +  "\n" +
                ", videos=" + videos + "\n" +
                ", curVideo=" + curVideo + "\n" +
                '}';
    }
}
