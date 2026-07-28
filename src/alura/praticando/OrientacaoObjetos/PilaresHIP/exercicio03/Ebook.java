package alura.praticando.OrientacaoObjetos.PilaresHIP.exercicio03;

public class Ebook extends Midia{
    private String formato;
    public Ebook(String titulo, int anoPublicacao, String formato) {
        super(titulo, anoPublicacao);
        this.formato = formato;
    }

    public void exibirInfo(){
        System.out.printf("Código: %s | Ebook: %s - Formato: %s",geraCodigo(),getTitulo(),formato);
    }
}
