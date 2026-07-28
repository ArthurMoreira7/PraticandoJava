package alura.praticando.OrientacaoObjetos.PilaresHIP.exercicio08;

public class Relatorio implements Imprimivel{
    private String titulo;
    private String conteudo;

    public Relatorio(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    @Override
    public void imprimir() {
        System.out.println(titulo);
        System.out.println(conteudo);
    }
}
