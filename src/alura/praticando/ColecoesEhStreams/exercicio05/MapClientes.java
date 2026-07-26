package alura.praticando.ColecoesEhStreams.exercicio05;

import java.util.HashMap;
import java.util.Map;

public class MapClientes {
    public static void main(String[] args) {
        Map<Integer, String> clientes = new HashMap<>();
        clientes.put(1,"João");
        clientes.put(2, "Marcos");
        clientes.put(3, "Beatriz");

        System.out.println("Cliente com ID 2 é: " + clientes.get(2));
    }
}
