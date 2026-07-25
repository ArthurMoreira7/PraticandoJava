package alura.praticando.Condicionais.exercicio05;

import java.util.Scanner;

public class CalculaDesconto {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o valor da compra: ");
        double valorCompra = leitor.nextDouble();

        if (valorCompra >= 100) {
            double valorComDesconto = valorCompra * ((double) 10 / 100);
            double novoValor = valorCompra - valorComDesconto;
            System.out.println("Desconto de 10% aplicado.");
            System.out.println("Novo Valor: R$" + novoValor);
        }else {
            System.out.println("Nenhum desconto aplicado.");
            System.out.println("Valor final: R$" + valorCompra);
        }

    }
}
