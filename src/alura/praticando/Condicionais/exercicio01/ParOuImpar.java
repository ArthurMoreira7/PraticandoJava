package alura.praticando.Condicionais.exercicio01;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int numero = leitura.nextInt();

        if(numero % 2 == 0){
            System.out.println(numero + " é um número par");
        } else {
            System.out.println(numero + " é um número impar");
        }


    }
}
