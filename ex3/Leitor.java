package ex3;

// objeto que será notificado quando Subject mudar
public class Leitor implements Observer {
    private String nome;

    public Leitor(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String nomeTopico, String noticia) {
        System.out.printf("Atenção %s! Nova notícia no tópico '%s': %s\n", 
            this.nome, nomeTopico, noticia);
    }
}