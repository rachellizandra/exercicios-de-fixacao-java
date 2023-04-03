package LogicaDeProgramacaoI.Loops.ExerciciosDiversos.DesafiosHackerrank;

import java.util.Arrays;
import java.util.List;

public class MEXArray {
    /**
     * um novo jogador é lançado na hackergames onde o jogador recebe um array de n inteiros arr e pode reduzir qualquer elemento arr[i] a um inteiro x
     * tal qual que 0<= x <= arr[i]. O MEX de um array é definido como o elemento mínimo não-negativo não presente no array.
     * Encontre o máximo MEX possível do array arr que pode ser obtido através da execução da operação qualquer número de vezes
     */
    public static int getMaximumMEX(List<Integer> arr) {
        // Converte a lista de inteiros para um array de inteiros
        int[] intArr = arr.stream().mapToInt(Integer::intValue).toArray();

        // Ordena o array em ordem crescente
        Arrays.sort(intArr);

        int mex = 0;
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] == mex) {
                // Se o valor atual for igual ao MEX, aumenta o MEX em 1
                mex++;
            } else if (intArr[i] > mex) {
                // Se o valor atual for maior que o MEX, retorna o MEX atual
                return mex;
            }
        }

        // Se todos os valores forem menores que o MEX, retorna o próprio MEX
        return mex;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(2, 5, 7, 1, 3, 4, 0);
        int maxMex = getMaximumMEX(arr);
        System.out.println("Máximo MEX: " + maxMex); // output: 6

    }

}
