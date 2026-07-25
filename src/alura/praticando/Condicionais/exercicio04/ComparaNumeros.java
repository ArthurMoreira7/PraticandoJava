package alura.praticando.Condicionais.exercicio04;

import java.util.Scanner;

public class ComparaNumeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = leitor.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = leitor.nextInt();

        if (num1 > num2){
            System.out.println(num1 + " é o maior número!");
        } else if (num2  > num1) {
            System.out.println(num2 + " é o maior número!");
        } else {
            System.out.println("Ambos os números são iguais!");
        }
    }
}
