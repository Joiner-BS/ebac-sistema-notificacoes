public class SmsNotificador implements Notificador{

    @Override
    public void enviarMensagem(String mensagem) {
        // Simula o envio de um SMS.
        System.out.println("[SMS] " + mensagem);
    }
}
