package alura.praticando.OrientacaoObjetos.PilaresHIP.exercicio03;

public class Revista extends Midia{
    private int edicao;
    public Revista(String titulo, int anoPublicacao, int edicao) {
        super(titulo, anoPublicacao);
        this.edicao = edicao;
    }
    public void exibirInfo(){
        System.out.printf("Código: %s | Revista: %s - Edição: %d",geraCodigo(),getTitulo(),edicao);
    }
}
