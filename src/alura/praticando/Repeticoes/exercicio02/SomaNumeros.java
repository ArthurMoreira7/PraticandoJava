package alura.praticando.Repeticoes.exercicio02;

import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        int[] valores = {10, 20, 30, 40, 50};
        int somaTotal = 0;

        for (int i = 0; i < valores.length; i++) {
            somaTotal += valores[i];
        }
        System.out.println("A soma total das receitas é: " + somaTotal);
    }
}
