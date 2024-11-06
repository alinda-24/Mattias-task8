package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArtPieceTest {
    
    @Test
    public void testGetDescription() {
        ArtPiece artPiece = new ArtPiece("Starry Night", "Vincent Van Gogh", 1889, "Oil on canvas");
        String expectedDescription = "Title: Starry Night, Artist: Vincent Van Gogh, Year: 1889, Medium: Oil on canvas";
        assertEquals(expectedDescription, artPiece.getDescription());
    }

    @Test
    public void testGetArtist() {
        ArtPiece artPiece = new ArtPiece("Starry Night", "Vincent Van Gogh", 1889, "Oil on canvas");
        assertEquals("Vincent Van Gogh", artPiece.getArtist());
    }

    @Test
    public void testGetYear() {
        ArtPiece artPiece = new ArtPiece("Starry Night", "Vincent Van Gogh", 1889, "Oil on canvas");
        assertEquals(1889, artPiece.getYear());
    }
}

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;
import java.util.*;

