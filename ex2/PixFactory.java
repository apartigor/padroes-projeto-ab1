package ex2;

// Implementação CONCRETA para pagamento por PIX
public class PixFactory extends PagamentoFactory {
    
    @Override
    public ProcessadorPagamento criarProcessador() {
        return new PixProcessador();
    }
}
