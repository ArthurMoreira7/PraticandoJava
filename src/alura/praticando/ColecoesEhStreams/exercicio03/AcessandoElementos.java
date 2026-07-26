package alura.praticando.ColecoesEhStreams.exercicio03;

import java.util.ArrayList;
import java.util.List;

public class AcessandoElementos {
    public static void main(String[] args) {
        List <String> funcionarios = new ArrayList<>();
        funcionarios.add("João");
        funcionarios.add("Maria");
        funcionarios.add("Ana");
        funcionarios.add("Pedro");
        funcionarios.add("Antônio");

        System.out.println("Segundo funcinário: " + funcionarios.get(1));
        System.out.println("Total de funcionários registrados: " + funcionarios.size());
    }
}
