package LogicaDeProgramacaoI.Loops.ExerciciosDiversos.ChatGPT;

public class MinimoCaractere {
    public static int minCharsToAdd(String searchWord, String resultWord) {
        int m = searchWord.length();
        int n = resultWord.length();
        int i = 0, j = 0, count = 0;

        while (i < m && j < n) {
            if (searchWord.charAt(i) == resultWord.charAt(j)) {
                i++;
                j++;
            } else {
                i++;
                count++;
            }
        }

        if (j == n) {
            return count;
        }

        return -1;
    }

    public static void main(String[] args) {
        String searchWord = "abcde";
        String resultWord = "aec";
        int count = minCharsToAdd(searchWord, resultWord);
        System.out.println("O número mínimo de caracteres a serem adicionados é: " + count);
    }
}
