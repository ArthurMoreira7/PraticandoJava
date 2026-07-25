package alura.praticando.Condicionais.exercicio02;

public class MediaEscolar {
    public static void main(String[] args) {
        double nota1 = 2.9;
        double nota2 = 7.8;
        double nota3 = 10;
        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7){
            System.out.println("O estudante teve média " + media + " e foi aprovado!!");
        } else if (media >= 5 && media < 7) {
            System.out.println("O estudante teve média " + media + " e está de recuperação!!");
        } else {
            System.out.println("O estudante teve média " + media + " e foi reprovado!!");
        }
    }
}
