package alura.praticando.Repeticoes.exercicio08;

import java.util.Scanner;

public class PositivosENegativos {
    public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in);
         String numero;
         int contaPositivos = 0;
         int contaNegativos = 0;

         while (true){
             System.out.println("Digite um número (ou 'fim' para encerrar): ");
             numero = leitor.nextLine();

             if (numero.equals("fim")){
                 break;
             }

             int num = Integer.parseInt(numero);

             if (num > 0){
                 contaPositivos++;
             } else if (num < 0){
                 contaNegativos++;
             }
         }
        System.out.println("Números positivos: " + contaPositivos);
        System.out.println("Números negativos: " + contaNegativos);
    }
}
