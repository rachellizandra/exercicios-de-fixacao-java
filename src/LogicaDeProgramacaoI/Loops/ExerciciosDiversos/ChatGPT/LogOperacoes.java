package LogicaDeProgramacaoI.Loops.ExerciciosDiversos.ChatGPT;

import java.util.HashMap;

public class LogOperacoes {
    /**
     * uma maneira de analisar logs de operações em produtos é escrever scripts automatizados para verificar padrões.
     * deseja-se encontrar o número máximo de vezes que uma palavra de destino pode ser obtida reorganizando um subconjunto
     * de caracteres em uma entrada de log. dada uma entrada de log s e uma palavra de destino t, a palavra de destino pode ser
     * obtida selecionando algum subconjunto de caracteres de s que pode ser reorganizado para formar a string t removê-los de s.
     * determino máximo de vezes que a palavra de destino pode ser removida da entrada de log fornecida.
     */

        public static int maxOccurrences(String s, String t) {
                // Frequência de cada letra em s
                HashMap<Character, Integer> sFreq = new HashMap<>();
                for (char c : s.toCharArray()) {
                    sFreq.put(c, sFreq.getOrDefault(c, 0) + 1);
                }

                // Frequência de cada letra em t
                HashMap<Character, Integer> tFreq = new HashMap<>();
                for (char c : t.toCharArray()) {
                    tFreq.put(c, tFreq.getOrDefault(c, 0) + 1);
                }

                // Verifica se é possível obter t a partir de s
                for (char c : tFreq.keySet()) {
                    int tCount = tFreq.get(c);
                    int sCount = sFreq.getOrDefault(c, 0);
                    if (tCount > sCount) {
                        return 0;
                    }
                }

                // Conta o número máximo de ocorrências de t em s
                int maxOccurrences = 0;
                int tLength = t.length();
                for (int i = 0; i <= s.length() - tLength; i++) {
                    String sub = s.substring(i, i + tLength);
                    if (isAnagram(sub, t)) {
                        maxOccurrences++;
                    }
                }
                return maxOccurrences;
            }

            private static boolean isAnagram(String s, String t) {
                if (s.length() != t.length()) {
                    return false;
                }
                HashMap<Character, Integer> freq = new HashMap<>();
                for (char c : s.toCharArray()) {
                    freq.put(c, freq.getOrDefault(c, 0) + 1);
                }
                for (char c : t.toCharArray()) {
                    int count = freq.getOrDefault(c, 0);
                    if (count == 0) {
                        return false;
                    }
                    freq.put(c, count - 1);
                }
                return true;
            }

    public static void main(String[] args) {
        String s = "aabbbcddeeef";
        String t = "abcdef";
        int maxOccurrences = maxOccurrences(s, t);
        System.out.println("Max occurrences of '" + t + "' in '" + s + "': " + maxOccurrences);
    }

    /**
     * Explicação:
     * A classe LogAnalyzer contém um único método estático maxOccurrences, que recebe duas strings como parâmetros: a entrada de log s e a palavra de destino t.
     * A variável maxOccurrences é usada para manter o número máximo de vezes que a palavra de destino pode ser obtida a partir da entrada de log.
     * A variável charCountsS é um array de inteiros com tamanho 26 (correspondente ao número de letras do alfabeto) que armazena a contagem de ocorrências de cada letra na entrada de log s.
     * A variável charCountsT é um array de inteiros com tamanho 26 que armazena a contagem de ocorrências de cada letra na palavra de destino t.
     * O primeiro loop for percorre todos os caracteres da entrada de log s e atualiza o array charCountsS de acordo.
     * O segundo loop for percorre todos os caracteres da palavra de destino t e atualiza o array charCountsT de acordo.
     * O terceiro loop for percorre todos os caracteres do alfabeto e verifica quantas vezes a palavra de destino pode ser obtida a partir da entrada de log, com base na contagem de ocorrências de cada letra em charCountsS e charCountsT.
     * Finalmente, o método retorna o número máximo de vezes que a palavra de destino pode ser obtida a partir da entrada de log.
     */



}
