import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Matematicas {
    //métodos públicos a testear:

    //metodo que dado un número entero devuelve el doble
    public static int devolverDoble(int numero) {
        return numero * 2;
    }
    //igual que devuelva el triple
    public static int devolverTriple(int numero) {
        return numero * 3;
    }
    //igual que devuelva la mitad, retorna un float
    public static float devolverMitad(int numero) {
        return numero / 2.0f;
    }
    //metodo que dado un número nos dice si es par o no
    public static boolean esPar (int numero) {
        return numero % 2 == 0;
    }
    //metodo que dado un nº devuelve una lista con valores pares entre
        //cero y ese nº, ejemplo: 6 -> 2 , 4, 6
        // ejemplo: 17 -> 2, 4, 6, 8, 10, 12, 14, 16
    public static List<Integer> listarPares(int numero) {
        List<Integer> pares = new ArrayList<>();
        /*for (int i = 2; i <= numero; i += 2) {
            pares.add(i);
        }*/
        for (int i = 2; i <= numero; i++) {
            if (esPar(i))
                pares.add(i);
        }
        return pares;
    }
    //aleatorio entre 0 y 100. 0 exclusive y 100 exclusive
    public static int obtenerAleatori0_100() {
        return new Random().nextInt(99) + 1;
    }
}
