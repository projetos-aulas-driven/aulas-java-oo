public class App {
    public static void main(String[] args) {

        Usuario leticia = new Usuario("Letícia", "Chijo", "111.111.111-11", "leticia@gmail.com");

        // Receita boloChocolate = new Receita("Bolo de Chocolate", "Ovos, chocolate, farinha", 50, false, leticia);

        System.out.println(leticia.getCpf());

        leticia.setEmail("batatinha@gmail.com");
        System.out.println(leticia.getEmail());
    }
}
