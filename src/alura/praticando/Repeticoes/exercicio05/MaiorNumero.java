package alura.praticando.Repeticoes.exercicio05;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os números separados por espaço: ");
        String[] numeros = sc.nextLine().split(" ");
        int maior = Integer.MIN_VALUE;

        for (String nums : numeros){
            int num = Integer.parseInt(nums);
            if (num > maior){
                maior = num;
            }
        }
        System.out.println("O maior número é: " + maior);
    }
}
