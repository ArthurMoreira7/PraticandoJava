package alura.praticando.OrientacaoObjetos.Abstracao.exercicio07;

public class Principal {
    public static void main(String[] args) {
        Cadastro colaborador = new Cadastro();
        colaborador.nome = "Arthur";
        colaborador.cargo = "Dev Júnior";
        colaborador.nivelAcesso = 1;

        System.out.println("-- Antes da atualização ---");
        colaborador.exibeInformacoes();

        colaborador.alteraInformacoes("Dev Pleno", 2);
        System.out.println("\n-- Após atualização ---");
        colaborador.exibeInformacoes();


    }
}
