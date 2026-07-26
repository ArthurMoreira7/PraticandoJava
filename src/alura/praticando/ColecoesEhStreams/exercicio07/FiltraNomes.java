package alura.praticando.ColecoesEhStreams.exercicio07;

import java.util.List;
import java.util.stream.Collectors;

public class FiltraNomes {
    public static void main(String[] args) {
        List<String> funcionarios = List.of("Ana", "Bruno", "Carlos", "Amanda", "Alice", "Daniel", "Caroline");

        List<String> funcionariosFiltrados = funcionarios.stream()
                .filter(nome -> nome.length() <= 5).collect(Collectors.toList());

        System.out.println(funcionariosFiltrados);

    }
}
