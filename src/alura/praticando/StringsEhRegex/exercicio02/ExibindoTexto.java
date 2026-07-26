package alura.praticando.StringsEhRegex.exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class ExibindoTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o texto: ");
        String texto = sc.nextLine();

        System.out.println("Texto em letras maiúsculas: " + texto.toUpperCase());
        System.out.println("Texto em letras minúsculas: " + texto.toLowerCase());


    }
}
