public class Main {
    public static void main(String[] args) {
        // Criação da camisa de time e loja
        CamisaTime camisa = new CamisaTime("Sao Paulo", 50);
        Loja loja = new Loja(camisa);

        // Criação de clientes (observadores)
        Cliente cliente1 = new Cliente("Caua");
        Cliente cliente2 = new Cliente("Erick");

        // Adicionando os clientes como observadores
        loja.adicionarObservador(cliente1);
        loja.adicionarObservador(cliente2);

        // Exibindo o estado inicial da loja
        System.out.println("Estado inicial da loja:");
        System.out.println(loja.getCamisaTime());

        // Atualizando o estoque da camisa e notificando os observadores
        System.out.println("\nAtualizando o estoque da camisa...");
        loja.atualizarEstoque(30);  // Mudando o estoque para 30

        // Atualizando o estoque novamente e notificando os observadores
        System.out.println("\nAtualizando o estoque da camisa novamente...");
        loja.atualizarEstoque(15);  // Mudando o estoque para 15
    }
}
