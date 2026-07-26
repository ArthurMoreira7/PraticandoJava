package alura.praticando.OrientacaoObjetos.Abstracao.exercicio04;

public class Conta {
    double saldo;

    public void exibeSaldo(){
        System.out.printf("Saldo atual: R$%.2f%n",saldo);
    }
    public void zeraSaldo(){
        saldo = 0.0;
    }
}
