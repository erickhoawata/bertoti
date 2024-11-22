public class Main {
    public static void main(String[] args) {
        MetodoPagamento cartao = new CartaoCredito();
        MetodoPagamento boleto = new BoletoBancario();
        MetodoPagamento paypal = new PayPal();

        Pedido pedido = new Pedido(150.0, cartao);

        Sistema sistema = new Sistema();

        System.out.println("Processando pagamento com Cartao de Credito:");
        sistema.realizarPagamento(pedido);

        System.out.println("\nAlterando metodo de pagamento para Boleto Bancario:");
        pedido.setMetodoPagamento(boleto);
        sistema.realizarPagamento(pedido);

        System.out.println("\nAlterando metodo de pagamento para PayPal:");
        pedido.setMetodoPagamento(paypal);
        sistema.realizarPagamento(pedido);
    }
}
