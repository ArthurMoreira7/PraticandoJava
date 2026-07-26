package alura.praticando.OrientacaoObjetos.Abstracao.exercicio08;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Tarefas t1 = new Tarefas();
        t1.descricao = "Estudar Java";
        t1.concluida = false;

        Tarefas t2 = new Tarefas();
        t2.descricao = "Fazer exercícios";
        t2.concluida = true;

        ArrayList <Tarefas> tarefas = new ArrayList<>();
        tarefas.add(t1);
        tarefas.add(t2);

        for (Tarefas t : tarefas){
            t.exibeInformacoes();
        }
    }
}
