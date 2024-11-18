public class Cliente implements Observador {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(CamisaTime camisaTime) {
        System.out.println("Cliente " + nome + " foi notificado sobre o estoque da " + camisaTime);
    }
}
