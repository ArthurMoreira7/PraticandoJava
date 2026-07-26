package alura.praticando.DataEhHora.exercicio05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AjustaData {
    public static void main(String[] args) {
        LocalDate dataVencimento = LocalDate.of(2025,04,20);
        dataVencimento.plusMonths(1);

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataAjustada = dataVencimento.format(formatoData);
        System.out.println("Nova data de vencimento: " + dataAjustada);
    }
}
