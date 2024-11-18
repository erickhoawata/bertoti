public class Arquivo implements Componente {
    private String nome;

    public Arquivo(String nome) {
        this.nome = nome;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Arquivo: " + nome);
    }
}
