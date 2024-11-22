public class Main {
    public static void main(String[] args) {
        CamisaTime camisa = new CamisaTime("Sao Paulo", 50);
        Loja loja = new Loja(camisa);

        Cliente cliente1 = new Cliente("Caua");
        Cliente cliente2 = new Cliente("Erick");

        loja.adicionarObservador(cliente1);
        loja.adicionarObservador(cliente2);

        System.out.println("Estado inicial da loja:");
        System.out.println(loja.getCamisaTime());

        System.out.println("\nAtualizando o estoque da camisa...");
        loja.atualizarEstoque(30);  

        System.out.println("\nAtualizando o estoque da camisa novamente...");
        loja.atualizarEstoque(15);
    }
}
