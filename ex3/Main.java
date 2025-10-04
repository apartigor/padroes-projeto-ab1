package ex3;

// Escolhi o padrão Observer para tirar a responsabilidade do tópico de controlar quem ele deve notificar
// O tópico apenas notifica os inscritos sobre a nova notícia, deixando o código principal mais limpo
// Se um novo leitor quiser ser notificado, ele vai ter que se inscrever no tópico desejado

public class Main {
    public static void main(String[] args) {
        // criar os Subjects (tópicos)
        Topico topicoEsports = new Topico("E-sport");
        Topico topicoTecnologia = new Topico("Tecnologia");

        // cria os Observers (leitores)
        Leitor leitorFulano = new Leitor("Fulano");
        Leitor leitorIgor = new Leitor("Igor");
        Leitor leitorFelipe = new Leitor("Felipe");

        // inscreve os leitores nos tópicos 
        topicoEsports.inscrever(leitorFulano);     // fulano se interessa por e-sports
        topicoEsports.inscrever(leitorIgor);   //  igor se interessa por e-sports

        topicoTecnologia.inscrever(leitorIgor); // igor interessa por tecnologia
        topicoTecnologia.inscrever(leitorFelipe);  // felipe se interessa por tecnologia

        // publicação das notícias e notificações automáticas
        
        // fulano e igor em e-sports
        topicoEsports.publicarNoticia("MIBR ganha o Valorant Champions 2025!");
        
        // igor e felipe em tecnologia
        topicoTecnologia.publicarNoticia("Java entra em desuso e morre!");

        // igor se desinscreve
        System.out.println("\n--- Igor não receberá mais notícias de E-sports. ---");
        topicoEsports.desinscrever(leitorIgor);

        // só fulano vai receber as notícias de e-sports agora
        topicoEsports.publicarNoticia("MIBR da desband em todo elenco após vitória.");
    }
}
