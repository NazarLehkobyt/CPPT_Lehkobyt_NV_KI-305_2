import java.util.ArrayList;

/**
 * Class VideoPlayer
 * @author
 * @version 1.0
 */
public abstract class VideoPlayer
{
    protected final Button nextVideo = new Button("next video");
    protected final Button prevVideo = new Button("prev video");
    protected final Button pause = new Button("pause");
    protected Logger logger = Logger.getLogger("logs.txt");
    protected Screen screen;
    protected HardDisk hardDisk;
    protected ArrayList<String> videos = new ArrayList<>();
    protected int curVideo  = 0;

    /**
     * Constructor
     * @param screen
     * @param hardDisk
     */
    public VideoPlayer(Screen screen, HardDisk hardDisk) {
        logger.log(logger.infoFlag + "VideoPlayer constructor called");
        this.screen = screen;
        this.hardDisk = hardDisk;
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
    public abstract void TurnOnNextVideo();

    /**
     * Method to turn on prev video
     */
    public abstract void TurnOnPrevVideo();


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
