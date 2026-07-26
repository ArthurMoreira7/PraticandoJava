package alura.praticando.DataEhHora.exercicio03;

import java.time.Duration;
import java.time.LocalTime;

public class CalculandoDuracao {
    public static void main(String[] args) {
        LocalTime primeiroHorario = LocalTime.of(14,30,0);
        LocalTime segundoHorario = LocalTime.of(16,45,0);

        Duration duracao = Duration.between(primeiroHorario,segundoHorario);

        System.out.println("Diferença de tempo: " + duracao.toHours() + " horas e " + duracao.toMinutesPart() + " minutos");

    }
}
