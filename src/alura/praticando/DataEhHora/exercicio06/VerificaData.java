package alura.praticando.DataEhHora.exercicio06;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VerificaData {
    public static void main(String[] args) {
        LocalDate dataEvento = LocalDate.of(2025,3,10);
        LocalDate dataAtual = LocalDate.of(2025,3,15);

        DateTimeFormatter formataData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataEventoFormatada = dataEvento.format(formataData);
        String dataAtualFormatada = dataAtual.format(formataData);

        System.out.println("Data do evento: " + dataEventoFormatada);
        System.out.println("Data atual: " + dataAtualFormatada);
        if (dataAtual.isAfter(dataEvento)){
            System.out.println("O evento já ocorreu.");
        } else {
            System.out.println("O evento ainda não ocorreu.");
        }

    }
}
