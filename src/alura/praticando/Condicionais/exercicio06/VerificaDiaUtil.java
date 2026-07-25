package alura.praticando.Condicionais.exercicio06;

import java.util.Scanner;

public class VerificaDiaUtil {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o dia da semana (em letras minúsculas): ");
        String diaDaSemana = leitor.nextLine();
        
        if (diaDaSemana.equals("segunda") || diaDaSemana.equals("terça") || diaDaSemana.equals("quarta") 
                || diaDaSemana.equals("quinta") || diaDaSemana.equals("sexta")){
            System.out.println(diaDaSemana + " é um dia útil.");
        } else if (diaDaSemana.equals("sábado") || diaDaSemana.equals("domingo")) {
            System.out.println(diaDaSemana + " não é um dia útil.");
        } else {
            System.out.println("Erro!!");
        }
    }
}
