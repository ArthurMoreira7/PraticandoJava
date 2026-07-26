package alura.praticando.OrientacaoObjetos.Abstracao.exercicio10;

public class Main {
    public static void main(String[] args) {
        Livro pedido = new Livro();
        pedido.titulo = "Dom Casmurro";
        pedido.diasAtraso = 3;

        pedido.exibirDetalhes();
    }
}
