public class AplicacaoPrincipal {
    public static void main(String[] args) {
        // Criando arquivos
        Componente arquivo1 = new Arquivo("Relatorio.txt");
        Componente arquivo2 = new Arquivo("Resumo.docx");
        Componente arquivo3 = new Arquivo("Foto.jpg");

        // Criando pastas
        Pasta pasta1 = new Pasta("Documentos");
        Pasta pasta2 = new Pasta("Imagens");

        // Adicionando arquivos às pastas
        pasta1.adicionarComponente(arquivo1);
        pasta1.adicionarComponente(arquivo2);
        pasta2.adicionarComponente(arquivo3);

        // Criando uma pasta principal
        Pasta pastaPrincipal = new Pasta("Meu Computador");
        
        // Adicionando subpastas à pasta principal
        pastaPrincipal.adicionarComponente(pasta1);
        pastaPrincipal.adicionarComponente(pasta2);

        // Exibindo a estrutura de pastas e arquivos
        pastaPrincipal.exibirDetalhes();
    }
}
