package alura.praticando.OrientacaoObjetos.PilaresHIP.exercicio05;

public class CartaoCredito extends Pagamento{
    public CartaoCredito(double valor) {
        super(valor);
    }

    @Override
    public double calculaTaxa() {
        return valor * 0.03;
    }

    @Override
    public void confirmaPagamento() {
        System.out.printf("Pagamente de %.2f no cartão de credito confirmado!! (Taxa de R$%.2f)",
                valor,calculaTaxa());
    }
}
