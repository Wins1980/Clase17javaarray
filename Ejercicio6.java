

        //Objetivo: Reorganizar aleatoriamente los elementos de una lista.
        //
        //Instrucciones:
        //
        //Crea un ArrayList de tipo String con los nombres de cinco ciudades.
        //Utiliza Collections.shuffle() para mezclar el orden de los elementos.
        //Imprime la lista antes y después de mezclarla.


        import java.util.ArrayList;
        import java.util.Collections;

        public class Ejercicio6 {

        public static void main(String[] args) {
                
                ArrayList<String> ciudad = new ArrayList<>();
                ciudad.add("Bogotá");
                ciudad.add("Cali");
                ciudad.add("Medellín");
                ciudad.add("San Andres");
                ciudad.add("Cartagena");

                System.out.println("Lista ciudades antes de mezclar: " + ciudad);

                Collections.shuffle(ciudad);

                System.out.println("Lista ciudades después de mezclar: " + ciudad);
            }
        }
