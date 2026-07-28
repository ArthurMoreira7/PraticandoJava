package alura.praticando.OrientacaoObjetos.PilaresHIP.exercicio04;

public class Main {
    public static void main(String[] args) {
        Email email = new Email("SEI LA", "eu@gmail.com");
        Sms sms = new Sms("NAO SEI", "31999999");
        Push push = new Push("OI", "usuario_wkkd");

        email.enviar();
        sms.enviar();
        push.enviar();
    }
}
