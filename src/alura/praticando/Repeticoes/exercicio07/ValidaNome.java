package alura.praticando.Repeticoes.exercicio07;

import java.util.Scanner;

public class ValidaNome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = "";

        while (!(nome.length() >= 3)){
            System.out.println("Digite seu nome: ");
            nome = scanner.nextLine();

            if (nome.length() >= 3){
                System.out.println(nome + " cadastrado com sucesso!");
            } else {
                System.out.println("Nome inválido . Digite novamente.");
                continue;
            }
        }
    }
}
