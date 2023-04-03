package LogicaDeProgramacaoI.Loops.ExerciciosDiversos.ChatGPT;

import java.util.*;

public class OrdenaArrays {
    /**
     *      Dado um array de n valores, ordene o array em ordem crescente,
     *      primeiro pela frequência de cada valor e então ordene pelos valores.
     */

    public static List<Integer> itemsSort(List<Integer> items) {
        // Cria um Map para contar as frequências de cada item
        Map<Integer, Integer> freq = new HashMap<>();
        for (int item : items) {
            freq.put(item, freq.getOrDefault(item, 0) + 1);
        }

        // Cria uma lista de pares (item, frequência) a partir do Map
        List<Map.Entry<Integer, Integer>> pairs = new ArrayList<>(freq.entrySet());

        // Ordena a lista de pares pelo valor da frequência (ordem crescente)
        // e, em caso de empate, pelo valor do item (ordem crescente)
        Collections.sort(pairs, (a, b) -> {
            if (a.getValue().equals(b.getValue())) {
                return a.getKey().compareTo(b.getKey());
            }
            return a.getValue().compareTo(b.getValue());
        });

        // Cria uma lista com os itens ordenados de acordo com a lista de pares
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> pair : pairs) {
            int item = pair.getKey();
            int freqValue = pair.getValue();
            for (int i = 0; i < freqValue; i++) {
                result.add(item);
            }
        }

        return result;
    }


}
