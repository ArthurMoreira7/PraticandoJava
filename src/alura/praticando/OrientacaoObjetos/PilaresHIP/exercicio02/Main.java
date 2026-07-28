package alura.praticando.OrientacaoObjetos.PilaresHIP.exercicio02;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Arthur", 19, 9.8);
        Aluno aluno2 = new Aluno("Ana", 19, 3.9);

        Docente docente1 = new Docente("Natalia",19,"Matemática");
        Docente docente2 = new Docente("Jacqueline",19,"Java Poo");

        aluno1.exibirDados();
        aluno2.exibirDados();

        docente1.exibirDados();
        docente2.exibirDados();
    }
}
