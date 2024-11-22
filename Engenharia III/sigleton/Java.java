public class Java {

    public static void main(String[] args) {
        GerenciadorDeConfiguracao configuracao1 = GerenciadorDeConfiguracao.getInstancia();
        GerenciadorDeConfiguracao configuracao2 = GerenciadorDeConfiguracao.getInstancia();

        configuracao1.exibirConfiguracoes();

        configuracao1.setAmbiente("produção");
        configuracao1.setCaminhoArquivo("config_prod.txt");

        configuracao2.exibirConfiguracoes();

        System.out.println("\nAs duas instancias sao iguais? " + (configuracao1 == configuracao2));
    }
}
