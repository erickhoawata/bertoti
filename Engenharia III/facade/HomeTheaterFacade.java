public class HomeTheaterFacade {
    private Televisao televisao;
    private SistemaDeSom sistemaDeSom;
    private LeitorDeDVD leitorDeDVD;

    public HomeTheaterFacade(Televisao televisao, SistemaDeSom sistemaDeSom, LeitorDeDVD leitorDeDVD) {
        this.televisao = televisao;
        this.sistemaDeSom = sistemaDeSom;
        this.leitorDeDVD = leitorDeDVD;
    }

    public void iniciarFilme(String nomeFilme) {
        System.out.println("Iniciando a experiencia de cinema em casa...");
        televisao.ligar();
        televisao.ajustarCanal(101); // Canal do filme
        sistemaDeSom.ligar();
        sistemaDeSom.ajustarVolume(15); // Volume médio
        leitorDeDVD.ligar();
        leitorDeDVD.tocarFilme(nomeFilme);
    }

    public void encerrarFilme() {
        System.out.println("Encerrando a experiencia de cinema em casa...");
        televisao.desligar();
        sistemaDeSom.desligar();
        leitorDeDVD.desligar();
    }
}
