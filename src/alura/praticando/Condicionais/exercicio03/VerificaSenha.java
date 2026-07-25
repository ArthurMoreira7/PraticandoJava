package alura.praticando.Condicionais.exercicio03;

import java.util.Scanner;

public class VerificaSenha {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String senha = "123456";
        System.out.println("Digite a senha: ");
        String senhaTentada = leitor.nextLine();

        if (senhaTentada.equals(senha)){
            System.out.println("Acesso Liberado!!");
        } else {
            System.out.println("Acesso Negado!!");
        }

    }
}
