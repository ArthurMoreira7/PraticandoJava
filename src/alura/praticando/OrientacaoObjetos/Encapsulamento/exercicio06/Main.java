package alura.praticando.OrientacaoObjetos.Encapsulamento.exercicio06;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta("Ana");
        conta.depositar(1000.00);
        conta.sacar(1200.00);
        conta.exibirSaldo();
    }
}
