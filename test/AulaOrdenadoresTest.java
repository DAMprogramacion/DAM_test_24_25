import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AulaOrdenadoresTest {
    AulaOrdenadores aula;
    @BeforeEach
    void setUp() {
        aula = new AulaOrdenadores("1.7");
        Ordenador ordenador1 = new Ordenador(16, "axus", false);
        aula.addOrdenador(ordenador1);
        Ordenador ordenador2 = new Ordenador(16, "axus", true);
        aula.addOrdenador(ordenador2);
        Ordenador ordenador3 = new Ordenador(32, "msi", false);
        aula.addOrdenador(ordenador3);
    }

    @Test
    void getNombreAlula() {
        assertEquals("1.7", aula.getNombreAlula());
    }

    @Test
    void setNombreAlula() {
        aula.setNombreAlula("1.8");
        assertEquals("1.8", aula.getNombreAlula());
    }

    @Test
    void getOrdenadores() {
        assertEquals(3, aula.getOrdenadores().size());
    }

    @Test
    void addOrdenador() {
        Ordenador ordenador = new Ordenador(8, "axus", true);
        aula.addOrdenador(ordenador);
        assertEquals(4, aula.getOrdenadores().size());
        assertEquals(8, aula.getOrdenadores().get(4).ram());
        assertEquals("axus", aula.getOrdenadores().get(4).placaBase());
        assertTrue(aula.getOrdenadores().get(4).graficaIntegrada());
        assertNull(aula.getOrdenadores().get(5));
    }

    @Test
    void eliminarOrdenador() {
        Ordenador ordenador = aula.eliminarOrdenador(1);
        assertEquals(2, aula.getOrdenadores().size());
        assertEquals(16, ordenador.ram());
        assertEquals("axus", ordenador.placaBase());
        assertFalse(ordenador.graficaIntegrada());
        ordenador = aula.eliminarOrdenador(1);
        assertEquals(2, aula.getOrdenadores().size());
        assertNull(ordenador);
    }

    @Test
    void eliminarOrdenadoresPorRam() {
        assertEquals(0, aula.eliminarOrdenadoresPorRam(64));
        assertEquals(2, aula.eliminarOrdenadoresPorRam(16));
    }




}