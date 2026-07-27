package alura.praticando.OrientacaoObjetos.Encapsulamento.exercicio04;

public class Usuario {
    private String senha;

    public Usuario(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void alteraSenha(String senhaAtual, String senhaNova) {
        if (senhaAtual.equals(getSenha())){
            senhaAtual = senhaNova;
            System.out.println("Senha Alterada com sucesso!");
        } else {
            System.out.println("Não foi possível alterar a senha!");
        }
    }
}
