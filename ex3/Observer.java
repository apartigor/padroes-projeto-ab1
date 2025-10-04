package ex3;

// método que o Subject chamara para notificar sobre uma mudança
public interface Observer {
    void atualizar(String nomeTopico, String noticia);
}