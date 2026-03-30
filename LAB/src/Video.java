public class Video extends Media {

    int frameRate;
    int resolution;

    Video(String title, double duration, double fileSize, int frameRate, int resolution) {
        super(title, duration, fileSize);
        this.frameRate = frameRate;
        this.resolution = resolution;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Frame Rate: " + frameRate);
        System.out.println("Resolution: " + resolution);
    }

    @Override
    public String toString(){
        return String.format("%s %d %d", super.toString(), frameRate, resolution);
    }
}
