package alura.praticando.OrientacaoObjetos.Encapsulamento.exercicio10;

public class Main {
    public static void main(String[] args) {
        Disciplina matematica = new Disciplina("Matemática");
        matematica.adicionarNota(7.5);
        matematica.adicionarNota(11.0);
        matematica.adicionarNota(8.0);
        matematica.adicionarNota(-3.0);
        matematica.adicionarNota(9.5);

        System.out.println("Notas válidadas: " + matematica.getNotasAlunos().size());
        System.out.println("Média em " + matematica.getNome() + ": " + matematica.calculaMedia());
    }
}
