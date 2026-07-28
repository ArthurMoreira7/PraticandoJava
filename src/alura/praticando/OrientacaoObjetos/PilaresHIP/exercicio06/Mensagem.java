package alura.praticando.OrientacaoObjetos.PilaresHIP.exercicio06;

public class Mensagem {
    public void enviarMensagem(String mensagemGeral){
        System.out.println("Mensagem enviada para todos contatos: " + mensagemGeral);
    }

    public void enviarMensagem(String contato, String mensagem){
        System.out.printf("Mensagem para %s: %s", contato,mensagem);
    }

    public void enviarMensagem(String contato, String mensagem , int totalMensagem){
        for (int i = 0; i < totalMensagem; i++) {
            System.out.printf("\nMensagem para %s: %s",contato,mensagem);
        }
    }
}
