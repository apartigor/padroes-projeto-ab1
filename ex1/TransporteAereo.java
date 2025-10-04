//Implementação do transporte aereo.

public class TransporteAereo implements Transporte {
    private static final double CUSTO_POR_KG = 10;

    @Override
    public double calcularFrete(double distancia, double peso) {
        System.out.println("Calculando frete Aéreo...");
        return peso * CUSTO_POR_KG;
    }
}