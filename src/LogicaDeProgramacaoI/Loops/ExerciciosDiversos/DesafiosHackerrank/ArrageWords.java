package LogicaDeProgramacaoI.Loops.ExerciciosDiversos.DesafiosHackerrank;

import java.util.*;

public class ArrageWords {
    public static String arrange(String sentence) {
        sentence = Character.toUpperCase(sentence.charAt(0)) + sentence.substring(1, sentence.length() - 1);
        String[] words = sentence.split(" ");
        Map<Integer, List<String>> map = new TreeMap<>();
        for (String word : words) {
            int length = word.length();
            if (!map.containsKey(length)) {
                map.put(length, new ArrayList<>());
            }
            map.get(length).add(word);
        }
        for (List<String> list : map.values()) {
            Collections.sort(list);
        }
        StringBuilder sb = new StringBuilder();
        for (List<String> list : map.values()) {
            for (String word : list) {
                sb.append(word).append(" ");
            }
        }
        String newSentence = sb.toString().trim() + ".";
        return newSentence;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String sentence = scanner.nextLine();
        String arrangedSentence = arrange(sentence);
        System.out.println("Nova frase: " + arrangedSentence);
    }
}
