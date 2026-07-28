package alura.praticando.OrientacaoObjetos.PilaresHIP.exercicio09;

public class Saque extends OperacaoBancaria implements AcaoBancaria{
    public Saque(double valor) {
        super(valor);
    }

    @Override
    public void executar() {
        System.out.println("Saque de R$" + valor + " realizado!");
    }
}
