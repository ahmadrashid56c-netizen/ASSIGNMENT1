public class Podcast extends Audio {

    String hostName;
    int episodeNumber;

    Podcast(String title, double duration, double fileSize, int bitrate, String artist,
            String hostName, int episodeNumber) {
        super(title, duration, fileSize, bitrate, artist);
        this.hostName = hostName;
        this.episodeNumber = episodeNumber;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Host: " + hostName);
        System.out.println("Episode: " + episodeNumber);
    }

    @Override
    public String toString(){
        return String.format("%s %s %d", super.toString(), hostName, episodeNumber);
    }
}
