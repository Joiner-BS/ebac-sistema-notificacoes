public class Main {

    public static void main(String[] args) {
        // Cada instância do serviço recebe um canal diferente.
        UsuarioService servicoEmail = new UsuarioService(new EmailNotificador());
        UsuarioService servicoSms = new UsuarioService(new SmsNotificador());
        UsuarioService servicoWhatsapp = new UsuarioService(new WhatsappNotificador());

        servicoEmail.registrar("João");
        servicoSms.registrar("Ana");
        servicoWhatsapp.registrar("Maria");
    }
}