public class App {
    public static void main(String[] args) {
        Receita boloChocolate = new Receita();

        boloChocolate.titulo = "Bolo de Chocolate";
        boloChocolate.ingredientes = "Ovos, chocolate, farinha";
        boloChocolate.tempoPreparo = 50;
        boloChocolate.vegetariano = false;
        boloChocolate.preparar();

        Usuario leticia = new Usuario();
        leticia.nome = "Letícia";
        leticia.sobrenome = "Chijo";
        leticia.cpf = "111.111.111-11";
        leticia.email = "leticia@gmail.com";

        boloChocolate.autor = leticia;

        System.out.println(boloChocolate.autor.nome);
    }
}
