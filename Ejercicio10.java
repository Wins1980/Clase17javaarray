//Ejercicio 10
//Objetivo: Verificar si un elemento existe en una lista.
//
//Instrucciones:
//
//Crea un ArrayList de nombres de animales.
//Verifica si un animal específico está en la lista usando contains().
//Imprime un mensaje indicando si el animal está en la lista o no.


import java.util.ArrayList;
public class Ejercicio10 {

    public static void main(String[] args) {

        ArrayList<String> nombresDeAnimales = new ArrayList<>();
        nombresDeAnimales.add("León");
        nombresDeAnimales.add("Tigre");
        nombresDeAnimales.add("Guepardo");
        nombresDeAnimales.add("Puma");
        nombresDeAnimales.add("Pantera");

        String animalABuscar = "Tigre";

        boolean existe = nombresDeAnimales.contains(animalABuscar);

        if (existe) {
            System.out.println("El animal '" + animalABuscar + "' que busca, está en la lista.");
        } else {
            System.out.println("El animal '" + animalABuscar + "' que busca, no está en la lista.");
        }
    }
}
