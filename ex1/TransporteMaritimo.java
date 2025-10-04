//Implementação do transporte maritimo.

public class TransporteMaritimo implements Transporte {
    private static final double CUSTO_POR_KG = 2;
    private static final double CUSTO_POR_KM = 10;

    @Override
    public double calcularFrete(double distancia, double peso) {
        System.out.println("Calculando frete Marítimo...");
        return (peso * CUSTO_POR_KG) + (distancia * CUSTO_POR_KM);
    }
}