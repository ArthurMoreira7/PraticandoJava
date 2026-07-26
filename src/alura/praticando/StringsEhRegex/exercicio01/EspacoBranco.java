package alura.praticando.StringsEhRegex.exercicio01;

import java.util.Scanner;

public class EspacoBranco {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o nome:     ");
        String nome = leitor.nextLine();

        System.out.println("Nome sem espaços: " + nome.trim());
    }
}
