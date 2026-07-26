package alura.praticando.StringsEhRegex.exercicio04;

import java.util.Scanner;

public class RemovendoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do arquivo: ");
        String arquivo = sc.nextLine();

        int posPonto = arquivo.lastIndexOf(".");
        if (posPonto != 1){
            String arquivoSemExtensao = arquivo.substring(0,posPonto);
            System.out.println("Nome do arquivo sem extensão: " + arquivoSemExtensao);
        } else {
            System.out.println("Arquivo não possui extensão!!");
        }

    }
}
