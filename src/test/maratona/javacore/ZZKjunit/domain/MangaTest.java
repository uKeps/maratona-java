package maratona.javacore.ZZKjunit.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MangaTest {
    private Manga manga1;
    private Manga manga2;
    @BeforeEach
    public void setUp() {
        manga1 = new Manga("Naruto", 220);
        manga2 = new Manga("Naruto", 220);
    }

    @Test
    public void accessors_ReturnData_WhenInitialized() {
        assertEquals("Naruto", manga1.name());
        assertEquals(220, manga1.episodes());
    }

    @Test
    public void accessors_ReturnTrue_WhenObjectsAreTheSame() {
        assertEquals(manga1, manga2);
    }

    @Test
    public void hashCode_ReturnTrue_WhenObjectsAreTheSame() {
        assertEquals(manga1.hashCode(), manga2.hashCode());
    }

    @Test
    public void constructor_ThrowNullPointerException_WhenNameIsNull() {
        assertThrows(NullPointerException.class, () -> new Manga(null, 100));
    }

    @Test
    public void isRecord_ReturnTrue_WhenCalledFromManga() {
        assertTrue(Manga.class.isRecord());
    }
}