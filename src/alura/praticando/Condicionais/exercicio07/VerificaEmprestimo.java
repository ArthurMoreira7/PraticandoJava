package alura.praticando.Condicionais.exercicio07;

import java.util.Scanner;

public class VerificaEmprestimo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do empréstimo: ");
        double valorEmprestimo = leitor.nextDouble();

        if (valorEmprestimo >= 1000 && valorEmprestimo <= 5000){
            System.out.println("O valor " + valorEmprestimo + " está dentro do intervalo " +
                    "permitido para o emprestimo. ");
        } else {
            System.out.println("O valor " + valorEmprestimo + " não está dentro do intervalo " +
                    "permitido para o emprestimo. ");
        }
    }
}
