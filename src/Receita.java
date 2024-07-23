public class Receita {
    String titulo;
    String ingredientes;
    int tempoPreparo;
    boolean vegetariano;
    Usuario autor;

    void preparar() {
        System.out.println("Estou preparando " + this.titulo);
    }
}
