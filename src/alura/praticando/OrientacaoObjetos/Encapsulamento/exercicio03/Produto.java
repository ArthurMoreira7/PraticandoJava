package alura.praticando.OrientacaoObjetos.Encapsulamento.exercicio03;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        if (preco < 0){
            System.out.println("Preço invalido!");
            this.preco = 0.0;
        } else {
            this.preco = preco;
        }
    }

    public void exibeDados (){
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
    }
}
