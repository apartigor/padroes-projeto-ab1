package ex4;

// Escolhi o padrão Decorator para adicionar funcionalidades extras ao relatório sem alterar o código original
// O relatório base é implementado com novas funcionalides/camada e acaba deixando o código principal mais limpo
// Se uma nova funcionalidade for necessária, só vai ser preciso criar um novo Decorator para ela

public class Main {
    public static void main(String[] args) {
        // cria o relatório base
        Relatorio relatorioCompleto = new RelatorioBase();
        System.out.println("--- Relatório Simples ---");
        System.out.println(relatorioCompleto.gerar());
        System.out.println("========================\n");
        
        // decora o relatório base com estatísticas
        relatorioCompleto = new EstatisticasDecorator(relatorioCompleto);
        System.out.println("--- Relatório com Estatísticas ---");
        System.out.println(relatorioCompleto.gerar());
        System.out.println("========================\n");

        // decora o relatório base com gráficos
        relatorioCompleto = new GraficosDecorator(relatorioCompleto);
        System.out.println("--- Relatório com Gráficos ---");
        System.out.println(relatorioCompleto.gerar());
        System.out.println("========================\n");

        // decora o objeto completo para "formatar" em PDF
        relatorioCompleto = new PDFDecorator(relatorioCompleto);
        System.out.println("--- Relatório completo e em PDF ---");
        System.out.println(relatorioCompleto.gerar());
        System.out.println("========================\n");
        
        // decora o objeto sem estatistica para "formatar" em PDF (não precisa ter sempre estatisticas ou gráficos para passar para PDF ou vice versa)
        Relatorio relatorioApenasPDF = new PDFDecorator(new RelatorioBase());
        System.out.println("--- Relatório Simples em PDF ---");
        System.out.println(relatorioApenasPDF.gerar());
        System.out.println("========================\n");
    }
}