package alura.praticando.ColecoesEhStreams.exercicio10;

import java.util.List;

public class CalculaEstatisticas {
    public static void main(String[] args) {
        List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);

        Double totalNotas = notas.stream().reduce(0.0,Double::sum);
        double mediaNotas = totalNotas / notas.size();

        Double maiorNota = notas.stream().max(Double::compareTo).orElse(0.0);
        Double menorNota = notas.stream().min(Double::compareTo).orElse(0.0);

        System.out.printf("Média das notas: %.2f", mediaNotas);
        System.out.println("\nSoma total das notas: " + totalNotas);
        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota);
    }
}
