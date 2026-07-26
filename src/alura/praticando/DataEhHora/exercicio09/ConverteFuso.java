package alura.praticando.DataEhHora.exercicio09;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ConverteFuso {
    public static void main(String[] args) {
        ZonedDateTime horaAtual = ZonedDateTime.now();
        ZonedDateTime horaSydney = horaAtual.withZoneSameInstant(ZoneId.of("Australia/Sydney"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("Hórario atual: " + horaAtual.format(formatter));
        System.out.println("Hórario atual em Sydney: " + horaSydney.format(formatter));
    }
}
