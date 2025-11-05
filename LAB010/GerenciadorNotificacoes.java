public class GerenciadorNotificacoes {
    public void enviar(Notificavel canal, String mensagem) {
        canal.enviarNotificacao(mensagem);
    }

    public static void main(String[] args) {
        GerenciadorNotificacoes gerenciador = new GerenciadorNotificacoes();

        Notificavel email = new EmailNotificacao();
        Notificavel sms = new SMSNotificacao();
        Notificavel push = new PushNotificacao();

        gerenciador.enviar(email, "Seu pedido foi confirmado!");
        gerenciador.enviar(sms, "Seu código de verificação é 1234.");
        gerenciador.enviar(push, "Você recebeu uma nova mensagem.");
    }
}