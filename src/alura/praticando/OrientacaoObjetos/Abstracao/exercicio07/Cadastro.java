package alura.praticando.OrientacaoObjetos.Abstracao.exercicio07;

public class Cadastro {
    String nome;
    String cargo;
    int nivelAcesso;

    public void alteraInformacoes(String novoCargo, int novoNivel){
        cargo = novoCargo;
        nivelAcesso = novoNivel;
    }

    public void exibeInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Nível de acesso: " + nivelAcesso);
    }
}
