package alura.praticando.StringsEhRegex.exercicio03;

import java.util.Scanner;

public class SubstituindoTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o texto: ");
        String texto = sc.nextLine();
        System.out.print("Digite a palavra a ser substituída: ");
        String palavraSubstituida = sc.nextLine();

        if (!texto.contains(palavraSubstituida)){
            System.out.print("Está palvra não é valida!");
            sc.close();
        }
        System.out.print("Digite a nova palavra: ");
        String novaPalavra = sc.nextLine();

        String novoTexto = texto.replace(palavraSubstituida, novaPalavra);
        System.out.println("Texto modificado: " + novoTexto);

    }
}
