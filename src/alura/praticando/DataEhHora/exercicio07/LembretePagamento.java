package alura.praticando.DataEhHora.exercicio07;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LembretePagamento {
    public static void main(String[] args) {
        LocalDate dataVencimento = LocalDate.of(2025,3,30);
        int periodoDeAntecedencia = 5;

        LocalDate dataDoLembrete = dataVencimento.minusDays(periodoDeAntecedencia);
        DateTimeFormatter formataData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataDoLembreteBr = dataDoLembrete.format(formataData);

        System.out.println("Data do lembrete: " + dataDoLembreteBr);

    }
}
