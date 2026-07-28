package alura.praticando.OrientacaoObjetos.PilaresHIP.exercicio10;

public class ArCondicionado implements Controlavel{
    boolean ligado = false;

    @Override
    public void ligar() {
        if (!ligado){
            System.out.println("Ar Condicionado ligado!");
        } else {
            System.out.println("Ar já está ligado!");
        }
    }

    @Override
    public void desligar() {
        if (ligado){
            System.out.println("Ar condicionado desligado!");
        } else {
            System.out.println("Ar condicionado já está desligado!");
        }
    }
}
