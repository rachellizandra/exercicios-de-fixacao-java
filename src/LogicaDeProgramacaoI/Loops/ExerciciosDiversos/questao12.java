package LogicaDeProgramacaoI.Loops.ExerciciosDiversos;

import java.util.Scanner;

public class questao12 {

    public static void main(String[] args) {
        // Gerador de tabuada
        /**
         * Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
         * qualquer número inteiro entre 1 a 10. O usuário deve informar de qual
         * numero ele deseja ver a tabuada. A saída deve ser conforme o
         * exemplo abaixo:
         */


        int valorUsuario;
        int multiplicador = 0;
        int total = 0;

        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um número: ");
        valorUsuario = ler.nextInt();

        for (int x = 0; x < 10; x++) {
            for(multiplicador = 0; multiplicador < 10; multiplicador++){
                total = valorUsuario * multiplicador;
                System.out.println(valorUsuario + " x " + multiplicador + " = " + total);
            }

        }

    }

}

