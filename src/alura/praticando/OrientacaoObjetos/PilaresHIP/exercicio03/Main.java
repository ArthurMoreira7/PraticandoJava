package alura.praticando.OrientacaoObjetos.PilaresHIP.exercicio03;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("O Hobbit", 1937,"Tolkien");
        Revista revista = new Revista("Placar", 2025,234);
        Ebook ebook = new Ebook("Sei la", 2020, "pdf");

        livro.exibirInfo();
        System.out.println();
        revista.exibirInfo();
        System.out.println();
        ebook.exibirInfo();
    }
}
