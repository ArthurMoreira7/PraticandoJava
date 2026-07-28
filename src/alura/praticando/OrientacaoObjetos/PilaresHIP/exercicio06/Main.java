package alura.praticando.OrientacaoObjetos.PilaresHIP.exercicio06;

public class Main {
    public static void main(String[] args) {
        Mensagem notificacao = new Mensagem();
        notificacao.enviarMensagem("Olá!");
        notificacao.enviarMensagem("João", "Bom dia!");
        notificacao.enviarMensagem("Maria", "Atenção!", 2);
    }
}
