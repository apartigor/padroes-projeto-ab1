// Escolhi o padrão Factory para tirar a responsabilidade de criar os processadores de pagamento no código principal
// A fábrica decide qual processador (PIX, Cartão, etc.) instanciar, deixando o código mais limpo
// Se um novo meio de pagamento for adicionado, só preciso criar uma nova fábrica

public class Main {
    public static void main(String[] args) {
        TransporteService service = new TransporteService();
        double distancia = 10;
        double peso = 5;

        // factory do transporte terrestre
        // frete é calculado pela distancia * custo por KM (que é 8)
        service.calcularEExibirFrete(new TerrestreFactory(), distancia, peso);

        // factory do transporte aereo
        // frete é calculado pelo peso * custo por KG (que é 10)
        service.calcularEExibirFrete(new AereoFactory(), distancia, peso);
        
        // factory do transporte maritimo
        // frete é calculado pela distancia * custo por KM (que é 10) + peso * custo por KG (que é 2)
        service.calcularEExibirFrete(new MaritimoFactory(), distancia, peso);

    }
}