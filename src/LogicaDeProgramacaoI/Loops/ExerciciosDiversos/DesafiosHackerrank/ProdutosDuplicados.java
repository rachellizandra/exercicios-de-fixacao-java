package LogicaDeProgramacaoI.Loops.ExerciciosDiversos.DesafiosHackerrank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProdutosDuplicados {
    /**
     * Você recebeu uma lista complexa de n produtos, cada um com um name, price e weight.
     * Descubra quantos produtos duplicados existem na lista.
     * Produtos duplicados contém parâmetros idênticos para todos os campos da lista.
     */
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Product A", "Product B", "Product C", "Product A", "Product D", "Product E", "Product B", "Product F");
        List<Integer> prices = Arrays.asList(10, 20, 30, 10, 40, 50, 20, 60);
        List<Integer> weights = Arrays.asList(1, 2, 3, 1, 4, 5, 2, 6);

        int count = numDuplicates(names, prices, weights);
        System.out.println("Number of duplicate products: " + count);
    }

    public static int numDuplicates(List<String> names, List<Integer> prices, List<Integer> weights) {
        int count = 0;
        Set<String> uniqueProducts = new HashSet<>();

        for (int i = 0; i < names.size(); i++) {
            String product = names.get(i) + prices.get(i) + weights.get(i);
            if (!uniqueProducts.add(product)) {
                count++;
            }
        }

        return count;
    }
}
