package alura.praticando.OrientacaoObjetos.Encapsulamento.exercicio01;

public class Carro {
    private String modelo;
    private String placa;
    private int ano;

    public Carro(String modelo, String placa, int ano) {
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }

    public void exibeInformacoes(){
        System.out.println("Véiculo cadastrado: ");
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Ano: " + ano);
    }
}
