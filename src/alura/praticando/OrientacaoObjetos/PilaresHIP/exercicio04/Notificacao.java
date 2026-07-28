package alura.praticando.OrientacaoObjetos.PilaresHIP.exercicio04;

public class Notificacao {
    protected String mensagem;
    protected String destinatario;

    public Notificacao(String mensagem, String destinatario) {
        this.mensagem = mensagem;
        this.destinatario = destinatario;
    }

    void enviar(){}
}
