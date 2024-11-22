import java.util.ArrayList;
import java.util.List;

public interface Servico {
    double getPreco();
    String getDescricao();

    
    class PacoteServico implements Servico {
        private String nome;
        private List<Servico> servicos = new ArrayList<>();

        public PacoteServico(String nome) {
            this.nome = nome;
        }

        public void adicionarServico(Servico servico) {
            servicos.add(servico);
        }

        @Override
        public double getPreco() {
            return servicos.stream().mapToDouble(Servico::getPreco).sum();
        }

        @Override
        public String getDescricao() {
            return nome + " (Pacote com " + servicos.size() + " serviços)";
        }
    }


    class ServicoIndividual implements Servico {
        private String descricao;
        private double preco;

        public ServicoIndividual(String descricao, double preco) {
            this.descricao = descricao;
            this.preco = preco;
        }

        @Override
        public double getPreco() {
            return preco;
        }

        @Override
        public String getDescricao() {
            return descricao;
        }
    }
}