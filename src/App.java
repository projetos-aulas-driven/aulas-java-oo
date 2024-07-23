import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // String[] receitas = { "Strogonoff", "Feijoada", "Rocambole" };

        // for (int i = 0; i < receitas.length; i++) {
        //     System.out.println(receitas[i]);
        // }

        // String[] autores = new String[3];

        // autores[0] = "Edu";
        // autores[1] = "Vagner";
        // autores[2] = "Vivi";

        List<String> autores = new ArrayList<>();

        autores.add("Edu");
        autores.add("Vagner");
        autores.add("Vivi");
        autores.add("Letícia");

        System.out.println(autores.get(3));

        System.out.println(autores.size()); // tamanho da lista
        System.out.println(autores.indexOf("Letícia")); // indexOf
        System.out.println(autores.isEmpty()); // verifica se o array está vazio
        System.out.println(autores.contains("Vagner")); // tipo o includes

        autores.clear();
        System.out.println(autores.isEmpty()); // verifica se o array está vazio
    }
}
