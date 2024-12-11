import java.util.HashMap;
import java.util.Map;

public class AulaOrdenadores {
    private String nombreAlula;
    private Map<Integer, Ordenador> ordenadores = new HashMap<>(); //diccionario vacío

    public AulaOrdenadores(String nombreAlula) {
        this.nombreAlula = nombreAlula;
    }

    //getters y setters


    public String getNombreAlula() {
        return nombreAlula;
    }

    public void setNombreAlula(String nombreAlula) {
        this.nombreAlula = nombreAlula;
    }

    public Map<Integer,Ordenador> getOrdenadores() {
        return ordenadores;
    }



    public AulaOrdenadores(String nombreAlula, Map<Integer, Ordenador> ordenadores) {
        this.nombreAlula = nombreAlula;
        this.ordenadores = ordenadores;
    }
    public Ordenador addOrdenador(Ordenador ordenador){
        int id = ordenadores.size() + 1;
        return ordenadores.put(id, ordenador);
    }
    public Ordenador eliminarOrdenador(int id) {
        return ordenadores.remove(id);
    }


}
