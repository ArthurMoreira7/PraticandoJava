package alura.praticando.OrientacaoObjetos.Encapsulamento.exercicio09;

public class Aluno {
    private String nome;
    private int pontos;
    private int nivel;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void ganharPontos(int pontos) {
        this.pontos += pontos;
        atualizaNivel();
    }

    public void atualizaNivel() {
        this.nivel = (pontos / 100) + 1;

    }

    public void exibirStatus(){
        System.out.println("Nome: " + nome);
        System.out.println("Nível: " + nivel);
        System.out.println("Pontos: " + pontos);
    }
}
