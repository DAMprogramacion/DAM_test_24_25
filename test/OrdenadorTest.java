import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrdenadorTest {
    Ordenador o1, o2;
    @BeforeEach
    void setUp() {
        o1 = new Ordenador(16,"Axus", true);
        o2 = new Ordenador(32, "msi", false);
    }

    @Test
    void testToString() {
    }

    @Test
    void ram() {
        assertEquals(16, o1.ram());
        assertEquals(32, o2.ram());
    }

    @Test
    void placaBase() {
        assertEquals("axus", o1.placaBase().toLowerCase());
        assertEquals("MSI", o2.placaBase().toUpperCase());
    }

    @Test
    void graficaIntegrada() {
        assertTrue(o1.graficaIntegrada());
        assertFalse(o2.graficaIntegrada());
    }
}