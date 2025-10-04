package ex2;

// Escolhi o padrão Factory para tirar a responsabilidade de criar os objetos de pagamento no código principal
// A fábrica decide qual pagamento instanciar, deixando o código mais limpo
// Se um novo pagamento for criado, só preciso adicionar uma nova fábrica

public class Main {
    public static void main(String[] args) {
        // o service que comanda a operação do pagamento
        PagamentoService servico = new PagamentoService();
        double valorDaCompraPIX = 100.00;
        double valorDaCompraCartaoCredito = 255.50;
        double valorDaCompraBoleto = 200.00;
        
        System.out.println("--- Um cliente escolheu pagar com PIX ---");
        // o sistema instancia a FÁBRICA de PIX
        PagamentoFactory pixFactory = new PixFactory();
        // passa a fábrica para o serviço
        servico.realizarPagamento(pixFactory, valorDaCompraPIX);
        
        System.out.println("\n--- Outro cliente escolheu pagar com Cartão de Crédito ---");
        // o sistema instancia a FÁBRICA de cartão de crédito
        PagamentoFactory cartaoFactory = new CartaoCreditoFactory();
        // passa a fábrica para o serviço
        servico.realizarPagamento(cartaoFactory, valorDaCompraCartaoCredito);
        
        System.out.println("\n--- Um terceiro cliente escolheu pagar com Boleto ---");
        // o sistema instancia a FÁBRICA de boleto
        PagamentoFactory boletoFactory = new BoletoFactory();
        // passa a fábrica para o serviço
        servico.realizarPagamento(boletoFactory, valorDaCompraBoleto);
    }
}