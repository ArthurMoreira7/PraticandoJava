package alura.praticando.OrientacaoObjetos.PilaresHIP.exercicio03;

public class Livro extends Midia{
    private String autor;

    public Livro(String titulo, int anoPublicacao, String autor) {
        super(titulo, anoPublicacao);
        this.autor = autor;
    }

    public void exibirInfo(){
        System.out.printf("Código: %s | Livro: %s - Autor: %s",geraCodigo(),getTitulo(),autor);
    }

}
