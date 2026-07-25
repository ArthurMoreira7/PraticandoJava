package alura.praticando.Repeticoes.exercicio10;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ControleConvidado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;

        ArrayList<String> convidados = new ArrayList<>();

        while (true) {
            System.out.println("Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar): ");
            nome =  scanner.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                System.out.println("Programa finalizado.");
                break;
            }

            if (nome.equalsIgnoreCase("ver")) {
                System.out.println("Lista atualizada de convidados: " + convidados);
                continue;
            }

            boolean jaExiste = false;
            for (String convidado : convidados) {
                if (convidado.toLowerCase().equals(nome.toLowerCase())) {
                    jaExiste = true;
                    break;
                }
            }

            if (jaExiste) {
                System.out.println("O nome " + nome + " já está na lista de convidados.");
            } else {
                convidados.add(nome);
                System.out.println(nome + " foi adicionado à lista de convidados.");
            }

        }
    }
}
