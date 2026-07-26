package alura.praticando.OrientacaoObjetos.Abstracao.exercicio04;

public class Principal {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.saldo = 1579.42;

        conta.exibeSaldo();
        conta.zeraSaldo();
        conta.exibeSaldo();
    }
}
