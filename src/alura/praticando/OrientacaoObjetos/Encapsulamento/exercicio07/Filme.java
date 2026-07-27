package alura.praticando.OrientacaoObjetos.Encapsulamento.exercicio07;

import java.util.ArrayList;

public class Filme {
    private String titulo;
    private ArrayList <Integer> avaliacao;

    public Filme(String titulo) {
        this.titulo = titulo;
        avaliacao = new ArrayList<>();
    }

    public void adicionarAvaliacao(int nota){
        if (nota>= 1 && nota  <= 5){
            avaliacao.add(nota);
        } else {
            System.out.println("Nota Inválida! Insira um valor de 1 a 5!.");
        }
    }

    public double retornaMedia(){
        int soma = 0;
        for (int nota : avaliacao){
            soma += nota;
        }
        return (double) soma / avaliacao.size();
    }

}
