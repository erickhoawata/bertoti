public class Main {
    public static void main(String[] args) {
        Televisao televisao = new Televisao();
        SistemaDeSom sistemaDeSom = new SistemaDeSom();
        LeitorDeDVD leitorDeDVD = new LeitorDeDVD();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(televisao, sistemaDeSom, leitorDeDVD);

        homeTheater.iniciarFilme("A Origem");

        homeTheater.encerrarFilme();
    }
}
