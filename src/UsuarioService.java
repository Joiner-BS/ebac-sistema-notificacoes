public class UsuarioService {

    // O serviço conhece o contrato, que pode ser atendido por qualquer canal.
    private final Notificador notificador;

    public UsuarioService(Notificador notificador) {
        // Guarda no atributo o notificador recebido de quem criou o serviço.
        this.notificador = notificador;
    }

    public void registrar(String nome) {
        System.out.println("Usuário " + nome + " registrado.");

        // Delega o envio ao notificador recebido no construtor.
        notificador.enviarMensagem("Bem-vindo " + nome + "!");
    }
}
