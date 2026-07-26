package alura.praticando.OrientacaoObjetos.Abstracao.exercicio09;

public class Estoque {
    String nome;
    int quantidade;

    public void vender(int qtdVendida){
        if (qtdVendida <= quantidade){
            quantidade -= qtdVendida;
            System.out.printf("Venda realizada. Estoque restante de %s: %d%n", nome , quantidade);
        } else {
            System.out.println("Estoque Insuficiente");
        }
    }

}
