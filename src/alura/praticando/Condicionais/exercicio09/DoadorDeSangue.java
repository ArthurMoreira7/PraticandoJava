package alura.praticando.Condicionais.exercicio09;

import java.util.Scanner;

public class DoadorDeSangue {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite a idade do doador: ");
        int idade = leitura.nextInt();
        System.out.println("Digite o peso do doador em (kg): ");
        double peso = leitura.nextDouble();

        if (idade >= 18 && idade <= 65 && peso > 50) {
            System.out.println("Doador compatível!!");
            System.out.println("Atende os requisitos para doação");
        } else if (!(idade >= 18 && idade <= 65)){
            System.out.println("Doador não compatível!!");
            System.out.println("Motivo: Idade não está entre 18 e 65 anos. ");
        } else if (!(peso > 50)) {
            System.out.println("Doador não compatível!!");
            System.out.println("Motivo: Peso não está mais que 50kg. ");
        } else {
            System.out.println("Doador não compatível!!");
            System.out.println("Motivo: Não atende nenhum dos requisitos. ");
        }

    }
}
