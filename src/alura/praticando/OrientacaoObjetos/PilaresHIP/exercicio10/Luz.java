package alura.praticando.OrientacaoObjetos.PilaresHIP.exercicio10;

public class Luz implements Controlavel{
    boolean ligado = false;

    @Override
    public void ligar() {
        if(!ligado){
            ligado = true;
            System.out.println("Luz ligada!");
        } else {
            System.out.println("Luz já está ligada!");
        }
    }

    @Override
    public void desligar() {
        if (ligado){
            System.out.println("Luz desligada!");
        } else {
            System.out.println("Luz já está desligada!");
        }
    }
}
