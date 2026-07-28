package alura.praticando.OrientacaoObjetos.PilaresHIP.exercicio02;

public class Aluno extends Pessoa{
    private double nota;

    public Aluno(String nome, int idade,double nota) {
        super(nome, idade);
        this.nota = nota;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Nota: " + nota);
    }
}
