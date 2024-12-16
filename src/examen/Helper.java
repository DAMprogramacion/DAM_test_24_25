package examen;

import java.util.ArrayList;
import java.util.List;

public class Helper {
    public static int obtenerProductosCaducados(List<Producto> productos) {
        int contador = 0;
        for (Producto producto : productos) {
            if (producto.estaCaducado())
                contador++;
        }
        return contador;
    }
    public static List<Producto> obtenerProductosInferiorPrecio(
            List<Producto> productos, double precio) {
        List<Producto> inferiorPrecio = new ArrayList<>();
        for (Producto producto : productos)
            if (producto.precio() < precio)
                inferiorPrecio.add(producto);
        return inferiorPrecio;
    }
}
