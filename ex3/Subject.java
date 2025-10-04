package ex3;

// métodos para gerenciar os Observers
public interface Subject {
    void inscrever(Observer observer);
    void desinscrever(Observer observer);
    void notificarObservers();
}