import java.util.ArrayList;
public class Ejercicio9 {

    public static void main(String[] args) {

        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("manzana");
        palabras.add("banana");
        palabras.add("manzana");
        palabras.add("naranja");
        palabras.add("banana");
        palabras.add("manzana");

        String palabraRepetida = "manzana";
        int contador = 0;

        for (String palabra : palabras) {
            if (palabra.equals(palabraRepetida)) {
                contador++;
            }
        }

        System.out.println("La palabra '" + palabraRepetida + "' aparece " + contador + " veces en la lista.");
    }
}
