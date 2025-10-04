package ex4;

public class EstatisticasDecorator extends RelatorioDecorator {

    public EstatisticasDecorator(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public String gerar() {
        String conteudoBase = super.gerar(); // pega objeto base
        String estatisticas = adicionarEstatisticas(); // adiciona as estatistica
        return conteudoBase + "\n" + estatisticas; // retorna o objeto combinado
    }

    private String adicionarEstatisticas() {
        return "[+] Adicionando estatísticas de faturamento ao relatório.";
    }
}