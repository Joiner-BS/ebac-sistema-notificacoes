public class WhatsappNotificador implements Notificador {

    @Override
    public void enviarMensagem(String mensagem) {
        // Simula o envio de uma mensagem pelo WhatsApp.
        System.out.println("[WhatsApp] " + mensagem);
    }

}
