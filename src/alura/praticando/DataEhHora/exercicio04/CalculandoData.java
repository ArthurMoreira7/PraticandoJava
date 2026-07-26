package alura.praticando.DataEhHora.exercicio04;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CalculandoData {
    public static void main(String[] args) {
        LocalDate dataInicio = LocalDate.of(2025,03,30);
        dataInicio.plusDays(15);

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String dataEntrega = dataInicio.format(formatoData);
        System.out.println("Data de entrega: " + dataEntrega);

    }
}
