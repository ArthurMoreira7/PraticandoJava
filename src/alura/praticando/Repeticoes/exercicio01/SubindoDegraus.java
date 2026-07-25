package alura.praticando.Repeticoes.exercicio01;

import java.util.Scanner;

public class SubindoDegraus {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a quantidade de degraus: ");
        int qtdDegraus = leitor.nextInt();

        for (int i = 1; i <= qtdDegraus; i++) {
            System.out.println("Subindo o degrau " + i);
        }
        System.out.println("Você chegou ao topo!");
    }
}
