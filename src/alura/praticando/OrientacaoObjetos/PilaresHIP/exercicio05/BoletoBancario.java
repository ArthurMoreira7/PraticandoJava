package alura.praticando.OrientacaoObjetos.PilaresHIP.exercicio05;

public class BoletoBancario extends Pagamento{
    public BoletoBancario(double valor) {
        super(valor);
    }

    @Override
    public void confirmaPagamento() {
        System.out.printf("Boleto no valor de %.2f gerado!! (Taxa de R$%.2f)", valor, calculaTaxa());
    }

    @Override
    public double calculaTaxa() {
        return valor * 0.01;
    }
}
