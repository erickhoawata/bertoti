public class GerenciadorDeConfiguracao {

    private static GerenciadorDeConfiguracao instancia;

    private String caminhoArquivo;
    private String ambiente;

    private GerenciadorDeConfiguracao() {
        caminhoArquivo = "config.txt";
        ambiente = "desenvolvimento";
    }

    public static GerenciadorDeConfiguracao getInstancia() {
        if (instancia == null) {
            instancia = new GerenciadorDeConfiguracao();
        }
        return instancia;
    }

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

    public void exibirConfiguracoes() {
        System.out.println("Configuracoes:");
        System.out.println("Caminho do arquivo: " + caminhoArquivo);
        System.out.println("Ambiente: " + ambiente);
    }
}
