public interface PrecoStrategy {
    double calcularPreco(double precoBase);

    
    class PrecoCachorro implements PrecoStrategy {
        @Override
        public double calcularPreco(double precoBase) {
            return precoBase * 1.2; 
        }
    }

   
    class PrecoGato implements PrecoStrategy {
        @Override
        public double calcularPreco(double precoBase) {
            return precoBase * 1.1;
        }
    }
}