public class LiveStream extends Video {

    String streamerName;
    boolean isLive;

    LiveStream(String title, double duration, double fileSize, int frameRate,
               int resolution, String streamerName, boolean isLive) {
        super(title, duration, fileSize, frameRate, resolution);
        this.streamerName = streamerName;
        this.isLive = isLive;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Streamer: " + streamerName);
        System.out.println("Is Live: " + isLive);
    }

    @Override
    public String toString(){
        return String.format("%s %s %b", super.toString(), streamerName, isLive);
    }
}
