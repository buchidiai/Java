package LinkedList.PlaylistChallenege;

public class Song {
    private String title;
    private double Duration;

    public Song(String title, double duration) {
        this.title = title;
        this.Duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", Duration=" + Duration +
                '}';
    }
}
