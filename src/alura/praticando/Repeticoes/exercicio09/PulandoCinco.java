package alura.praticando.Repeticoes.exercicio09;

import java.util.Scanner;

public class PulandoCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= 20; i++) {
            if (i % 10 == 5){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
