package ex4;

public class PDFDecorator extends RelatorioDecorator {

    public PDFDecorator(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public String gerar() {
        String conteudoBase = super.gerar(); // pega o objeto base
        String formatoPDF = formatarParaPDF(conteudoBase); // "formata" o conteúdo para PDF
        return formatoPDF; // retorna o objeto formatado
    }

    private String formatarParaPDF(String conteudo) {
        return "--- [COMEÇO DO ARQUIVO PDF] ---\n" +
               conteudo +
               "\n--- [FIM DO ARQUIVO PDF] ---";
    }
}