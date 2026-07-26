package alura.praticando.OrientacaoObjetos.Abstracao.exercicio05;

public class Principal {
    public static void main(String[] args) {
        ControleTemperatura controleTemperatura = new ControleTemperatura();
        controleTemperatura.local = "Setor A";
        controleTemperatura.temperaturaAtual = 39.2;

        controleTemperatura.mostraInformacoes();
    }
}
