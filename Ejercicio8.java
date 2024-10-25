import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio8 {

    public static void main(String[] args) {
        // Crear un ArrayList de tipo String con los días de la semana
        ArrayList<String> diasDeLaSemana = new ArrayList<>();
        diasDeLaSemana.add("Lunes");
        diasDeLaSemana.add("Martes");
        diasDeLaSemana.add("Miércoles");
        diasDeLaSemana.add("Jueves");
        diasDeLaSemana.add("Viernes");
        diasDeLaSemana.add("Sábado");
        diasDeLaSemana.add("Domingo");

        System.out.println("Lista original días de la semana: " + diasDeLaSemana);

        Collections.reverse(diasDeLaSemana);

        System.out.println("Lista invertida días de la semana: " + diasDeLaSemana);
    }
}

