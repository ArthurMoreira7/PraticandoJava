package alura.praticando.OrientacaoObjetos.Abstracao.exercicio06;

public class Alunos {
    String nome;
    double nota1;
    double nota2;

    public void exibeRelatorio(){
        double media = (nota1 + nota2) / 2;
        System.out.printf("Nome: %s %nNota 1: %.1f %nNota2: %.1f %nMédia: %.1f%n", nome, nota1, nota2, media);
        if (media >= 7){
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
    }

}
