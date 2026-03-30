public class Demo {
    public static void main(String[] args) {

        Audio a = new Audio("Song", 3.5, 5.0, 320, "Artist");
        Podcast p = new Podcast("Podcast", 60, 50, 128, "Speaker", "Host", 10);
        Video v = new Video("Movie", 120, 700, 60, 1080);
        LiveStream l = new LiveStream("Live Game", 0, 0, 60, 1080, "StreamerX", true);

        a.display();
        System.out.println();

        p.display();
        System.out.println();

        v.display();
        System.out.println();

        l.display();
    }
}
