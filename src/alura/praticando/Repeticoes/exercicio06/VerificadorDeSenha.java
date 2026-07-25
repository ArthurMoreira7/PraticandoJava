package alura.praticando.Repeticoes.exercicio06;

import java.util.Scanner;

public class VerificadorDeSenha {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String senha = "1234";
        int tentativas = 3;

        while (tentativas > 0){
            System.out.println("Digite sua senha: ");
            String senhaTentada = leitor.nextLine();

            if (senhaTentada.equals(senha)){
                System.out.println("Senha Correta! Acesso concedido!");
                break;
            } else if (tentativas > 1) {
                System.out.println("Senha incorreta. Você tem " + (tentativas - 1) + " tentativas restantes.");
            } else {
                System.out.println("Conta Bloqueada!");
                break;
            }
            tentativas--;
        }

    }
}
