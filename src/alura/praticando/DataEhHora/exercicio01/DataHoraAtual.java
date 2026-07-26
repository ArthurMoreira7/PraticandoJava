package alura.praticando.DataEhHora.exercicio01;

import java.time.LocalDate;
import java.time.LocalTime;

public class DataHoraAtual {
    public static void main(String[] args) {
        String tarefa = "Enviar relátorio semanal";
        LocalDate dataAtual = LocalDate.now();
        LocalTime horaAtual = LocalTime.now();

        System.out.println("Data Atual: " + dataAtual);
        System.out.println("Hora Atual: " + horaAtual);
    }
}
