public class App {
    public static void main(String[] args) {
        String tituloReceita = "Bolo de cenoura";
        int quantidadeIngredientes = 2;
        double precoVenda = 2.5;
        final boolean vegetariana = false;

        // comparadores: > >= < <= == !=
        // operadores lógicos: && || !
        if (precoVenda > 10 && vegetariana == true) { 
            System.out.println("Receita cara");
        } else {
            System.out.println("Receita barata");
        }

        int quantidadeReceitas = 4;
        while(quantidadeReceitas != 0) {
            System.out.println("Essa é a receita " + quantidadeReceitas);
            quantidadeReceitas -= 1;
        }

        for (int qtdeReceitas = 4; qtdeReceitas != 0; qtdeReceitas--) {
            System.out.println("Essa é a receita " + qtdeReceitas);
        }
    }
}
