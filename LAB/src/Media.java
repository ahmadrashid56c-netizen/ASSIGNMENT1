public class Media {
    String title;
    double duration;
    double fileSize;

    Media(String title, double duration, double fileSize){
        this.title = title;
        this.duration = duration;
        this.fileSize = fileSize;
    }

    public void play(){
        System.out.println(title + " is playing");
    }

    public void pause(){
        System.out.println(title + " is paused");
    }

    public void stop(){
        System.out.println(title + " is stopped");
    }

    public void display(){
        System.out.println("Title: " + title);
        System.out.println("Duration: " + duration);
        System.out.println("File Size: " + fileSize);
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %.2f", title, duration, fileSize);
    }
}
