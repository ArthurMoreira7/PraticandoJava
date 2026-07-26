package alura.praticando.DataEhHora.exercicio08;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FusoHorario {
    public static void main(String[] args) {
        ZonedDateTime dataToquio = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        String horaFormatada = dataToquio.format(formatter);

        System.out.println("Horário atual em Tóquio: " + horaFormatada);
    }
}
