import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.List;

class MatematicasTest {

    @Test
    void devolverDoble() {
        assertEquals(4, Matematicas.devolverDoble(2));
        assertEquals(0, Matematicas.devolverDoble(0));
        assertEquals(-4, Matematicas.devolverDoble(-2));
        assertNotEquals(5, Matematicas.devolverDoble(2));
    }

    @Test
    void devolverTriple() {
        assertEquals(6, Matematicas.devolverTriple(2));
        assertEquals(0, Matematicas.devolverTriple(0));
        assertEquals(-6, Matematicas.devolverTriple(-2));
        assertNotEquals(5, Matematicas.devolverTriple(2));
    }

    @Test
    void devolverMitad() {
        assertEquals(1, Matematicas.devolverMitad(2));
        assertEquals(0, Matematicas.devolverMitad(0));
        assertEquals(-2, Matematicas.devolverMitad(-4));
        assertEquals( 1.5f, Matematicas.devolverMitad(3));
        assertEquals( -1.5f, Matematicas.devolverMitad(-3));
    }

    @Test
    void esPar() {
        assertTrue(Matematicas.esPar(4));
        assertTrue(Matematicas.esPar(0));
        assertFalse(Matematicas.esPar(9));
    }

    @Test
    void listarPares() {
        assertEquals(0, Matematicas.listarPares(0).size());
        assertEquals(0, Matematicas.listarPares(1).size());
        assertEquals(1, Matematicas.listarPares(2).size());
        assertEquals(3, Matematicas.listarPares(6).size());
        assertEquals(List.of(2, 4, 6, 8), Matematicas.listarPares(8));
        assertNotEquals(List.of(2, 4, 6, 8), Matematicas.listarPares(6));

    }
}