public class GerenciadorDeConfiguracao {

    // A instância única da classe
    private static GerenciadorDeConfiguracao instancia;

    // Variáveis de configuração
    private String caminhoArquivo;
    private String ambiente;

    // Construtor privado para evitar instância externa
    private GerenciadorDeConfiguracao() {
        // Valores padrão
        caminhoArquivo = "config.txt";
        ambiente = "desenvolvimento";
    }

    // Método para obter a instância única
    public static GerenciadorDeConfiguracao getInstancia() {
        if (instancia == null) {
            // Garantindo que apenas uma instância será criada
            instancia = new GerenciadorDeConfiguracao();
        }
        return instancia;
    }

    // Métodos para acessar as configurações
    public String getCaminhoArquivo() {
        return caminhoArquivo;
    }

    public void setCaminhoArquivo(String caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    // Exibe as configurações
    public void exibirConfiguracoes() {
        System.out.println("Configuracoes:");
        System.out.println("Caminho do arquivo: " + caminhoArquivo);
        System.out.println("Ambiente: " + ambiente);
    }
}
