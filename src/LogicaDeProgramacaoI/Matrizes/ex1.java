package LogicaDeProgramacaoI.Matrizes;

import java.security.SecureRandom;
import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de linhas da matriz que deseja:");
        int linhas = scan.nextInt();
        System.out.println("Digite a quantidade de colunas da matriz que deseja:");
        int colunas = scan.nextInt();

        int[][] numeros = new int[linhas][colunas];

        for(int l = 0; l < linhas; l++){
            for(int c=0; c < colunas; c++) {
                numeros[l][c] = new SecureRandom().nextInt(100);
            }
        }

        for(int l=0; l < linhas; l++){
            for(int c = 0; c < colunas; c++) {
                System.out.printf("%2d | ", numeros[l][c]);
            }
            System.out.printf("%n");
        }

        //ou
//        for(int[] n : numeros) {
//            for(int v : n) {
//                System.out.printf("%2d | ", v);
//            }
//            System.out.printf("%n");
//        }
    }
}
