public class CamisaTime {
    private String nomeTime;
    private int estoque;

    public CamisaTime(String nomeTime, int estoque) {
        this.nomeTime = nomeTime;
        this.estoque = estoque;
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "Camisa do time " + nomeTime + " | Estoque: " + estoque;
    }
}
