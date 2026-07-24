package alura.praticando.Variaveis.exercicio05;

public class InformacoesLivros {
    public static void main(String[] args) {
        String titulo = "Pequeno Principe";
        String autor = "Saint-Exupéry";
        int numerosPaginas = 96;
        double precoLivro = 39.9;
        char categoria ='F';

        if (categoria == 'F'){
            System.out.println("Livro cadastrado: " + titulo + ", de " + autor +
                    ". Ele possui " + numerosPaginas + " páginas, custa R$" + precoLivro +
                    " e pertence á categoria Ficção.");
        } else if (categoria == 'N') {
            System.out.println("Livro cadastrado: " + titulo + ", de " + autor +
                    ". Ele possui " + numerosPaginas + " páginas, custa R$" + precoLivro +
                    " e pertence á categoria NÃO Ficção.");
        } else if (categoria == 'T') {
            System.out.println("Livro cadastrado: " + titulo + ", de " + autor +
                    ". Ele possui " + numerosPaginas + " páginas, custa R$" + precoLivro +
                    " e pertence á categoria Tecnologia.");
        }else if (categoria == 'H') {
            System.out.println("Livro cadastrado: " + titulo + ", de " + autor +
                    ". Ele possui " + numerosPaginas + " páginas, custa R$" + precoLivro +
                    " e pertence á categoria Historia.");
        } else {
            System.out.println("Categoria Invalida!");
        }
    }
}
