package alura.praticando.StringsEhRegex.exercicio05;

import java.util.Scanner;

public class VerificandoPalavra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o texto: ");
        String texto = sc.nextLine();
        System.out.println("Digite a palavra: ");
        String palavra = sc.nextLine();

        if (texto.contains(palavra)){
            System.out.println(palavra + " está presente no texto!");
        } else {
            System.out.println(palavra + " não está presente no texto!");
        }

    }
}
