package alura.praticando.OrientacaoObjetos.Encapsulamento.exercicio10;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private ArrayList <Double> notasAlunos;

    public ArrayList<Double> getNotasAlunos() {
        return notasAlunos;
    }

    public String getNome() {
        return nome;
    }

    public Disciplina(String nome) {
        this.nome = nome;
        notasAlunos = new ArrayList<>();
    }

    public void adicionarNota(double nota){
        if (nota >= 0 && nota <= 10){
            notasAlunos.add(nota);
        } else {
            System.out.println("Nota inválida: " + nota);
        }
    }

    public double calculaMedia(){
        int soma = 0;

        for (Double nota : notasAlunos){
            soma += nota;
        }

        return (double) soma / notasAlunos.size();
    }
}
