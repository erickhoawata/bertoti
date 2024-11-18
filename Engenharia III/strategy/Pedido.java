public class Pedido {
    private double valor;
    private MetodoPagamento metodoPagamento;

    public Pedido(double valor, MetodoPagamento metodoPagamento) {
        this.valor = valor;
        this.metodoPagamento = metodoPagamento;
    }

    public void processarPagamento() {
        metodoPagamento.processarPagamento(this.valor);
    }

    public void setMetodoPagamento(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public double getValor() {
        return valor;
    }
}
