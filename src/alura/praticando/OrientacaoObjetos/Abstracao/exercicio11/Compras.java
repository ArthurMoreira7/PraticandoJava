package alura.praticando.OrientacaoObjetos.Abstracao.exercicio11;

public class Compras {
    String nome;
    double preco;
    int quantidade;

    public double retornaValorTotal(){
        return preco * quantidade;
    }
}
