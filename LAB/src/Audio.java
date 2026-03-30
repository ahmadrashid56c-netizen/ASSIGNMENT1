public class Audio extends Media {

    int bitrate;
    String artist;

    Audio(String title, double duration, double fileSize, int bitrate, String artist){
        super(title, duration, fileSize);
        this.bitrate = bitrate;
        this.artist = artist;
    }

    @Override
    public void play(){
        System.out.println(title + " by " + artist + " is playing");
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Bitrate: " + bitrate);
        System.out.println("Artist: " + artist);
    }

    @Override
    public String toString(){
        return String.format("%s %d %s", super.toString(), bitrate, artist);
    }
}
