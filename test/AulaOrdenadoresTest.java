import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AulaOrdenadoresTest {
    AulaOrdenadores aula;
    @BeforeEach
    void setUp() {
        aula = new AulaOrdenadores("1.7");
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
        assertEquals(0, aula.getOrdenadores().size());
    }

    @Test
    void addOrdenador() {
        Ordenador ordenador1 = new Ordenador(16, "axus", false);
        aula.addOrdenador(ordenador1);
        assertEquals(1, aula.getOrdenadores().size());
        Ordenador ordenador2 = new Ordenador(16, "msi", true);
        aula.addOrdenador(ordenador2);
        assertEquals(2, aula.getOrdenadores().size());
        //assertEquals(ordenador1, ordenador2);
    }

    @Test
    void eliminarOrdenador() {
    }
}