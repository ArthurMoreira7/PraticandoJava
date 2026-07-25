package alura.praticando.Condicionais.exercicio08;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o primeiro lado: ");
        int lado1 = leitor.nextInt();
        System.out.println("Informe o segundo lado: ");
        int lado2 = leitor.nextInt();
        System.out.println("Informe o terceiro lado: ");
        int lado3 = leitor.nextInt();

        int somaDosLados = lado1 + lado2;
        if (somaDosLados > lado3){
            System.out.println("Os lados podem formar um triângulo.");
        } else {
            System.out.println("Os lados não podem formar um triângulo.");
        }
    }
}
