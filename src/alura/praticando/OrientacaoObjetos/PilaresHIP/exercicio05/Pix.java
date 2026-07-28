package alura.praticando.OrientacaoObjetos.PilaresHIP.exercicio05;

public class Pix extends Pagamento{

    public Pix(double valor) {
        super(valor);
    }

    @Override
    public void confirmaPagamento() {
        System.out.printf("Pix confirmado no valor de R$%.2f (Sem taxas adicionais)" ,valor);
    }
}
