package ex3;
import java.util.ArrayList;
import java.util.List;


// o que os leitores vão estar "linkados"
public class Topico implements Subject {
    private String nome;
    private List<Observer> observers = new ArrayList<>();
    private String ultimaNoticia;

    public Topico(String nome) {
        this.nome = nome;
    }
    
    // adiciona um novo leitor à lista de notificações
    @Override
    public void inscrever(Observer observer) {
        observers.add(observer);
    }

    // remove um leitor da lista
    @Override
    public void desinscrever(Observer observer) {
        observers.remove(observer);
    }

    // aplica o metodo para atualizar os leitores
    @Override
    public void notificarObservers() {
        for (Observer observer : observers) {
            observer.atualizar(this.nome, this.ultimaNoticia);
        }
    }


    // quando publicar uma nova notícia, o método atualiza seu estado e notifica todos os leitores inscritos
    public void publicarNoticia(String noticia) {
        this.ultimaNoticia = noticia;
        System.out.printf("\n--- [TÓPICO %s] Nova publicação! Notificando inscritos... ---\n", this.nome);
        notificarObservers(); 
    }
}