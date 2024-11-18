public class BoletoBancario implements MetodoPagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado com Boleto Bancario. Aguardando compensacao.");
    }
}
