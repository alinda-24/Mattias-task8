import java.util.List;
import java.util.ArrayList;

public class GalleryManager {
    private List<ArtPiece> gallery;

    public GalleryManager() {
        gallery = new ArrayList<>();
    }

    public void loadGalleryFromFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] data = line.split(", ");
            String title = data[0];
            String artist = data[1];
            int year = Integer.parseInt(data[2]);
            String medium = data[3];
            ArtPiece artPiece = new ArtPiece(title, artist, year, medium);
            gallery.add(artPiece);
        }
        reader.close();
    }

    public List<ArtPiece> searchByArtist(String artistName) {
        List<ArtPiece> result = new ArrayList<>();
        for (ArtPiece artPiece : gallery) {
            if (artPiece.getArtist().equalsIgnoreCase(artistName)) {
                result.add(artPiece);
            }
        }
        return result;
    }

    public List<ArtPiece> searchByYear(int year) {
        List<ArtPiece> result = new ArrayList<>();
        for (ArtPiece artPiece : gallery) {
            if (artPiece.getYear() == year) {
                result.add(artPiece);
            }
        }
        return result;
    }

    public void displayGallery() {
        for (ArtPiece artPiece : gallery) {
            System.out.println(artPiece.getDescription());
        }
    }
}