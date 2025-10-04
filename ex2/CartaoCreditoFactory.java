package ex2;

// Implementação CONCRETA para pagamento por cartão de crédito
public class CartaoCreditoFactory extends PagamentoFactory {

    @Override
    public ProcessadorPagamento criarProcessador() {
        return new CartaoCreditoProcessador();
    }
}
