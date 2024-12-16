package examen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoTest {
    Producto p1 = null, p2 = null, p3 = null, p4 = null;
    @BeforeEach
    void setUp() {
        p1 = new Producto("Jabón", 3.22, 1);
        p2 = new Producto("Aspirinas", 22, 10);
        p3 = new Producto("magdalenas", 11, 11);
        p4 = new Producto("yogures", 2,31);
    }

    @Test
    void estaCaducado() {
        assertFalse(p1.estaCaducado(), "Días en almacen " + p1.diasAlmacen());
        assertFalse(p2.estaCaducado(), "Días en almacen " + p2.diasAlmacen());
        assertTrue(p3.estaCaducado(), "Días en almacen " + p3.diasAlmacen());
        assertTrue(p4.estaCaducado(), "Días en almacen " + p4.diasAlmacen());

    }

    @Test
    void testToString() {
        assertEquals("Jabón- 3.22 euros- 1 día en almacén", p1.toString());
        assertEquals("Aspirinas- 22.00 euros- 10 días en almacén", p2.toString());
        assertEquals("magdalenas- 11.00 euros- 11 días en almacén", p3.toString());
        assertEquals("yogures- 2.00 euros- 31 días en almacén", p4.toString());
    }

    @Test
    void nombreProducto() {
        assertEquals("Aspirinas", p2.nombreProducto());
        assertEquals("magdalenas", p3.nombreProducto());
    }

    @Test
    void precio() {
        assertEquals( 3.22, p1.precio());
        assertEquals(2, p4.precio());

    }

    @Test
    void diasAlmacen() {
        assertEquals(31, p4.diasAlmacen());
        assertEquals(11, p3.diasAlmacen());
    }
}