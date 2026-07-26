package alura.praticando.ColecoesEhStreams.exercicio09;

import java.util.List;

public class CalculaImposto {
    public static void main(String[] args) {
        List<Double> precosProdutos = List.of(29.99, 49.50, 15.75, 99.99);

        Double total = precosProdutos.stream().reduce(0.0, Double::sum);
        double precoComDesconto = total * 0.08;

        double totalComDesconto = total + precoComDesconto;

        System.out.println("Valor total antes do imposto: " + String.format("%.2f", total));
        System.out.println("Valor total com imposto de 8%: " + String.format("%.2f",totalComDesconto));
    }
}
