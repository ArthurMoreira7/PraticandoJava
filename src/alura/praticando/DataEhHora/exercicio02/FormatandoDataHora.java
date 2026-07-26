package alura.praticando.DataEhHora.exercicio02;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormatandoDataHora {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        LocalTime horaAtual = LocalTime.now();

        DateTimeFormatter dataBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter horaBr = DateTimeFormatter.ofPattern("HH:mm");

        String dataFormatada = dataAtual.format(dataBr);
        String horaFormatada = horaAtual.format(horaBr);

        System.out.println("Data formatada: " + dataFormatada);
        System.out.println("Hora formatada: " + horaFormatada);

    }
}
