package LogicaDeProgramacaoI.Loops.ExerciciosDiversos.ChatGPT;

import java.util.regex.Pattern;

public class RegexExample {
    /**
     * dada uma lista de strings composta pelos caracteres 'a' e 'b', crie uma expressão regular que
     * corresponda a strings que começam e terminam com a mesma letra.
     */
        public static void main(String[] args) {
            String regex = "^(a|b).*\\1$";
            Pattern pattern = Pattern.compile(regex);
            String[] strings = {"abab", "aba", "bbb", "baa", "bbbab"};

            for (String s : strings) {
                boolean matches = pattern.matcher(s).matches();
                System.out.printf("%s: %s%n", s, matches);
            }
        }
    }

