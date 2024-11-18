public class Main {
    public static void main(String[] args) {
        // Criando instâncias dos diferentes métodos de pagamento
        MetodoPagamento cartao = new CartaoCredito();
        MetodoPagamento boleto = new BoletoBancario();
        MetodoPagamento paypal = new PayPal();

        // Criando um pedido
        Pedido pedido = new Pedido(150.0, cartao);

        // Criando o sistema de pagamento
        Sistema sistema = new Sistema();

        // Realizando o pagamento com Cartão de Crédito
        System.out.println("Processando pagamento com Cartao de Credito:");
        sistema.realizarPagamento(pedido);

        System.out.println("\nAlterando metodo de pagamento para Boleto Bancario:");
        // Mudando para pagamento via Boleto Bancário
        pedido.setMetodoPagamento(boleto);
        sistema.realizarPagamento(pedido);

        System.out.println("\nAlterando metodo de pagamento para PayPal:");
        // Mudando para pagamento via PayPal
        pedido.setMetodoPagamento(paypal);
        sistema.realizarPagamento(pedido);
    }
}
