package alura.praticando.OrientacaoObjetos.PilaresHIP.exercicio02;

public class Docente extends Pessoa {
    private String disciplina;

    public Docente(String nome,int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Disciplina: " + disciplina);
    }
}
