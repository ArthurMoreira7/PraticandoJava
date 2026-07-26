package alura.praticando.OrientacaoObjetos.Abstracao.exercicio02;

public class Livros {
    String titulo;
    String autor;
    int paginas;

    public void exibeDadosDoLivro(){
        System.out.printf("\"%s\" de %s com %d páginas%n", titulo, autor, paginas);
    }
}
