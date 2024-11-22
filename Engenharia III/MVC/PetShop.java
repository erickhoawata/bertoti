import java.util.ArrayList;
import java.util.List;

public class PetShop {
    private List<String> notificacoes = new ArrayList<>();

    public void notificarCliente(String mensagem) {
        notificacoes.add(mensagem);
        System.out.println("[Notificação]: " + mensagem);
    }
}