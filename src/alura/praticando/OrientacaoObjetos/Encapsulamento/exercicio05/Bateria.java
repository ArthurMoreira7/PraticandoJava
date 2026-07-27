package alura.praticando.OrientacaoObjetos.Encapsulamento.exercicio05;

public class Bateria {
    private int nivel;

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if (nivel >= 0 && nivel <= 100) {
            this.nivel = nivel;
        } else {
            System.out.println("Não é possível definir o nível da bateria!");
        }
    }

    public void exibeStatusBateria(){
        if (getNivel() <= 20){
            System.out.println("Bateria: fraca!");
        } else if (getNivel() <= 80){
            System.out.println("Bateria: ok!");
        } else {
            System.out.println("Bateria: cheia!");
        }
    }
}
