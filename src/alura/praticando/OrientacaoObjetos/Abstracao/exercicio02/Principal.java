package alura.praticando.OrientacaoObjetos.Abstracao.exercicio02;

public class Principal {
    public static void main(String[] args) {
        Livros livro = new Livros();
        livro.titulo = "O Guia do Mochileiro das Galáxias";
        livro.autor = "Douglas Adams";
        livro.paginas = 208;

        livro.exibeDadosDoLivro();
    }
}
