//Implementação do transporte terrestre.

public class TransporteTerrestre implements Transporte {
    private static final double CUSTO_POR_KM = 8;

    @Override
    public double calcularFrete(double distancia, double peso) {
        System.out.println("Calculando frete Terrestre...");
        return distancia * CUSTO_POR_KM;
    }
}