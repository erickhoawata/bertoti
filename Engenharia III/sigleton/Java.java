public class Java {

    public static void main(String[] args) {
        // Obtendo a instância única do GerenciadorDeConfiguracao
        GerenciadorDeConfiguracao configuracao1 = GerenciadorDeConfiguracao.getInstancia();
        GerenciadorDeConfiguracao configuracao2 = GerenciadorDeConfiguracao.getInstancia();

        // Exibindo as configurações usando a primeira instância
        configuracao1.exibirConfiguracoes();

        // Alterando a configuração através da primeira instância
        configuracao1.setAmbiente("produção");
        configuracao1.setCaminhoArquivo("config_prod.txt");

        // Exibindo as configurações novamente usando a segunda instância
        // Como ambas as instâncias são a mesma, as configurações alteradas serão refletidas
        configuracao2.exibirConfiguracoes();

        // Verificando se as duas instâncias são iguais
        System.out.println("\nAs duas instancias sao iguais? " + (configuracao1 == configuracao2));
    }
}
