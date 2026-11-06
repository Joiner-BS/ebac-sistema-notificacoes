public class EmailNotificador implements Notificador{

    @Override
    public void enviarMensagem(String mensagem) {
        // Simula o envio de um e-mail.
        System.out.println("[E-mail] " + mensagem);
    }
}
