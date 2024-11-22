public class AplicacaoPrincipal {
    public static void main(String[] args) {
        Componente arquivo1 = new Arquivo("Relatorio.txt");
        Componente arquivo2 = new Arquivo("Resumo.docx");
        Componente arquivo3 = new Arquivo("Foto.jpg");

        Pasta pasta1 = new Pasta("Documentos");
        Pasta pasta2 = new Pasta("Imagens");

        pasta1.adicionarComponente(arquivo1);
        pasta1.adicionarComponente(arquivo2);
        pasta2.adicionarComponente(arquivo3);

        Pasta pastaPrincipal = new Pasta("Meu Computador");

        pastaPrincipal.adicionarComponente(pasta1);
        pastaPrincipal.adicionarComponente(pasta2);

        pastaPrincipal.exibirDetalhes();
    }
}
