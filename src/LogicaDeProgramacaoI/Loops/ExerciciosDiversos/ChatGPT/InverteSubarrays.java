package LogicaDeProgramacaoI.Loops.ExerciciosDiversos.ChatGPT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InverteSubarrays {
    /**
     *     Para uma determinada matriz de inteiros, execute operações na matriz. retorna o array resultante após todas as operações terem sido aplicadas na ordem dada. cada operação contém dois índices. inverta o subarray entre esses índices baseados em zero, inclusive. exemplo:
     *     arr = [9,8,7,6,5,4,3,2,1,0]
     *     operações = [[0,9], [4,5], [3,6], [2,7], [1,8], [0,9]]
     */


        public static List<Integer> performOperations(List<Integer> arr, List<List<Integer>> operacoes) {
            for (List<Integer> op : operacoes) {
                int start = op.get(0);
                int end = op.get(1);
                while (start < end) {
                    Collections.swap(arr, start, end);
                    start++;
                    end--;
                }
            }
            return arr;
        }

        public static void main(String[] args) {
            List<Integer> arr = new ArrayList<>(List.of(9, 8, 7, 6, 5, 4, 3, 2, 1, 0));
            List<List<Integer>> operacoes = new ArrayList<>(List.of(
                    List.of(0, 9),
                    List.of(4, 5),
                    List.of(3, 6),
                    List.of(2, 7),
                    List.of(1, 8),
                    List.of(0, 9)
            ));
            List<Integer> result = performOperations(arr, operacoes);
            System.out.println(result); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        }
    }
