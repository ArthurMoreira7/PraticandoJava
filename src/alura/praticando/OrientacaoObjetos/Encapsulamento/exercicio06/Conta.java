package alura.praticando.OrientacaoObjetos.Encapsulamento.exercicio06;

public class Conta {
    private String titular;
    private double saldo;

    public Conta(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito > 0) {
            saldo += valorDeposito;
        } else {
            System.out.println("Não é possível depositar esse valor!");
        }
    }

    public void sacar(double valorSaque) {
        if (valorSaque <= saldo) {
            valorSaque -= saldo;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo de " + titular + ": " + saldo);
    }

}
