public class Main {
    public static void main(String[] args) {
       
        PetShop petShop = new PetShop();

        
        PetShopController controller = new PetShopController(petShop);
        
        Servico banho = new Servico.ServicoIndividual("Banho", 30.0);
        Servico tosa = new Servico.ServicoIndividual("Tosa", 50.0);

       
        Servico.PacoteServico pacote = new Servico.PacoteServico("Pacote Básico");
        pacote.adicionarServico(banho);
        pacote.adicionarServico(tosa);

       
        controller.realizarServico("Cachorro", banho, new PrecoStrategy.PrecoCachorro());
        controller.realizarServico("Gato", pacote, new PrecoStrategy.PrecoGato());
    }
}