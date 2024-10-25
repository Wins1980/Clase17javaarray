//Objetivo: Eliminar duplicados de una lista usando un Set.
//
//Instrucciones:
//
//Crea un ArrayList de números enteros que contenga duplicados.
//Convierte la lista a un Set para eliminar los duplicados.
//Imprime la lista original y el conjunto resultante.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class Ejercicio7 {

    public static void main(String[] args) {

        ArrayList<Integer> listaConDuplicados = new ArrayList<>();
        listaConDuplicados.add(1);
        listaConDuplicados.add(2);
        listaConDuplicados.add(2);
        listaConDuplicados.add(3);
        listaConDuplicados.add(4);
        listaConDuplicados.add(4);
        listaConDuplicados.add(5);

        System.out.println("Lista original: " + listaConDuplicados);

        Set<Integer> conjuntoSinDuplicados = new HashSet<>(listaConDuplicados);

        System.out.println("Conjunto sin duplicados: " + conjuntoSinDuplicados);
    }
}



