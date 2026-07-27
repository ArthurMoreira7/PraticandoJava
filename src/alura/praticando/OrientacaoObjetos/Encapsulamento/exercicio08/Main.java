package alura.praticando.OrientacaoObjetos.Encapsulamento.exercicio08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = new Usuario("aluno2025", "escola@123");
        int tentativas = 3;

        while (tentativas > 0) {
            System.out.print("Digite o seu usuário: ");
            String login = scanner.nextLine();

            System.out.print("Digite a sua senha: ");
            String senha = scanner.nextLine();
            if (usuario.validaSenha(senha)) {
                System.out.println("Login bem-sucedido!");
                break;
            } else {
                tentativas--;
                if (tentativas == 0) {
                    System.out.println("Acesso bloqueado. Contate o administrador.");
                } else {
                    System.out.println("Senha incorreta. Tentativas restantes: " + tentativas);
                }
            }
        }
    }
}
