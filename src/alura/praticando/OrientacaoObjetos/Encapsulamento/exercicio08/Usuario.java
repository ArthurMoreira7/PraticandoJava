package alura.praticando.OrientacaoObjetos.Encapsulamento.exercicio08;

public class Usuario {
    private String login;
    private String senha;

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public boolean validaSenha(String senhaDigitada){
        if (senhaDigitada.equals(getSenha())){
            return true;
        }
        return false;
    }
    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }
}
