package alura.praticando.OrientacaoObjetos.PilaresHIP.exercicio04;

public class Sms extends Notificacao{

    public Sms(String mensagem, String destinatario) {
        super(mensagem, destinatario);
    }

    @Override
    void enviar() {
        System.out.println("Sms para telefone: " + destinatario);
        System.out.println("Mensagem: " + mensagem);
    }
}
