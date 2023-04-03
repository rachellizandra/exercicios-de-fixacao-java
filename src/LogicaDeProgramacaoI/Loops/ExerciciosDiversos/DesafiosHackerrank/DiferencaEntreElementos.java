package LogicaDeProgramacaoI.Loops.ExerciciosDiversos.DesafiosHackerrank;

import java.util.Arrays;
import java.util.List;

public class DiferencaEntreElementos {
    /**
     * Dado um array de inteiros, sem reordenar, determine a diferença máxima entre qualquer elemento e qualquer outro elemento menor anterior.
     * se não houver um elemento anterior menor, retorne -1
     */
    public static int maxTrailing(List<Integer> arr) {
        int maxDiff = -1;
        int minSoFar = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            int current = arr.get(i);
            if (current < minSoFar) {
                minSoFar = current;
            } else {
                int diff = current - minSoFar;
                if (diff > maxDiff) {
                    maxDiff = diff;
                }
            }
        }

        return maxDiff;

    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(2, 3, 10, 2, 4, 8, 1);
        int maxDiff = maxTrailing(arr);
        System.out.println("Máxima diferença: " + maxDiff); // output: 9
    }


}
