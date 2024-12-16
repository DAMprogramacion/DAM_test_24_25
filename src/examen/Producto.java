package examen;

public record Producto(String nombreProducto, double precio, int diasAlmacen) {
    public boolean estaCaducado(){
        return diasAlmacen > 10;
    }
    //Carne de ternera- 19 euros- 8 dı́as en almacén

    @Override
    public String toString() {
        String dia = diasAlmacen == 1 ? "día" : "días";
        String sPrecio = String.format("%.2f", precio).replace(',', '.');
        return String.format("%s- %s euros- %d %s en almacén",
                nombreProducto, sPrecio, diasAlmacen, dia);
    }
}
