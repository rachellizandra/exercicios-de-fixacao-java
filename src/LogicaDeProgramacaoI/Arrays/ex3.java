package LogicaDeProgramacaoI.Arrays;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        final int tam = 5;
        char[] gabarito = {'a', 'a', 'd', 'b', 'c'};
        char[] respostas = new char[tam];

        int nota = 0;
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < tam; i++) {
            System.out.printf("Informe a resposta da questão %d: ", (i + 1));
            respostas[i] = scanner.nextLine().charAt(0);
        }

        for(int i = 0; i < tam; i++) {
            if(respostas[i] == gabarito[i]) {
                nota++;
            }
        }
        System.out.printf("%nNota do aluno: %d", nota);
    }
}
