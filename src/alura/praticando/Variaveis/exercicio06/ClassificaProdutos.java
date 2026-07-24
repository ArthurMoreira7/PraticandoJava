package alura.praticando.Variaveis.exercicio06;

public class ClassificaProdutos {
    public static void main(String[] args) {
        double preco = 150.00;
        if (preco <= 50){
            System.out.println("Categoria do produto: Econômico.");
        } else if (preco <= 200) {
            System.out.println("Categoria do produto: Intermediário");
        } else if (preco > 200){
            System.out.println("Categoria do produto: Premium");
        } else {
            System.out.println("Categoria Invalida!");
        }
    }
}
