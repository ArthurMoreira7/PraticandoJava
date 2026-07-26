package alura.praticando.OrientacaoObjetos.Abstracao.exercicio05;

public class ControleTemperatura {
    String local;
    double temperaturaAtual;

    public void mostraInformacoes() {
        System.out.println("Loocal do sensor: " + local);
        System.out.printf("Temperatura: %.1f%n", temperaturaAtual);

        if (temperaturaAtual > 37.5) {
            System.out.println("Alerta: Temperatura acima do limite!");
        } else if (temperaturaAtual < 37.5) {
            System.out.println("Temperatura dentro do limite!");
        }
    }
}
