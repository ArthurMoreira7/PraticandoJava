package alura.praticando.OrientacaoObjetos.Abstracao.exercicio01;

public class Principal {
    public static void main(String[] args) {
        Produtos produto = new Produtos();
        produto.nome = "Mouse Gamer";
        produto.preco = 159.9;
        produto.quantidade = 25;

        produto.relatorioDoProduto();
    }
}
