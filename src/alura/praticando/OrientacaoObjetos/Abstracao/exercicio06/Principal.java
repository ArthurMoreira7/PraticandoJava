package alura.praticando.OrientacaoObjetos.Abstracao.exercicio06;

public class Principal {
    public static void main(String[] args) {
        Alunos aluno = new Alunos();
        aluno.nome = "João Silva";
        aluno.nota1 = 6.5;
        aluno.nota2 = 7.5;

        aluno.exibeRelatorio();
    }
}
