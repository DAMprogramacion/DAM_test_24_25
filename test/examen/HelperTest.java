package examen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HelperTest {
    List<Producto> productos = new ArrayList<>(); //lista vacía
    @BeforeEach
    void setup(){
        productos.add(new Producto("Jabón", 3.22, 1));
        productos.add(new Producto("Aspirinas", 22, 10));
        productos.add(new Producto("magdalenas", 11, 11));
        productos.add(new Producto("yogures", 2,31));
    }
    @Test
    void obtenerProductosCaducados() {
        assertEquals(2, Helper.obtenerProductosCaducados(productos));
    }

    @Test
    void obtenerProductosInferiorPrecio() {
        assertEquals(2, Helper.obtenerProductosInferiorPrecio(productos, 10).size());
        assertEquals(3, Helper.obtenerProductosInferiorPrecio(productos, 20).size());
        assertEquals(0, Helper.obtenerProductosInferiorPrecio(productos, 1).size());
    }
}