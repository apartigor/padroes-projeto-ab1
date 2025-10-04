package ex2;
// Implementação CONCRETA para pagamento por boleto
public class BoletoFactory extends PagamentoFactory {
    
    @Override
    public ProcessadorPagamento criarProcessador() {
        return new BoletoProcessador();
    }
}
