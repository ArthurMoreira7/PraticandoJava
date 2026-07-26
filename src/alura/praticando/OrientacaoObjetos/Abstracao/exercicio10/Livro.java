package alura.praticando.OrientacaoObjetos.Abstracao.exercicio10;

public class Livro {
    String titulo;
    int diasAtraso;

    public void exibirDetalhes(){
        double valorMulta = 2.50  * diasAtraso;

        System.out.printf("Livro: %s | Multa por %d dias de atraso: %.2f", titulo,diasAtraso,valorMulta);
    }

}
