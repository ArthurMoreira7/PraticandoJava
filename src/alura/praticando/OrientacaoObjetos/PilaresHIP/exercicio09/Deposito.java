package alura.praticando.OrientacaoObjetos.PilaresHIP.exercicio09;

public class Deposito extends OperacaoBancaria implements AcaoBancaria{
    public Deposito(double valor) {
        super(valor);
    }

    @Override
    public void executar() {
        System.out.println("Depósito de R$" + valor + " realizado!");
    }
}
