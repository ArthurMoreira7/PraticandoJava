package alura.praticando.Condicionais.exercicio10;

import java.util.Scanner;

public class AcessoSistema {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int codigoAcesso = 2023;

        System.out.println("Informe o código de acesso: ");
         int codigoTentado = leitor.nextInt();
        System.out.println("Informe seu nível de permissão: ");
        int nivelPermissao = leitor.nextInt();

        if (codigoTentado == codigoAcesso && nivelPermissao >= 1 && nivelPermissao <= 3 ){
            System.out.println("Acesso Liberado! Bem Vindo ao Sistema!");
        } else {
            System.out.println("Acesso Negado!!");
            if (!(codigoTentado == codigoAcesso)){
                System.out.println("Código inválido!!");
            }
            if (!(nivelPermissao == 1 || nivelPermissao == 2 || nivelPermissao == 3)){
                System.out.println("Nível de permissão insuficiente!!");
            }

        }


    }
}
