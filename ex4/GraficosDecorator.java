package ex4;

public class GraficosDecorator extends RelatorioDecorator {

    public GraficosDecorator(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public String gerar() {
        String conteudoBase = super.gerar(); // pega objeto base
        String graficos = visualizarGraficos(); // adiciona os graficos
        return conteudoBase + "\n" + graficos; // retorna o objeto combinado
    }

    private String visualizarGraficos() {
        return "~~~~~~Exibição de gráficos~~~~~~";
    }
}