public class Main {
    public static void main(String[] args) {
        // Criando os componentes do sistema de Home Theater
        Televisao televisao = new Televisao();
        SistemaDeSom sistemaDeSom = new SistemaDeSom();
        LeitorDeDVD leitorDeDVD = new LeitorDeDVD();

        // Criando a fachada que simplifica a interação com os componentes
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(televisao, sistemaDeSom, leitorDeDVD);

        // Iniciando a reprodução do filme
        homeTheater.iniciarFilme("A Origem");

        // Encerrando a experiência
        homeTheater.encerrarFilme();
    }
}
