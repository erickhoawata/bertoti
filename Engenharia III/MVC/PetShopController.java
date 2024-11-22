public class PetShopController {
    private PetShop petShop;

    public PetShopController(PetShop petShop) {
        this.petShop = petShop;
    }

    public void realizarServico(String animal, Servico servico, PrecoStrategy estrategia) {
        double precoFinal = estrategia.calcularPreco(servico.getPreco());
        System.out.println("Realizando " + servico.getDescricao() + " para " + animal);
        System.out.println("Preço final: R$" + precoFinal);

        petShop.notificarCliente("Serviço concluído para " + animal + ": " + servico.getDescricao());
    }
}