package alura.praticando.OrientacaoObjetos.PilaresHIP.exercicio04;

public class Email extends Notificacao{
    public Email(String mensagem, String destinatario) {
        super(mensagem, destinatario);
    }

    @Override
    void enviar() {
        System.out.println("Email para: " + destinatario);
        System.out.println("Mensagem: " + mensagem);
    }
}
