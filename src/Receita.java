public class Receita {
    String titulo;
    String ingredientes;
    int tempoPreparo;
    boolean vegetariano;
    Usuario autor;

    Receita() {}

    Receita(String titulo) {
        this.titulo = titulo;
    }

    Receita(String titulo, String ingredientes, int tempoPreparo, boolean vegetariano, Usuario autor) {
        this.titulo = titulo;
        this.ingredientes = ingredientes;
        this.tempoPreparo = tempoPreparo;
        this.vegetariano = vegetariano;
        this.autor = autor;
    }

    void preparar() {
        System.out.println("Estou preparando " + this.titulo);
    }
}
