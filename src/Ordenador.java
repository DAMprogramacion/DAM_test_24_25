public record Ordenador(int ram, String placaBase, boolean graficaIntegrada) {
    //16,Axus,true
    @Override
    public String toString() {
        return String.format("%d,%s,%b", ram, placaBase, graficaIntegrada);
    }
}
