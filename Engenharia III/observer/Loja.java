import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Observador> observadores = new ArrayList<>();
    private CamisaTime camisaTime;

    public Loja(CamisaTime camisaTime) {
        this.camisaTime = camisaTime;
    }

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.atualizar(camisaTime);
        }
    }

    public void atualizarEstoque(int novoEstoque) {
        camisaTime.setEstoque(novoEstoque);
        notificarObservadores();
    }

    public CamisaTime getCamisaTime() {
        return camisaTime;
    }
}
