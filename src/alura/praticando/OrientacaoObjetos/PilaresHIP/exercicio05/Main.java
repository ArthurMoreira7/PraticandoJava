package alura.praticando.OrientacaoObjetos.PilaresHIP.exercicio05;

public class Main {
    public static void main(String[] args) {
        Pagamento cartao = new CartaoCredito(250.00);
        Pagamento boleto = new BoletoBancario(500.00);
        Pagamento pix = new Pix(300.00);

        cartao.confirmaPagamento();
        System.out.println();
        boleto.confirmaPagamento();
        System.out.println();
        pix.confirmaPagamento();
    }
}
