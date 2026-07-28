package alura.praticando.OrientacaoObjetos.PilaresHIP.exercicio05;

public class Pagamento {
    protected double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public void confirmaPagamento(){
        System.out.printf("Pagamento de %.2f confirmado!", valor);
    }

    public double calculaTaxa(){
        return valor * 0.0;
    }
}
