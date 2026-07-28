package alura.praticando.OrientacaoObjetos.PilaresHIP.exercicio09;

public abstract class OperacaoBancaria implements AcaoBancaria{
    protected double valor;

    public OperacaoBancaria(double valor) {
        this.valor = valor;
    }

    protected OperacaoBancaria() {
    }
}
