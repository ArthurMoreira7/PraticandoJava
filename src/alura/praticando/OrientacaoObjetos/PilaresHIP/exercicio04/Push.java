package alura.praticando.OrientacaoObjetos.PilaresHIP.exercicio04;

public class Push extends Notificacao{
    public Push(String mensagem, String destinatario) {
        super(mensagem, destinatario);
    }

    @Override
    void enviar() {
        System.out.println("Push para: " + destinatario);
        System.out.println("Mensagem: " + mensagem);
    }
}
