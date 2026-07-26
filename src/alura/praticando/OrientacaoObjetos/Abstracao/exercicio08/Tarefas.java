package alura.praticando.OrientacaoObjetos.Abstracao.exercicio08;

public class Tarefas {
    String descricao;
    boolean concluida;


    public void exibeInformacoes(){
        System.out.printf("Tarefa: %s - Status: %b%n",descricao,concluida);
    }
}
