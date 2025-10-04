public class TransporteService {
    public void calcularEExibirFrete(TransporteFactory factory, double distancia, double peso) {
        Transporte transporte = factory.criarTransporte();
        // guarda o resultado e o exibe
        double frete = transporte.calcularFrete(distancia, peso);
        System.out.printf("Valor do frete calculado: R$ %.2f\n\n", frete);
    }
}