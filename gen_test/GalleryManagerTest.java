package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GalleryManagerTest {
    
    @Test
    public void testSearchByArtist() throws IOException {
        GalleryManager manager = new GalleryManager();
        manager.loadGalleryFromFile("artpieces.txt");
        
        List<ArtPiece> results = manager.searchByArtist("Vincent Van Gogh");
        assertEquals(1, results.size());
        assertEquals("Vincent Van Gogh", results.get(0).getArtist());
    }

    @Test
    public void testSearchByYear() throws IOException {
        GalleryManager manager = new GalleryManager();
        manager.loadGalleryFromFile("artpieces.txt");
        
        List<ArtPiece> results = manager.searchByYear(1889);
        assertEquals(1, results.size());
        assertEquals(1889, results.get(0).getYear());
    }

    @Test
    public void testEmptyFile() throws IOException {
        GalleryManager manager = new GalleryManager();
        manager.loadGalleryFromFile("emptyfile.txt");
        
        List<ArtPiece> results = manager.searchByArtist("Any Artist");
        assertTrue(results.isEmpty());
    }

    @Test(expected = FileNotFoundException.class)
    public void testFileNotFound() throws IOException {
        GalleryManager manager = new GalleryManager();
        manager.loadGalleryFromFile("nonexistentfile.txt");
    }

    @Test
    public void testMalformedData() {
        try {
            GalleryManager manager = new GalleryManager();
            manager.loadGalleryFromFile("malformeddata.txt");
            fail("Expected a NumberFormatException");
        } catch (NumberFormatException e) {
            // Test passes
        } catch (IOException e) {
            fail("Unexpected IOException");
        }
    }

    @Test
    public void testSearchByArtistCaseInsensitive() throws IOException {
        GalleryManager manager = new GalleryManager();
        manager.loadGalleryFromFile("artpieces.txt");
        
        List<ArtPiece> results = manager.searchByArtist("viNcEnt VaN Gogh");
        assertEquals(1, results.size());
        assertEquals("Vincent Van Gogh", results.get(0).getArtist());
    }
    
    @Test
    public void testLoadLargeFilePerformance() {
        try {
            GalleryManager manager = new GalleryManager();
            long startTime = System.currentTimeMillis();
            manager.loadGalleryFromFile("largefile.txt");
            long endTime = System.currentTimeMillis();
            assertTrue("Loading took too much time", (endTime - startTime) < 5000);
        } catch (IOException e) {
            fail("Unexpected IOException");
        }
    }
}