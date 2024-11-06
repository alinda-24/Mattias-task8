public class ArtPiece {
    private String title;
    private String artist;
    private int year;
    private String medium;

    public ArtPiece(String title, String artist, int year, String medium) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.medium = medium;
    }

    public String getDescription() {
        return String.format("Title: %s, Artist: %s, Year: %d, Medium: %s", title, artist, year, medium);
    }

    public String getArtist() {
        return artist;
    }

    public int getYear() {
        return year;
    }
}