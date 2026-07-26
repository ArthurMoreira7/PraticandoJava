package alura.praticando.OrientacaoObjetos.Abstracao.exercicio01;

public class Produtos {
    String nome;
    double preco;
    int quantidade;

    public void relatorioDoProduto(){
        System.out.printf("Produto: %s %nPreço: $%.2f %nQuantidade no estoque: %d", nome , preco,quantidade);
    }
}
